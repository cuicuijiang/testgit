package com.ds.etl.model.vetting;

import java.io.Serializable;
import java.util.List;

/**
 * 运营商信息根表
 * @author zhangqingli
 *
 */
public class TelRoot implements Serializable {
	private static final long serialVersionUID = 1L;

	// 爬取记录
	private TelRootLogin telRootLogin;
	// 基础信息表三合一
	private TelRootBasicInfo telRootBasicinfo;
	// 历史账单表三合一
	private List<TelRootBillHistory> telRootBillHistorys;
	// 通话记录表三合一
	private List<TelRootCall> telRootCalls;
	// 短信表三合一
	private List<TelRootMsg> telRootMsgs;

	
	public TelRootLogin getTelRootLogin() {
		return telRootLogin;
	}

	public void setTelRootLogin(TelRootLogin telRootLogin) {
		this.telRootLogin = telRootLogin;
	}

	public TelRootBasicInfo getTelRootBasicinfo() {
		return telRootBasicinfo;
	}

	public void setTelRootBasicinfo(TelRootBasicInfo telRootBasicinfo) {
		this.telRootBasicinfo = telRootBasicinfo;
	}

	public List<TelRootBillHistory> getTelRootBillHistorys() {
		return telRootBillHistorys;
	}

	public void setTelRootBillHistorys(List<TelRootBillHistory> telRootBillHistorys) {
		this.telRootBillHistorys = telRootBillHistorys;
	}

	public List<TelRootCall> getTelRootCalls() {
		return telRootCalls;
	}

	public void setTelRootCalls(List<TelRootCall> telRootCalls) {
		this.telRootCalls = telRootCalls;
	}

	public List<TelRootMsg> getTelRootMsgs() {
		return telRootMsgs;
	}

	public void setTelRootMsgs(List<TelRootMsg> telRootMsgs) {
		this.telRootMsgs = telRootMsgs;
	}
}
