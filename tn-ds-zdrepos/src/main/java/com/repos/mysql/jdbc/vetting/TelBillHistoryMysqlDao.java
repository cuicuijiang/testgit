package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;
import com.repos.model.creditvetting.TelBillHistory;

/**
 * 运营商数据-短信表三合一
 * basic_info_id 对应b_t_basic_info表中的id、 customer_id、 idcard、 user_number
 * @author zhangqingli
 *
 */
@Repository
public class TelBillHistoryMysqlDao extends CreditVettingBaseDao<TelBillHistory>{
	{
		tableName = "b_t_bill_history";
		primaryIdName = "id";
	}
}
