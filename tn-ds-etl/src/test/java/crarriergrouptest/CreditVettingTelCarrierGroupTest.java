package crarriergrouptest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ds.etl.carrier.vetting.TelRootCallCarrierGroup;
import com.ds.etl.carrier.vetting.TelRootLoginCarrierGroup;

/**
 * @author zhangqingli
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"classpath:applicationContext-etl.xml"	
})
public class CreditVettingTelCarrierGroupTest {
	
	@Autowired
	private TelRootLoginCarrierGroup telRootLoginCarrierGroup;
	
	@Autowired
	private TelRootCallCarrierGroup telRootCallCarrierGroup;
	
	
	@Test
	public void init() {
		
	}
	
	
	@Test
	public void testTelRootLoginCarrierGroup() {
		telRootLoginCarrierGroup.carry();
	}
	
	@Test
	public void testTelRootCallCarrierGroup() {
		telRootCallCarrierGroup.carry();
	}
}
