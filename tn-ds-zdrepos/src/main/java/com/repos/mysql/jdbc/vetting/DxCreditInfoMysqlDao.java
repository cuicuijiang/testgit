package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.DxCreditInfo;

@Repository
public class DxCreditInfoMysqlDao extends CreditVettingBaseDao<DxCreditInfo> {
	{
		tableName = "b_dx_credit_info";
		primaryIdName = "id";
	}
}
