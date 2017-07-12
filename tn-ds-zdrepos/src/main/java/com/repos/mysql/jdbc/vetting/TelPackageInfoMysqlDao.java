package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.TelPackageInfo;

/**
 * 运营商数据-业务信息
 * basic_info_id、 task_id、 application_id
 * @author zhangqingli
 *
 */
@Repository
public class TelPackageInfoMysqlDao extends CreditVettingBaseDao<TelPackageInfo>{
	{
		tableName = "b_tel_package_info";
		primaryIdName = "id";
	}
}
