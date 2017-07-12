package com.repos.model.creditvetting;

import java.util.Date;
public class CustomerFaceVerify {

	private Long faceVerifyId;
	private Long customerId;
	private String sceneVerifyId;
	private Long sceneId;
	private String requestId;
	private String resultFaceidJson;
	private String resultIdcardDatasourceJson;
	private String resultIdcardPhotoJson;
	private String data;
	private String realImg;
	private String faceImg;
	private Integer origin;
	private Date createDate;

	public void setFaceVerifyId(Long faceVerifyId){
		this.faceVerifyId=faceVerifyId;
	}

	public Long getFaceVerifyId(){
		return faceVerifyId;
	}

	public void setCustomerId(Long customerId){
		this.customerId=customerId;
	}

	public Long getCustomerId(){
		return customerId;
	}

	public void setSceneVerifyId(String sceneVerifyId){
		this.sceneVerifyId=sceneVerifyId;
	}

	public String getSceneVerifyId(){
		return sceneVerifyId;
	}

	public void setSceneId(Long sceneId){
		this.sceneId=sceneId;
	}

	public Long getSceneId(){
		return sceneId;
	}

	public void setRequestId(String requestId){
		this.requestId=requestId;
	}

	public String getRequestId(){
		return requestId;
	}

	public void setResultFaceidJson(String resultFaceidJson){
		this.resultFaceidJson=resultFaceidJson;
	}

	public String getResultFaceidJson(){
		return resultFaceidJson;
	}

	public void setResultIdcardDatasourceJson(String resultIdcardDatasourceJson){
		this.resultIdcardDatasourceJson=resultIdcardDatasourceJson;
	}

	public String getResultIdcardDatasourceJson(){
		return resultIdcardDatasourceJson;
	}

	public void setResultIdcardPhotoJson(String resultIdcardPhotoJson){
		this.resultIdcardPhotoJson=resultIdcardPhotoJson;
	}

	public String getResultIdcardPhotoJson(){
		return resultIdcardPhotoJson;
	}

	public void setData(String data){
		this.data=data;
	}

	public String getData(){
		return data;
	}

	public void setRealImg(String realImg){
		this.realImg=realImg;
	}

	public String getRealImg(){
		return realImg;
	}

	public void setFaceImg(String faceImg){
		this.faceImg=faceImg;
	}

	public String getFaceImg(){
		return faceImg;
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
