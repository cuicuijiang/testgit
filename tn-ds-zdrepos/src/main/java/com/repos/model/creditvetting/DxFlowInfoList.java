package com.repos.model.creditvetting;

import java.util.Date;
public class DxFlowInfoList {

	private Long id;
	private Long basicInfoId;
	private String customerId;
	private String idcard;
	private String userNumber;
	private String flowCycle;
	private String flowTotalCost;
	private String flowNetworkType;
	private String flowStatTime;
	private String flowTime;
	private String flowContent;
	private String flowCostType;
	private String flowTotal;
	private String flowAddress;
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

	public void setFlowCycle(String flowCycle){
		this.flowCycle=flowCycle;
	}

	public String getFlowCycle(){
		return flowCycle;
	}

	public void setFlowTotalCost(String flowTotalCost){
		this.flowTotalCost=flowTotalCost;
	}

	public String getFlowTotalCost(){
		return flowTotalCost;
	}

	public void setFlowNetworkType(String flowNetworkType){
		this.flowNetworkType=flowNetworkType;
	}

	public String getFlowNetworkType(){
		return flowNetworkType;
	}

	public void setFlowStatTime(String flowStatTime){
		this.flowStatTime=flowStatTime;
	}

	public String getFlowStatTime(){
		return flowStatTime;
	}

	public void setFlowTime(String flowTime){
		this.flowTime=flowTime;
	}

	public String getFlowTime(){
		return flowTime;
	}

	public void setFlowContent(String flowContent){
		this.flowContent=flowContent;
	}

	public String getFlowContent(){
		return flowContent;
	}

	public void setFlowCostType(String flowCostType){
		this.flowCostType=flowCostType;
	}

	public String getFlowCostType(){
		return flowCostType;
	}

	public void setFlowTotal(String flowTotal){
		this.flowTotal=flowTotal;
	}

	public String getFlowTotal(){
		return flowTotal;
	}

	public void setFlowAddress(String flowAddress){
		this.flowAddress=flowAddress;
	}

	public String getFlowAddress(){
		return flowAddress;
	}

	public void setInquiryTime(Date inquiryTime){
		this.inquiryTime=inquiryTime;
	}

	public Date getInquiryTime(){
		return inquiryTime;
	}

}
