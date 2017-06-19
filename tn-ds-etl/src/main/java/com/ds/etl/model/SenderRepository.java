package com.ds.etl.model;

import java.util.Collection;


/**
 * 数据发送处理者
 * @author zhangqingli
 *
 */
public interface SenderRepository<T, ID extends Number> {
	/**
	 * 最大记录总条数
	 * @return
	 */
	Long maxTotalCount();
	
	/**
	 * 一次发送的数据（id包含头包含尾）
	 * @param start
	 * @param end
	 * @return
	 */
	Collection<T> sendRecords(ID idStart, ID idEnd);
}
