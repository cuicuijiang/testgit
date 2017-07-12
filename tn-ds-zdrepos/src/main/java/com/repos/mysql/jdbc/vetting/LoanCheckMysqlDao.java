package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.LoanCheck;

/**
 * 借款审核表
 * loan_check_id 审核ID自增、 application_id
 * @author zhangqingli
 *
 */
@Repository
public class LoanCheckMysqlDao extends CreditVettingBaseDao<LoanCheck> {
	{
		tableName = "b_loan_check";
		primaryIdName = "loan_check_id";
	}
}
