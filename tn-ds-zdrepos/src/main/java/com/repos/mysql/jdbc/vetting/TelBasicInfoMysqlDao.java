package com.repos.mysql.jdbc.vetting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.repos.model.commons.StateCode.DataCodeEnum;
import com.repos.model.creditvetting.TelBasicInfo;


/**
 * 运营商数据- 基础信息表三合一
 * customer_id、 idcard、 user_number、 task_id、 application_id
 * @author zhangqingli
 *
 */
@Repository
public class TelBasicInfoMysqlDao extends CreditVettingBaseDao<TelBasicInfo> {
	private static final SimpleDateFormat SDF_DATE_AND_TIME  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
	private static final SimpleDateFormat SDF_DATE  = new SimpleDateFormat("yyyy-MM-dd");
	{
		tableName = "b_t_basic_info";
		primaryIdName = "id";
	}
	
	public TelBasicInfo findByIdcardOrUsernumberAndInquiryTimeToday(String idCard, String userNumber, Date inquiryTime) {
		String dateStr = SDF_DATE.format(inquiryTime);
		Date startTime = null;
		Date endTime = null;
		try {
			startTime = SDF_DATE_AND_TIME.parse(dateStr + " 00:00:00.000");
			endTime = SDF_DATE_AND_TIME.parse(dateStr + " 23:59:59.999");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
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
