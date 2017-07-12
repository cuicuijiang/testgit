package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Kunta_call_result implements Serializable{
	private static final long serialVersionUID = -5137170724706328463L;
	
	private Integer userInfoId;//用户信息ID
	private String kunta_call_result;//第三方数据源调用详情字符串
	private String real_name_check;//实名认证结果
	private String card_name_check;//银行卡号-姓名一致性验证结果
	private String card_mobile_check;//银行卡号-手机号一致性验证结果
	private String mobile_name_check;//手机号-姓名一致性验证结果
	private String mobile_id_number_check;//手机号-身份证一致性验证结果
	private String mobile_id_number_name_check;//手机号-身份证-姓名一致性验证结果
	private String degree_query;//学历查询结果
	
	
	private Real_name_check result_real_name_check;
	private Card_name_check result_card_name_check;
	private Card_mobile_check result_card_mobile_check;
	private Mobile_name_check result_mobile_name_check;
	private Mobile_id_number_check result_mobile_id_number_check;
	private Mobile_id_number_name_check result_mobile_id_number_name_check;
	private Degree_query result_degree_query;
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
	public String getKunta_call_result() {
		return kunta_call_result;
	}
	public void setKunta_call_result(String kunta_call_result) {
		this.kunta_call_result = kunta_call_result;
	}
	public String getReal_name_check() {
		return real_name_check;
	}
	public void setReal_name_check(String real_name_check) {
		this.real_name_check = real_name_check;
	}
	public String getCard_name_check() {
		return card_name_check;
	}
	public void setCard_name_check(String card_name_check) {
		this.card_name_check = card_name_check;
	}
	public String getCard_mobile_check() {
		return card_mobile_check;
	}
	public void setCard_mobile_check(String card_mobile_check) {
		this.card_mobile_check = card_mobile_check;
	}
	public String getMobile_name_check() {
		return mobile_name_check;
	}
	public void setMobile_name_check(String mobile_name_check) {
		this.mobile_name_check = mobile_name_check;
	}
	public String getMobile_id_number_check() {
		return mobile_id_number_check;
	}
	public void setMobile_id_number_check(String mobile_id_number_check) {
		this.mobile_id_number_check = mobile_id_number_check;
	}
	public String getMobile_id_number_name_check() {
		return mobile_id_number_name_check;
	}
	public void setMobile_id_number_name_check(String mobile_id_number_name_check) {
		this.mobile_id_number_name_check = mobile_id_number_name_check;
	}
	public String getDegree_query() {
		return degree_query;
	}
	public void setDegree_query(String degree_query) {
		this.degree_query = degree_query;
	}
	public Real_name_check getResult_real_name_check() {
		return result_real_name_check;
	}
	public void setResult_real_name_check(Real_name_check result_real_name_check) {
		this.result_real_name_check = result_real_name_check;
	}
	public Card_name_check getResult_card_name_check() {
		return result_card_name_check;
	}
	public void setResult_card_name_check(Card_name_check result_card_name_check) {
		this.result_card_name_check = result_card_name_check;
	}
	public Card_mobile_check getResult_card_mobile_check() {
		return result_card_mobile_check;
	}
	public void setResult_card_mobile_check(Card_mobile_check result_card_mobile_check) {
		this.result_card_mobile_check = result_card_mobile_check;
	}
	public Mobile_name_check getResult_mobile_name_check() {
		return result_mobile_name_check;
	}
	public void setResult_mobile_name_check(Mobile_name_check result_mobile_name_check) {
		this.result_mobile_name_check = result_mobile_name_check;
	}
	public Mobile_id_number_check getResult_mobile_id_number_check() {
		return result_mobile_id_number_check;
	}
	public void setResult_mobile_id_number_check(Mobile_id_number_check result_mobile_id_number_check) {
		this.result_mobile_id_number_check = result_mobile_id_number_check;
	}
	public Mobile_id_number_name_check getResult_mobile_id_number_name_check() {
		return result_mobile_id_number_name_check;
	}
	public void setResult_mobile_id_number_name_check(Mobile_id_number_name_check result_mobile_id_number_name_check) {
		this.result_mobile_id_number_name_check = result_mobile_id_number_name_check;
	}
	public Degree_query getResult_degree_query() {
		return result_degree_query;
	}
	public void setResult_degree_query(Degree_query result_degree_query) {
		this.result_degree_query = result_degree_query;
	}
}
