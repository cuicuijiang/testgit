package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

/**
 * 银行卡-姓名一致性验证详情
 *
 */
public class Card_name_check implements Serializable{
	private static final long serialVersionUID = -7791443564947816807L;
	private Integer userInfoId;			//用户信息ID
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
	private String card_name_check;		//验证详情JSON串
	private String result;				//调用结果
	private String result_code;			//调用结果编码
	private Boolean flow_charge;		//是否扣费
	private String name;				//姓名
	private String card;				//银行卡号
	public String getCard_name_check() {
		return card_name_check;
	}
	public void setCard_name_check(String card_name_check) {
		this.card_name_check = card_name_check;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	@Override
	public String toString() {
		return "Card_name_check [userInfoId=" + userInfoId + ", card_name_check=" + card_name_check + ", result="
				+ result + ", result_code=" + result_code + ", flow_charge=" + flow_charge + ", name=" + name
				+ ", card=" + card + "]";
	}
}
