package com.repos.model.creditvetting;

import java.util.Date;
public class LtBillHistory {

	private Long id;
	private Long basicInfoId;
	private String customerId;
	private String userNumber;
	private String idcard;
	private String billCycle;
	private String feeAmount;
	private String feeName;
	private String integrateItemCode;
	private String usedValue;
	private String parentItemCode;
	private String writeOffFee;
	private String actionFeeUsed;
	private String allFee;
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

	public void setBillCycle(String billCycle){
		this.billCycle=billCycle;
	}

	public String getBillCycle(){
		return billCycle;
	}

	public void setFeeAmount(String feeAmount){
		this.feeAmount=feeAmount;
	}

	public String getFeeAmount(){
		return feeAmount;
	}

	public void setFeeName(String feeName){
		this.feeName=feeName;
	}

	public String getFeeName(){
		return feeName;
	}

	public void setIntegrateItemCode(String integrateItemCode){
		this.integrateItemCode=integrateItemCode;
	}

	public String getIntegrateItemCode(){
		return integrateItemCode;
	}

	public void setUsedValue(String usedValue){
		this.usedValue=usedValue;
	}

	public String getUsedValue(){
		return usedValue;
	}

	public void setParentItemCode(String parentItemCode){
		this.parentItemCode=parentItemCode;
	}

	public String getParentItemCode(){
		return parentItemCode;
	}

	public void setWriteOffFee(String writeOffFee){
		this.writeOffFee=writeOffFee;
	}

	public String getWriteOffFee(){
		return writeOffFee;
	}

	public void setActionFeeUsed(String actionFeeUsed){
		this.actionFeeUsed=actionFeeUsed;
	}

	public String getActionFeeUsed(){
		return actionFeeUsed;
	}

	public void setAllFee(String allFee){
		this.allFee=allFee;
	}

	public String getAllFee(){
		return allFee;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

}
