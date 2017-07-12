package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Real_name_check implements Serializable{
	private static final long serialVersionUID = -5494271654820020101L;
	private Integer userInfoId;//用户信息ID
	private String real_name_check;//实名认证结果字符串
	private String result;//调用结果
	private String result_code;//调用结果编码
	private Boolean flow_charge;//是否扣费	
	private String name;//姓名
	private String id_number;//身份证
	public String getReal_name_check() {
		return real_name_check;
	}
	public void setReal_name_check(String real_name_check) {
		this.real_name_check = real_name_check;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResult_code() {
		return result_code;
	}
	public void setResult_code(String result_code) {
		this.result_code = result_code;
	}
	public Boolean getFlow_charge() {
		return flow_charge;
	}
	public void setFlow_charge(Boolean flow_charge) {
		this.flow_charge = flow_charge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	@Override
	public String toString() {
		return "Real_name_check [userInfoId=" + userInfoId + ", real_name_check=" + real_name_check + ", result="
				+ result + ", result_code=" + result_code + ", flow_charge=" + flow_charge + ", name=" + name
				+ ", id_number=" + id_number + "]";
	}
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
	
}
