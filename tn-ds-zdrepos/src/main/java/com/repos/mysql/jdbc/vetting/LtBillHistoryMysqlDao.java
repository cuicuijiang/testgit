package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.LtBillHistory;

@Repository
public class LtBillHistoryMysqlDao extends CreditVettingBaseDao<LtBillHistory> {
	{
		tableName = "b_lt_bill_history";
		primaryIdName = "id";
	}
}