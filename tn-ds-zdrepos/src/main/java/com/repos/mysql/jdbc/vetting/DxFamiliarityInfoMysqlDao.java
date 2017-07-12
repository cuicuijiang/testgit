package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.DxFamiliarityInfo;

@Repository
public class DxFamiliarityInfoMysqlDao extends CreditVettingBaseDao<DxFamiliarityInfo> {
	{
		tableName = "b_dx_familiarity_info";
		primaryIdName = "id";
	}
}
