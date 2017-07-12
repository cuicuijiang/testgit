package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.CustomerIdnoAuth;


/**
 * 身份证检测表
 * customer_id、 scene_id、 scene_idno_auth_id 数据在场景方唯一标识、 name、 idno
 * @author zhangqingli
 *
 */
@Repository
public class CustomerIdnoAuthMysqlDao extends CreditVettingBaseDao<CustomerIdnoAuth> {
	{
		tableName = "b_customer_idno_auth";
		primaryIdName = "idno_auth_id";
	}
}
