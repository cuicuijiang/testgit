package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.TnapiRiskresult;

/**
 * 查询反欺诈系统返回结果
 * apply_no 申请单uuid、 scenes_id 信审场景id、 customer_id
 * @author zhangqingli
 *
 */
@Repository
public class TnapiRiskresultMysqlDao extends CreditVettingBaseDao<TnapiRiskresult> {
	{
		tableName = "b_tnapi_riskresult";
		primaryIdName = "id";
	}
}
