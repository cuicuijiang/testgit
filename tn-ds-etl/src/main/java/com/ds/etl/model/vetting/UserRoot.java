package com.ds.etl.model.vetting;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 客户基本信息
 * @author zhangqingli
 *
 */
@Document(collection="userRoot")
public class UserRoot implements Serializable {
	private static final long serialVersionUID = 1L;
	
}
