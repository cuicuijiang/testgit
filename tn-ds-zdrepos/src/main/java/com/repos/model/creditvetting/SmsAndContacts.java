package com.repos.model.creditvetting;

import java.util.Date;
public class SmsAndContacts {

	private Long id;
	private String userNumber;
	private Long sceneId;
	private String sms;
	private String contacts;
	private String type;
	private Date createTime;
	private Date modifyTime;

	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return id;
	}

	public void setUserNumber(String userNumber){
		this.userNumber=userNumber;
	}

	public String getUserNumber(){
		return userNumber;
	}

	public void setSceneId(Long sceneId){
		this.sceneId=sceneId;
	}

	public Long getSceneId(){
		return sceneId;
	}

	public void setSms(String sms){
		this.sms=sms;
	}

	public String getSms(){
		return sms;
	}

	public void setContacts(String contacts){
		this.contacts=contacts;
	}

	public String getContacts(){
		return contacts;
	}

	public void setType(String type){
		this.type=type;
	}

	public String getType(){
		return type;
	}

	public void setCreateTime(Date createTime){
		this.createTime=createTime;
	}

	public Date getCreateTime(){
		return createTime;
	}

	public void setModifyTime(Date modifyTime){
		this.modifyTime=modifyTime;
	}

	public Date getModifyTime(){
		return modifyTime;
	}

	@Override
	public String toString() {
		return "SmsAndContacts [id=" + id + ", userNumber=" + userNumber + ", sceneId=" + sceneId + ", sms=" + sms
				+ ", contacts=" + contacts + ", type=" + type + ", createTime=" + createTime + ", modifyTime="
				+ modifyTime + "]";
	}
}
