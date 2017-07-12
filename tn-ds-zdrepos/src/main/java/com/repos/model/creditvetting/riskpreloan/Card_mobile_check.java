package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;
/**
 * 银行卡-手机号一致性验证详情
 *
 */
public class Card_mobile_check implements Serializable{
	private static final long serialVersionUID = 4498361503421332162L;
	private Integer userInfoId;			//用户信息ID
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
	private String card_mobile_check;	//验证详情JSON
	private String result;				//调用结果
	private String result_code;			//调用结果编码
	private Boolean flow_charge;		//是否扣费
	private String card;				//银行卡号
	private String mobile;				//手机号
	public String getCard_mobile_check() {
		return card_mobile_check;
	}
	public void setCard_mobile_check(String card_mobile_check) {
		this.card_mobile_check = card_mobile_check;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResult_code() {
		return result_code;
	}
	public void setResult_code(String result_code) {
		this.result_code = result_code;
	}
	public Boolean getFlow_charge() {
		return flow_charge;
	}
	public void setFlow_charge(Boolean flow_charge) {
		this.flow_charge = flow_charge;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Card_mobile_check [userInfoId=" + userInfoId + ", card_mobile_check=" + card_mobile_check + ", result="
				+ result + ", result_code=" + result_code + ", flow_charge=" + flow_charge + ", card=" + card
				+ ", mobile=" + mobile + "]";
	}
}
