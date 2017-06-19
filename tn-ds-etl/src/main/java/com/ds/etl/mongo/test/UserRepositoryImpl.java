package com.ds.etl.mongo.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;

/**
 * User Mongo全文检索实现类
 * repository-impl-postfix="Impl"
 * 
 * @author zhangqingli
 *
 */
public class UserRepositoryImpl {

	@Autowired
	@Qualifier("creditvettingMongoTemplate")
	private MongoTemplate mongoTemplate;
	
	
	@SuppressWarnings("rawtypes")
	public List<User> textSearch(String[] keywords, int pageNum, int pageSize) {
		TextCriteria textCriteria = TextCriteria.forDefaultLanguage().matchingAny(keywords);
		Query query = TextQuery.queryText(textCriteria).sortByScore().with( new PageRequest(pageNum-1, pageSize));
		return mongoTemplate.find(query, User.class);
	}
}
