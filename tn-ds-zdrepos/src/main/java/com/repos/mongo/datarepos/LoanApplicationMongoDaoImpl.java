package com.repos.mongo.datarepos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import com.repos.model.creditvetting.LoanApplication;

/**
 * LoanApplicationMongoDao spring data mongodb 实现类
 * @author zhangqingli
 *
 */
@Repository
public class LoanApplicationMongoDaoImpl {

	@Autowired
	@Qualifier("datareposMongoTemplate")
	private MongoTemplate mongoTemplate;
	
	
	public Long getLastestApplicationId() {
		Query query = new Query().with(new Sort(Direction.DESC, "applicationId")).limit(1);
		LoanApplication loanApplication = mongoTemplate.findOne(query , LoanApplication.class);
		if (loanApplication==null) {
			return 1L;
		}
		return loanApplication.getApplicationId();
	}
}
