package com.repos.model.creditvetting;


public class EncryptKey {

	private Long id;
	private Long sceneId;
	private String privateKeyName;
	private String rsaPublicKeyName;
	private String privateKeyPkcs8Name;
	private Integer keyFlag;
	private String remark;

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

	public void setPrivateKeyName(String privateKeyName){
		this.privateKeyName=privateKeyName;
	}

	public String getPrivateKeyName(){
		return privateKeyName;
	}

	public void setRsaPublicKeyName(String rsaPublicKeyName){
		this.rsaPublicKeyName=rsaPublicKeyName;
	}

	public String getRsaPublicKeyName(){
		return rsaPublicKeyName;
	}

	public void setPrivateKeyPkcs8Name(String privateKeyPkcs8Name){
		this.privateKeyPkcs8Name=privateKeyPkcs8Name;
	}

	public String getPrivateKeyPkcs8Name(){
		return privateKeyPkcs8Name;
	}

	public void setKeyFlag(Integer keyFlag){
		this.keyFlag=keyFlag;
	}

	public Integer getKeyFlag(){
		return keyFlag;
	}

	public void setRemark(String remark){
		this.remark=remark;
	}

	public String getRemark(){
		return remark;
	}

}
