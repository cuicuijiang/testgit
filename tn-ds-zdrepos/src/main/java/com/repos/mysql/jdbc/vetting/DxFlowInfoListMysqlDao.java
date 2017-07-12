package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.DxFlowInfoList;

@Repository
public class DxFlowInfoListMysqlDao extends CreditVettingBaseDao<DxFlowInfoList>{
	{
		tableName = "b_dx_flow_info_list";
		primaryIdName = "id";
	}
}