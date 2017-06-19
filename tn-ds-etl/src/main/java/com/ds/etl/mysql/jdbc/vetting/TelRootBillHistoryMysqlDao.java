package com.ds.etl.mysql.jdbc.vetting;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.ds.etl.model.SenderRepository;
import com.ds.etl.model.vetting.TelRootBillHistory;

/**
 * @author zhangqingli
 *
 */
@Repository
public class TelRootBillHistoryMysqlDao implements SenderRepository<TelRootBillHistory, Long>{
	
	@Autowired
	@Qualifier("creditvettingJdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public Long maxTotalCount() {
		String sql = "select max(id) from b_t_bill_history";
		return jdbcTemplate.queryForObject(sql, Long.class);
	}
	

	@Override
	public List<TelRootBillHistory> sendRecords(Long start, Long end) {
		String sql = "select * from b_t_bill_history where id>=? and id<=?";
		RowMapper<TelRootBillHistory> rowMapper = new BeanPropertyRowMapper<TelRootBillHistory>(TelRootBillHistory.class);
		return jdbcTemplate.query(sql, rowMapper, start, end);
	}
}
