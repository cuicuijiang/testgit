package com.ds.etl.mongo.test;

import com.ds.etl.model.ReceiverRepository;
import com.ds.etl.model.test.LocalPerson;

/**
 * @author zhangqingli
 *
 */
public interface LocalPersonMongoDao extends ReceiverRepository<LocalPerson, Long> {
	
}
