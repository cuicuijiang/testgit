package com.repos.integration.etl;

import java.util.List;

/**
 * 数据抽提器接口
 * @author zhangqingli
 * @param <T>
 */
public interface Extracter<T, ID> {
	
	/**
	 * 获取最后一个ID
	 */
	ID getLastestId();
	
	/**
	 * extract方法
	 * @param id
	 * @return
	 */
	T extract(ID id);
	
	/**
	 * 默认extract方法实现
	 * @param start
	 * @param end
	 * @return
	 */
	default List<T> extract(ID start, ID end) {
		// TODO STH IN IMPLEMENTS CLASS
		return null;
	}
}
