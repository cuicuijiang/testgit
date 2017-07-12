package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.YdDetailInfo;

/**
 * @author zhangqingli
 *
 */
@Repository
public class YdDetailInfoMysqlDao extends CreditVettingBaseDao<YdDetailInfo> {
	{
		tableName = "b_yd_detail_info";
		primaryIdName = "id";
	}
}
