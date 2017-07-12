package com.repos.model.creditvetting;

import java.util.Date;
public class DxPointInfo {

	private Long id;
	private Long basicInfoId;
	private String customerId;
	private String idcard;
	private String userNumber;
	private String pointCycle;
	private String pointProduceTime;
	private String pointAvailable;
	private String pointTotal;
	private String pointUse;
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

	public void setPointCycle(String pointCycle){
		this.pointCycle=pointCycle;
	}

	public String getPointCycle(){
		return pointCycle;
	}

	public void setPointProduceTime(String pointProduceTime){
		this.pointProduceTime=pointProduceTime;
	}

	public String getPointProduceTime(){
		return pointProduceTime;
	}

	public void setPointAvailable(String pointAvailable){
		this.pointAvailable=pointAvailable;
	}

	public String getPointAvailable(){
		return pointAvailable;
	}

	public void setPointTotal(String pointTotal){
		this.pointTotal=pointTotal;
	}

	public String getPointTotal(){
		return pointTotal;
	}

	public void setPointUse(String pointUse){
		this.pointUse=pointUse;
	}

	public String getPointUse(){
		return pointUse;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

}
