package com.repos.model.creditvetting;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="loanApplication")
public class LoanApplication {
	
	@Id
	private String applicationUuid;
	private Long applicationId;
	private String sceneApplyId;
	private Long sceneId;
	private Long customerId;
	private Double applyLoanAmount;
	private Integer applyLoanTerm;
	private Date applyDate;
	private String applicationStatus;
	private Integer checkFlag;
	private Integer resultCheckFlag;
	private String resultRemark;
	private Double finalLoanAmount;
	private Integer finalLoanTerm;
	private Integer contractSign;
	private Long contractId;
	private Integer payCheck;
	private String payCheckRejectReason;
	private Integer payFlag;
	private String payFailReason;
	private String antifraudResultJson;
	private String sceneApplyInfoJson;
	private String hengduApplyId;
	private String hengduSceneId;
	private String applyTgLocation;
	private Integer validFlag;
	private String overdueJson;
	private Integer paymentFlag;
	private Double realRepayment;
	private Date paymentDate;
	private String zhichengResultJson;
	private Integer hideFlag;
	private String refuseCodes;
	private String refuseValues;
	private String store;

	private LoanCheck loanCheck;
	private YqbFengkong yqbFengkong;
	private TnapiRiskresult tnapiRiskresult;
	private RiskpreloanRiskuserinfo riskpreloanRiskuserinfo;
	private Scene scene;
	private TelLogin telLogin;
	private Customer customer;
	private CustomerHistory customerHistory;
	

	
	public CustomerHistory getCustomerHistory() {
		return customerHistory;
	}

	public void setCustomerHistory(CustomerHistory customerHistory) {
		this.customerHistory = customerHistory;
	}

	public LoanCheck getLoanCheck() {
		return loanCheck;
	}

	public void setLoanCheck(LoanCheck loanCheck) {
		this.loanCheck = loanCheck;
	}

	public YqbFengkong getYqbFengkong() {
		return yqbFengkong;
	}

	public void setYqbFengkong(YqbFengkong yqbFengkong) {
		this.yqbFengkong = yqbFengkong;
	}

	public TnapiRiskresult getTnapiRiskresult() {
		return tnapiRiskresult;
	}

	public void setTnapiRiskresult(TnapiRiskresult tnapiRiskresult) {
		this.tnapiRiskresult = tnapiRiskresult;
	}

	public RiskpreloanRiskuserinfo getRiskpreloanRiskuserinfo() {
		return riskpreloanRiskuserinfo;
	}

