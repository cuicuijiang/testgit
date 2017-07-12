package com.repos.model.creditvetting;

import java.io.Serializable;

public class TnapiRiskReportItem implements Serializable {
	private static final long serialVersionUID = 1L;
	private String output;
	private String refuseCode;
	private String riskType;
	private Integer weights;
	private Integer result;
	private String no;
	
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getRefuseCode() {
		return refuseCode;
	}
	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}
	public String getRiskType() {
		return riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}
	public Integer getWeights() {
		return weights;
	}
	public void setWeights(Integer weights) {
		this.weights = weights;
	}
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "TnapiRiskReportItem [output=" + output + ", refuseCode=" + refuseCode + ", riskType=" + riskType
				+ ", weights=" + weights + ", result=" + result + ", no=" + no + "]";
	}
}
