package com.ds.etl.mysql.jdbc.vetting;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.ds.etl.model.SenderRepository;
import com.ds.etl.model.vetting.TelRootLogin;

/**
 * @author zhangqingli
 *
 */
@Repository
public class TelRootLoginMysqlDao implements SenderRepository<TelRootLogin, Long> {
	
	@Autowired
	@Qualifier("creditvettingJdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Long maxTotalCount() {
		String sql = "select max(id) from b_t_login";
		return jdbcTemplate.queryForObject(sql, Long.class);
	}
	
	
	@Override
	public List<TelRootLogin> sendRecords(Long start, Long end) {
		String sql = "select * from b_t_login where id>=? and id<=?";
		RowMapper<TelRootLogin> rowMapper = new BeanPropertyRowMapper<TelRootLogin>(TelRootLogin.class);
		return jdbcTemplate.query(sql, rowMapper, start, end);
	}
}