	public void setRiskpreloanRiskuserinfo(RiskpreloanRiskuserinfo riskpreloanRiskuserinfo) {
		this.riskpreloanRiskuserinfo = riskpreloanRiskuserinfo;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public TelLogin getTelLogin() {
		return telLogin;
	}

	public void setTelLogin(TelLogin telLogin) {
		this.telLogin = telLogin;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationUuid(String applicationUuid) {
		this.applicationUuid = applicationUuid;
	}

	public String getApplicationUuid() {
		return applicationUuid;
	}

	public void setSceneApplyId(String sceneApplyId) {
		this.sceneApplyId = sceneApplyId;
	}

	public String getSceneApplyId() {
		return sceneApplyId;
	}

	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
	}

	public Long getSceneId() {
		return sceneId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setApplyLoanAmount(Double applyLoanAmount) {
		this.applyLoanAmount = applyLoanAmount;
	}

	public Double getApplyLoanAmount() {
		return applyLoanAmount;
	}

	public void setApplyLoanTerm(Integer applyLoanTerm) {
		this.applyLoanTerm = applyLoanTerm;
	}

	public Integer getApplyLoanTerm() {
		return applyLoanTerm;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setCheckFlag(Integer checkFlag) {
		this.checkFlag = checkFlag;
	}

	public Integer getCheckFlag() {
		return checkFlag;
	}

	public void setResultCheckFlag(Integer resultCheckFlag) {
		this.resultCheckFlag = resultCheckFlag;
	}

	public Integer getResultCheckFlag() {
		return resultCheckFlag;
	}

	public void setResultRemark(String resultRemark) {
		this.resultRemark = resultRemark;
	}

	public String getResultRemark() {
		return resultRemark;
	}

	public void setFinalLoanAmount(Double finalLoanAmount) {
		this.finalLoanAmount = finalLoanAmount;
	}

	public Double getFinalLoanAmount() {
		return finalLoanAmount;
	}

	public void setFinalLoanTerm(Integer finalLoanTerm) {
		this.finalLoanTerm = finalLoanTerm;
	}

	public Integer getFinalLoanTerm() {
		return finalLoanTerm;
	}

	public void setContractSign(Integer contractSign) {
		this.contractSign = contractSign;
	}

	public Integer getContractSign() {
		return contractSign;
	}

	public void setContractId(Long contractId) {
		this.contractId = contractId;
	}

	public Long getContractId() {
		return contractId;
	}

	public void setPayCheck(Integer payCheck) {
		this.payCheck = payCheck;
	}

	public Integer getPayCheck() {
		return payCheck;
	}

	public void setPayCheckRejectReason(String payCheckRejectReason) {
		this.payCheckRejectReason = payCheckRejectReason;
	}

	public String getPayCheckRejectReason() {
		return payCheckRejectReason;
	}

	public void setPayFlag(Integer payFlag) {
		this.payFlag = payFlag;
	}

	public Integer getPayFlag() {
		return payFlag;
	}

	public void setPayFailReason(String payFailReason) {
		this.payFailReason = payFailReason;
	}

	public String getPayFailReason() {
		return payFailReason;
	}

	public void setAntifraudResultJson(String antifraudResultJson) {
		this.antifraudResultJson = antifraudResultJson;
	}

	public String getAntifraudResultJson() {
		return antifraudResultJson;
	}

	public void setSceneApplyInfoJson(String sceneApplyInfoJson) {
		this.sceneApplyInfoJson = sceneApplyInfoJson;
	}

	public String getSceneApplyInfoJson() {
		return sceneApplyInfoJson;
	}

	public void setHengduApplyId(String hengduApplyId) {
		this.hengduApplyId = hengduApplyId;
	}

	public String getHengduApplyId() {
		return hengduApplyId;
	}

	public void setHengduSceneId(String hengduSceneId) {
		this.hengduSceneId = hengduSceneId;
	}

	public String getHengduSceneId() {
		return hengduSceneId;
	}

	public void setApplyTgLocation(String applyTgLocation) {
		this.applyTgLocation = applyTgLocation;
	}

	public String getApplyTgLocation() {
		return applyTgLocation;
	}

	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}

	public Integer getValidFlag() {
		return validFlag;
	}

	public void setOverdueJson(String overdueJson) {
		this.overdueJson = overdueJson;
	}

	public String getOverdueJson() {
		return overdueJson;
	}

	public void setPaymentFlag(Integer paymentFlag) {
		this.paymentFlag = paymentFlag;
	}

	public Integer getPaymentFlag() {
		return paymentFlag;
	}

	public void setRealRepayment(Double realRepayment) {
		this.realRepayment = realRepayment;
	}

	public Double getRealRepayment() {
		return realRepayment;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setZhichengResultJson(String zhichengResultJson) {
		this.zhichengResultJson = zhichengResultJson;
	}

	public String getZhichengResultJson() {
		return zhichengResultJson;
	}

	public void setHideFlag(Integer hideFlag) {
		this.hideFlag = hideFlag;
	}

	public Integer getHideFlag() {
		return hideFlag;
	}

	public void setRefuseCodes(String refuseCodes) {
		this.refuseCodes = refuseCodes;
	}

	public String getRefuseCodes() {
		return refuseCodes;
	}

	public void setRefuseValues(String refuseValues) {
		this.refuseValues = refuseValues;
	}

	public String getRefuseValues() {
		return refuseValues;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getStore() {
		return store;
	}

}
