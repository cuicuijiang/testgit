package com.repos.model.creditvetting;

import java.util.Date;
public class YdPayInfo {

	private Long id;
	private Long basicInfoId;
	private String customerId;
	private String idcard;
	private String userNumber;
	private String feeQueryCycle;
	private String feeChannel;
	private String feeAmount;
	private String feeType;
	private String feeTime;
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

	public void setFeeQueryCycle(String feeQueryCycle){
		this.feeQueryCycle=feeQueryCycle;
	}

	public String getFeeQueryCycle(){
		return feeQueryCycle;
	}

	public void setFeeChannel(String feeChannel){
		this.feeChannel=feeChannel;
	}

	public String getFeeChannel(){
		return feeChannel;
	}

	public void setFeeAmount(String feeAmount){
		this.feeAmount=feeAmount;
	}

	public String getFeeAmount(){
		return feeAmount;
	}

	public void setFeeType(String feeType){
		this.feeType=feeType;
	}

	public String getFeeType(){
		return feeType;
	}

	public void setFeeTime(String feeTime){
		this.feeTime=feeTime;
	}

	public String getFeeTime(){
		return feeTime;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

}
