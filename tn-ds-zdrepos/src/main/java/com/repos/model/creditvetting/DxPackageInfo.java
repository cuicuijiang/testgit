package com.repos.model.creditvetting;

import java.util.Date;
public class DxPackageInfo {

	private Long id;
	private Long basicInfoId;
	private String customerId;
	private String idcard;
	private String userNumber;
	private String packageName;
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

	public void setPackageName(String packageName){
		this.packageName=packageName;
	}

	public String getPackageName(){
		return packageName;
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
