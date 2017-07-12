package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;
import com.repos.model.creditvetting.TelPointInfo;

/**
 * 运营商数据-积分信息
 * basic_info_id、 task_id、 application_id、 user_number
 * @author zhangqingli
 *
 */
@Repository
public class TelPointInfoMysqlDao extends CreditVettingBaseDao<TelPointInfo>{
	{
		tableName = "b_tel_point_info";
		primaryIdName = "id";
	}
}
