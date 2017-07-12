package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class RiskPreloanResult implements Serializable{
	private static final long serialVersionUID = -8323344422218016282L;
	private Integer userInfoId;			//用户信息ID
	private Boolean success;				//是否调用成功
	private String reason_code;			//错误代码
	private String reason_desc;			//错误描述
	private Integer final_score;			//风险分数
	private String final_decision;		//风险结果，Accept建议通过,Review建议审核,Reject建议拒绝
	private String report_id;			//报告编号
	private String device_type;			//设备类型
	private String proxy_info;			//代理信息
	private Long apply_time;				//扫描时间
	private Long report_time;			//报告时间
	private String device_info;			//设备环境信息
	private String geo_ip;				//地理位置信息
	private String geo_trueip;			//真实地理位置信息
	private String risk_items;			//扫描出来的风险项
	private String kunta_call_result;	//第三方数据调用详情
	private String address_detect;		//归属地解析
	private String application_id;		//申请编号
	private String riskPreloan_json;		//返回结果JSON串
	
	
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getReason_code() {
		return reason_code;
	}
	public void setReason_code(String reason_code) {
		this.reason_code = reason_code;
	}
	public String getReason_desc() {
		return reason_desc;
	}
	public void setReason_desc(String reson_desc) {
		this.reason_desc = reson_desc;
	}
	public Integer getFinal_score() {
		return final_score;
	}
	public void setFinal_score(Integer final_score) {
		this.final_score = final_score;
	}
	public String getFinal_decision() {
		return final_decision;
	}
	public void setFinal_decision(String final_decision) {
		this.final_decision = final_decision;
	}
	public String getReport_id() {
		return report_id;
	}
	public void setReport_id(String report_id) {
		this.report_id = report_id;
	}
	public String getDevice_type() {
		return device_type;
	}
	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}

	public String getProxy_info() {
		return proxy_info;
	}
	public void setProxy_info(String proxy_info) {
		this.proxy_info = proxy_info;
	}
	public String getRisk_items() {
		return risk_items;
	}
	public void setRisk_items(String risk_items) {
		this.risk_items = risk_items;
	}
	public Long getApply_time() {
		return apply_time;
	}
	public void setApply_time(Long apply_time) {
		this.apply_time = apply_time;
	}
	public Long getReport_time() {
		return report_time;
	}
	public void setReport_time(Long report_time) {
		this.report_time = report_time;
	}
	public String getDevice_info() {
		return device_info;
	}
	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}
	public String getGeo_ip() {
		return geo_ip;
	}
	public void setGeo_ip(String geo_ip) {
		this.geo_ip = geo_ip;
	}
	public String getGeo_trueip() {
		return geo_trueip;
	}
	public void setGeo_trueip(String geo_trueip) {
		this.geo_trueip = geo_trueip;
	}

	
	public String getKunta_call_result() {
		return kunta_call_result;
	}
	public void setKunta_call_result(String kunta_call_result) {
		this.kunta_call_result = kunta_call_result;
	}
	public String getAddress_detect() {
		return address_detect;
	}
	public void setAddress_detect(String address_detect) {
		this.address_detect = address_detect;
	}
	public String getApplication_id() {
		return application_id;
	}
	public void setApplication_id(String application_id) {
		this.application_id = application_id;
	}
	public String getRiskPreloan_json() {
		return riskPreloan_json;
	}
	public void setRiskPreloan_json(String riskPreloan_json) {
		this.riskPreloan_json = riskPreloan_json;
	}
	@Override
	public String toString() {
		return "RiskPreloanResult [userInfoId=" + userInfoId + ", success=" + success + ", reason_code=" + reason_code
				+ ", reason_desc=" + reason_desc + ", final_score=" + final_score + ", final_decision=" + final_decision
				+ ", report_id=" + report_id + ", device_type=" + device_type + ", proxy_info=" + proxy_info
				+ ", apply_time=" + apply_time + ", report_time=" + report_time + ", device_info=" + device_info
				+ ", geo_ip=" + geo_ip + ", geo_trueip=" + geo_trueip + ", risk_items=" + risk_items
				+ ", kunta_call_result=" + kunta_call_result + ", address_detect=" + address_detect
				+ ", application_id=" + application_id + ", riskPreloan_json=" + riskPreloan_json + "]";
	}
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
	
}
