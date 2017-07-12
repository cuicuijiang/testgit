package com.repos.model.creditvetting;

import java.util.Date;
public class BlackandwhiteList {

	private Integer ruleId;
	private String listType;
	private Integer sceneId;
	private String mobile;
	private String idcard;
	private String customerName;
	private Integer delFlag;
	private String summary;
	private Integer createMan;
	private Date createDate;
	private Long customerId;

	public void setRuleId(Integer ruleId){
		this.ruleId=ruleId;
	}

	public Integer getRuleId(){
		return ruleId;
	}

	public void setListType(String listType){
		this.listType=listType;
	}

	public String getListType(){
		return listType;
	}

	public void setSceneId(Integer sceneId){
		this.sceneId=sceneId;
	}

	public Integer getSceneId(){
		return sceneId;
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

	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}

	public String getCustomerName(){
		return customerName;
	}

	public void setDelFlag(Integer delFlag){
		this.delFlag=delFlag;
	}

	public Integer getDelFlag(){
		return delFlag;
	}

	public void setSummary(String summary){
		this.summary=summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setCreateMan(Integer createMan){
		this.createMan=createMan;
	}

	public Integer getCreateMan(){
		return createMan;
	}

	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}

	public Date getCreateDate(){
		return createDate;
	}

	public void setCustomerId(Long customerId){
		this.customerId=customerId;
	}

	public Long getCustomerId(){
		return customerId;
	}

}
