package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.YdPayInfo;

@Repository
public class YdPayInfoMysqlDao extends CreditVettingBaseDao<YdPayInfo> {
	{
		tableName = "b_yd_pay_info";
		primaryIdName = "id";
	}
}
