package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.Customer;


/**
 * 客户信息表
 * scene_id、 scene_custid、 mobile_register 注册用手机号码、 customer_name 客户名、
 * idcard、 mobile、 bank_card 卡号、 email、 bank_phone 银行卡预留手机号码、 
 * guarantor_name 担保人姓名、 guarantor_mobile 担保人手机号、 guarantor_idcard 担保人身份证号、 
 * ip 申请IP地址
 * @author zhangqingli
 *
 */
@Repository
public class CustomerMysqlDao extends CreditVettingBaseDao<Customer>{
	
	{
		tableName = "b_customer";
		primaryIdName = "customer_id";
	}
	
}
