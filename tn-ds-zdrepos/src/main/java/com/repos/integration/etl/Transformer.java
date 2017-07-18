package com.repos.integration.etl;

/**
 * 数据转换器
 * @author zhangqingli
 * @param <S>
 * @param <T>
 */
public interface Transformer<S, T> {
	T trans(S s);
}
