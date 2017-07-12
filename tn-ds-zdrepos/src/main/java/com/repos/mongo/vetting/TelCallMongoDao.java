package com.repos.mongo.vetting;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.repos.model.creditvetting.TelCall;

/**
 * @author zhangqingli
 *
 */
public interface TelCallMongoDao extends MongoRepository<TelCall, Long> {
	
	@Query("{basic_info_id:?0}")
	List<TelCall> findByBasicInfoId(Long basicInfoId);
}
