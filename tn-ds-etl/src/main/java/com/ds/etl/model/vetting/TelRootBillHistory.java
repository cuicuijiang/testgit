package com.ds.etl.model.vetting;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 历史账单表三合一
 * @author zhangqingli
 *
 */
@Document(collection="telRootBillHistory")
public class TelRootBillHistory implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	@Id
	private Long id;
	//对应b_t_basic_info表中的id
	@Indexed
	private Integer basic_info_id;
	@Indexed
	private String customer_id;
	@Indexed
	private String idcard;
	@Indexed
	private String user_number;
	//记账周期
	private String account_query_cycle;
	//本月消费，单位:元
	private String account_comsume;
	//费用项目
	private String account_items;
	//金额，单位:元
	private String account_fee;
	//费用类别
	private String account_category;
	//查询时间
	private Date inquiry_time;
	//费用合计
	private String bill_total;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getBasic_info_id() {
		return basic_info_id;
	}
	public void setBasic_info_id(Integer basic_info_id) {
		this.basic_info_id = basic_info_id;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getUser_number() {
		return user_number;
	}
	public void setUser_number(String user_number) {
		this.user_number = user_number;
	}
	public String getAccount_query_cycle() {
		return account_query_cycle;
	}
	public void setAccount_query_cycle(String account_query_cycle) {
		this.account_query_cycle = account_query_cycle;
	}
	public String getAccount_comsume() {
		return account_comsume;
	}
	public void setAccount_comsume(String account_comsume) {
		this.account_comsume = account_comsume;
	}
	public String getAccount_items() {
		return account_items;
	}
	public void setAccount_items(String account_items) {
		this.account_items = account_items;
	}
	public String getAccount_fee() {
		return account_fee;
	}
	public void setAccount_fee(String account_fee) {
		this.account_fee = account_fee;
	}
	public String getAccount_category() {
		return account_category;
	}
	public void setAccount_category(String account_category) {
		this.account_category = account_category;
	}
	public Date getInquiry_time() {
		return inquiry_time;
	}
	public void setInquiry_time(Date inquiry_time) {
		this.inquiry_time = inquiry_time;
	}
	public String getBill_total() {
		return bill_total;
	}
	public void setBill_total(String bill_total) {
		this.bill_total = bill_total;
	}
}
