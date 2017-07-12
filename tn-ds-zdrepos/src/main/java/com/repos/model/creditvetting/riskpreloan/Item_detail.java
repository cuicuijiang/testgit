package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Item_detail implements Serializable{
	private static final long serialVersionUID = -7495825842858351307L;
	private Integer userInfoId;//用户信息ID
	private String item_detail;//检查项详情字符串
	private Integer item_id;
	public Integer getItem_id() {
		return item_id;
	}
	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}
	private Integer discredit_times;//信贷逾期次数
	private String overdue_details;//逾期详情
	private Integer platform_count;//多头借贷	
	private String platform_detail;//借贷详情
	private String platform_detail_dimension;//多平台细分维度详情	
	private String high_risk_areas;//高风险区域
	private String hit_list_datas;//列表数据
	private String court_details;//法院详情信息列表
	private String fraud_type;//风险类型	
	private String frequency_detail_list;//频度详情
	private String namelist_hit_details;//命中名单详情列表
	private String type;//规则的类型
	public String getItem_detail() {
		return item_detail;
	}
	public void setItem_detail(String item_detail) {
		this.item_detail = item_detail;
	}
	public Integer getDiscredit_times() {
		return discredit_times;
	}
	public void setDiscredit_times(Integer discredit_times) {
		this.discredit_times = discredit_times;
	}
	public String getOverdue_details() {
		return overdue_details;
	}
	public void setOverdue_details(String overdue_details) {
		this.overdue_details = overdue_details;
	}
	public Integer getPlatform_count() {
		return platform_count;
	}
	public void setPlatform_count(Integer platform_count) {
		this.platform_count = platform_count;
	}
	public String getPlatform_detail() {
		return platform_detail;
	}
	public void setPlatform_detail(String platform_detail) {
		this.platform_detail = platform_detail;
	}
	public String getPlatform_detail_dimension() {
		return platform_detail_dimension;
	}
	public void setPlatform_detail_dimension(String platform_detail_dimension) {
		this.platform_detail_dimension = platform_detail_dimension;
	}
	public String getHigh_risk_areas() {
		return high_risk_areas;
	}
	public void setHigh_risk_areas(String high_risk_areas) {
		this.high_risk_areas = high_risk_areas;
	}
	public String getHit_list_datas() {
		return hit_list_datas;
	}
	public void setHit_list_datas(String hit_list_datas) {
		this.hit_list_datas = hit_list_datas;
	}
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
	public String getFrequency_detail_list() {
		return frequency_detail_list;
	}
	public void setFrequency_detail_list(String frequency_detail_list) {
		this.frequency_detail_list = frequency_detail_list;
	}
	public String getNamelist_hit_details() {
		return namelist_hit_details;
	}
	public void setNamelist_hit_details(String namelist_hit_details) {
		this.namelist_hit_details = namelist_hit_details;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Item_detail [userInfoId=" + userInfoId + ", item_detail=" + item_detail + ", item_id=" + item_id
				+ ", discredit_times=" + discredit_times + ", overdue_details=" + overdue_details + ", platform_count="
				+ platform_count + ", platform_detail=" + platform_detail + ", platform_detail_dimension="
				+ platform_detail_dimension + ", high_risk_areas=" + high_risk_areas + ", hit_list_datas="
				+ hit_list_datas + ", court_details=" + court_details + ", fraud_type=" + fraud_type
				+ ", frequency_detail_list=" + frequency_detail_list + ", namelist_hit_details=" + namelist_hit_details
				+ ", type=" + type + "]";
	}
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
}
