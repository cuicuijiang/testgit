package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;
import com.repos.model.creditvetting.LoanApplication;


/**
 * 申请借贷表
 * application_id 借款申请ID自增、 application_uuid 贷款申请UUID、 scene_apply_id前端贷款单号、 
 * scene_id场景id、 customer_id 客户ID 对应b_customer.customer_id、 apply_date 申请时间 、
 * contract_id 合同ID，contract_sign=2时有效，可能为null、 hengdu_apply_id 申请号衡度专用、 
 * hengdu_scene_id 场景号衡度专用
 * 
 * @author zhangqingli
 *
 */
@Repository
public class LoanApplicationMysqlDao extends CreditVettingBaseDao<LoanApplication>{
	
	{
		tableName = "b_loan_application";
		primaryIdName = "application_id";
	}
	
}




