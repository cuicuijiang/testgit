package com.ds.etl.model;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 数据记录搬运者
 * @author zhangqingli
 *
 */
public class Carrier<T> implements Callable<Boolean> {
	private static final Logger LOGGER = LoggerFactory.getLogger(Carrier.class);
	private long carrierBatchSize; //每个搬运工一次处理的数据条数
	
	private SenderRepository<T, Long> senderRepository;
	private ReceiverRepository<T, Long> receiverRepository;
	private IdRange idRange; //每个搬运工每次处理的数据区间
	
	public Carrier(SenderRepository<T, Long> senderRepository,
			ReceiverRepository<T, Long> receiverRepository, IdRange idRange, long carrierBatchSize) {
		this.senderRepository = senderRepository;
		this.receiverRepository = receiverRepository;
		this.idRange = idRange;
		this.carrierBatchSize = carrierBatchSize;
	}


	@Override
	public Boolean call() throws Exception {
		Boolean carrySuccess = true;
		LOGGER.info("搬运工搬运开始，idRange：{}", idRange);
		long startTime = System.currentTimeMillis();
		
		List<IdRange> splits = idRange.split(idRange, carrierBatchSize);
		for (IdRange idRange : splits) {
			try {
				Collection<T> records = senderRepository.sendRecords(idRange.getStart(), idRange.getEnd());
				receiverRepository.save(records);
			} catch (Exception e) {
				LOGGER.error("搬运工搬运出现异常，idRange：{}", idRange);
				e.printStackTrace();
				carrySuccess = false;
				continue;
			}
		}
		
		LOGGER.info("搬运工搬运结束，idRange:{}, 耗时:{} ms", idRange, (System.currentTimeMillis()-startTime));
		return carrySuccess;
	}
}
