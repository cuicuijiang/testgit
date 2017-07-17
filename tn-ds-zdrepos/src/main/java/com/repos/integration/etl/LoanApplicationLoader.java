package com.repos.integration.etl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.repos.model.creditvetting.LoanApplication;
import com.repos.mongo.datarepos.LoanApplicationMongoDao;

/**
 * LoanApplication 数据加载器
 * @author zhangqingli
 *
 */
@Component
public class LoanApplicationLoader implements Loader<LoanApplication> {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoanApplicationLoader.class);
	
	@Autowired
	private LoanApplicationMongoDao loanApplicationMongoDao;
	
	
	@Override
	public LoanApplication load(LoanApplication  loanApplication) {
		long start = System.currentTimeMillis();
		LOGGER.info("> 开始加载数据");
		
		loanApplication = loanApplicationMongoDao.save(loanApplication);
		
		LOGGER.info("> 数据加载总耗时: {} s", (System.currentTimeMillis()-start)/1000.0);
		return loanApplication;
	}
	
	@Override
	public List<LoanApplication> load(List<LoanApplication> loanApplications) {
		long start = System.currentTimeMillis();
		LOGGER.info("> 开始加载数据");
		
		loanApplications = loanApplicationMongoDao.save(loanApplications);
		
		LOGGER.info("> 数据加载总耗时: {} s", (System.currentTimeMillis()-start)/1000.0);
		return loanApplications;
	}

	@Override
	public Long getLastestId() {
		return loanApplicationMongoDao.getLastestApplicationId();
	}
}
