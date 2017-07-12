package com.repos.model.creditvetting;

import java.util.List;

public class TelDx {

	private Long basicInfoId;
	private List<DxFlowInfoList> dxFlowInfoLists;
	private List<DxPackageInfo> dxPackageInfos;
	private List<DxFamiliarityInfo> dxFamiliarityInfos;
	private List<DxPointInfo> dxPointInfos;
	private List<DxCreditInfo> dxCreditInfos;

	public Long getBasicInfoId() {
		return basicInfoId;
	}

	public void setBasicInfoId(Long basicInfoId) {
		this.basicInfoId = basicInfoId;
	}

	public List<DxFlowInfoList> getDxFlowInfoLists() {
		return dxFlowInfoLists;
	}

	public void setDxFlowInfoLists(List<DxFlowInfoList> dxFlowInfoLists) {
		this.dxFlowInfoLists = dxFlowInfoLists;
	}

	public List<DxPackageInfo> getDxPackageInfos() {
		return dxPackageInfos;
	}

	public void setDxPackageInfos(List<DxPackageInfo> dxPackageInfos) {
		this.dxPackageInfos = dxPackageInfos;
	}

	public List<DxFamiliarityInfo> getDxFamiliarityInfos() {
		return dxFamiliarityInfos;
	}

	public void setDxFamiliarityInfos(List<DxFamiliarityInfo> dxFamiliarityInfos) {
		this.dxFamiliarityInfos = dxFamiliarityInfos;
	}

	public List<DxPointInfo> getDxPointInfos() {
		return dxPointInfos;
	}

	public void setDxPointInfos(List<DxPointInfo> dxPointInfos) {
		this.dxPointInfos = dxPointInfos;
	}

	public List<DxCreditInfo> getDxCreditInfos() {
		return dxCreditInfos;
	}

	public void setDxCreditInfos(List<DxCreditInfo> dxCreditInfos) {
		this.dxCreditInfos = dxCreditInfos;
	}

}
