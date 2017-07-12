package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Overdue_detail implements Serializable{
	private static final long serialVersionUID = 5728626260867238909L;
	private Integer userInfoId;//用户信息ID
	private String overdue_detail;//逾期详情字符串
	private Double overdue_amount;//逾期金额	
	private Integer overdue_count;//逾期笔数
	private Integer overdue_day;//逾期天数
	public String getOverdue_detail() {
		return overdue_detail;
	}
	public void setOverdue_detail(String overdue_detail) {
		this.overdue_detail = overdue_detail;
	}
	public Double getOverdue_amount() {
		return overdue_amount;
	}
	public void setOverdue_amount(Double overdue_amount) {
		this.overdue_amount = overdue_amount;
	}
	public Integer getOverdue_count() {
		return overdue_count;
	}
	public void setOverdue_count(Integer overdue_count) {
		this.overdue_count = overdue_count;
	}
	public Integer getOverdue_day() {
		return overdue_day;
	}
	public void setOverdue_day(Integer overdue_day) {
		this.overdue_day = overdue_day;
	}
	@Override
	public String toString() {
		return "Overdue_detail [userInfoId=" + userInfoId + ", overdue_detail=" + overdue_detail + ", overdue_amount="
				+ overdue_amount + ", overdue_count=" + overdue_count + ", overdue_day=" + overdue_day + "]";
	}
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
}
