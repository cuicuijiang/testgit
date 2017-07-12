package com.repos.mysql.jdbc.vetting;

import org.springframework.stereotype.Repository;

import com.repos.model.creditvetting.CustomerFaceVerify;


/**
 * 人脸识别检测
 * customer_id 客户id、 scene_verify_id 数据在场景方唯一标识、 scene_id 场景ID、 request_id 请求唯一标识
 * @author zhangqingli
 */
@Repository
public class CustomerFaceVerifyMysqlDao extends CreditVettingBaseDao<CustomerFaceVerify> {
	{
		tableName = "b_customer_face_verify";
		primaryIdName = "face_verify_id";
	}
}
