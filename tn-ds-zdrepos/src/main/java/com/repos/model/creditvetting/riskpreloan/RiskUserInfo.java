package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class RiskUserInfo implements Serializable{
	private static final long serialVersionUID = 6436028116320332767L;
	private Integer userInfoId;
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
	private String loan_amount;			//申请贷款金额
	private String loan_term;			//申请贷款期限
	private String loan_term_unit;		//期限单位
	private String loan_date;			//申请借款日期
	private String purpose;				//借款用途
	private String apply_province;		//进件省份
	private String apply_city;			//进件城市
	private String apply_channel;		//进件渠道
	private String name;				//姓名
	private String id_number;			//身份证号
	private String mobile;				//手机号
	private String card_number;			//银行卡号
	private String work_phone;			//公司座机
	private String home_phone;			//家庭座机
	private String qq;					//QQ
	private String email;				//邮箱
	private String diploma;				//学历
	private String marriage;			//婚姻情况
	private String house_property;		//房产情况
	private String house_type;			//房产类型
	private String registered_address;	//户籍地址
	private String home_address;		//家庭地址
	private String contact_address;		//通讯地址
	private String career;				//职业
	private String applyer_type;		//申请人员类别
	private String work_time;			//工作时间
	private String company_name;		//工作单位
	private String company_address;		//单位地址
	private String company_industry;	//公司行业
	private String company_type;		//公司性质
	private String occupation;			//职位
	private String annual_income;		//年收入
	private String is_cross_loan;		//三个月内是否跨平台申请借款
	private String cross_loan_count;	//三个月内跨平台申请借款平台个数
	private String is_liability_loan;	//三个月内是否跨平台借款负债
	private String liability_loan_count;//三个月内跨平台借款负债平台个数
	private String is_id_checked;		//是否通过实名认证
	private String contact1_relation;	//第一联系人社会关系
	private String contact1_name;		//第一联系人姓名
	private String contact1_id_number;	//第一联系人身份证
	private String contact1_mobile;		//第一联系人手机号
	private String contact1_addr;		//第一联系人家庭地址
	private String contact1_com_name;	//第一联系人工作单位
	private String contact1_com_addr;	//第一联系人工作地址
	private String contact2_relation;
	private String contact2_name;
	private String contact2_id_number;
	private String contact2_mobile;
	private String contact2_addr;
	private String contact2_com_name;
	private String contact2_com_addr;
	private String contact3_relation;
	private String contact3_name;
	private String contact3_id_number;
	private String contact3_mobile;
	private String contact3_addr;
	private String contact3_com_name;
	private String contact3_com_addr;
	private String contact4_relation;
	private String contact4_name;
	private String contact4_id_number;
	private String contact4_mobile;
	private String contact4_addr;
	private String contact4_com_name;
	private String contact4_com_addr;
	private String contact5_relation;
	private String contact5_name;
	private String contact5_id_number;
	private String contact5_mobile;
	private String contact5_addr;
	private String contact5_com_name;
	private String contact5_com_addr;
	private String ip_address;
	private String token_id;
	private String black_box;
	public String getLoan_amount() {
		return loan_amount;
	}
	public void setLoan_amount(String loan_amount) {
		this.loan_amount = loan_amount;
	}
	public String getLoan_term() {
		return loan_term;
	}
	public void setLoan_term(String loan_term) {
		this.loan_term = loan_term;
	}
	public String getLoan_term_unit() {
		return loan_term_unit;
	}
	public void setLoan_term_unit(String loan_term_unit) {
		this.loan_term_unit = loan_term_unit;
	}
	public String getLoan_date() {
		return loan_date;
	}
	public void setLoan_date(String loan_date) {
		this.loan_date = loan_date;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getApply_province() {
		return apply_province;
	}
	public void setApply_province(String apply_province) {
		this.apply_province = apply_province;
	}
	public String getApply_city() {
		return apply_city;
	}
	public void setApply_city(String apply_city) {
		this.apply_city = apply_city;
	}
	public String getApply_channel() {
		return apply_channel;
	}
	public void setApply_channel(String apply_channel) {
		this.apply_channel = apply_channel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCard_number() {
		return card_number;
	}
	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}
	public String getWork_phone() {
		return work_phone;
	}
	public void setWork_phone(String work_phone) {
		this.work_phone = work_phone;
	}
	public String getHome_phone() {
		return home_phone;
	}
	public void setHome_phone(String home_phone) {
		this.home_phone = home_phone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDiploma() {
		return diploma;
	}
	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}
	public String getMarriage() {
		return marriage;
	}
	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}
	public String getHouse_property() {
		return house_property;
	}
	public void setHouse_property(String house_property) {
		this.house_property = house_property;
	}
	public String getHouse_type() {
		return house_type;
	}
	public void setHouse_type(String house_type) {
		this.house_type = house_type;
	}
	public String getRegistered_address() {
		return registered_address;
	}
	public void setRegistered_address(String registered_address) {
		this.registered_address = registered_address;
	}
	public String getHome_address() {
		return home_address;
	}
	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}
	public String getContact_address() {
		return contact_address;
	}
	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getApplyer_type() {
		return applyer_type;
	}
	public void setApplyer_type(String applyer_type) {
		this.applyer_type = applyer_type;
	}
	public String getWork_time() {
		return work_time;
	}
	public void setWork_time(String work_time) {
		this.work_time = work_time;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCompany_address() {
		return company_address;
	}
	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}
	public String getCompany_industry() {
		return company_industry;
	}
	public void setCompany_industry(String company_industry) {
		this.company_industry = company_industry;
	}
	public String getCompany_type() {
		return company_type;
	}
	public void setCompany_type(String company_type) {
		this.company_type = company_type;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getAnnual_income() {
		return annual_income;
	}
	public void setAnnual_income(String annual_income) {
		this.annual_income = annual_income;
	}
	public String getIs_cross_loan() {
		return is_cross_loan;
	}
	public void setIs_cross_loan(String is_cross_loan) {
		this.is_cross_loan = is_cross_loan;
	}
	public String getCross_loan_count() {
		return cross_loan_count;
	}
	public void setCross_loan_count(String cross_loan_count) {
		this.cross_loan_count = cross_loan_count;
	}
	public String getIs_liability_loan() {
		return is_liability_loan;
	}
	public void setIs_liability_loan(String is_liability_loan) {
		this.is_liability_loan = is_liability_loan;
	}
	public String getLiability_loan_count() {
		return liability_loan_count;
	}
	public void setLiability_loan_count(String liability_loan_count) {
		this.liability_loan_count = liability_loan_count;
	}
	public String getIs_id_checked() {
		return is_id_checked;
	}
	public void setIs_id_checked(String is_id_checked) {
		this.is_id_checked = is_id_checked;
	}
	public String getContact1_relation() {
		return contact1_relation;
	}
	public void setContact1_relation(String contact1_relation) {
		this.contact1_relation = contact1_relation;
	}
	public String getContact1_name() {
		return contact1_name;
	}
	public void setContact1_name(String contact1_name) {
		this.contact1_name = contact1_name;
	}
	public String getContact1_id_number() {
		return contact1_id_number;
	}
	public void setContact1_id_number(String contact1_id_number) {
		this.contact1_id_number = contact1_id_number;
	}
	public String getContact1_mobile() {
		return contact1_mobile;
	}
	public void setContact1_mobile(String contact1_mobile) {
		this.contact1_mobile = contact1_mobile;
	}
	public String getContact1_addr() {
		return contact1_addr;
	}
	public void setContact1_addr(String contact1_addr) {
		this.contact1_addr = contact1_addr;
	}
	public String getContact1_com_name() {
		return contact1_com_name;
	}
	public void setContact1_com_name(String contact1_com_name) {
		this.contact1_com_name = contact1_com_name;
	}
	public String getContact1_com_addr() {
		return contact1_com_addr;
	}
	public void setContact1_com_addr(String contact1_com_addr) {
		this.contact1_com_addr = contact1_com_addr;
	}
	public String getContact2_relation() {
		return contact2_relation;
	}
	public void setContact2_relation(String contact2_relation) {
		this.contact2_relation = contact2_relation;
	}
	public String getContact2_name() {
		return contact2_name;
	}
	public void setContact2_name(String contact2_name) {
		this.contact2_name = contact2_name;
	}
	public String getContact2_id_number() {
		return contact2_id_number;
	}
	public void setContact2_id_number(String contact2_id_number) {
		this.contact2_id_number = contact2_id_number;
	}
	public String getContact2_mobile() {
		return contact2_mobile;
	}
	public void setContact2_mobile(String contact2_mobile) {
		this.contact2_mobile = contact2_mobile;
	}
	public String getContact2_addr() {
		return contact2_addr;
	}
	public void setContact2_addr(String contact2_addr) {
		this.contact2_addr = contact2_addr;
	}
	public String getContact2_com_name() {
		return contact2_com_name;
	}
	public void setContact2_com_name(String contact2_com_name) {
		this.contact2_com_name = contact2_com_name;
	}
	public String getContact2_com_addr() {
		return contact2_com_addr;
	}
	public void setContact2_com_addr(String contact2_com_addr) {
		this.contact2_com_addr = contact2_com_addr;
	}
	public String getContact3_relation() {
		return contact3_relation;
	}
	public void setContact3_relation(String contact3_relation) {
		this.contact3_relation = contact3_relation;
	}
	public String getContact3_name() {
		return contact3_name;
	}
	public void setContact3_name(String contact3_name) {
		this.contact3_name = contact3_name;
	}
	public String getContact3_id_number() {
		return contact3_id_number;
	}
	public void setContact3_id_number(String contact3_id_number) {
		this.contact3_id_number = contact3_id_number;
	}
	public String getContact3_mobile() {
		return contact3_mobile;
	}
	public void setContact3_mobile(String contact3_mobile) {
		this.contact3_mobile = contact3_mobile;
	}
	public String getContact3_addr() {
		return contact3_addr;
	}
	public void setContact3_addr(String contact3_addr) {
		this.contact3_addr = contact3_addr;
	}
	public String getContact3_com_name() {
		return contact3_com_name;
	}
	public void setContact3_com_name(String contact3_com_name) {
		this.contact3_com_name = contact3_com_name;
	}
	public String getContact3_com_addr() {
		return contact3_com_addr;
	}
	public void setContact3_com_addr(String contact3_com_addr) {
		this.contact3_com_addr = contact3_com_addr;
	}
	public String getContact4_relation() {
		return contact4_relation;
	}
	public void setContact4_relation(String contact4_relation) {
		this.contact4_relation = contact4_relation;
	}
	public String getContact4_name() {
		return contact4_name;
	}
	public void setContact4_name(String contact4_name) {
		this.contact4_name = contact4_name;
	}
	public String getContact4_id_number() {
		return contact4_id_number;
	}
	public void setContact4_id_number(String contact4_id_number) {
		this.contact4_id_number = contact4_id_number;
	}
	public String getContact4_mobile() {
		return contact4_mobile;
	}
	public void setContact4_mobile(String contact4_mobile) {
		this.contact4_mobile = contact4_mobile;
	}
	public String getContact4_addr() {
		return contact4_addr;
	}
	public void setContact4_addr(String contact4_addr) {
		this.contact4_addr = contact4_addr;
	}
	public String getContact4_com_name() {
		return contact4_com_name;
	}
	public void setContact4_com_name(String contact4_com_name) {
		this.contact4_com_name = contact4_com_name;
	}
	public String getContact4_com_addr() {
		return contact4_com_addr;
	}
	public void setContact4_com_addr(String contact4_com_addr) {
		this.contact4_com_addr = contact4_com_addr;
	}
	public String getContact5_relation() {
		return contact5_relation;
	}
	public void setContact5_relation(String contact5_relation) {
		this.contact5_relation = contact5_relation;
	}
	public String getContact5_name() {
		return contact5_name;
	}
	public void setContact5_name(String contact5_name) {
		this.contact5_name = contact5_name;
	}
	public String getContact5_id_number() {
		return contact5_id_number;
	}
	public void setContact5_id_number(String contact5_id_number) {
		this.contact5_id_number = contact5_id_number;
	}
	public String getContact5_mobile() {
		return contact5_mobile;
	}
	public void setContact5_mobile(String contact5_mobile) {
		this.contact5_mobile = contact5_mobile;
	}
	public String getContact5_addr() {
		return contact5_addr;
	}
	public void setContact5_addr(String contact5_addr) {
		this.contact5_addr = contact5_addr;
	}
	public String getContact5_com_name() {
		return contact5_com_name;
	}
	public void setContact5_com_name(String contact5_com_name) {
		this.contact5_com_name = contact5_com_name;
	}
	public String getContact5_com_addr() {
		return contact5_com_addr;
	}
	public void setContact5_com_addr(String contact5_com_addr) {
		this.contact5_com_addr = contact5_com_addr;
	}
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getToken_id() {
		return token_id;
	}
	public void setToken_id(String token_id) {
		this.token_id = token_id;
	}
	public String getBlack_box() {
		return black_box;
	}
	public void setBlack_box(String black_box) {
		this.black_box = black_box;
	}
	@Override
	public String toString() {
		return "RiskUserInfo [userInfoId=" + userInfoId + ", loan_amount=" + loan_amount + ", loan_term=" + loan_term
				+ ", loan_term_unit=" + loan_term_unit + ", loan_date=" + loan_date + ", purpose=" + purpose
				+ ", apply_province=" + apply_province + ", apply_city=" + apply_city + ", apply_channel="
				+ apply_channel + ", name=" + name + ", id_number=" + id_number + ", mobile=" + mobile
				+ ", card_number=" + card_number + ", work_phone=" + work_phone + ", home_phone=" + home_phone + ", qq="
				+ qq + ", email=" + email + ", diploma=" + diploma + ", marriage=" + marriage + ", house_property="
				+ house_property + ", house_type=" + house_type + ", registered_address=" + registered_address
				+ ", home_address=" + home_address + ", contact_address=" + contact_address + ", career=" + career
				+ ", applyer_type=" + applyer_type + ", work_time=" + work_time + ", company_name=" + company_name
				+ ", company_address=" + company_address + ", company_industry=" + company_industry + ", company_type="
				+ company_type + ", occupation=" + occupation + ", annual_income=" + annual_income + ", is_cross_loan="
				+ is_cross_loan + ", cross_loan_count=" + cross_loan_count + ", is_liability_loan=" + is_liability_loan
				+ ", liability_loan_count=" + liability_loan_count + ", is_id_checked=" + is_id_checked
				+ ", contact1_relation=" + contact1_relation + ", concatc1_name=" + contact1_name
				+ ", contact1_id_number=" + contact1_id_number + ", contact1_mobile=" + contact1_mobile
				+ ", contact1_addr=" + contact1_addr + ", contact1_com_name=" + contact1_com_name
				+ ", contact1_com_addr=" + contact1_com_addr + ", contact2_relation=" + contact2_relation
				+ ", contact2_name=" + contact2_name + ", contact2_id_number=" + contact2_id_number
				+ ", contact2_mobile=" + contact2_mobile + ", contact2_addr=" + contact2_addr + ", contact2_com_name="
				+ contact2_com_name + ", contact2_com_addr=" + contact2_com_addr + ", contact3_relation="
				+ contact3_relation + ", contact3_name=" + contact3_name + ", contact3_id_number=" + contact3_id_number
				+ ", contact3_mobile=" + contact3_mobile + ", contact3_addr=" + contact3_addr + ", contact3_com_name="
				+ contact3_com_name + ", contact3_com_addr=" + contact3_com_addr + ", contact4_relation="
				+ contact4_relation + ", contact4_name=" + contact4_name + ", contact4_id_number=" + contact4_id_number
				+ ", contact4_mobile=" + contact4_mobile + ", contact4_addr=" + contact4_addr + ", contact4_com_name="
				+ contact4_com_name + ", contact4_com_addr=" + contact4_com_addr + ", contact5_relation="
				+ contact5_relation + ", contact5_name=" + contact5_name + ", contact5_id_number=" + contact5_id_number
				+ ", contact5_mobile=" + contact5_mobile + ", contact5_addr=" + contact5_addr + ", contact5_com_name="
				+ contact5_com_name + ", contact5_com_addr=" + contact5_com_addr + ", ip_address=" + ip_address
				+ ", token_id=" + token_id + ", black_box=" + black_box + "]";
	}
}
