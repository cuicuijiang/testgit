package com.repos.model.creditvetting;

import java.util.Date;
public class YdBizBusiness {

	private Long id;
	private Long basicInfoId;
	private String customerId;
	private String idcard;
	private String userNumber;
	private String businessFee;
	private String businessCategory;
	private String businessName;
	private String effectTime;
	private String invalidTime;
	private String queryCycle;
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

	public void setBusinessFee(String businessFee){
		this.businessFee=businessFee;
	}

	public String getBusinessFee(){
		return businessFee;
	}

	public void setBusinessCategory(String businessCategory){
		this.businessCategory=businessCategory;
	}

	public String getBusinessCategory(){
		return businessCategory;
	}

	public void setBusinessName(String businessName){
		this.businessName=businessName;
	}

	public String getBusinessName(){
		return businessName;
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

	public void setQueryCycle(String queryCycle){
		this.queryCycle=queryCycle;
	}

	public String getQueryCycle(){
		return queryCycle;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

}
