package com.ds.etl.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 数据记录搬运小组
 * @author zhangqingli
 *
 */
public abstract class CarrierGroup<T> {
	private static final Logger LOGGER = LoggerFactory.getLogger(CarrierGroup.class);
	
	private SenderRepository<T, Long> senderRepository;
	private ReceiverRepository<T, Long> receiverRepository;
	private long carrierGroupBatchSize = 100000L;
	private long carrierBatchSize = 10000L;
	private IdRange cursorRange; //范围游标
	
	
	public long getCarrierGroupBatchSize() {
		return carrierGroupBatchSize;
	}
	public void setCarrierGroupBatchSize(long carrierGroupBatchSize) {
		this.carrierGroupBatchSize = carrierGroupBatchSize;
		this.cursorRange = new IdRange(1, carrierGroupBatchSize);
	}
	public long getCarrierBatchSize() {
		return carrierBatchSize;
	}
	public void setCarrierBatchSize(long carrierBatchSize) {
		this.carrierBatchSize = carrierBatchSize;
	}


	/**
	 * @param senderRepository  数据发送处理者
	 * @param receiverRepository  数据接收处理者
	 * @param carrierGroupBatchSize  搬运小组一次性处理记录条数默认值
	 * @param carrierBatchSize  搬运工一次性处理记录条数默认值
	 */
	protected CarrierGroup(SenderRepository<T, Long> senderRepository, 
			ReceiverRepository<T, Long> receiverRepository, 
			long carrierGroupBatchSize,
			long carrierBatchSize) {
		this.senderRepository = senderRepository;
		this.receiverRepository = receiverRepository;
		
		this.carrierGroupBatchSize = carrierGroupBatchSize;
		this.cursorRange = new IdRange(1, carrierGroupBatchSize);
		
		this.carrierBatchSize = carrierBatchSize;
	}

	
	
	/**
	 * 搬运小组搬运数据方法
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public void carry() {
		LOGGER.info("数据搬运开始，SenderRepository：{}", senderRepository.getClass());
		long startTime = System.currentTimeMillis();
		
		try {
			// 获取最大数据总条数
			Long maxTotalCount = senderRepository.maxTotalCount();
			LOGGER.info("数据最大总条数：{}", maxTotalCount);
			LOGGER.info("搬运小组一次性处理记录条数：{}", carrierGroupBatchSize);
			LOGGER.info("搬运工一次性处理记录条数：{}", carrierBatchSize);
			
			// 数据小组一次性搬运carrierGroupBatchSize条数据，并将这些条数据平均分配给小组的搬运工去处理
			while (cursorRange.getEnd()<maxTotalCount || (cursorRange.getEnd()>=maxTotalCount && cursorRange.getStart()<=maxTotalCount)) {
				List<IdRange> splitIdRanges = cursorRange.split(cursorRange, carrierBatchSize);
				LOGGER.info("小组搬运工个数：{}, cursorRange:{}", splitIdRanges.size(), cursorRange);
				
				List<FutureTask<Boolean>> futureTasks = new ArrayList<FutureTask<Boolean>>(splitIdRanges.size());
				for (int i=0; i<splitIdRanges.size(); i++) {
					Carrier<T> carrier = new Carrier<T>(senderRepository, receiverRepository, splitIdRanges.get(i), carrierBatchSize);
					FutureTask<Boolean> futureTask = new FutureTask<Boolean>(carrier);
					
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
				endNew = endNew>maxTotalCount ? maxTotalCount : endNew;
				cursorRange.setStart(startNew);
				cursorRange.setEnd(endNew);
			}
		} catch (Exception e) {
			LOGGER.error("carrierGroup整个搬运过程有异常出现!");
			e.printStackTrace();
		} finally {
			// TODO
		}
		
		LOGGER.info("数据搬运结束，SenderRepository：{}, 总耗时：{} ms", senderRepository.getClass(), (System.currentTimeMillis()-startTime));
	}
	
}
