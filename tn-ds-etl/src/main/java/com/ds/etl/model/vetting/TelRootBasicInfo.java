package com.ds.etl.model.vetting;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 基础信息表三合一
 * 
 * @author zhangqingli
 *
 */
@Document(collection="telRootBasicInfo")
public class TelRootBasicInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	//主键
	@Id
	private Long id;
	//客户id
	@Indexed
	private String customer_id;
	//实名制信息
	private String real_info;
	//身份证号
	@Indexed
	private String idcard;
	//姓名
	private String user_name;
	//联系地址
	private String cert_addr;
	//用户星级
	private String user_lvl;
	//开机状态
	private String mobile_status;
	//网龄
	private String net_age;
	//余额，单位:元
	private String balance;
	//email
	private String email;
	//手机号码
	@Indexed
	private String user_number;
	//查询时间
	private Date inquiry_time;
	//任务ID
	@Indexed
	private String task_id;
	//借款申请ID，b_loan_application表
	@Indexed
	private Integer application_id;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getReal_info() {
		return real_info;
	}
	public void setReal_info(String real_info) {
		this.real_info = real_info;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getCert_addr() {
		return cert_addr;
	}
	public void setCert_addr(String cert_addr) {
		this.cert_addr = cert_addr;
	}
	public String getUser_lvl() {
		return user_lvl;
	}
	public void setUser_lvl(String user_lvl) {
		this.user_lvl = user_lvl;
	}
	public String getMobile_status() {
		return mobile_status;
	}
	public void setMobile_status(String mobile_status) {
		this.mobile_status = mobile_status;
	}
	public String getNet_age() {
		return net_age;
	}
	public void setNet_age(String net_age) {
		this.net_age = net_age;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser_number() {
		return user_number;
	}
	public void setUser_number(String user_number) {
		this.user_number = user_number;
	}
	public Date getInquiry_time() {
		return inquiry_time;
	}
	public void setInquiry_time(Date inquiry_time) {
		this.inquiry_time = inquiry_time;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public Integer getApplication_id() {
		return application_id;
	}
	public void setApplication_id(Integer application_id) {
		this.application_id = application_id;
	}
	
}
