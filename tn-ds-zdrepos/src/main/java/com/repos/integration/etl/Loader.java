package com.repos.integration.etl;

/**
 * 数据加载器接口
 * @author zhangqingli
 * @param <T>
 */
public interface Loader<T> {
	
	T load(T t);
}
