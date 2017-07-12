package com.repos.model.creditvetting;

public class Scene {

	private Long sceneId;
	private String sceneName;
	private String sceneType;
	private Integer loanType;
	private Integer statusFlag;
	private String antiFraud;
	private String scoreFlag;
	private String creditFlag;
	private Integer whiteListRule;
	private String remark;
	private EncryptKey encryptKey;

	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
	}

	public Long getSceneId() {
		return sceneId;
	}

	public void setSceneName(String sceneName) {
		this.sceneName = sceneName;
	}

	public String getSceneName() {
		return sceneName;
	}

	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
	}

	public String getSceneType() {
		return sceneType;
	}

	public void setLoanType(Integer loanType) {
		this.loanType = loanType;
	}

	public Integer getLoanType() {
		return loanType;
	}

	public void setStatusFlag(Integer statusFlag) {
		this.statusFlag = statusFlag;
	}

	public Integer getStatusFlag() {
		return statusFlag;
	}

	public void setAntiFraud(String antiFraud) {
		this.antiFraud = antiFraud;
	}

	public String getAntiFraud() {
		return antiFraud;
	}

	public void setScoreFlag(String scoreFlag) {
		this.scoreFlag = scoreFlag;
	}

	public String getScoreFlag() {
		return scoreFlag;
	}

	public void setCreditFlag(String creditFlag) {
		this.creditFlag = creditFlag;
	}

	public String getCreditFlag() {
		return creditFlag;
	}

	public void setWhiteListRule(Integer whiteListRule) {
		this.whiteListRule = whiteListRule;
	}

	public Integer getWhiteListRule() {
		return whiteListRule;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public EncryptKey getEncryptKey() {
		return encryptKey;
	}

	public void setEncryptKey(EncryptKey encryptKey) {
		this.encryptKey = encryptKey;
	}

}
