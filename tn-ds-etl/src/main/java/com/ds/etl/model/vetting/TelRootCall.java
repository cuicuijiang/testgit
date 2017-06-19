package com.ds.etl.model.vetting;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 通话记录表三合一
 * @author zhangqingli
 *
 */
@Document(collection="telRootCall")
public class TelRootCall implements Serializable {
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
	
	//时长
	private String times;
	
	//时间
	private String stat_time;
	
	//1.主叫2.被叫
	private String call_channel;
	
	//地点
	private String call_address;
	
	//通话类型
	private String land_type;
	
	//对方号码
	private String other_number;
	
	//查询时间
	private Date inquiry_time;
	
	
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
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public String getStat_time() {
		return stat_time;
	}
	public void setStat_time(String stat_time) {
		this.stat_time = stat_time;
	}
	public String getCall_channel() {
		return call_channel;
	}
	public void setCall_channel(String call_channel) {
		this.call_channel = call_channel;
	}
	public String getCall_address() {
		return call_address;
	}
	public void setCall_address(String call_address) {
		this.call_address = call_address;
	}
	public String getLand_type() {
		return land_type;
	}
	public void setLand_type(String land_type) {
		this.land_type = land_type;
	}
	public String getOther_number() {
		return other_number;
	}
	public void setOther_number(String other_number) {
		this.other_number = other_number;
	}
	public Date getInquiry_time() {
		return inquiry_time;
	}
	public void setInquiry_time(Date inquiry_time) {
		this.inquiry_time = inquiry_time;
	}
	
}
