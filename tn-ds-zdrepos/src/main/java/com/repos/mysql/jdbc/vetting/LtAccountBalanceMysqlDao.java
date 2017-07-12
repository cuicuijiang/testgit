package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.LtAccountBalance;

@Repository
public class LtAccountBalanceMysqlDao extends CreditVettingBaseDao<LtAccountBalance> {
	{
		tableName = "b_lt_account_balance";
		primaryIdName = "id";
	}
}
