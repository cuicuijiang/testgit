package com.ds.etl.model.vetting;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 爬取记录表
 * 
 * @author zhangqingli
 *
 */
@Document(collection="telRootLogin")
public class TelRootLogin implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	@Id
	private Long id;
	
	//任务ID
	@Indexed
	private String task_id;
	
	//身份证号
	@Indexed
	private String idcard;
	
	//客户真实姓名
	private String user_name;
	
	//手机号码
	@Indexed
	private String user_number;
	
	//爬取结果 1成功 2失败
	private Integer result;
	
	//爬取结果说明
	private String remark;
	
	//爬取时间
	private Date create_time;
	
	//修改时间
	@Indexed
	private Date modify_time;
	
	//借款申请ID，b_loan_application表
	@Indexed
	private String application_id;
	
	//结果json
	private String result_json;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTask_id() {
		return task_id;
	}
	public void setTask_id(String task_id) {
		this.task_id = task_id;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_number() {
		return user_number;
	}
	public void setUser_number(String user_number) {
		this.user_number = user_number;
	}
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Date getModify_time() {
		return modify_time;
	}
	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}
	public String getApplication_id() {
		return application_id;
	}
	public void setApplication_id(String application_id) {
		this.application_id = application_id;
	}
	public String getResult_json() {
		return result_json;
	}
	public void setResult_json(String result_json) {
		this.result_json = result_json;
	}
}
