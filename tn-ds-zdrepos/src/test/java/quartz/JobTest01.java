package quartz;

import java.text.ParseException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.repos.quartz.LoanApplicationCarrierGroupJob;
import com.repos.quartz.QuartzManager;

public class JobTest01 {
	
	public static void main(String[] args) throws ParseException {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		QuartzManager quartzManager = (QuartzManager) ctx.getBean("quartzManager");
		quartzManager.addJob("job01", "jobGroup01", "cronTrigger01", "cronTriggerGroup01", LoanApplicationCarrierGroupJob.class, "0/10 * * * * ?");
	}
}
