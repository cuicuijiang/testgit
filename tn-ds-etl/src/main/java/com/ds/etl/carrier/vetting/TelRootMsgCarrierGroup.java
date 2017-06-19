package com.ds.etl.carrier.vetting;

import com.ds.etl.model.CarrierGroup;
import com.ds.etl.model.ReceiverRepository;
import com.ds.etl.model.SenderRepository;
import com.ds.etl.model.vetting.TelRootMsg;


/**
 * credit_vetting.b_t_msg表数据搬运小组
 * @author zhangqingli
 *
 */
public class TelRootMsgCarrierGroup extends CarrierGroup<TelRootMsg> {

	public TelRootMsgCarrierGroup(
			SenderRepository<TelRootMsg, Long> senderRepository,
			ReceiverRepository<TelRootMsg, Long> receiverRepository,
			long carrierGroupBatchSize, long carrierBatchSize) {
		super(senderRepository, receiverRepository, carrierGroupBatchSize,
				carrierBatchSize);
	}
}
