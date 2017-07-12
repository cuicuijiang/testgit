package com.repos.model.creditvetting;

import java.util.List;

import com.repos.model.creditvetting.riskpreloan.Address_detect;
import com.repos.model.creditvetting.riskpreloan.Court_detail;
import com.repos.model.creditvetting.riskpreloan.Device_info;
import com.repos.model.creditvetting.riskpreloan.Frequency_detail_list;
import com.repos.model.creditvetting.riskpreloan.Geo_ip;
import com.repos.model.creditvetting.riskpreloan.Geo_trueip;
import com.repos.model.creditvetting.riskpreloan.Item_detail;
import com.repos.model.creditvetting.riskpreloan.Kunta_call_result;
import com.repos.model.creditvetting.riskpreloan.Namelist_hit_detail;
import com.repos.model.creditvetting.riskpreloan.Overdue_detail;
import com.repos.model.creditvetting.riskpreloan.Platform_detail_dimension;
import com.repos.model.creditvetting.riskpreloan.Proxy_info;
import com.repos.model.creditvetting.riskpreloan.Risk_item;

public class RiskpreloanResult {

	private Long id;
	private Long userInfoId;
	private Integer success;
	private String reasonCode;
	private String reasonDesc;
	private Integer finalScore;
	private String finalDecision;
	private String reportId;
	private String deviceType;
	private String proxyInfo;
	private Long applyTime;
	private Long reportTime;
	private String deviceInfo;
	private String geoIp;
	private String geoTrueip;
	private String riskItems;
	private String kuntaCallResult;
	private String addressDetect;
	private String applicationUuid;
	private String riskPreloanJson;

	private Address_detect result_address_detect;
	private List<Court_detail> result_court_details;
	private Device_info result_device_info;
	private List<Frequency_detail_list> result_frequency_detail_lists;
	private Geo_ip result_geo_ip;
	private Geo_trueip result_geo_trueip;
	private List<Item_detail> result_item_details;
	private List<Namelist_hit_detail> result_namelist_hit_details;
	private List<Overdue_detail> result_overdue_details;
	private List<Platform_detail_dimension> result_platform_detail_dimensions;
	private List<Risk_item> result_risk_items;
	private List<Proxy_info> result_proxy_infos;
	private Kunta_call_result result_kunta_call_result;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Long userInfoId) {
		this.userInfoId = userInfoId;
	}
	public Integer getSuccess() {
		return success;
	}
	public void setSuccess(Integer success) {
		this.success = success;
	}
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getReasonDesc() {
		return reasonDesc;
	}
	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}
	public Integer getFinalScore() {
		return finalScore;
	}
	public void setFinalScore(Integer finalScore) {
		this.finalScore = finalScore;
	}
	public String getFinalDecision() {
		return finalDecision;
	}
	public void setFinalDecision(String finalDecision) {
		this.finalDecision = finalDecision;
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getProxyInfo() {
		return proxyInfo;
	}
	public void setProxyInfo(String proxyInfo) {
		this.proxyInfo = proxyInfo;
	}
	public Long getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Long applyTime) {
		this.applyTime = applyTime;
	}
	public Long getReportTime() {
		return reportTime;
	}
	public void setReportTime(Long reportTime) {
		this.reportTime = reportTime;
	}
	public String getDeviceInfo() {
		return deviceInfo;
	}
	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}
	public String getGeoIp() {
		return geoIp;
	}
	public void setGeoIp(String geoIp) {
		this.geoIp = geoIp;
	}
	public String getGeoTrueip() {
		return geoTrueip;
	}
	public void setGeoTrueip(String geoTrueip) {
		this.geoTrueip = geoTrueip;
	}
	public String getRiskItems() {
		return riskItems;
	}
	public void setRiskItems(String riskItems) {
		this.riskItems = riskItems;
	}
	public String getKuntaCallResult() {
		return kuntaCallResult;
	}
	public void setKuntaCallResult(String kuntaCallResult) {
		this.kuntaCallResult = kuntaCallResult;
	}
	public String getAddressDetect() {
		return addressDetect;
	}
	public void setAddressDetect(String addressDetect) {
		this.addressDetect = addressDetect;
	}
	public String getApplicationUuid() {
		return applicationUuid;
	}
	public void setApplicationUuid(String applicationUuid) {
		this.applicationUuid = applicationUuid;
	}
	public String getRiskPreloanJson() {
		return riskPreloanJson;
	}
	public void setRiskPreloanJson(String riskPreloanJson) {
		this.riskPreloanJson = riskPreloanJson;
	}
	public Address_detect getResult_address_detect() {
		return result_address_detect;
	}
	public void setResult_address_detect(Address_detect result_address_detect) {
		this.result_address_detect = result_address_detect;
	}
	public List<Court_detail> getResult_court_details() {
		return result_court_details;
	}
	public void setResult_court_details(List<Court_detail> result_court_details) {
		this.result_court_details = result_court_details;
	}
	public Device_info getResult_device_info() {
		return result_device_info;
	}
	public void setResult_device_info(Device_info result_device_info) {
		this.result_device_info = result_device_info;
	}
	public List<Frequency_detail_list> getResult_frequency_detail_lists() {
		return result_frequency_detail_lists;
	}
	public void setResult_frequency_detail_lists(List<Frequency_detail_list> result_frequency_detail_lists) {
		this.result_frequency_detail_lists = result_frequency_detail_lists;
	}
	public Geo_ip getResult_geo_ip() {
		return result_geo_ip;
	}
	public void setResult_geo_ip(Geo_ip result_geo_ip) {
		this.result_geo_ip = result_geo_ip;
	}
	public Geo_trueip getResult_geo_trueip() {
		return result_geo_trueip;
	}
	public void setResult_geo_trueip(Geo_trueip result_geo_trueip) {
		this.result_geo_trueip = result_geo_trueip;
	}
	public List<Item_detail> getResult_item_details() {
		return result_item_details;
	}
	public void setResult_item_details(List<Item_detail> result_item_details) {
		this.result_item_details = result_item_details;
	}
	public List<Namelist_hit_detail> getResult_namelist_hit_details() {
		return result_namelist_hit_details;
	}
	public void setResult_namelist_hit_details(List<Namelist_hit_detail> result_namelist_hit_details) {
		this.result_namelist_hit_details = result_namelist_hit_details;
	}
	public List<Overdue_detail> getResult_overdue_details() {
		return result_overdue_details;
	}
	public void setResult_overdue_details(List<Overdue_detail> result_overdue_details) {
		this.result_overdue_details = result_overdue_details;
	}
	public List<Platform_detail_dimension> getResult_platform_detail_dimensions() {
		return result_platform_detail_dimensions;
	}
	public void setResult_platform_detail_dimensions(List<Platform_detail_dimension> result_platform_detail_dimensions) {
		this.result_platform_detail_dimensions = result_platform_detail_dimensions;
	}
	public List<Risk_item> getResult_risk_items() {
		return result_risk_items;
	}
	public void setResult_risk_items(List<Risk_item> result_risk_items) {
		this.result_risk_items = result_risk_items;
	}
	public List<Proxy_info> getResult_proxy_infos() {
		return result_proxy_infos;
	}
	public void setResult_proxy_infos(List<Proxy_info> result_proxy_infos) {
		this.result_proxy_infos = result_proxy_infos;
	}
	public Kunta_call_result getResult_kunta_call_result() {
		return result_kunta_call_result;
	}
	public void setResult_kunta_call_result(Kunta_call_result result_kunta_call_result) {
		this.result_kunta_call_result = result_kunta_call_result;
	}
}
