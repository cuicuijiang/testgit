package com.repos.mysql.jdbc.vetting;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.repos.model.commons.StateCode.DataCodeEnum;
import com.repos.model.creditvetting.BlackandwhiteList;

/**
 * 黑白名单
 * rule_id、scene_id、idcard、mobile、customer_name
 * @author zhangqingli
 *
 */
@Repository
public class BlackandwhiteListMysqlDao extends CreditVettingBaseDao<BlackandwhiteList> {
	{
		tableName = "b_blackandwhite_list";
		primaryIdName = "rule_id";
	}
	
	 
	/**
	 * 在某订单场景下面判断客户是否在黑名单或白名单
	 * @return
	 */
	public List<BlackandwhiteList> findByMobileOrIdCardAndSceneId(String mobile, String idCard, Long sceneId) {
		long start = System.currentTimeMillis();
		String sql = "select * from "+ tableName +" where  (mobile=? or  idcard=?) and  del_flag=2  and  scene_id=?";
		LOGGER.info("sql> {}", sql);
		LOGGER.info("sql params> {}, {}, {}", mobile, idCard, sceneId);
		
		RowMapper<BlackandwhiteList> rowMapper = new BeanPropertyRowMapper<BlackandwhiteList>(BlackandwhiteList.class);
		List<BlackandwhiteList> results = jdbcTemplate.query(sql, rowMapper, mobile, idCard, sceneId);
		if (results.isEmpty()) {
			LOGGER.info(DataCodeEnum.DATA_IS_NULL.getDesc());
		}
		
		LOGGER.info("sql> 耗时：{} s", (System.currentTimeMillis()-start)/1000.0);
		return results;
	}
}
