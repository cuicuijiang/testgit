package com.ds.etl.carrier.vetting;

import com.ds.etl.model.CarrierGroup;
import com.ds.etl.model.ReceiverRepository;
import com.ds.etl.model.SenderRepository;
import com.ds.etl.model.vetting.TelRootBasicInfo;


/**
 * credit_vetting.b_t_basic_info表数据搬运小组
 * @author zhangqingli
 *
 */
public class TelRootBasicInfoCarrierGroup extends CarrierGroup<TelRootBasicInfo> {

	public TelRootBasicInfoCarrierGroup(
			SenderRepository<TelRootBasicInfo, Long> senderRepository,
			ReceiverRepository<TelRootBasicInfo, Long> receiverRepository,
			long carrierGroupBatchSize, long carrierBatchSize) {
		super(senderRepository, receiverRepository, carrierGroupBatchSize,
				carrierBatchSize);
	}
}
