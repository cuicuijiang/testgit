package crarriergrouptest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.ds.etl.carrier.test.LocalPersonCarrierGroup;

/**
 * @author zhangqingli
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"classpath:applicationContext-etl.xml"	
})
public class LocalPersonCarrierGroupTest {
	
	@Autowired
	private LocalPersonCarrierGroup localPersonCarrierGroup;
	
	
	@Test
	public void testTelRootLoginCarrierGroup() {
		localPersonCarrierGroup.carry();
	}
}
