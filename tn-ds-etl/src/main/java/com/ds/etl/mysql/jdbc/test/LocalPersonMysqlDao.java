package com.ds.etl.mysql.jdbc.test;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ds.etl.model.SenderRepository;
import com.ds.etl.model.test.LocalPerson;

@Repository
public class LocalPersonMysqlDao implements SenderRepository<LocalPerson, Long> {

	@Autowired
	@Qualifier("creditvettingJdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Long maxTotalCount() {
		String sql = "select max(id) from T_EMP";
		return jdbcTemplate.queryForObject(sql, Long.class);
	}

	@Override
	public Collection<LocalPerson> sendRecords(Long idStart, Long idEnd) {
		String sql = "select * from T_EMP where id>=? and id<=?";
		RowMapper<LocalPerson> rowMapper = new BeanPropertyRowMapper<LocalPerson>(LocalPerson.class);
		return jdbcTemplate.query(sql, rowMapper, idStart, idEnd);
	}

}
