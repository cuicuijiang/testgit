package com.ds.etl.carrier.vetting;

import com.ds.etl.model.CarrierGroup;
import com.ds.etl.model.ReceiverRepository;
import com.ds.etl.model.SenderRepository;
import com.ds.etl.model.vetting.TelRootCall;


/**
 * credit_vetting.b_t_call表数据搬运小组
 * @author zhangqingli
 *
 */
public class TelRootCallCarrierGroup extends CarrierGroup<TelRootCall> {

	public TelRootCallCarrierGroup(
			SenderRepository<TelRootCall, Long> senderRepository,
			ReceiverRepository<TelRootCall, Long> receiverRepository,
			long carrierGroupBatchSize, 
			long carrierBatchSize) {
		super(senderRepository, receiverRepository, carrierGroupBatchSize,
				carrierBatchSize);
	}
	
}
