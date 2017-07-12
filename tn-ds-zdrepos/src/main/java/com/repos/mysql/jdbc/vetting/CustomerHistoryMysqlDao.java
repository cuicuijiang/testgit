package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.CustomerHistory;


/**
 * 客户信息表
 * customer_id、 application_id、 scene_id、 scene_custid、 mobile_register、 customer_name、 
 * idcard、 mobile、 bank_card、  email、 bank_phone、 guarantor_name、 guarantor_mobile、 
 * guarantor_idcard、 ip
 * 
 * @author zhangqingli
 *
 */
@Repository
public class CustomerHistoryMysqlDao extends CreditVettingBaseDao<CustomerHistory> {
	
	{
		tableName = "b_customer_history";
		primaryIdName = "customer_history_id";
	}
}
