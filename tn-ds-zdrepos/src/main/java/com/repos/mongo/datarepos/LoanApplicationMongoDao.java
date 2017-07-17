package com.repos.mongo.datarepos;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.repos.model.creditvetting.LoanApplication;

/**
 * LoanApplicationMongoDao
 * @author zhangqingli
 *
 */
public interface LoanApplicationMongoDao extends MongoRepository<LoanApplication, String> {

	/**
	 * 获取最大的 applicationId
	 * @return
	 */
	Long getLastestApplicationId();
}
