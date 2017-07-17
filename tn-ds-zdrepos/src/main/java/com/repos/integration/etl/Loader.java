package com.repos.integration.etl;

import java.util.List;

/**
 * 数据加载器接口
 * @author zhangqingli
 * @param <T>
 */
public interface Loader<T> {
	
	/**
	 * load方法
	 * @param t
	 * @return
	 */
	T load(T t);
	
	
	/**
	 * 默认加载方法
	 * @param t
	 * @return
	 */
	default List<T> load(List<T> ts) {
		// TODO STH IN IMPLEMENTS CLASS
		return null;
	}
	
	Long getLastestId();
}
