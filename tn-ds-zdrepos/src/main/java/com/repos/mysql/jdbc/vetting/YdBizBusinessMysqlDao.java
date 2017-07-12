package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.YdBizBusiness;

/**
 * YdBizBusinessMysqlDao
 * @author zhangqingli
 *
 */
@Repository
public class YdBizBusinessMysqlDao extends CreditVettingBaseDao<YdBizBusiness> {
	{
		tableName = "b_yd_biz_business";
		primaryIdName = "id";
	}
}
