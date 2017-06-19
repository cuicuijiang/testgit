package com.ds.etl.carrier.test;

import com.ds.etl.model.CarrierGroup;
import com.ds.etl.model.ReceiverRepository;
import com.ds.etl.model.SenderRepository;
import com.ds.etl.model.test.LocalPerson;


public class LocalPersonCarrierGroup extends CarrierGroup<LocalPerson> {

	protected LocalPersonCarrierGroup(
			SenderRepository<LocalPerson, Long> senderRepository,
			ReceiverRepository<LocalPerson, Long> receiverRepository,
			long carrierGroupBatchSize, long carrierBatchSize) {
		super(senderRepository, receiverRepository, carrierGroupBatchSize,
				carrierBatchSize);
	}

}
