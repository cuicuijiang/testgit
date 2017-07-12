package com.repos.model.creditvetting;

import java.util.Date;
public class LtAccountBalance {

	private Long id;
	private Long basicInfoId;
	private String customerId;
	private String userNumber;
	private String idcard;
	private String prepayAvailable;
	private String prepayUnavailable;
	private String promAvailable;
	private String promUnavailable;
	private String totalBalance;
	private String userBalance;
	private String userBalanceUnavailable;
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

	public void setPrepayAvailable(String prepayAvailable){
		this.prepayAvailable=prepayAvailable;
	}

	public String getPrepayAvailable(){
		return prepayAvailable;
	}

	public void setPrepayUnavailable(String prepayUnavailable){
		this.prepayUnavailable=prepayUnavailable;
	}

	public String getPrepayUnavailable(){
		return prepayUnavailable;
	}

	public void setPromAvailable(String promAvailable){
		this.promAvailable=promAvailable;
	}

	public String getPromAvailable(){
		return promAvailable;
	}

	public void setPromUnavailable(String promUnavailable){
		this.promUnavailable=promUnavailable;
	}

	public String getPromUnavailable(){
		return promUnavailable;
	}

	public void setTotalBalance(String totalBalance){
		this.totalBalance=totalBalance;
	}

	public String getTotalBalance(){
		return totalBalance;
	}

	public void setUserBalance(String userBalance){
		this.userBalance=userBalance;
	}

	public String getUserBalance(){
		return userBalance;
	}

	public void setUserBalanceUnavailable(String userBalanceUnavailable){
		this.userBalanceUnavailable=userBalanceUnavailable;
	}

	public String getUserBalanceUnavailable(){
		return userBalanceUnavailable;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

}
