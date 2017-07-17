package com.repos.mysql.jdbc.vetting;

import java.util.Date;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.repos.model.commons.StateCode.DataCodeEnum;
import com.repos.model.creditvetting.TelLogin;
import com.repos.utils.DateUtil;


@Repository
public class TelLoginMysqlDao extends CreditVettingBaseDao<TelLogin> {
	{
		tableName = "b_t_login";
		primaryIdName = "id";
	}
	
	
	public TelLogin findByIdcardOrUsernumberAndCreateTimeToday(String idCard, String userNumber, Date createTime) {
		long start = System.currentTimeMillis();
		Date startTime = DateUtil.startOfSomeday(createTime);
		Date endTime = DateUtil.endOfSomeday(createTime);
		
		String sql = "select * from "+ tableName +" where result=1 and (idcard=? or user_number=?) and create_time>? and create_time<?";
		LOGGER.info("sql> {}", sql);
		LOGGER.info("sql params> {}, {}, {}, {}", idCard, userNumber, startTime, endTime);
		
		TelLogin result = null;
		RowMapper<TelLogin> rowMapper = new BeanPropertyRowMapper<TelLogin>(TelLogin.class);
		List<TelLogin> list = jdbcTemplate.query(sql, rowMapper, idCard, userNumber, startTime, endTime);
		if (list.isEmpty()) {
			LOGGER.info(DataCodeEnum.DATA_IS_NULL.getDesc());
		} else {
			result = list.get(0);
		}
		
		LOGGER.info("sql> 耗时：{} s", (System.currentTimeMillis()-start)/1000.0);
		return result;
	}
	
}
