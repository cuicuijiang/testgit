package com.repos.model.creditvetting;

import java.util.Date;
public class TnapiRiskresult {

	private Long id;
	private String applyNo;
	private Integer scenesId;
	private Integer customerId;
	private String antifraudResultJson;
	private Date creatDate;
	private Integer result;
	private TnapiRiskReport tnapiRiskReport;
	
	
	public TnapiRiskReport getTnapiRiskReport() {
		return tnapiRiskReport;
	}

	public void setTnapiRiskReport(TnapiRiskReport tnapiRiskReport) {
		this.tnapiRiskReport = tnapiRiskReport;
	}

	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return id;
	}

	public void setApplyNo(String applyNo){
		this.applyNo=applyNo;
	}

	public String getApplyNo(){
		return applyNo;
	}

	public void setScenesId(Integer scenesId){
		this.scenesId=scenesId;
	}

	public Integer getScenesId(){
		return scenesId;
	}

	public void setCustomerId(Integer customerId){
		this.customerId=customerId;
	}

	public Integer getCustomerId(){
		return customerId;
	}

	public void setAntifraudResultJson(String antifraudResultJson){
		this.antifraudResultJson=antifraudResultJson;
	}

	public String getAntifraudResultJson(){
		return antifraudResultJson;
	}

	public void setCreatDate(Date creatDate){
		this.creatDate=creatDate;
	}

	public Date getCreatDate(){
		return creatDate;
	}

	public void setResult(Integer result){
		this.result=result;
	}

	public Integer getResult(){
		return result;
	}

	
	@Override
	public String toString() {
		return "TnapiRiskresult [id=" + id + ", applyNo=" + applyNo + ", scenesId=" + scenesId + ", customerId="
				+ customerId + ", antifraudResultJson=" + antifraudResultJson + ", creatDate=" + creatDate + ", result="
				+ result + ", tnapiRiskReport=" + tnapiRiskReport + "]";
	}
}
