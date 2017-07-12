package com.repos.model.creditvetting;

import java.util.Date;
import java.util.List;

public class Customer {

	private Long customerId;
	private Long sceneId;
	private Long sceneCustid;
	private String mobileRegister;
	private String customerName;
	private String idcard;
	private String mobile;
	private Integer gender;
	private Integer age;
	private String education;
	private String bankCard;
	private String bankName;
	private String email;
	private String bankPhone;
	private String address;
	private Date creditDate;
	private Integer ccxScore;
	private String fraudScore;
	private Double creditAmount;
	private String creditTerm;
	private String censusRegister;
	private String graduatedUniversity;
	private String universityCity;
	private String mobileLocation;
	private String Zodiac;
	private String starSign;
	private String workplace;
	private Double incomeEstimate;
	private Double debetEstimate;
	private String firstContactName;
	private String firstContactRelationship;
	private String firstContactMobile;
	private String secondContactName;
	private String secondContactRelationship;
	private String secondContactMobile;
	private String thirdContactName;
	private String thirdContactRelationship;
	private String thirdContactMobile;
	private String profession;
	private String companyName;
	private String companyPosition;
	private String companyPhone;
	private String guarantorName;
	private String guarantorRelationship;
	private String guarantorMobile;
	private String guarantorIdcard;
	private String guarantorCompanyName;
	private String guarantorCompanyAddress;
	private String guarantorCompanyPhone;
	private String ip;
	private String applyAddress;
	private String imei;
	private Date createDate;
	private String idPictureFront;
	private String idPictureBack;
	private String tgLocation;
	private String firstContactIdcard;
	private String secondContactIdcard;
	private String thirdContactIdcard;
	private String maritalStatus;
	private String sceneCustomerJson;
	private String liveTime;

	private List<CustomerFaceVerify> customerFaceVerifies;
	private List<CustomerIdnoAuth> customerIdnoAuths;
	private List<TelephoneAudit> telephoneAudits;
	private List<BlackandwhiteList> blackandwhiteLists;
	private List<CreditInquiry> creditInquiries;
	private List<AntifraudInquiry> antifraudInquiries;
	private List<SmsAndContacts> smsAndContactses;

	
	public List<CustomerFaceVerify> getCustomerFaceVerifies() {
		return customerFaceVerifies;
	}

	public void setCustomerFaceVerifies(List<CustomerFaceVerify> customerFaceVerifies) {
		this.customerFaceVerifies = customerFaceVerifies;
	}

	public List<AntifraudInquiry> getAntifraudInquiries() {
		return antifraudInquiries;
	}

	public void setAntifraudInquiries(List<AntifraudInquiry> antifraudInquiries) {
		this.antifraudInquiries = antifraudInquiries;
	}

	public List<CustomerIdnoAuth> getCustomerIdnoAuths() {
		return customerIdnoAuths;
	}

	public void setCustomerIdnoAuths(List<CustomerIdnoAuth> customerIdnoAuths) {
		this.customerIdnoAuths = customerIdnoAuths;
	}

	public List<TelephoneAudit> getTelephoneAudits() {
		return telephoneAudits;
	}

	public void setTelephoneAudits(List<TelephoneAudit> telephoneAudits) {
		this.telephoneAudits = telephoneAudits;
	}

	public List<BlackandwhiteList> getBlackandwhiteLists() {
		return blackandwhiteLists;
	}

	public void setBlackandwhiteLists(List<BlackandwhiteList> blackandwhiteLists) {
		this.blackandwhiteLists = blackandwhiteLists;
	}

	public List<CreditInquiry> getCreditInquiries() {
		return creditInquiries;
	}

	public void setCreditInquiries(List<CreditInquiry> creditInquiries) {
		this.creditInquiries = creditInquiries;
	}

	public List<SmsAndContacts> getSmsAndContactses() {
		return smsAndContactses;
	}

