package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.DxPointInfo;

@Repository
public class DxPointInfoMysqlDao extends CreditVettingBaseDao<DxPointInfo> {
	{
		tableName = "b_dx_point_info";
		primaryIdName = "id";
	}
}
