package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.YqbFengkong;

@Repository
public class YqbFengkongMysqlDao extends CreditVettingBaseDao<YqbFengkong> {
	{
		tableName = "b_yqb_fengkong";
		primaryIdName = "id";
	}
}
