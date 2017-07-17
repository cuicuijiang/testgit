package com.repos.mysql.jdbc.vetting;

import java.util.Date;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.repos.model.commons.StateCode.DataCodeEnum;
import com.repos.model.creditvetting.TelBasicInfo;
import com.repos.utils.DateUtil;


/**
 * 运营商数据- 基础信息表三合一
 * customer_id、 idcard、 user_number、 task_id、 application_id
 * @author zhangqingli
 *
 */
@Repository
public class TelBasicInfoMysqlDao extends CreditVettingBaseDao<TelBasicInfo> {
	{
		tableName = "b_t_basic_info";
		primaryIdName = "id";
	}
	
	public TelBasicInfo findByIdcardOrUsernumberAndInquiryTimeToday(String idCard, String userNumber, Date inquiryTime) {
		Date startTime = DateUtil.startOfSomeday(inquiryTime);
		Date endTime = DateUtil.endOfSomeday(inquiryTime);
		
		String sql = "select * from "+ tableName +" where (idcard=? or user_number=?) and inquiry_time>? and inquiry_time<?";
		LOGGER.info("sql> {}", sql);
		LOGGER.info("sql params> {}, {}, {}, {}", idCard, userNumber, startTime, endTime);
		
		TelBasicInfo result = null;
		RowMapper<TelBasicInfo> rowMapper = new BeanPropertyRowMapper<TelBasicInfo>(TelBasicInfo.class);
		List<TelBasicInfo> list = jdbcTemplate.query(sql, rowMapper, idCard, userNumber, startTime, endTime);
		if (list.isEmpty()) {
			LOGGER.info(DataCodeEnum.DATA_IS_NULL.getDesc());
		} else {
			result = list.get(0);
		}
		
		return result;
	}
}
