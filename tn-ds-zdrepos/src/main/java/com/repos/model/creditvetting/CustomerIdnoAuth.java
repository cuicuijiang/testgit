package com.repos.model.creditvetting;

import java.util.Date;
public class CustomerIdnoAuth {

	private Long idnoAuthId;
	private Long customerId;
	private Integer sceneId;
	private String sceneIdnoAuthId;
	private String name;
	private String idno;
	private String race;
	private Integer gender;
	private String frontRequestId;
	private String backRequestId;
	private Integer birthYear;
	private Integer birthMonth;
	private Integer birthDay;
	private String address;
	private String headRect;
	private String issuedBy;
	private String validDate;
	private String frontLegality;
	private String backLegality;
	private Integer origin;
	private Date createDate;

	public void setIdnoAuthId(Long idnoAuthId){
		this.idnoAuthId=idnoAuthId;
	}

	public Long getIdnoAuthId(){
		return idnoAuthId;
	}

	public void setCustomerId(Long customerId){
		this.customerId=customerId;
	}

	public Long getCustomerId(){
		return customerId;
	}

	public void setSceneId(Integer sceneId){
		this.sceneId=sceneId;
	}

	public Integer getSceneId(){
		return sceneId;
	}

	public void setSceneIdnoAuthId(String sceneIdnoAuthId){
		this.sceneIdnoAuthId=sceneIdnoAuthId;
	}

	public String getSceneIdnoAuthId(){
		return sceneIdnoAuthId;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}

	public void setIdno(String idno){
		this.idno=idno;
	}

	public String getIdno(){
		return idno;
	}

	public void setRace(String race){
		this.race=race;
	}

	public String getRace(){
		return race;
	}

	public void setGender(Integer gender){
		this.gender=gender;
	}

	public Integer getGender(){
		return gender;
	}

	public void setFrontRequestId(String frontRequestId){
		this.frontRequestId=frontRequestId;
	}

	public String getFrontRequestId(){
		return frontRequestId;
	}

	public void setBackRequestId(String backRequestId){
		this.backRequestId=backRequestId;
	}

	public String getBackRequestId(){
		return backRequestId;
	}

	public void setBirthYear(Integer birthYear){
		this.birthYear=birthYear;
	}

	public Integer getBirthYear(){
		return birthYear;
	}

	public void setBirthMonth(Integer birthMonth){
		this.birthMonth=birthMonth;
	}

	public Integer getBirthMonth(){
		return birthMonth;
	}

	public void setBirthDay(Integer birthDay){
		this.birthDay=birthDay;
	}

	public Integer getBirthDay(){
		return birthDay;
	}

	public void setAddress(String address){
		this.address=address;
	}

	public String getAddress(){
		return address;
	}

	public void setHeadRect(String headRect){
		this.headRect=headRect;
	}

	public String getHeadRect(){
		return headRect;
	}

	public void setIssuedBy(String issuedBy){
		this.issuedBy=issuedBy;
	}

	public String getIssuedBy(){
		return issuedBy;
	}

	public void setValidDate(String validDate){
		this.validDate=validDate;
	}

	public String getValidDate(){
		return validDate;
	}

	public void setFrontLegality(String frontLegality){
		this.frontLegality=frontLegality;
	}

	public String getFrontLegality(){
		return frontLegality;
	}

	public void setBackLegality(String backLegality){
		this.backLegality=backLegality;
	}

	public String getBackLegality(){
		return backLegality;
	}

	public void setOrigin(Integer origin){
		this.origin=origin;
	}

	public Integer getOrigin(){
		return origin;
	}

	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}

	public Date getCreateDate(){
		return createDate;
	}

}
