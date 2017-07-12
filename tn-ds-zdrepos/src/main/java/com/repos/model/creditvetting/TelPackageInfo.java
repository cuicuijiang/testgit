package com.repos.model.creditvetting;

import java.util.Date;
public class TelPackageInfo {

	private Long id;
	private Long basicInfoId;
	private String taskId;
	private Long applicationId;
	private String brandName;
	private String payType;
	private String category;
	private String packageName;
	private String packageFee;
	private String feeCycle;
	private String effectTime;
	private String invalidTime;
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

	public void setBrandName(String brandName){
		this.brandName=brandName;
	}

	public String getBrandName(){
		return brandName;
	}

	public void setPayType(String payType){
		this.payType=payType;
	}

	public String getPayType(){
		return payType;
	}

	public void setCategory(String category){
		this.category=category;
	}

	public String getCategory(){
		return category;
	}

	public void setPackageName(String packageName){
		this.packageName=packageName;
	}

	public String getPackageName(){
		return packageName;
	}

	public void setPackageFee(String packageFee){
		this.packageFee=packageFee;
	}

	public String getPackageFee(){
		return packageFee;
	}

	public void setFeeCycle(String feeCycle){
		this.feeCycle=feeCycle;
	}

	public String getFeeCycle(){
		return feeCycle;
	}

	public void setEffectTime(String effectTime){
		this.effectTime=effectTime;
	}

	public String getEffectTime(){
		return effectTime;
	}

	public void setInvalidTime(String invalidTime){
		this.invalidTime=invalidTime;
	}

	public String getInvalidTime(){
		return invalidTime;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

}
