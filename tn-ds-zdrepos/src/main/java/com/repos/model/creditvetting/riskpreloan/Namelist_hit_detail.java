package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Namelist_hit_detail implements Serializable{
	private static final long serialVersionUID = -2021142405569353057L;
	private Integer userInfoId;//用户信息ID
	private String namelist_hit_details;//命中名单详情列表字符串
	private String description;//描述	
	private String fraud_type;//风险类型	
	private String hit_type_displayname;//匹配类型
	private String type;//规则标识
	private String court_details;// 法院详情
	private String fuzzy_detail_hits;//模糊名单命中详情
	public String getNamelist_hit_details() {
		return namelist_hit_details;
	}
	public void setNamelist_hit_details(String namelist_hit_details) {
		this.namelist_hit_details = namelist_hit_details;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFraud_type() {
		return fraud_type;
	}
	public void setFraud_type(String fraud_type) {
		this.fraud_type = fraud_type;
	}
	public String getHit_type_displayname() {
		return hit_type_displayname;
	}
	public void setHit_type_displayname(String hit_type_displayname) {
		this.hit_type_displayname = hit_type_displayname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCourt_details() {
		return court_details;
	}
	public void setCourt_details(String court_details) {
		this.court_details = court_details;
	}
	public String getFuzzy_detail_hits() {
		return fuzzy_detail_hits;
	}
	public void setFuzzy_detail_hits(String fuzzy_detail_hits) {
		this.fuzzy_detail_hits = fuzzy_detail_hits;
	}
	@Override
	public String toString() {
		return "Namelist_hit_detail [userInfoId=" + userInfoId + ", namelist_hit_details=" + namelist_hit_details
				+ ", description=" + description + ", fraud_type=" + fraud_type + ", hit_type_displayname="
				+ hit_type_displayname + ", type=" + type + ", court_details=" + court_details + ", fuzzy_detail_hits="
				+ fuzzy_detail_hits + "]";
	}
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
}
