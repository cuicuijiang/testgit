package com.repos.integration.etl;

import java.util.List;
import java.util.concurrent.Callable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.repos.model.commons.IdRange;

/**
 * 数据搬运线程
 * @author zhangqingli
 * @param <T>
 */
public class CarrierCallable<T> implements Callable<Boolean> {
	private static final Logger LOGGER = LoggerFactory.getLogger(CarrierCallable.class);
	
	//一个搬运线程处理的数据区间
	private IdRange idRange;
	//数据提取器
	private Extracter<T, Long> extracter;
	//数据加载器
	private 	Loader<T> loader;

	/**
	 * CarrierCallable构造方法
	 * @param idRange
	 * @param extracter
	 * @param loader
	 */
	public CarrierCallable(IdRange idRange, Extracter<T, Long> extracter, Loader<T> loader) {
		this.idRange = idRange;
		this.extracter = extracter;
		this.loader = loader;
	}

	@Override
	public Boolean call() throws Exception {
		Boolean carrySuccess = true;
		LOGGER.info("搬运工搬运开始，idRange：{}", idRange);
		long startTime = System.currentTimeMillis();
		
		try {
			List<T> records = extracter.extract(idRange.getStart(), idRange.getEnd());
			loader.load(records);
		} catch (Exception e) {
			LOGGER.error("搬运工搬运出现异常，idRange：{}", idRange);
			e.printStackTrace();
			carrySuccess = false;
		}
		
		LOGGER.info("搬运工搬运结束，idRange:{}, 耗时:{} ms", idRange, (System.currentTimeMillis()-startTime));
		return carrySuccess;
	}
}
