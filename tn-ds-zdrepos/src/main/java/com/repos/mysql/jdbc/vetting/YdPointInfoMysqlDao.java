package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.YdPointInfo;

@Repository
public class YdPointInfoMysqlDao extends CreditVettingBaseDao<YdPointInfo> {
	{
		tableName = "b_yd_point_info";
		primaryIdName = "id";
	}
}
