package com.repos.model.creditvetting;

import java.util.Date;
public class YqbFengkong {

	private Long id;
	private String orderId;
	private String method;
	private String businessParams;
	private String applyMsg;
	private String resultJson;
	private String resultMsg;
	private String resultCode;
	private String resultDict;
	private Date inquiryTime;
	private Date modifyTime;
	private String applyCode;

	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return id;
	}

	public void setOrderId(String orderId){
		this.orderId=orderId;
	}

	public String getOrderId(){
		return orderId;
	}

	public void setMethod(String method){
		this.method=method;
	}

	public String getMethod(){
		return method;
	}

	public void setBusinessParams(String businessParams){
		this.businessParams=businessParams;
	}

	public String getBusinessParams(){
		return businessParams;
	}

	public void setApplyMsg(String applyMsg){
		this.applyMsg=applyMsg;
	}

	public String getApplyMsg(){
		return applyMsg;
	}

	public void setResultJson(String resultJson){
		this.resultJson=resultJson;
	}

	public String getResultJson(){
		return resultJson;
	}

	public void setResultMsg(String resultMsg){
		this.resultMsg=resultMsg;
	}

	public String getResultMsg(){
		return resultMsg;
	}

	public void setResultCode(String resultCode){
		this.resultCode=resultCode;
	}

	public String getResultCode(){
		return resultCode;
	}

	public void setResultDict(String resultDict){
		this.resultDict=resultDict;
	}

	public String getResultDict(){
		return resultDict;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

	public void setModifyTime(Date modifyTime){
		this.modifyTime=modifyTime;
	}

	public Date getModifyTime(){
		return modifyTime;
	}

	public void setApplyCode(String applyCode){
		this.applyCode=applyCode;
	}

	public String getApplyCode(){
		return applyCode;
	}

}
