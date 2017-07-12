package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Proxy_info implements Serializable{
	private static final long serialVersionUID = -2377737708390721005L;
	private Integer userInfoId;//用户信息ID
	private String proxy_info;//代理信息字符串
	private String port;//代理端口
	private String proxyProtocol;//代理协议
	private String proxyType;//代理类型
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getProxyProtocol() {
		return proxyProtocol;
	}
	public void setProxyProtocol(String proxyProtocol) {
		this.proxyProtocol = proxyProtocol;
	}
	public String getProxyType() {
		return proxyType;
	}
	public void setProxyType(String proxyType) {
		this.proxyType = proxyType;
	}
	public String getProxy_info() {
		return proxy_info;
	}
	public void setProxy_info(String proxy_info) {
		this.proxy_info = proxy_info;
	}
	@Override
	public String toString() {
		return "Proxy_info [userInfoId=" + userInfoId + ", proxy_info=" + proxy_info + ", port=" + port
				+ ", proxyProtocol=" + proxyProtocol + ", proxyType=" + proxyType + "]";
	}
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
	
}
