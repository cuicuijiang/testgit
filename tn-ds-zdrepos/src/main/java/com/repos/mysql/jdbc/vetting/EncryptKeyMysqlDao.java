package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.EncryptKey;

/**
 * 
 * @author zhangqingli
 *
 */
@Repository
public class EncryptKeyMysqlDao extends CreditVettingBaseDao<EncryptKey> {
	{
		tableName = "b_key";
		primaryIdName = "id";
	}
}
