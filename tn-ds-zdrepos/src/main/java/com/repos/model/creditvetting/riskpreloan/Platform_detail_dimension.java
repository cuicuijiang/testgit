package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

public class Platform_detail_dimension implements Serializable{
	private static final long serialVersionUID = -5253270470406628046L;
	private Integer userInfoId;//用户信息ID
	private String platform_detail_dimension;//多平台细分维度详情字符串
	private Integer count;//维度命中多头个数
	private String detail;//维度命中多头详情
	private String dimension;//维度展示名
	public String getPlatform_detail_dimension() {
		return platform_detail_dimension;
	}
	public void setPlatform_detail_dimension(String platform_detail_dimension) {
		this.platform_detail_dimension = platform_detail_dimension;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	@Override
	public String toString() {
		return "Platform_detail_dimension [userInfoId=" + userInfoId + ", platform_detail_dimension="
				+ platform_detail_dimension + ", count=" + count + ", detail=" + detail + ", dimension=" + dimension
				+ "]";
	}
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
}
