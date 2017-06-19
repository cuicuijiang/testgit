package com.ds.etl.mongo.test;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface UserRepository extends MongoRepository<User<UserData>, String>{

	/**
     * 根据name查找
     * @param name name
     * @return user list
     */
	List<User<UserData>> findByName(String name);
	
	/**
     * 同时根据name和password查找
     * @param name name
     * @param password password
     * @return user list
     */
	List<User<UserData>> findByNameAndPassword(String name, String password);
	
	/**
     * 分页查找
     * @param name name
     * @param pageable 分页请求
     * @return 查找出的当前页的结果
     */
    Page<User<UserData>> findByName(String name, Pageable pageable);
    
    /**
     * 自定义查找
     * 查找姓名为name1 或者 name2 的user
     * @param name1 name1
     * @param name2 name2
     * @return user list
     */
    @Query("{$or:[{name: ?0}, {name: ?1}]}")
    List<User<UserData>> customFind1(String name1, String name2);
    
    //@Query("{$text:{$search:{?0}}}") //不支持
    //List<User<UserData>> customFind2(String keyword);
    
    /**
	 * 全文检索结接口
	 * @param keywords keywords
	 * @return User
	 */
	List<User<UserData>> textSearch(String[] keywords, int pageNum, int pageSize);
	
	/**
	 * 查询某一时间之后的记录
	 * @param date
	 * @return User
	 */
	List<User<UserData>> findByCreateTimeAfter(Date date);
	
	/**
	 * 查询某一时间之后的记录
	 * @param date
	 * @return User
	 */
	@Query(value="{createTime:{$gt: ?0}}")
	List<User<UserData>> findByCreateTimeAfter2(Date date);
	
}
