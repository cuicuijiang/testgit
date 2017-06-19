package com.ds.etl.model.vetting;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 短信表三合一
 * @author zhangqingli
 *
 */
@Document(collection="telRootMsg")
public class TelRootMsg implements Serializable {
	private static final long serialVersionUID = 1L;

	//主键
	@Id
	private Long id;
	//对应b_t_basic_info表中的id
	@Indexed
	private String basic_info_id;
	@Indexed
	private String customer_id;
	@Indexed
	private String idcard;
	@Indexed
	private String user_number;
	//信息类型
	private String msg_channel;
	//通信方式
	private String msg_type;
	//对方号码
	private String msg_other_num;
	//时间
	private String msg_stat_time;
	//费用，单位:元
	private String msg_cost;
	//查询时间
	private String inquiry_time;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBasic_info_id() {
		return basic_info_id;
	}
	public void setBasic_info_id(String basic_info_id) {
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
	public String getMsg_channel() {
		return msg_channel;
	}
	public void setMsg_channel(String msg_channel) {
		this.msg_channel = msg_channel;
	}
	public String getMsg_type() {
		return msg_type;
	}
	public void setMsg_type(String msg_type) {
		this.msg_type = msg_type;
	}
	public String getMsg_other_num() {
		return msg_other_num;
	}
	public void setMsg_other_num(String msg_other_num) {
		this.msg_other_num = msg_other_num;
	}
	public String getMsg_stat_time() {
		return msg_stat_time;
	}
	public void setMsg_stat_time(String msg_stat_time) {
		this.msg_stat_time = msg_stat_time;
	}
	public String getMsg_cost() {
		return msg_cost;
	}
	public void setMsg_cost(String msg_cost) {
		this.msg_cost = msg_cost;
	}
	public String getInquiry_time() {
		return inquiry_time;
	}
	public void setInquiry_time(String inquiry_time) {
		this.inquiry_time = inquiry_time;
	}
	
}
