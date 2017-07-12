package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;
import com.repos.model.creditvetting.TelCall;

/**
 * 运营商数据-通话记录表三合一
 * basic_info_id、 customer_id、idcard、 user_number、 other_number
 * @author zhangqingli
 *
 */
@Repository
public class TelCallMysqlDao extends CreditVettingBaseDao<TelCall>{
	{
		tableName = "b_t_call";
		primaryIdName = "id";
	}
}
