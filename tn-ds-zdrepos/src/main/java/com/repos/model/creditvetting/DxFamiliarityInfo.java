package com.repos.model.creditvetting;

import java.util.Date;
public class DxFamiliarityInfo {

	private Long id;
	private Long basicInfoId;
	private String idcard;
	private String userNumber;
	private String taskId;
	private String memberNumber;
	private String memberCornet;
	private String memberType;
	private String memberCreatTime;
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

	public void setTaskId(String taskId){
		this.taskId=taskId;
	}

	public String getTaskId(){
		return taskId;
	}

	public void setMemberNumber(String memberNumber){
		this.memberNumber=memberNumber;
	}

	public String getMemberNumber(){
		return memberNumber;
	}

	public void setMemberCornet(String memberCornet){
		this.memberCornet=memberCornet;
	}

	public String getMemberCornet(){
		return memberCornet;
	}

	public void setMemberType(String memberType){
		this.memberType=memberType;
	}

	public String getMemberType(){
		return memberType;
	}

	public void setMemberCreatTime(String memberCreatTime){
		this.memberCreatTime=memberCreatTime;
	}

	public String getMemberCreatTime(){
		return memberCreatTime;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

}
