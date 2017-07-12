package creditvetting;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.repos.model.creditvetting.TelCall;
import com.repos.mongo.vetting.TelCallMongoDao;

import basetest.BaseTest;

/**
 * 
 * @author zhangqingli
 *
 */
public class TelCallTest extends BaseTest {
	
	@Autowired 
	private TelCallMongoDao telCallMongoDao; 
	
	
	@Test
	public void test01() {
		List<TelCall> list = telCallMongoDao.findByBasicInfoId(80481L);
		for (TelCall telCall : list) {
			System.out.println(telCall);
		}
	}
}
