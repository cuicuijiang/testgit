package com.repos.model.creditvetting;

import java.util.Date;
public class TelBillHistory {

	private Long id;
	private Long basicInfoId;
	private String customerId;
	private String idcard;
	private String userNumber;
	private String accountQueryCycle;
	private String accountComsume;
	private String accountItems;
	private String accountFee;
	private String accountCategory;
	private Date inquiryTime;
	private String billTotal;

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

	public void setAccountQueryCycle(String accountQueryCycle){
		this.accountQueryCycle=accountQueryCycle;
	}

	public String getAccountQueryCycle(){
		return accountQueryCycle;
	}

	public void setAccountComsume(String accountComsume){
		this.accountComsume=accountComsume;
	}

	public String getAccountComsume(){
		return accountComsume;
	}

	public void setAccountItems(String accountItems){
		this.accountItems=accountItems;
	}

	public String getAccountItems(){
		return accountItems;
	}

	public void setAccountFee(String accountFee){
		this.accountFee=accountFee;
	}

	public String getAccountFee(){
		return accountFee;
	}

	public void setAccountCategory(String accountCategory){
		this.accountCategory=accountCategory;
	}

	public String getAccountCategory(){
		return accountCategory;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

	public void setBillTotal(String billTotal){
		this.billTotal=billTotal;
	}

	public String getBillTotal(){
		return billTotal;
	}

}
