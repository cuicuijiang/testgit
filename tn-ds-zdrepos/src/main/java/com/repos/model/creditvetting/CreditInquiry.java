package com.repos.model.creditvetting;

import java.util.Date;
public class CreditInquiry {

	private Long inquiryId;
	private Integer sceneId;
	private String custName;
	private String mobile;
	private String idcard;
	private String bankCard;
	private Date inquiryTime;
	private Integer ccxScore;
	private String resultCode;
	private String codeName;
	private String resultData;

	public void setInquiryId(Long inquiryId){
		this.inquiryId=inquiryId;
	}

	public Long getInquiryId(){
		return inquiryId;
	}

	public void setSceneId(Integer sceneId){
		this.sceneId=sceneId;
	}

	public Integer getSceneId(){
		return sceneId;
	}

	public void setCustName(String custName){
		this.custName=custName;
	}

	public String getCustName(){
		return custName;
	}

	public void setMobile(String mobile){
		this.mobile=mobile;
	}

	public String getMobile(){
		return mobile;
	}

	public void setIdcard(String idcard){
		this.idcard=idcard;
	}

	public String getIdcard(){
		return idcard;
	}

	public void setBankCard(String bankCard){
		this.bankCard=bankCard;
	}

	public String getBankCard(){
		return bankCard;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

	public void setCcxScore(Integer ccxScore){
		this.ccxScore=ccxScore;
	}

	public Integer getCcxScore(){
		return ccxScore;
	}

	public void setResultCode(String resultCode){
		this.resultCode=resultCode;
	}

	public String getResultCode(){
		return resultCode;
	}

	public void setCodeName(String codeName){
		this.codeName=codeName;
	}

	public String getCodeName(){
		return codeName;
	}

	public void setResultData(String resultData){
		this.resultData=resultData;
	}

	public String getResultData(){
		return resultData;
	}

}
