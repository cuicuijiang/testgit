package com.repos.model.creditvetting;

import java.util.Date;
public class TelMsg {

	private Long id;
	private Long basicInfoId;
	private String customerId;
	private String idcard;
	private String userNumber;
	private String msgChannel;
	private String msgType;
	private String msgOtherNum;
	private String msgStatTime;
	private String msgCost;
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

	public void setMsgChannel(String msgChannel){
		this.msgChannel=msgChannel;
	}

	public String getMsgChannel(){
		return msgChannel;
	}

	public void setMsgType(String msgType){
		this.msgType=msgType;
	}

	public String getMsgType(){
		return msgType;
	}

	public void setMsgOtherNum(String msgOtherNum){
		this.msgOtherNum=msgOtherNum;
	}

	public String getMsgOtherNum(){
		return msgOtherNum;
	}

	public void setMsgStatTime(String msgStatTime){
		this.msgStatTime=msgStatTime;
	}

	public String getMsgStatTime(){
		return msgStatTime;
	}

	public void setMsgCost(String msgCost){
		this.msgCost=msgCost;
	}

	public String getMsgCost(){
		return msgCost;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

}
