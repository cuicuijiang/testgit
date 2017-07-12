package creditvetting;

import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.repos.model.creditvetting.SmsAndContacts;
import com.repos.mysql.jdbc.vetting.SmsAndContactsMysqlDao;

import basetest.BaseTest;


public class SmsAndContactsTest extends BaseTest {
	
	@Autowired
	private SmsAndContactsMysqlDao smsAndContactsMysqlDao;
	
	
	@Test
	public void test01() {
		List<SmsAndContacts> smsAndContactses = smsAndContactsMysqlDao.findByUsernumberAndSceneId("15930880961", 100010L);
		
		for (SmsAndContacts smsAndContacts : smsAndContactses) {
			String contacts = smsAndContacts.getSms();
			System.out.println(contacts);
		}
	}
	
}
