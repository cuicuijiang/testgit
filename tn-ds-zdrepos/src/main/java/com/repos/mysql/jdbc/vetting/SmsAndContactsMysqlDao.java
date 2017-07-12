package com.repos.mysql.jdbc.vetting;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.Base64Utils;

import com.repos.model.commons.StateCode.DataCodeEnum;
import com.repos.model.creditvetting.SmsAndContacts;

/**
 * 客户手机app中的短信
 * user_number 注册电话号码、 scene_id 场景id
 * @author zhangqingli
 *
 */
@Repository
public class SmsAndContactsMysqlDao extends CreditVettingBaseDao<SmsAndContacts> {
	
	{
		tableName = "b_sms_and_contacts";
		primaryIdName = "id";
	}
	
	
	/**
	 * findByUsernumberAndSceneId
	 * @param userNumber  用户注册电话号码
	 * @param sceneId	场景id
	 * @return
	 */
	public List<SmsAndContacts> findByUsernumberAndSceneId(String userNumber, Long sceneId) {
		long start = System.currentTimeMillis();
		String sql = "select * from " + tableName + " where user_number=? and scene_id=?";
		LOGGER.info("sql> {}", sql);
		LOGGER.info("sql params> {}, {}", userNumber, sceneId);
		
		RowMapper<SmsAndContacts> rowMapper = new BeanPropertyRowMapper<SmsAndContacts>(SmsAndContacts.class);
		List<SmsAndContacts> results = jdbcTemplate.query(sql, rowMapper, userNumber, sceneId);
		if (results.isEmpty()) {
			LOGGER.info(DataCodeEnum.DATA_IS_NULL.getDesc());
		}
		
		for (SmsAndContacts smsAndContacts : results) {
			String sms = smsAndContacts.getSms();
			String contacts = smsAndContacts.getContacts();
			if (sms != null) {
				smsAndContacts.setSms(new String(Base64Utils.decodeFromString(sms)));
			}
			if (contacts != null) {
				smsAndContacts.setContacts(new String(Base64Utils.decodeFromString(contacts)));
			}
		}
		
		LOGGER.info("sql> 耗时：{} s", (System.currentTimeMillis()-start)/1000.0);
		return results;
	}
	
	
	public static void main(String[] args) {
		String sss = null;
		
		byte[] bs = Base64Utils.decodeFromString(sss);
		System.out.println(new String(bs));
	}
}
