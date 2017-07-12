package com.repos.model.creditvetting;

import java.util.Date;
import java.util.List;

public class TelBasicInfo {

	private Long id;
	private Long customerId;
	private String realInfo;
	private String idcard;
	private String userName;
	private String certAddr;
	private String userLvl;
	private String mobileStatus;
	private String netAge;
	private String balance;
	private String email;
	private String userNumber;
	private Date inquiryTime;
	private String taskId;
	private Integer applicationId;

	private List<TelCall> telCalls;
	private List<TelMsg> telMsgs;
	private List<TelPackageInfo> telPackageInfos;
	private List<TelPointInfo> telPointInfos;
	private List<TelBillHistory> telBillHistories;
	private TelYd telYd;
	private TelLt telLt;
	private TelDx telDx;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getRealInfo() {
		return realInfo;
	}

	public void setRealInfo(String realInfo) {
		this.realInfo = realInfo;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCertAddr() {
		return certAddr;
	}

	public void setCertAddr(String certAddr) {
		this.certAddr = certAddr;
	}

	public String getUserLvl() {
		return userLvl;
	}

	public void setUserLvl(String userLvl) {
		this.userLvl = userLvl;
	}

	public String getMobileStatus() {
		return mobileStatus;
	}

	public void setMobileStatus(String mobileStatus) {
		this.mobileStatus = mobileStatus;
	}

	public String getNetAge() {
		return netAge;
	}

	public void setNetAge(String netAge) {
		this.netAge = netAge;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public Date getInquiryTime() {
		return inquiryTime;
	}

	public void setInquiryTime(Date inquiryTime) {
		this.inquiryTime = inquiryTime;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Integer getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Integer applicationId) {
		this.applicationId = applicationId;
	}

	public List<TelCall> getTelCalls() {
		return telCalls;
	}

	public void setTelCalls(List<TelCall> telCalls) {
		this.telCalls = telCalls;
	}

	public List<TelMsg> getTelMsgs() {
		return telMsgs;
	}

	public void setTelMsgs(List<TelMsg> telMsgs) {
		this.telMsgs = telMsgs;
	}

	public List<TelPackageInfo> getTelPackageInfos() {
		return telPackageInfos;
	}

	public void setTelPackageInfos(List<TelPackageInfo> telPackageInfos) {
		this.telPackageInfos = telPackageInfos;
	}

	public List<TelPointInfo> getTelPointInfos() {
		return telPointInfos;
	}

	public void setTelPointInfos(List<TelPointInfo> telPointInfos) {
		this.telPointInfos = telPointInfos;
	}

	public List<TelBillHistory> getTelBillHistories() {
		return telBillHistories;
	}

	public void setTelBillHistories(List<TelBillHistory> telBillHistories) {
		this.telBillHistories = telBillHistories;
	}

	public TelYd getTelYd() {
		return telYd;
	}

	public void setTelYd(TelYd telYd) {
		this.telYd = telYd;
	}

	public TelLt getTelLt() {
		return telLt;
	}

	public void setTelLt(TelLt telLt) {
		this.telLt = telLt;
	}

	public TelDx getTelDx() {
		return telDx;
	}

	public void setTelDx(TelDx telDx) {
		this.telDx = telDx;
	}

}
