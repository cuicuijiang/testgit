package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.DxPackageInfo;


@Repository
public class DxPackageInfoMysqlDao extends CreditVettingBaseDao<DxPackageInfo> {
	{
		tableName = "b_dx_package_info";
		primaryIdName = "id";
	}
}
