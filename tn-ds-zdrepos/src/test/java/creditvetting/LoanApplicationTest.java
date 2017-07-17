package creditvetting;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.repos.integration.etl.CarrierGroup;
import com.repos.integration.etl.LoanApplicationExtracter;
import com.repos.integration.etl.LoanApplicationLoader;
import com.repos.model.creditvetting.LoanApplication;
import basetest.BaseTest;


public class LoanApplicationTest extends BaseTest {

	@Autowired
	private LoanApplicationExtracter loanApplicationExtracter;
	
	@Autowired
	private LoanApplicationLoader loanApplicationLoader;
	
	@Autowired
	private CarrierGroup<LoanApplication> loanApplicationCarrierGroup;
	
	
	@Test
	public void test01() {
		LoanApplication loanApplication = loanApplicationExtracter.extract(1200251L);
		String json = JSON.toJSONString(loanApplication, true);
		System.out.println(json);
		
		loanApplication = loanApplicationLoader.load(loanApplication);
		System.out.println(loanApplication);
	}
	
	
	@Test
	public void test02() {
		Long lastestId = loanApplicationLoader.getLastestId();
		System.out.println(lastestId);
	}
	
	@Test
	public void test03() {
		loanApplicationCarrierGroup.carry();
	}
}
