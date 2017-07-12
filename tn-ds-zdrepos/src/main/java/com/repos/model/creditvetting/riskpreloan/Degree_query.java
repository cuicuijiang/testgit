package com.repos.model.creditvetting.riskpreloan;

import java.io.Serializable;

/**
 * 学历查询详情
 *
 */
public class Degree_query implements Serializable{
	private static final long serialVersionUID = 5137089466302873770L;
	private Integer userInfoId;					//用户信息ID
	public Integer getUserInfoId() {
		return userInfoId;
	}
	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}
	private String degree_query;				//查询结果JSON串
	private String result;						//调用结果
	private String result_code;					//调用结果编码
	private Boolean flow_charge;				//是否扣费
	private String name;						//姓名
	private String id_number;					//身份证
	private String third_part_degree;			//学历
	private String third_part_graduate_school;	//毕业学校
	private String third_part_speciality;		//专业
	private String third_part_enrol_date;		//入学年份
	private String third_part_graduate_date;	//毕业年份	
	private String third_part_study_style;		//学历类型
	private String third_part_study_result;		//毕业类型
	public String getDegree_query() {
		return degree_query;
	}
	public void setDegree_query(String degree_query) {
		this.degree_query = degree_query;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getResult_code() {
		return result_code;
	}
	public void setResult_code(String result_code) {
		this.result_code = result_code;
	}
	public Boolean getFlow_charge() {
		return flow_charge;
	}
	public void setFlow_charge(Boolean flow_charge) {
		this.flow_charge = flow_charge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public String getThird_part_degree() {
		return third_part_degree;
	}
	public void setThird_part_degree(String third_part_degree) {
		this.third_part_degree = third_part_degree;
	}
	public String getThird_part_graduate_school() {
		return third_part_graduate_school;
	}
	public void setThird_part_graduate_school(String third_part_graduate_school) {
		this.third_part_graduate_school = third_part_graduate_school;
	}
	public String getThird_part_speciality() {
		return third_part_speciality;
	}
	public void setThird_part_speciality(String third_part_speciality) {
		this.third_part_speciality = third_part_speciality;
	}
	public String getThird_part_enrol_date() {
		return third_part_enrol_date;
	}
	public void setThird_part_enrol_date(String third_part_enrol_date) {
		this.third_part_enrol_date = third_part_enrol_date;
	}
	public String getThird_part_graduate_date() {
		return third_part_graduate_date;
	}
	public void setThird_part_graduate_date(String third_part_graduate_date) {
		this.third_part_graduate_date = third_part_graduate_date;
	}
	public String getThird_part_study_style() {
		return third_part_study_style;
	}
	public void setThird_part_study_style(String third_part_study_style) {
		this.third_part_study_style = third_part_study_style;
	}
	public String getThird_part_study_result() {
		return third_part_study_result;
	}
	public void setThird_part_study_result(String third_part_study_result) {
		this.third_part_study_result = third_part_study_result;
	}
	@Override
	public String toString() {
		return "Degree_query [userInfoId=" + userInfoId + ", degree_query=" + degree_query + ", result=" + result
				+ ", result_code=" + result_code + ", flow_charge=" + flow_charge + ", name=" + name + ", id_number="
				+ id_number + ", third_part_degree=" + third_part_degree + ", third_part_graduate_school="
				+ third_part_graduate_school + ", third_part_speciality=" + third_part_speciality
				+ ", third_part_enrol_date=" + third_part_enrol_date + ", third_part_graduate_date="
				+ third_part_graduate_date + ", third_part_study_style=" + third_part_study_style
				+ ", third_part_study_result=" + third_part_study_result + "]";
	}
}
