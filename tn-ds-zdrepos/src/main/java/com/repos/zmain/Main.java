package com.repos.zmain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.util.StringUtils;
import com.repos.integration.etl.CarrierGroup;
import com.repos.quartz.QuartzManager;

/**
 * 程序入口
 * @author zhangqingli
 * 
 * 定量ETL:
 * nohup java -DcarrierGroupBean=loanApplicationCarrierGroup -DstartId=5 -DendId=50 -DcarrierGroupBatchSize=12 -DcarrierBatchSize=4 -jar tn-ds-zdrepos-0.0.1-SNAPSHOT.jar > etl.log &
 * nohup java -DcarrierGroupBean=loanApplicationCarrierGroup -DstartId=5 -DendId=50 -jar tn-ds-zdrepos-0.0.1-SNAPSHOT.jar > etl.log &
 * nohup java -DcarrierGroupBean=loanApplicationCarrierGroup -DstartId=5 -jar tn-ds-zdrepos-0.0.1-SNAPSHOT.jar > etl.log &
 * nohup java -DcarrierGroupBean=loanApplicationCarrierGroup -jar tn-ds-zdrepos-0.0.1-SNAPSHOT.jar > etl.log &
 * 
 * 定时ETL:
 * nohup java -DcarrierGroupBean=loanApplicationCarrierGroup -DcarrierGroupBatchSize=20 -DcarrierBatchSize=5 -DjobClass="com.repos.quartz.LoanApplicationCarrierGroupJob" -Dcron="0 15 10 ? * MON" -jar tn-ds-zdrepos-0.0.1-SNAPSHOT.jar > etl.log &
 * nohup java -DcarrierGroupBean=loanApplicationCarrierGroup -DjobClass="com.repos.quartz.LoanApplicationCarrierGroupJob" -Dcron="0 15 10 ? * MON" -jar tn-ds-zdrepos-0.0.1-SNAPSHOT.jar > etl.log &
 * 
 */
public class Main {
	private static final Logger LOGGER= LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) throws ClassNotFoundException {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		String carrierGroupBeanName = System.getProperty("carrierGroupBean");
		LOGGER.info("carrierGroupBean: {}", carrierGroupBeanName);
		CarrierGroup<?> carrierGroupBean = ctx.getBean(carrierGroupBeanName, CarrierGroup.class);
		
		
		//定量ETL（并重新初始化CarrierGroupParams）
		Long startId = 1L; //默认为1
		Long endId = null; //默认为lastId
		try {
			startId = Long.valueOf(System.getProperty("startId")); 
		} catch (NumberFormatException e) {
			startId = 1L;
		}
		try {
			endId = Long.valueOf(System.getProperty("endId")); 		
		} catch (NumberFormatException e) {
			endId = null;
		}
		LOGGER.info("startId: {}", startId);
		LOGGER.info("endId: {}", endId);
		
 		Long carrierGroupBatchSize = 1000L; 	//默认为1000
		Long carrierBatchSize = 250L;		//默认为250
		try {
			carrierGroupBatchSize = Long.valueOf(System.getProperty("carrierGroupBatchSize"));
			carrierBatchSize = Long.valueOf(System.getProperty("carrierBatchSize"));
		} catch (NumberFormatException e) {
			carrierGroupBatchSize = 1000L;
			carrierBatchSize = 250L;
		}
		LOGGER.info("carrierGroupBatchSize: {}", carrierGroupBatchSize);
		LOGGER.info("carrierBatchSize: {}", carrierBatchSize);
		carrierGroupBean.reInitCarrierGroupParams(startId, endId, carrierGroupBatchSize, carrierBatchSize);
		
		
		//定时 或 非定时ETL（根据是否设置jobClass和cron来判断是否需要定时ETL）
		String jobClassName = System.getProperty("jobClass");	
		String cron = System.getProperty("cron");
		LOGGER.info("jobClassName: {}", jobClassName);
		LOGGER.info("cron: {}", cron);
		if (!StringUtils.isEmpty(jobClassName) && !StringUtils.isEmpty(cron)) {
			QuartzManager quartzManager = ctx.getBean("quartzManager", QuartzManager.class);
			Class<?> jobClass = Class.forName(jobClassName);
			quartzManager.addJob(jobClass.getName(), "carrierJobGroup", jobClass.getName()+"Trigger", "carrierTriggerGroup", jobClass, cron);
		} else {
			carrierGroupBean.carry();
		}
	}
	
}
