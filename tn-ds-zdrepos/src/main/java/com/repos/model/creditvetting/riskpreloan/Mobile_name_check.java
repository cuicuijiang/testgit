package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Mobile_name_check implements Serializable{
	private static final long serialVersionUID = -2654701989329599702L;
	private Integer userInfoId;//用户信息ID
	private String mobile_name_check;//手机号-姓名一致性验证详情字符串
	private String result;//调用结果
	private String result_code;//调用结果编码
	private Boolean flow_charge;//是否扣费
	private String mobile;//手机号
	private String name;//姓名
	public String getMobile_name_check() {
		return mobile_name_check;
	}
	public void setMobile_name_check(String mobile_name_check) {
		this.mobile_name_check = mobile_name_check;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Mobile_name_check [userInfoId=" + userInfoId + ", mobile_name_check=" + mobile_name_check + ", result="
				+ result + ", result_code=" + result_code + ", flow_charge=" + flow_charge + ", mobile=" + mobile
				+ ", name=" + name + "]";
	}
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
}
