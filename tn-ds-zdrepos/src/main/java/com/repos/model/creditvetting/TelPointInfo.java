package com.repos.model.creditvetting;

import java.util.Date;
public class TelPointInfo {

	private Long id;
	private Long basicInfoId;
	private String taskId;
	private Long applicationId;
	private String pointCycle;
	private String pointAvailable;
	private String pointLastBalance;
	private String pointUsage;
	private String pointNewAvailable;
	private String operationTime;
	private String pointChange;
	private String pointType;
	private String operationType;
	private String userNumber;
	private Date inquiryTime;

	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return id;
	}

	public void setBasicInfoId(Long basicInfoId){
		this.basicInfoId=basicInfoId;
	}

	public Long getBasicInfoId(){
		return basicInfoId;
	}

	public void setTaskId(String taskId){
		this.taskId=taskId;
	}

	public String getTaskId(){
		return taskId;
	}

	public void setApplicationId(Long applicationId){
		this.applicationId=applicationId;
	}

	public Long getApplicationId(){
		return applicationId;
	}

	public void setPointCycle(String pointCycle){
		this.pointCycle=pointCycle;
	}

	public String getPointCycle(){
		return pointCycle;
	}

	public void setPointAvailable(String pointAvailable){
		this.pointAvailable=pointAvailable;
	}

	public String getPointAvailable(){
		return pointAvailable;
	}

	public void setPointLastBalance(String pointLastBalance){
		this.pointLastBalance=pointLastBalance;
	}

	public String getPointLastBalance(){
		return pointLastBalance;
	}

	public void setPointUsage(String pointUsage){
		this.pointUsage=pointUsage;
	}

	public String getPointUsage(){
		return pointUsage;
	}

	public void setPointNewAvailable(String pointNewAvailable){
		this.pointNewAvailable=pointNewAvailable;
	}

	public String getPointNewAvailable(){
		return pointNewAvailable;
	}

	public void setOperationTime(String operationTime){
		this.operationTime=operationTime;
	}

	public String getOperationTime(){
		return operationTime;
	}

	public void setPointChange(String pointChange){
		this.pointChange=pointChange;
	}

	public String getPointChange(){
		return pointChange;
	}

	public void setPointType(String pointType){
		this.pointType=pointType;
	}

	public String getPointType(){
		return pointType;
	}

	public void setOperationType(String operationType){
		this.operationType=operationType;
	}

	public String getOperationType(){
		return operationType;
	}

	public void setUserNumber(String userNumber){
		this.userNumber=userNumber;
	}

	public String getUserNumber(){
		return userNumber;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

}
