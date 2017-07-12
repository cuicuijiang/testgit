package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Device_info implements Serializable{
	private static final long serialVersionUID = 8383628283736743495L;
	private Integer userInfoId;//用户信息ID
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
	private String device_info;//设备环境信息字符串
	private String accept;//请求
	private String acceptEncoding;//请求编码
	private String acceptLanguage;//请求语言
	private String browser;//浏览器
	private String browserType;//浏览器类型
	private String browserVersion;//浏览器版本
	private String canvas;//
	private String cookieEnabled;//是否使用cookie
	private String deviceId;//设备ID
	private String deviceType;//设备类型
	private String flashEnabled;//是否使用flash
	private String fontId;//字体id
	private String fpCookie;//
	private String identifier;//识别码
	private String langRes;//语言编号
	private String languageRes;//语言类型
	private String os;//操作系统
	private String pluginList;//插件表
	private String refer;//电脑网址
	private String referer;//手机网址
	private String screenRes;//屏幕信息
	private String smartId;//硬件ID
	private String softId;//软件ID
	private String tcpOs;//tcp系统版本
	private String tokenId;//
	private String trueIp;//真实ip
	private String userAgent;//代理
	private String version;//版本
	public String getDevice_info() {
		return device_info;
	}
	public void setDevice_info(String device_info) {
		this.device_info = device_info;
	}
	public String getAccept() {
		return accept;
	}
	public void setAccept(String accept) {
		this.accept = accept;
	}
	public String getAcceptEncoding() {
		return acceptEncoding;
	}
	public void setAcceptEncoding(String acceptEncoding) {
		this.acceptEncoding = acceptEncoding;
	}
	public String getAcceptLanguage() {
		return acceptLanguage;
	}
	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public String getBrowserType() {
		return browserType;
	}
	public void setBrowserType(String browserType) {
		this.browserType = browserType;
	}
	public String getBrowserVersion() {
		return browserVersion;
	}
	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}
	public String getCanvas() {
		return canvas;
	}
	public void setCanvas(String canvas) {
		this.canvas = canvas;
	}
	public String getCookieEnabled() {
		return cookieEnabled;
	}
	public void setCookieEnabled(String cookieEnabled) {
		this.cookieEnabled = cookieEnabled;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getFlashEnabled() {
		return flashEnabled;
	}
	public void setFlashEnabled(String flashEnabled) {
		this.flashEnabled = flashEnabled;
	}
	public String getFontId() {
		return fontId;
	}
	public void setFontId(String fontId) {
		this.fontId = fontId;
	}
	public String getFpCookie() {
		return fpCookie;
	}
	public void setFpCookie(String fpCookie) {
		this.fpCookie = fpCookie;
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getLangRes() {
		return langRes;
	}
	public void setLangRes(String langRes) {
		this.langRes = langRes;
	}
	public String getLanguageRes() {
		return languageRes;
	}
	public void setLanguageRes(String languageRes) {
		this.languageRes = languageRes;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getPluginList() {
		return pluginList;
	}
	public void setPluginList(String pluginList) {
		this.pluginList = pluginList;
	}
	public String getRefer() {
		return refer;
	}
	public void setRefer(String refer) {
		this.refer = refer;
	}
	public String getReferer() {
		return referer;
	}
	public void setReferer(String referer) {
		this.referer = referer;
	}
	public String getScreenRes() {
		return screenRes;
	}
	public void setScreenRes(String screenRes) {
		this.screenRes = screenRes;
	}
	public String getSmartId() {
		return smartId;
	}
	public void setSmartId(String smartId) {
		this.smartId = smartId;
	}
	public String getSoftId() {
		return softId;
	}
	public void setSoftId(String softId) {
		this.softId = softId;
	}
	public String getTcpOs() {
		return tcpOs;
	}
	public void setTcpOs(String tcpOs) {
		this.tcpOs = tcpOs;
	}
	public String getTokenId() {
		return tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	public String getTrueIp() {
		return trueIp;
	}
	public void setTrueIp(String trueIp) {
		this.trueIp = trueIp;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Device_info [userInfoId=" + userInfoId + ", device_info=" + device_info + ", accept=" + accept
				+ ", acceptEncoding=" + acceptEncoding + ", acceptLanguage=" + acceptLanguage + ", browser=" + browser
				+ ", browserType=" + browserType + ", browserVersion=" + browserVersion + ", canvas=" + canvas
				+ ", cookieEnabled=" + cookieEnabled + ", deviceId=" + deviceId + ", deviceType=" + deviceType
				+ ", flashEnabled=" + flashEnabled + ", fontId=" + fontId + ", fpCookie=" + fpCookie + ", identifier="
				+ identifier + ", langRes=" + langRes + ", languageRes=" + languageRes + ", os=" + os + ", pluginList="
				+ pluginList + ", refer=" + refer + ", referer=" + referer + ", screenRes=" + screenRes + ", smartId="
				+ smartId + ", softId=" + softId + ", tcpOs=" + tcpOs + ", tokenId=" + tokenId + ", trueIp=" + trueIp
				+ ", userAgent=" + userAgent + ", version=" + version + "]";
	}
	
}
