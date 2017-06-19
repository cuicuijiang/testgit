package mongodbtest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ds.etl.mongo.test.User;
import com.ds.etl.mongo.test.UserData;
import com.ds.etl.mongo.test.UserRepository;

/**
 * User mongodb  测试类
 * @author zhangqingli
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
		"classpath:applicationContext-etl.xml"
})
public class UserTest {
	
	@Autowired
	private UserRepository userRepository;

	
	@Test
	public void testInit() {
		System.out.println(userRepository);
	}
	
	
	/**
	 * 删除所有
	 */
	@Test
	public void testDeleteAll() {
		userRepository.deleteAll();
	}
	
	/**
	 * 测试保存
	 */
	@Test
	public void testSave01() {
		User<UserData> user = new User<UserData>("java user", "aaa bbb ccc");
		user.setId("1");
		user.setCid("xxxxxxxxxxaaaa");
		user.setNickname("phpp");
		user.setGeo("this is geo info");
		user.setTitle("zhangsan java title");
		user.setContent("mongodb is support for text search");
		
		UserData userData = new UserData();
		Date date = new Date();
		userData.setDate(date);
		
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		userData.setMap(map);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1111);
		list.add(2222);
		userData.setList(list);
		
		Set<String> set = new HashSet<String>();
		set.add("hahaha");
		set.add("heihei");
		userData.setSet(set);
		
		Integer[] array = new Integer[]{1,2,3};
		userData.setArray(array);
		user.setData(userData);
		
		user = userRepository.save(user);
		System.out.println(user);
	}
	
	@Test
	public void testSave02() {
		List<User<UserData>> list = new ArrayList<User<UserData>>();
		
		User<UserData> user = new User<UserData>("张三", "123456");
		user.setId("1");
		user.setCreateTime(new Date());
		user = userRepository.save(user);
		
		User<UserData> user2 = new User<UserData>("张三1", "1234561");
		user2.setId("1");
		user2.setCreateTime(new Date());
		
		list.add(user);
		list.add(user2);
		userRepository.save(list);
	}
	
	@Test
	public void testSave03() {
		List<User<UserData>> list = new ArrayList<User<UserData>>();
		
		User<UserData> user = new User<UserData>("张三", "123456");
		user.setId("1");
		user.setCreateTime(new Date());
		user = userRepository.save(user);
		
		User<UserData> user2 = new User<UserData>();
		user2.setId("2");
		
		User<UserData> user3 = new User<UserData>("张三1", "1234561");
		user3.setId("3");
		user3.setCreateTime(new Date());
		
		list.add(user);
		list.add(null);
		list.add(user3);
		userRepository.save(list);
	}
	
	/**
	 * 查询大于某一时间的记录
	 * @throws ParseException 
	 */
	@Test
	public void testFindByCreateTimeAfter() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date date = sdf.parse("2017-05-18 17:30:09.484");
		List<User<UserData>> users = userRepository.findByCreateTimeAfter(date);
		System.out.println(users);
	}
	@Test
	public void testFindByCreateTimeAfter2() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date date = sdf.parse("2017-05-18 17:30:09.484");
		List<User<UserData>> users = userRepository.findByCreateTimeAfter2(date);
		System.out.println(users);
	}
	
	
	/**
	 * 测试查询
	 */
	@Test
	public void testFindByName() {
		List<User<UserData>> users = userRepository.findByName("java user");
		System.out.println(users);
	}
	
	@Test
	public void testFindByNameAndPassword() {
		List<User<UserData>> users = userRepository.findByNameAndPassword("张三", "123456");
		System.out.println(users);
	}
	
	@Test
	public void testFindByNamePage() {
		Page<User<UserData>> page = userRepository.findByName("张三", new PageRequest(0, 2));
		System.out.println(page.getContent());
	}
	
	@Test
	public void testCustomFind1() {
		List<User<UserData>> users = userRepository.customFind1("张三", "李四");
		System.out.println(users);
	}
	
	/**
	 * 全文检索（不支持中文）
	 */
	@Test
	public void testCustomFind2() {
		List<User<UserData>> users = userRepository.textSearch(new String[]{"java"}, 1, 2);
		for (User<UserData> user : users) {
			System.out.println(user);
		}
	}
}
