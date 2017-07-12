package creditvetting;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.repos.model.creditvetting.AntifraudInquiry;
import com.repos.mysql.jdbc.vetting.AntifraudInquiryMysqlDao;

import basetest.BaseTest;

public class AntifraudInquiryTest extends BaseTest {

	@Autowired
	private AntifraudInquiryMysqlDao antifraudInquiryMysqlDao;
	
	
	@Test
	public void test01() {
		List<AntifraudInquiry> antifraudInquiries = antifraudInquiryMysqlDao.findByColumn(AntifraudInquiry.class, "id", 4L);
		
		for (AntifraudInquiry antifraudInquiry : antifraudInquiries) {
			System.out.println(antifraudInquiry);
		}
	}
}
