package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Frequency_detail_list implements Serializable{
	private static final long serialVersionUID = 5930637969390337937L;
	private Integer userInfoId;//用户信息ID
	private String frequency_detail_list;//频度详情字符串
	private String detail;//频度规则命中基本详情
	private String data;//频度规则列表详情
	private String type;//频度规则类型
	public String getFrequency_detail_list() {
		return frequency_detail_list;
	}
	public void setFrequency_detail_list(String frequency_detail_list) {
		this.frequency_detail_list = frequency_detail_list;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Frequency_detail_list [userInfoId=" + userInfoId + ", frequency_detail_list=" + frequency_detail_list
				+ ", detail=" + detail + ", data=" + data + ", type=" + type + "]";
	}
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
}
