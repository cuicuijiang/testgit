package com.repos.model.creditvetting;

import java.util.Date;
public class YdPointInfo {

	private Long id;
	private Long basicInfoId;
	private String customerId;
	private String idcard;
	private String userNumber;
	private String currentScore;
	private String pointCycle;
	private String operationTime;
	private String serverNum;
	private String operationType;
	private String pointType;
	private String changeAmount;
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

	public void setCustomerId(String customerId){
		this.customerId=customerId;
	}

	public String getCustomerId(){
		return customerId;
	}

	public void setIdcard(String idcard){
		this.idcard=idcard;
	}

	public String getIdcard(){
		return idcard;
	}

	public void setUserNumber(String userNumber){
		this.userNumber=userNumber;
	}

	public String getUserNumber(){
		return userNumber;
	}

	public void setCurrentScore(String currentScore){
		this.currentScore=currentScore;
	}

	public String getCurrentScore(){
		return currentScore;
	}

	public void setPointCycle(String pointCycle){
		this.pointCycle=pointCycle;
	}

	public String getPointCycle(){
		return pointCycle;
	}

	public void setOperationTime(String operationTime){
		this.operationTime=operationTime;
	}

	public String getOperationTime(){
		return operationTime;
	}

	public void setServerNum(String serverNum){
		this.serverNum=serverNum;
	}

	public String getServerNum(){
		return serverNum;
	}

	public void setOperationType(String operationType){
		this.operationType=operationType;
	}

	public String getOperationType(){
		return operationType;
	}

	public void setPointType(String pointType){
		this.pointType=pointType;
	}

	public String getPointType(){
		return pointType;
	}

	public void setChangeAmount(String changeAmount){
		this.changeAmount=changeAmount;
	}

	public String getChangeAmount(){
		return changeAmount;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

}
