package com.repos.model.creditvetting;

import java.util.Date;
public class AntifraudInquiry {

	private Long id;
	private Long sceneId;
	private String applyNo;
	private String result;
	private String resultData;
	private String code;
	private String msg;
	private String serialNo;
	private String ccxSerialNo;
	private Date createDate;

	public void setId(Long id){
		this.id=id;
	}

	public Long getId(){
		return id;
	}

	public void setSceneId(Long sceneId){
		this.sceneId=sceneId;
	}

	public Long getSceneId(){
		return sceneId;
	}

	public void setApplyNo(String applyNo){
		this.applyNo=applyNo;
	}

	public String getApplyNo(){
		return applyNo;
	}

	public void setResult(String result){
		this.result=result;
	}

	public String getResult(){
		return result;
	}

	public void setResultData(String resultData){
		this.resultData=resultData;
	}

	public String getResultData(){
		return resultData;
	}

	public void setCode(String code){
		this.code=code;
	}

	public String getCode(){
		return code;
	}

	public void setMsg(String msg){
		this.msg=msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setSerialNo(String serialNo){
		this.serialNo=serialNo;
	}

	public String getSerialNo(){
		return serialNo;
	}

	public void setCcxSerialNo(String ccxSerialNo){
		this.ccxSerialNo=ccxSerialNo;
	}

	public String getCcxSerialNo(){
		return ccxSerialNo;
	}

	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}

	public Date getCreateDate(){
		return createDate;
	}

	@Override
	public String toString() {
		return "AntifraudInquiry [id=" + id + ", sceneId=" + sceneId + ", applyNo=" + applyNo + ", result=" + result
				+ ", resultData=" + resultData + ", code=" + code + ", msg=" + msg + ", serialNo=" + serialNo
				+ ", ccxSerialNo=" + ccxSerialNo + ", createDate=" + createDate + "]";
	}
}
