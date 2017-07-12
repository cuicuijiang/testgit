package com.repos.mysql.jdbc.vetting;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.stereotype.Repository;

import com.repos.model.commons.StateCode.DataCodeEnum;


/**
 * CreditVetting DAO 基类
 * @author zhangqingli
 * @param <T>
 */
@Repository
public class CreditVettingBaseDao<T> {
	protected static final Logger LOGGER = LoggerFactory.getLogger(CreditVettingBaseDao.class);
	
	@Autowired
	@Qualifier("creditvettingJdbcTemplate")
	protected JdbcTemplate jdbcTemplate;
	@Autowired
	protected LobHandler lobHandler;
	
	protected String tableName;
	protected String primaryIdName;

	
	/**
	 * maxId
	 * @return
	 */
	public Long maxId() {
		long start = System.currentTimeMillis();
		String sql = "select max("+primaryIdName+") from " + tableName;
		LOGGER.info("sql> {}", sql);
		
		Long result = jdbcTemplate.queryForObject(sql, Long.class);
		LOGGER.info("sql> 耗时：{} s", (System.currentTimeMillis()-start)/1000.0);
		return result;
	}
	
	
	/**
	 * findForObjectById
	 * @param entityType
	 * @param id
	 * @return
	 */
	public T findForObjectById(Class<T> entityType, Long id) {
		long start = System.currentTimeMillis();
		String sql = "select * from " + tableName + " where "+ primaryIdName +"=?";
		LOGGER.info("sql> {}", sql);
		LOGGER.info("sql params> {}", id);
		RowMapper<T> rowMapper = new BeanPropertyRowMapper<T>(entityType);
		
		T t = null;
		try {
			t = jdbcTemplate.queryForObject(sql, rowMapper, id);
		} catch (DataAccessException e) {
			LOGGER.info(DataCodeEnum.DATA_IS_NULL.getDesc());
		}

		LOGGER.info("sql> 耗时：{} s", (System.currentTimeMillis()-start)/1000.0);
		return t;
	}
	
	
	/**
	 * findByIdBetween
	 * @param entityType
	 * @param start
	 * @param end
	 * @return
	 */
	public List<T> findByIdBetween(Class<T> entityType, Long start, Long end) {
		long startTime = System.currentTimeMillis();
		String sql = "select * from " + tableName + " where "+ primaryIdName +">=? and "+ primaryIdName +"<=?";
		LOGGER.info("sql> {}", sql);
		LOGGER.info("sql params> {}, {}", start, end);
		RowMapper<T> rowMapper = new BeanPropertyRowMapper<T>(entityType);

		List<T> results = jdbcTemplate.query(sql, rowMapper, start, end);
		if (results.isEmpty()) {
			LOGGER.info(DataCodeEnum.DATA_IS_NULL.getDesc());
		}
		
		LOGGER.info("sql> 耗时：{} s", (System.currentTimeMillis()-startTime)/1000.0);
		return results;
	}
	
	
	/**
	 * findByColumn 
	 * @param entityType
	 * @param columnName
	 * @param columnValue
	 * @return
	 */
	public List<T> findByColumn(Class<T> entityType, String columnName, Object columnValue) {
		long start = System.currentTimeMillis();
		String sql = "select * from " + tableName + " where "+ columnName +"=?";
		LOGGER.info("sql> {}", sql);
		LOGGER.info("sql params> {}", columnValue);
		RowMapper<T> rowMapper = new BeanPropertyRowMapper<T>(entityType);
		
		List<T> results = jdbcTemplate.query(sql, rowMapper, columnValue);
		if (results.isEmpty()) {
			LOGGER.info(DataCodeEnum.DATA_IS_NULL.getDesc());
		}
		
		LOGGER.info("sql> 耗时：{} s", (System.currentTimeMillis()-start)/1000.0);
		return results;
	}
	
	
	/**
	 * findForObjectByColumn
	 * @param entityType
	 * @param columnName
	 * @param columnValue
	 * @return
	 */
	public T findForObjectByColumn(Class<T> entityType, String columnName, Object columnValue) {
		long start = System.currentTimeMillis();
		String sql = "select * from " + tableName + " where "+ columnName +"=?";
		LOGGER.info("sql> {}", sql);
		LOGGER.info("sql params> {}", columnValue);
		RowMapper<T> rowMapper = new BeanPropertyRowMapper<T>(entityType);
		
		T t = null;
		try {
			t = jdbcTemplate.queryForObject(sql, rowMapper, columnValue);
		} catch (DataAccessException e) {
			LOGGER.info(DataCodeEnum.DATA_IS_NULL.getDesc());
		}
		
		LOGGER.info("sql> 耗时：{} s", (System.currentTimeMillis()-start)/1000.0);
		return t;
	}
}
