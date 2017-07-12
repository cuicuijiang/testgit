package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Risk_item implements Serializable{
	private static final long serialVersionUID = -2251609592453504795L;
	private Integer userInfoId;//用户信息ID
	private String risk_items;//风险项字符串
	private Integer item_id;//检查项编号
	public Integer getItem_id() {
		return item_id;
	}
	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}
	private String item_name;//检查项名称
	private String risk_level;//风险等级
	private String group;//检查项分组
	private String item_detail;//检查详情
	public String getRisk_items() {
		return risk_items;
	}
	public void setRisk_items(String risk_items) {
		this.risk_items = risk_items;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public String getRisk_level() {
		return risk_level;
	}
	public void setRisk_level(String risk_level) {
		this.risk_level = risk_level;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getItem_detail() {
		return item_detail;
	}
	public void setItem_detail(String item_detail) {
		this.item_detail = item_detail;
	}
	@Override
	public String toString() {
		return "Risk_item [userInfoId=" + userInfoId + ", risk_items=" + risk_items + ", item_id=" + item_id
				+ ", item_name=" + item_name + ", risk_level=" + risk_level + ", group=" + group + ", item_detail="
				+ item_detail + "]";
	}
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
}
