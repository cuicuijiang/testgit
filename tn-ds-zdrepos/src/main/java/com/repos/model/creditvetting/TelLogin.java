package com.repos.model.creditvetting;

import java.util.Date;

public class TelLogin {

	private Long id;
	private String taskId;
	private String idcard;
	private String userName;
	private String userNumber;
	private Integer result;
	private String remark;
	private Date createTime;
	private Date modifyTime;
	private String applicationUuid;
	private String resultJson;

	private TelBasicInfo telBasicInfo;

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setResult(Integer result) {
		this.result = result;
	}

	public Integer getResult() {
		return result;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setApplicationUuid(String applicationUuid) {
		this.applicationUuid = applicationUuid;
	}

	public String getApplicationUuid() {
		return applicationUuid;
	}

	public void setResultJson(String resultJson) {
		this.resultJson = resultJson;
	}

	public String getResultJson() {
		return resultJson;
	}

	public TelBasicInfo getTelBasicInfo() {
		return telBasicInfo;
	}

	public void setTelBasicInfo(TelBasicInfo telBasicInfo) {
		this.telBasicInfo = telBasicInfo;
	}
}
