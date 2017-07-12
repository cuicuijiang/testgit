package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.TelephoneAudit;

/**
 * 借款申请表
 * @author zhangqingli
 *
 */
@Repository
public class TelephoneAuditMysqlDao extends CreditVettingBaseDao<TelephoneAudit> {

	{
		tableName = "b_telephone_audit";
		primaryIdName = "telephone_audit_id";
	}
}
