package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Geo_ip implements Serializable{
	private static final long serialVersionUID = 8791415946349247662L;
	private Integer userInfoId;//用户信息ID
	private String geo_ip;//IP地址详情字符串
	private String ip; //ip地址
	private Long lip;//long 型ip
	private String country;//IP地址所处国家
	private String province;//所在省份
	private String city;//IP地址所处城市
	private String county;//IP地址所处县
	private String isp;//互联网服务提供商
	private Double latitude;//纬度
	private Double longitude;//经度
	public String getGeo_ip() {
		return geo_ip;
	}
	public void setGeo_ip(String geo_ip) {
		this.geo_ip = geo_ip;
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
		return "Geo_ip [userInfoId=" + userInfoId + ", geo_ip=" + geo_ip + ", ip=" + ip + ", lip=" + lip + ", country="
				+ country + ", province=" + province + ", city=" + city + ", county=" + county + ", isp=" + isp
				+ ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
	
}
