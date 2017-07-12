package com.repos.model.creditvetting;

import java.util.List;

public class TelYd {

	private Long basicInfoId;
	private List<YdBizBusiness> ydBizBusinesses;
	private List<YdDetailInfo> ydDetailInfos;
	private List<YdPayInfo> ydPayInfos;
	private List<YdPointInfo> ydPointInfos;

	public Long getBasicInfoId() {
		return basicInfoId;
	}

	public void setBasicInfoId(Long basicInfoId) {
		this.basicInfoId = basicInfoId;
	}

	public List<YdBizBusiness> getYdBizBusinesses() {
		return ydBizBusinesses;
	}

	public void setYdBizBusinesses(List<YdBizBusiness> ydBizBusinesses) {
		this.ydBizBusinesses = ydBizBusinesses;
	}

	public List<YdDetailInfo> getYdDetailInfos() {
		return ydDetailInfos;
	}

	public void setYdDetailInfos(List<YdDetailInfo> ydDetailInfos) {
		this.ydDetailInfos = ydDetailInfos;
	}

	public List<YdPayInfo> getYdPayInfos() {
		return ydPayInfos;
	}

	public void setYdPayInfos(List<YdPayInfo> ydPayInfos) {
		this.ydPayInfos = ydPayInfos;
	}

	public List<YdPointInfo> getYdPointInfos() {
		return ydPointInfos;
	}

	public void setYdPointInfos(List<YdPointInfo> ydPointInfos) {
		this.ydPointInfos = ydPointInfos;
	}
}
