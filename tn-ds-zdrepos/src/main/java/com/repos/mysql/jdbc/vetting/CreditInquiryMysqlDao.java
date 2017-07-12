package com.repos.mysql.jdbc.vetting;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.repos.model.commons.StateCode.DataCodeEnum;
import com.repos.model.creditvetting.CreditInquiry;

/**
 * 万象分查询记录表
 * inquiry_id 查询记录ID、 scene_id、 cust_name、 mobile、 idcard、 bank_card卡号、 result_code 查询结果编号
 * @author zhangqingli
 *
 */
@Repository
public class CreditInquiryMysqlDao extends CreditVettingBaseDao<CreditInquiry> {
	{
		tableName = "b_credit_inquiry";
		primaryIdName = "inquiry_id";
	}
	
	
	/**
	 * findByIdCardAndMobileAndBankcardAndSceneId
	 * @param idCard
	 * @param mobile
	 * @param bankCard
	 * @param sceneId
	 * @return
	 */
	public List<CreditInquiry> findByIdCardAndMobileAndBankcardAndSceneId(String idCard, String mobile, String bankCard, Long sceneId) {
		long start = System.currentTimeMillis();
		String sql = "select * from " + tableName + " where idcard=? and mobile=? and bank_card=? and scene_id=?";
		LOGGER.info("sql> {}", sql);
		LOGGER.info("sql params> {}, {}, {}, {}", idCard, mobile, bankCard, sceneId);
		
		RowMapper<CreditInquiry> rowMapper = new BeanPropertyRowMapper<CreditInquiry>(CreditInquiry.class);
		List<CreditInquiry> results = jdbcTemplate.query(sql, rowMapper, idCard, mobile, bankCard, sceneId);
		if (results.isEmpty()) {
			LOGGER.info(DataCodeEnum.DATA_IS_NULL.getDesc());
		}
		
		LOGGER.info("sql> 耗时：{} s", (System.currentTimeMillis()-start)/1000.0);
		return results;
	}
}
