package com.repos.model.creditvetting;

import java.io.Serializable;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection="telRootCall")
public class TelCall implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	
	@Field("basic_info_id")
	@Indexed
	private Long basicInfoId;
	
	@Field("customer_id")
	@Indexed
	private String customerId;
	
	@Field("idcard")
	@Indexed
	private String idcard;
	
	@Field("user_number")
	@Indexed
	private String userNumber;
	
	@Field("times")
	private String times;
	
	@Field("stat_time")
	private String statTime;
	
	@Field("call_channel")
	private String callChannel;
	
	@Field("call_address")
	private String callAddress;
	
	@Field("land_type")
	private String landType;
	
	@Field("other_number")
	private String otherNumber;
	
	@Field("inquiry_time")
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

	public void setTimes(String times){
		this.times=times;
	}

	public String getTimes(){
		return times;
	}

	public void setStatTime(String statTime){
		this.statTime=statTime;
	}

	public String getStatTime(){
		return statTime;
	}

	public void setCallChannel(String callChannel){
		this.callChannel=callChannel;
	}

	public String getCallChannel(){
		return callChannel;
	}

	public void setCallAddress(String callAddress){
		this.callAddress=callAddress;
	}

	public String getCallAddress(){
		return callAddress;
	}

	public void setLandType(String landType){
		this.landType=landType;
	}

	public String getLandType(){
		return landType;
	}

	public void setOtherNumber(String otherNumber){
		this.otherNumber=otherNumber;
	}

	public String getOtherNumber(){
		return otherNumber;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

	@Override
	public String toString() {
		return "TelCall [id=" + id + ", basicInfoId=" + basicInfoId + ", customerId=" + customerId + ", idcard="
				+ idcard + ", userNumber=" + userNumber + ", times=" + times + ", statTime=" + statTime
				+ ", callChannel=" + callChannel + ", callAddress=" + callAddress + ", landType=" + landType
				+ ", otherNumber=" + otherNumber + ", inquiryTime=" + inquiryTime + "]";
	}
}
