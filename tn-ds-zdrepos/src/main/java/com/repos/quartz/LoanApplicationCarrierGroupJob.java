package com.repos.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.repos.integration.etl.CarrierGroup;
import com.repos.integration.etl.LoanApplicationLoader;

/**
 * LoanApplicationCarrierGroup定时任务
 * @author zhangqingli
 *
 */
public class LoanApplicationCarrierGroupJob extends QuartzJobBean {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoanApplicationCarrierGroupJob.class);
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		LOGGER.info("> LoanApplicationCarrierGroupJob 执行，triggerKeyName 为{}", context.getTrigger().getKey().getName());
		
		ApplicationContext ctx = null;
		try {
			ctx = (ApplicationContext) context.getScheduler().getContext().get("applicationContext");
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
		CarrierGroup<?> loanApplicationCarrierGroup = ctx.getBean("loanApplicationCarrierGroup", CarrierGroup.class);
		
		LoanApplicationLoader loader = (LoanApplicationLoader) loanApplicationCarrierGroup.getLoader();
		Long lastestId = loader.getLastestId();
		loanApplicationCarrierGroup.reInitCarrierGroupParams(lastestId+1, null, loanApplicationCarrierGroup.getCarrierGroupBatchSize(), loanApplicationCarrierGroup.getCarrierBatchSize());
		
		loanApplicationCarrierGroup.carry();
	}
}
