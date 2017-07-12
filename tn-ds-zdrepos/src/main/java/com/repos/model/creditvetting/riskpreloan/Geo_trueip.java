package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Geo_trueip implements Serializable{
	private static final long serialVersionUID = -861251258484246259L;
	private Integer userInfoId;//用户信息ID
	private String geo_trueip;//真实IP地址详情字符串
	private String ip; //ip地址
	private Long lip;//long 型ip
	private String country;//IP地址所处国家
	private String province;//所在省份
	private String city;//IP地址所处城市
	private String county;//IP地址所处县
	private String isp;//互联网服务提供商
	private Double latitude;//纬度
	private Double longitude;//经度
	public String getGeo_trueip() {
		return geo_trueip;
	}
	public void setGeo_trueip(String geo_trueip) {
		this.geo_trueip = geo_trueip;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Long getLip() {
		return lip;
	}
	public void setLip(Long lip) {
		this.lip = lip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getIsp() {
		return isp;
	}
	public void setIsp(String isp) {
		this.isp = isp;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "Geo_trueip [userInfoId=" + userInfoId + ", geo_trueip=" + geo_trueip + ", ip=" + ip + ", lip=" + lip
				+ ", country=" + country + ", province=" + province + ", city=" + city + ", county=" + county + ", isp="
				+ isp + ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
}
