package com.repos.integration.etl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.FutureTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.repos.model.commons.IdRange;

/**
 * 数据搬运线程组
 * @author zhangqingli
 *
 */
public class CarrierGroup<T> {
	private static final Logger LOGGER = LoggerFactory.getLogger(CarrierGroup.class);

	// 数据提取器
	private Extracter<T, Long> extracter;
	// 数据加载器
	private Loader<T> loader;
	// 数据加载到endId结束（包含endId，如果没有设置则数据加载到maxId结束）
	private Long endId;
	// 数据范围游标
	private IdRange cursorRange;
	// 数据搬运线程组一次性处理数据的条数
	private Long carrierGroupBatchSize;
	// 每个数据搬运线程处理数据的条数
	private Long carrierBatchSize;
	
	
	public Extracter<T, Long> getExtracter() {
		return extracter;
	}
	public Loader<T> getLoader() {
		return loader;
	}
	public Long getCarrierGroupBatchSize() {
		return carrierGroupBatchSize;
	}
	public Long getCarrierBatchSize() {
		return carrierBatchSize;
	}
	
	
	/**
	 * 根据 startId, endId, carrierGroupBatchSize, carrierBatchSize 重新初始化CarrierGroupParams
	 * @param startId
	 */
	public void reInitCarrierGroupParams(Long startId, Long endId, Long carrierGroupBatchSize, Long carrierBatchSize) {
		this.carrierGroupBatchSize = carrierGroupBatchSize;
		this.carrierBatchSize = carrierBatchSize;
		this.cursorRange = new IdRange(startId, startId+carrierGroupBatchSize-1);
		this.endId = endId;
	}
	
	
	/**
	 * 构造方法
	 * @param extracter	数据提取器
	 * @param loader		数据加载器
	 * @param startId	数据从startId处开始加载
	 * @param endId		数据加载到endId结束
	 * @param carrierGroupBatchSize	数据搬运线程组一次性处理数据的条数
	 * @param carrierBatchSize		每个数据搬运线程处理数据的条数
	 */
	public CarrierGroup(Extracter<T, Long> extracter, Loader<T> loader, 
			Long startId, Long endId, Long carrierGroupBatchSize, Long carrierBatchSize) {
		this.extracter = extracter;
		this.loader = loader;
		this.carrierGroupBatchSize = carrierGroupBatchSize;
		this.carrierBatchSize = carrierBatchSize;
		this.cursorRange = new IdRange(startId, startId+carrierGroupBatchSize-1);
		this.endId = endId;
	}
	
	
	/**
	 * 搬运线程组数据处理方法
	 */
	public void carry() {
		LOGGER.info("数据搬运开始，Extracter：{}", extracter.getClass());
		long startTime = System.currentTimeMillis();
		
		try {
			// 获取最后一个ID
			Long lastestId = null;
			if (endId != null) {
				lastestId = this.endId;
			} else {
				lastestId = extracter.getLastestId();
			}
			LOGGER.info("LastestId：{}", lastestId);
			LOGGER.info("搬运小组一次性处理记录条数：{}", carrierGroupBatchSize);
			LOGGER.info("每个搬运工处理记录条数：{}", carrierBatchSize);
			
			// 数据小组一次性搬运carrierGroupBatchSize条数据，并将这些条数据平均分配给小组的搬运工去处理
			while (cursorRange.getEnd()<lastestId ||  (cursorRange.getEnd()>=lastestId && cursorRange.getStart()<=lastestId)) {
				if (cursorRange.getEnd()>=lastestId) {
					cursorRange.setEnd(lastestId);
				}
				
				List<IdRange> splitIdRanges = cursorRange.split(carrierBatchSize);
				LOGGER.info("小组搬运工个数：{}, cursorRange:{}", splitIdRanges.size(), cursorRange);
				
				List<FutureTask<Boolean>> futureTasks = new ArrayList<FutureTask<Boolean>>(splitIdRanges.size());
				for (int i = 0; i < splitIdRanges.size(); i++) {
					CarrierCallable<T> carrierCallable = new CarrierCallable<T>(splitIdRanges.get(i), extracter, loader);
					FutureTask<Boolean> futureTask = new FutureTask<Boolean>(carrierCallable);
					futureTasks.add(futureTask);
					new Thread(futureTask).start();
				}
				
				boolean groupCarrySuccess = true;
				for (FutureTask<Boolean> futureTask : futureTasks) {
					groupCarrySuccess = groupCarrySuccess ? futureTask.get() : groupCarrySuccess;
				}
				if (!groupCarrySuccess) {
					LOGGER.error("发生过异常，cursorRange:{}", cursorRange);
				}
				
				long startNew = cursorRange.getStart() + carrierGroupBatchSize;
				long endNew = cursorRange.getEnd() + carrierGroupBatchSize;
				endNew = endNew>lastestId ? lastestId : endNew;
				cursorRange.setStart(startNew);
				cursorRange.setEnd(endNew);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// TODO
		}
		
		LOGGER.info("数据搬运结束，SenderRepository：{}, 总耗时：{} ms", extracter.getClass(), (System.currentTimeMillis()-startTime));
	}
	
}
