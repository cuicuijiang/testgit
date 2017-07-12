package com.repos.model.creditvetting;

import java.util.Date;
public class LoanCheck {

	private Long loanCheckId;
	private Long applicationId;
	private Date checkDate;
	private Integer checkLevel;
	private Integer checkFlag;
	private Integer checkMan;
	private Double checkLoanAmount;
	private Integer checkLoanTerm;
	private String remark;
	private Date createDate;
	private String refuseCodes;
	private String refuseValues;

	public void setLoanCheckId(Long loanCheckId){
		this.loanCheckId=loanCheckId;
	}

	public Long getLoanCheckId(){
		return loanCheckId;
	}

	public void setApplicationId(Long applicationId){
		this.applicationId=applicationId;
	}

	public Long getApplicationId(){
		return applicationId;
	}

	public void setCheckDate(Date checkDate){
		this.checkDate=checkDate;
	}

	public Date getCheckDate(){
		return checkDate;
	}

	public void setCheckLevel(Integer checkLevel){
		this.checkLevel=checkLevel;
	}

	public Integer getCheckLevel(){
		return checkLevel;
	}

	public void setCheckFlag(Integer checkFlag){
		this.checkFlag=checkFlag;
	}

	public Integer getCheckFlag(){
		return checkFlag;
	}

	public void setCheckMan(Integer checkMan){
		this.checkMan=checkMan;
	}

	public Integer getCheckMan(){
		return checkMan;
	}

	public void setCheckLoanAmount(Double checkLoanAmount){
		this.checkLoanAmount=checkLoanAmount;
	}

	public Double getCheckLoanAmount(){
		return checkLoanAmount;
	}

	public void setCheckLoanTerm(Integer checkLoanTerm){
		this.checkLoanTerm=checkLoanTerm;
	}

	public Integer getCheckLoanTerm(){
		return checkLoanTerm;
	}

	public void setRemark(String remark){
		this.remark=remark;
	}

	public String getRemark(){
		return remark;
	}

	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}

	public Date getCreateDate(){
		return createDate;
	}

	public void setRefuseCodes(String refuseCodes){
		this.refuseCodes=refuseCodes;
	}

	public String getRefuseCodes(){
		return refuseCodes;
	}

	public void setRefuseValues(String refuseValues){
		this.refuseValues=refuseValues;
	}

	public String getRefuseValues(){
		return refuseValues;
	}

}
