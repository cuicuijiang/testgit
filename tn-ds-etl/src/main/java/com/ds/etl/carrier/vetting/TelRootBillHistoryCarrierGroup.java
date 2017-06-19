package com.ds.etl.carrier.vetting;

import com.ds.etl.model.CarrierGroup;
import com.ds.etl.model.ReceiverRepository;
import com.ds.etl.model.SenderRepository;
import com.ds.etl.model.vetting.TelRootBillHistory;


/**
 * credit_vetting.b_t_bill_history表数据搬运小组
 * @author zhangqingli
 *
 */
public class TelRootBillHistoryCarrierGroup extends CarrierGroup<TelRootBillHistory> {

	protected TelRootBillHistoryCarrierGroup(
			SenderRepository<TelRootBillHistory, Long> senderRepository,
			ReceiverRepository<TelRootBillHistory, Long> receiverRepository,
			long carrierGroupBatchSize, long carrierBatchSize) {
		super(senderRepository, receiverRepository, carrierGroupBatchSize,
				carrierBatchSize);
	}
}
