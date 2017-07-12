/**
 * 
 */
package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.RiskpreloanRiskuserinfo;

/**
 * 同盾贷前审核报告-用户信息
 * userInfoId、 name、 id_number 身份证号、 mobile、 card_number 银行卡号、 email  
 * @author zhangqingli
 *
 */
@Repository
public class RiskpreloanRiskuserinfoMysqlDao extends CreditVettingBaseDao<RiskpreloanRiskuserinfo> {
	{
		tableName = "b_riskpreloan_riskuserinfo";
		primaryIdName = "userInfoId";
	}
}
