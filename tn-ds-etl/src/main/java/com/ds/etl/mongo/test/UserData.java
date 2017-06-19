package com.ds.etl.mongo.test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserData {
	private Date date;
	private Map<String, String> map;
	private List<Integer> list;
	private Set<String> set;
	private Integer[] array;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Integer[] getArray() {
		return array;
	}
	public void setArray(Integer[] array) {
		this.array = array;
	}
	
	@Override
	public String toString() {
		return "UserData [date=" + date + ", map=" + map + ", list=" + list
				+ ", set=" + set + ", array=" + Arrays.toString(array) + "]";
	}
}
