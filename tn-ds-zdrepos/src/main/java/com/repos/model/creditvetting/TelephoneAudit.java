package com.repos.model.creditvetting;

import java.util.Date;
public class TelephoneAudit {

	private Long telephoneAuditId;
	private Long customerId;
	private Long applicationId;
	private String contactName;
	private String contactRelationship;
	private String contactMobile;
	private Integer telephoneAuditMan;
	private Date telephoneAuditTime;
	private Integer connectFlag;
	private String question;
	private String questionDetail;
	private String reply;

	public void setTelephoneAuditId(Long telephoneAuditId){
		this.telephoneAuditId=telephoneAuditId;
	}

	public Long getTelephoneAuditId(){
		return telephoneAuditId;
	}

	public void setCustomerId(Long customerId){
		this.customerId=customerId;
	}

	public Long getCustomerId(){
		return customerId;
	}

	public void setApplicationId(Long applicationId){
		this.applicationId=applicationId;
	}

	public Long getApplicationId(){
		return applicationId;
	}

	public void setContactName(String contactName){
		this.contactName=contactName;
	}

	public String getContactName(){
		return contactName;
	}

	public void setContactRelationship(String contactRelationship){
		this.contactRelationship=contactRelationship;
	}

	public String getContactRelationship(){
		return contactRelationship;
	}

	public void setContactMobile(String contactMobile){
		this.contactMobile=contactMobile;
	}

	public String getContactMobile(){
		return contactMobile;
	}

	public void setTelephoneAuditMan(Integer telephoneAuditMan){
		this.telephoneAuditMan=telephoneAuditMan;
	}

	public Integer getTelephoneAuditMan(){
		return telephoneAuditMan;
	}

	public void setTelephoneAuditTime(Date telephoneAuditTime){
		this.telephoneAuditTime=telephoneAuditTime;
	}

	public Date getTelephoneAuditTime(){
		return telephoneAuditTime;
	}

	public void setConnectFlag(Integer connectFlag){
		this.connectFlag=connectFlag;
	}

	public Integer getConnectFlag(){
		return connectFlag;
	}

	public void setQuestion(String question){
		this.question=question;
	}

	public String getQuestion(){
		return question;
	}

	public void setQuestionDetail(String questionDetail){
		this.questionDetail=questionDetail;
	}

	public String getQuestionDetail(){
		return questionDetail;
	}

	public void setReply(String reply){
		this.reply=reply;
	}

	public String getReply(){
		return reply;
	}

}
