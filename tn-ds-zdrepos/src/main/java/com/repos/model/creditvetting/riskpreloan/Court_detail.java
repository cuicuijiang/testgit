package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

/**
 * 法院详情信息
 *
 */
public class Court_detail implements Serializable{
	private static final long serialVersionUID = -113446209133259069L;
	private Integer userInfoId;			//用户信息ID
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
	private String court_details;		//法院详情JSON
	private String fraud_type;			//风险类型
	private String name;				//被执行人姓名
	private String id_number;
	private String age;					//年龄
	private String gender;				//性别
	private String province;			//省份
	private String filing_time;			//立案时间
	private String court_name;			//执行法院
	private String execution_department;//做出执行依据的单位
	private String duty;				//生效法律文书确定的义务
	private String situation;			//被执行人的执行情况
	private String discredit_detail;	//失信被执行人行为具体情形
	private String execution_base;		//执行依据文号
	private String case_number;			//案号
	private String execution_number;	//执行标的
	private String execution_status;	//执行状态
	public String getCourt_details() {
		return court_details;
	}
	public void setCourt_details(String court_details) {
		this.court_details = court_details;
	}
	public String getFraud_type() {
		return fraud_type;
	}
	public void setFraud_type(String fraud_type) {
		this.fraud_type = fraud_type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getFiling_time() {
		return filing_time;
	}
	public void setFiling_time(String filing_time) {
		this.filing_time = filing_time;
	}
	public String getCourt_name() {
		return court_name;
	}
	public void setCourt_name(String court_name) {
		this.court_name = court_name;
	}
	public String getExecution_department() {
		return execution_department;
	}
	public void setExecution_department(String execution_department) {
		this.execution_department = execution_department;
	}
	public String getDuty() {
		return duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public String getDiscredit_detail() {
		return discredit_detail;
	}
	public void setDiscredit_detail(String discredit_detail) {
		this.discredit_detail = discredit_detail;
	}
	public String getExecution_base() {
		return execution_base;
	}
	public void setExecution_base(String execution_base) {
		this.execution_base = execution_base;
	}
	public String getCase_number() {
		return case_number;
	}
	public void setCase_number(String case_number) {
		this.case_number = case_number;
	}
	public String getExecution_number() {
		return execution_number;
	}
	public void setExecution_number(String execution_number) {
		this.execution_number = execution_number;
	}
	public String getExecution_status() {
		return execution_status;
	}
	public void setExecution_status(String execution_status) {
		this.execution_status = execution_status;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	@Override
	public String toString() {
		return "Court_detail [userInfoId=" + userInfoId + ", court_details=" + court_details + ", fraud_type="
				+ fraud_type + ", name=" + name + ", id_number=" + id_number + ", age=" + age + ", gender=" + gender
				+ ", province=" + province + ", filing_time=" + filing_time + ", court_name=" + court_name
				+ ", execution_department=" + execution_department + ", duty=" + duty + ", situation=" + situation
				+ ", discredit_detail=" + discredit_detail + ", execution_base=" + execution_base + ", case_number="
				+ case_number + ", execution_number=" + execution_number + ", execution_status=" + execution_status
				+ "]";
	}
}
