package com.ds.etl.model;

import java.io.Serializable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 数据接收处理者
 * @author zhangqingli
 *
 */
public interface ReceiverRepository<T, ID extends Serializable> extends MongoRepository<T, ID>{

}
