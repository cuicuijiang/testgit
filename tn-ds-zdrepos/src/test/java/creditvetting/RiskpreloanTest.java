package creditvetting;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.repos.model.creditvetting.LoanApplication;
import com.repos.model.creditvetting.RiskpreloanResult;
import com.repos.model.creditvetting.RiskpreloanRiskuserinfo;
import com.repos.mysql.jdbc.vetting.LoanApplicationMysqlDao;
import com.repos.mysql.jdbc.vetting.RiskpreloanResultMysqlDao;
import com.repos.mysql.jdbc.vetting.RiskpreloanRiskuserinfoMysqlDao;
import com.repos.trans.creditvetting.RiskpreloanResultTrans;

import basetest.BaseTest;


public class RiskpreloanTest extends BaseTest {
	
	@Autowired
	private LoanApplicationMysqlDao loanApplicationMysqlDao;
	@Autowired
	private RiskpreloanRiskuserinfoMysqlDao riskpreloanRiskuserinfoMysqlDao;
	@Autowired
	private RiskpreloanResultMysqlDao riskpreloanResultMysqlDao;
	@Autowired
	private RiskpreloanResultTrans riskpreloanResultTrans;
	
	
	@Test
	public void test01() {
		LoanApplication loanApplication = loanApplicationMysqlDao.findForObjectById(LoanApplication.class, 1180171L);
		RiskpreloanRiskuserinfo riskpreloanRiskuserinfo = riskpreloanRiskuserinfoMysqlDao.findForObjectByColumn(RiskpreloanRiskuserinfo.class, "userInfoId", loanApplication.getApplicationId());
		loanApplication.setRiskpreloanRiskuserinfo(riskpreloanRiskuserinfo);
		if (riskpreloanRiskuserinfo != null) {
			RiskpreloanResult riskpreloanResult = riskpreloanResultMysqlDao.findForObjectByColumn(RiskpreloanResult.class, "userInfoId", riskpreloanRiskuserinfo.getUserInfoId());
			riskpreloanRiskuserinfo.setRiskpreloanResult(riskpreloanResult);
			
			//解析riskpreloanResult
			riskpreloanResultTrans.trans(riskpreloanResult);
		}
	}
}
