package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Mobile_id_number_check implements Serializable{
	private static final long serialVersionUID = -8066071800417160111L;
	private Integer userInfoId;//用户信息ID
	private String mobile_id_number_check;//手机号-身份证一致性验证结果字符串
	private String result;//调用结果	
	private String result_code;//调用结果编码	
	private Boolean flow_charge;//是否扣费	
	private String mobile;//手机号
	private String id_number;//身份证
	public String getMobile_id_number_check() {
		return mobile_id_number_check;
	}
	public void setMobile_id_number_check(String mobile_id_number_check) {
		this.mobile_id_number_check = mobile_id_number_check;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	@Override
	public String toString() {
		return "Mobile_id_number_check [userInfoId=" + userInfoId + ", mobile_id_number_check=" + mobile_id_number_check
				+ ", result=" + result + ", result_code=" + result_code + ", flow_charge=" + flow_charge + ", mobile="
				+ mobile + ", id_number=" + id_number + "]";
	}
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
}