	public void setSmsAndContactses(List<SmsAndContacts> smsAndContactses) {
		this.smsAndContactses = smsAndContactses;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
	}

	public Long getSceneId() {
		return sceneId;
	}

	public void setSceneCustid(Long sceneCustid) {
		this.sceneCustid = sceneCustid;
	}

	public Long getSceneCustid() {
		return sceneCustid;
	}

	public void setMobileRegister(String mobileRegister) {
		this.mobileRegister = mobileRegister;
	}

	public String getMobileRegister() {
		return mobileRegister;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobile() {
		return mobile;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getGender() {
		return gender;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getEducation() {
		return education;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setBankPhone(String bankPhone) {
		this.bankPhone = bankPhone;
	}

	public String getBankPhone() {
		return bankPhone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setCreditDate(Date creditDate) {
		this.creditDate = creditDate;
	}

	public Date getCreditDate() {
		return creditDate;
	}

	public void setCcxScore(Integer ccxScore) {
		this.ccxScore = ccxScore;
	}

	public Integer getCcxScore() {
		return ccxScore;
	}

	public void setFraudScore(String fraudScore) {
		this.fraudScore = fraudScore;
	}

	public String getFraudScore() {
		return fraudScore;
	}

	public void setCreditAmount(Double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public Double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditTerm(String creditTerm) {
		this.creditTerm = creditTerm;
	}

	public String getCreditTerm() {
		return creditTerm;
	}

	public void setCensusRegister(String censusRegister) {
		this.censusRegister = censusRegister;
	}

	public String getCensusRegister() {
		return censusRegister;
	}

	public void setGraduatedUniversity(String graduatedUniversity) {
		this.graduatedUniversity = graduatedUniversity;
	}

	public String getGraduatedUniversity() {
		return graduatedUniversity;
	}

	public void setUniversityCity(String universityCity) {
		this.universityCity = universityCity;
	}

	public String getUniversityCity() {
		return universityCity;
	}

	public void setMobileLocation(String mobileLocation) {
		this.mobileLocation = mobileLocation;
	}

	public String getMobileLocation() {
		return mobileLocation;
	}

	public void setZodiac(String Zodiac) {
		this.Zodiac = Zodiac;
	}

	public String getZodiac() {
		return Zodiac;
	}

	public void setStarSign(String starSign) {
		this.starSign = starSign;
	}

	public String getStarSign() {
		return starSign;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setIncomeEstimate(Double incomeEstimate) {
		this.incomeEstimate = incomeEstimate;
	}

	public Double getIncomeEstimate() {
		return incomeEstimate;
	}

	public void setDebetEstimate(Double debetEstimate) {
		this.debetEstimate = debetEstimate;
	}

	public Double getDebetEstimate() {
		return debetEstimate;
	}

	public void setFirstContactName(String firstContactName) {
		this.firstContactName = firstContactName;
	}

	public String getFirstContactName() {
		return firstContactName;
	}

	public void setFirstContactRelationship(String firstContactRelationship) {
		this.firstContactRelationship = firstContactRelationship;
	}

	public String getFirstContactRelationship() {
		return firstContactRelationship;
	}

	public void setFirstContactMobile(String firstContactMobile) {
		this.firstContactMobile = firstContactMobile;
	}

	public String getFirstContactMobile() {
		return firstContactMobile;
	}

	public void setSecondContactName(String secondContactName) {
		this.secondContactName = secondContactName;
	}

	public String getSecondContactName() {
		return secondContactName;
	}

	public void setSecondContactRelationship(String secondContactRelationship) {
		this.secondContactRelationship = secondContactRelationship;
	}

	public String getSecondContactRelationship() {
		return secondContactRelationship;
	}

	public void setSecondContactMobile(String secondContactMobile) {
		this.secondContactMobile = secondContactMobile;
	}

	public String getSecondContactMobile() {
		return secondContactMobile;
	}

	public void setThirdContactName(String thirdContactName) {
		this.thirdContactName = thirdContactName;
	}

	public String getThirdContactName() {
		return thirdContactName;
	}

	public void setThirdContactRelationship(String thirdContactRelationship) {
		this.thirdContactRelationship = thirdContactRelationship;
	}

	public String getThirdContactRelationship() {
		return thirdContactRelationship;
	}

	public void setThirdContactMobile(String thirdContactMobile) {
		this.thirdContactMobile = thirdContactMobile;
	}

	public String getThirdContactMobile() {
		return thirdContactMobile;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getProfession() {
		return profession;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyPosition(String companyPosition) {
		this.companyPosition = companyPosition;
	}

	public String getCompanyPosition() {
		return companyPosition;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setGuarantorName(String guarantorName) {
		this.guarantorName = guarantorName;
	}

	public String getGuarantorName() {
		return guarantorName;
	}

	public void setGuarantorRelationship(String guarantorRelationship) {
		this.guarantorRelationship = guarantorRelationship;
	}

	public String getGuarantorRelationship() {
		return guarantorRelationship;
	}

	public void setGuarantorMobile(String guarantorMobile) {
		this.guarantorMobile = guarantorMobile;
	}

	public String getGuarantorMobile() {
		return guarantorMobile;
	}

	public void setGuarantorIdcard(String guarantorIdcard) {
		this.guarantorIdcard = guarantorIdcard;
	}

	public String getGuarantorIdcard() {
		return guarantorIdcard;
	}

	public void setGuarantorCompanyName(String guarantorCompanyName) {
		this.guarantorCompanyName = guarantorCompanyName;
	}

	public String getGuarantorCompanyName() {
		return guarantorCompanyName;
	}

	public void setGuarantorCompanyAddress(String guarantorCompanyAddress) {
		this.guarantorCompanyAddress = guarantorCompanyAddress;
	}

	public String getGuarantorCompanyAddress() {
		return guarantorCompanyAddress;
	}

	public void setGuarantorCompanyPhone(String guarantorCompanyPhone) {
		this.guarantorCompanyPhone = guarantorCompanyPhone;
	}

	public String getGuarantorCompanyPhone() {
		return guarantorCompanyPhone;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}

	public void setApplyAddress(String applyAddress) {
		this.applyAddress = applyAddress;
	}

	public String getApplyAddress() {
		return applyAddress;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getImei() {
		return imei;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setIdPictureFront(String idPictureFront) {
		this.idPictureFront = idPictureFront;
	}

	public String getIdPictureFront() {
		return idPictureFront;
	}

	public void setIdPictureBack(String idPictureBack) {
		this.idPictureBack = idPictureBack;
	}

	public String getIdPictureBack() {
		return idPictureBack;
	}

	public void setTgLocation(String tgLocation) {
		this.tgLocation = tgLocation;
	}

	public String getTgLocation() {
		return tgLocation;
	}

	public void setFirstContactIdcard(String firstContactIdcard) {
		this.firstContactIdcard = firstContactIdcard;
	}

	public String getFirstContactIdcard() {
		return firstContactIdcard;
	}

	public void setSecondContactIdcard(String secondContactIdcard) {
		this.secondContactIdcard = secondContactIdcard;
	}

	public String getSecondContactIdcard() {
		return secondContactIdcard;
	}

	public void setThirdContactIdcard(String thirdContactIdcard) {
		this.thirdContactIdcard = thirdContactIdcard;
	}

	public String getThirdContactIdcard() {
		return thirdContactIdcard;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setSceneCustomerJson(String sceneCustomerJson) {
		this.sceneCustomerJson = sceneCustomerJson;
	}

	public String getSceneCustomerJson() {
		return sceneCustomerJson;
	}

	public void setLiveTime(String liveTime) {
		this.liveTime = liveTime;
	}

	public String getLiveTime() {
		return liveTime;
	}
}
