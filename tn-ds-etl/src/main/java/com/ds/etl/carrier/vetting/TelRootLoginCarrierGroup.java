package com.ds.etl.carrier.vetting;

import com.ds.etl.model.CarrierGroup;
import com.ds.etl.model.ReceiverRepository;
import com.ds.etl.model.SenderRepository;
import com.ds.etl.model.vetting.TelRootLogin;


/**
 * credit_vetting.b_t_login表数据搬运小组
 * @author zhangqingli
 *
 */
public class TelRootLoginCarrierGroup extends CarrierGroup<TelRootLogin> {

	public TelRootLoginCarrierGroup(
			SenderRepository<TelRootLogin, Long> senderRepository,
			ReceiverRepository<TelRootLogin, Long> receiverRepository,
			long carrierGroupBatchSize, 
			long carrierBatchSize) {
		super(senderRepository, receiverRepository, carrierGroupBatchSize, carrierBatchSize);
	}
}
