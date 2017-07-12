package com.repos.integration.etl;

import java.io.Serializable;

/**
 * 数据抽提器接口
 * @author zhangqingli
 * @param <T>
 */
public interface Extracter<T, ID extends Serializable> {
	
	T extract(ID id);
}
