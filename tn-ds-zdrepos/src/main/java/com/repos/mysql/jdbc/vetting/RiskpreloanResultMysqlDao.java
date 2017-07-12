package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.RiskpreloanResult;

/**
 * 贷前审核报告- 调用结果
 * userInfoId、 report_id 报告编号、 application_id 申请编号
 * @author zhangqingli
 *
 */
@Repository
public class RiskpreloanResultMysqlDao extends CreditVettingBaseDao<RiskpreloanResult> {
	{
		tableName = "b_riskpreloan_result";
		primaryIdName = "id";
	}
}
