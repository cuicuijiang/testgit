package mysqltest;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ds.etl.carrier.vetting.TelRootLoginCarrierGroup;
import com.ds.etl.model.vetting.TelRootCall;
import com.ds.etl.model.vetting.TelRootLogin;
import com.ds.etl.mongo.vetting.TelRootCallMongoDao;
import com.ds.etl.mongo.vetting.TelRootLoginMongoDao;
import com.ds.etl.mysql.jdbc.vetting.TelRootCallMysqlDao;
import com.ds.etl.mysql.jdbc.vetting.TelRootLoginMysqlDao;

/**
 * 信审系统mysql数据源测试
 * @author zhangqingli
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"classpath:applicationContext-etl.xml"	
})
public class CreditVettingTelTest {
	
	@Autowired
	@Qualifier("creditvettingDatasource")
	private DataSource dataSource;
	
	
	@Autowired
	private TelRootLoginMysqlDao telRootLoginMysqlDao;
	
	@Autowired
	private TelRootCallMysqlDao telRootCallMysqlDao;
	
	@Autowired
	private TelRootLoginMongoDao telRootLoginMongoDao;
	
	@Autowired
	private TelRootCallMongoDao telRootCallMongoDao;
	
	@Autowired
	private TelRootLoginCarrierGroup telRootLoginCarrierGroup;
	
	
	/**
	 * 测试获取数据源
	 */
	@Test
	public void testInitDataSource() {
		System.out.println(dataSource); //ok
	}
	
	
	/*==========================查询数据条数================================*/
	/**
	 * 测试查询b_t_login数据条数
	 */
	@Test
	public void testQueryTelLoginCount() {
		long count = telRootLoginMysqlDao.maxTotalCount();
		System.out.println(count); 
	}
	
	/**
	 * 测试查询b_t_call数据条数（使用maxid的方式）
	 */
	@Test
	public void testQueryTelCallCount() {
		long count = telRootCallMysqlDao.maxTotalCount();
		System.out.println(count);
	}
	
	
	
	/*============================根据id范围查询记录集合==============================*/
	/**
	 * 测试查询b_t_login记录集合
	 */
	@Test
	public void testTelLoginFindListByIdRange() {
		List<TelRootLogin> telRootLogins = telRootLoginMysqlDao.sendRecords(1L, 4L);
		System.out.println(telRootLogins);
	}
	
	/**
	 * 测试查询b_t_call记录集合（一次处理1万条数据）
	 */
	@Test
	public void testTelCallFindListByIdRange() {
		List<TelRootCall> telRootCalls = telRootCallMysqlDao.sendRecords(100000000L, 100010000L);
		System.out.println(telRootCalls.size());
	}
	
	
	/*=============================mongodb保存测试=============================*/
	@Test
	public void testTelRootLoginMongoDaoSave() {
		List<TelRootLogin> telRootLogins = telRootLoginMysqlDao.sendRecords(1L, 4L);
		telRootLoginMongoDao.save(telRootLogins);
	}
	
	@Test
	public void testTelRootCallMongoDaoSave() {
		List<TelRootCall> telRootCalls = telRootCallMysqlDao.sendRecords(100000000L, 100010000L);
		telRootCallMongoDao.save(telRootCalls);
	}
	
	
	/*==========================数据搬运小组测试================================*/
	@Test
	public void testTelRootLoginCarrierGroup() {
		telRootLoginCarrierGroup.carry();
	}
}
