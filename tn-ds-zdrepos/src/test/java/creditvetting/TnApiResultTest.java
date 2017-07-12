package creditvetting;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.repos.model.creditvetting.TnapiRiskReport;
import com.repos.model.creditvetting.TnapiRiskresult;
import com.repos.mysql.jdbc.vetting.TnapiRiskresultMysqlDao;

import basetest.BaseTest;

/**
 * 
 * @author zhangqingli
 *
 */
public class TnApiResultTest extends BaseTest {

	@Autowired
	private TnapiRiskresultMysqlDao tnapiRiskresultMysqlDao;
	
	
	@Test
	public void test01() {
		TnapiRiskresult tnapiRiskresult = tnapiRiskresultMysqlDao.findForObjectByColumn(TnapiRiskresult.class, "apply_no", "12058670450541747281");
		
		String antifraudResultJson = tnapiRiskresult.getAntifraudResultJson();
		TnapiRiskReport tnapiRiskReport = JSON.parseObject(antifraudResultJson, TnapiRiskReport.class);
		tnapiRiskresult.setTnapiRiskReport(tnapiRiskReport);
		String json = JSON.toJSONString(tnapiRiskresult, true);
		System.out.println(json);
	}
	
}
