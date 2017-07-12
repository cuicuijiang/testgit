package com.repos.model.creditvetting;

import java.util.Date;
public class LtPaymentRecord {

	private Long id;
	private Long basicInfoId;
	private String customerId;
	private String userNumber;
	private String idcard;
	private String payChannel;
	private String payDate;
	private String payFee;
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

	public void setUserNumber(String userNumber){
		this.userNumber=userNumber;
	}

	public String getUserNumber(){
		return userNumber;
	}

	public void setIdcard(String idcard){
		this.idcard=idcard;
	}

	public String getIdcard(){
		return idcard;
	}

	public void setPayChannel(String payChannel){
		this.payChannel=payChannel;
	}

	public String getPayChannel(){
		return payChannel;
	}

	public void setPayDate(String payDate){
		this.payDate=payDate;
	}

	public String getPayDate(){
		return payDate;
	}

	public void setPayFee(String payFee){
		this.payFee=payFee;
	}

	public String getPayFee(){
		return payFee;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

}
