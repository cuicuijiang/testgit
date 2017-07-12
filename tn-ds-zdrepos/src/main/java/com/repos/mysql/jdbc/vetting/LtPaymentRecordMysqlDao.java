package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.LtPaymentRecord;


@Repository
public class LtPaymentRecordMysqlDao extends CreditVettingBaseDao<LtPaymentRecord> {
	{
		tableName = "b_lt_payment_record";
		primaryIdName = "id";
	}
}