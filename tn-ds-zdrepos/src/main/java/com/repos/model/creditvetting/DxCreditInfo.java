package com.repos.model.creditvetting;

import java.util.Date;
public class DxCreditInfo {

	private Long id;
	private Long basicInfoId;
	private String customerId;
	private String idcard;
	private String userNumber;
	private String creditLevel;
	private String creditAmount;
	private String creditTime;
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

	public void setCreditLevel(String creditLevel){
		this.creditLevel=creditLevel;
	}

	public String getCreditLevel(){
		return creditLevel;
	}

	public void setCreditAmount(String creditAmount){
		this.creditAmount=creditAmount;
	}

	public String getCreditAmount(){
		return creditAmount;
	}

	public void setCreditTime(String creditTime){
		this.creditTime=creditTime;
	}

	public String getCreditTime(){
		return creditTime;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

}
