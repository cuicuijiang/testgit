package com.repos.model.creditvetting;

import java.util.List;

public class TelLt {

	private Long basicInfoId;
	private List<LtAccountBalance> ltAccountBalances;
	private List<LtBillHistory> ltBillHistories;
	private List<LtPaymentRecord> LtPaymentRecords;

	public Long getBasicInfoId() {
		return basicInfoId;
	}

	public void setBasicInfoId(Long basicInfoId) {
		this.basicInfoId = basicInfoId;
	}

	public List<LtAccountBalance> getLtAccountBalances() {
		return ltAccountBalances;
	}

	public void setLtAccountBalances(List<LtAccountBalance> ltAccountBalances) {
		this.ltAccountBalances = ltAccountBalances;
	}

	public List<LtBillHistory> getLtBillHistories() {
		return ltBillHistories;
	}

	public void setLtBillHistories(List<LtBillHistory> ltBillHistories) {
		this.ltBillHistories = ltBillHistories;
	}

	public List<LtPaymentRecord> getLtPaymentRecords() {
		return LtPaymentRecords;
	}

	public void setLtPaymentRecords(List<LtPaymentRecord> ltPaymentRecords) {
		LtPaymentRecords = ltPaymentRecords;
	}

}
