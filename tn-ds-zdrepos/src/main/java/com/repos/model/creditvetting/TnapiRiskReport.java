package com.repos.model.creditvetting;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TnapiRiskReport implements Serializable {
	private static final long serialVersionUID = 1L;
	private String applyId;
	private String resCode;
	private String result;
	private String serialNo;
	private List<TnapiRiskReportItem> data = new ArrayList<TnapiRiskReportItem>();
	
	public String getApplyId() {
		return applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getResCode() {
		return resCode;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public List<TnapiRiskReportItem> getData() {
		return data;
	}
	public void setData(List<TnapiRiskReportItem> data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "TnapiRiskReport [applyId=" + applyId + ", resCode=" + resCode + ", result=" + result + ", serialNo="
				+ serialNo + ", data=" + data + "]";
	}
}
