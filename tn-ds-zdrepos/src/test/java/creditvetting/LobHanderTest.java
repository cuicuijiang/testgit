package creditvetting;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.AbstractLobCreatingPreparedStatementCallback;
import org.springframework.jdbc.support.lob.LobCreator;
import org.springframework.jdbc.support.lob.LobHandler;
import basetest.BaseTest;


public class LobHanderTest extends BaseTest {

	@Autowired
	@Qualifier("creditvettingJdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private LobHandler lobHandler;

	/**
	 * 插入clob数据
	 */
	@Test
	public void test01() {
		String sql = "insert into t_post(id,text) values(?,?)";
		jdbcTemplate.execute(sql, new AbstractLobCreatingPreparedStatementCallback(lobHandler) {
			@Override
			protected void setValues(PreparedStatement ps, LobCreator lobCreator)
					throws SQLException, DataAccessException {
				ps.setInt(1, 1);
				lobCreator.setClobAsString(ps, 2, "我是Clob字段"); // 设置Clob字段
			}
		});
	}

	/**
	 * 以块数据方式读取Lob数据
	 */
	@Test
	public void test02() {
		String sql = "select id,text from t_post where id = ?";

		List<User01> users = jdbcTemplate.query(sql, new Object[] { 1 }, new RowMapper<User01>() {
			@Override
			public User01 mapRow(ResultSet rs, int rowNum) throws SQLException {
				byte[] attach = lobHandler.getBlobAsBytes(rs, 2);
				String strAttach = new String(attach);

				User01 user1 = new User01();
				user1.setId(rs.getInt("id"));
				user1.setText(strAttach);
				return user1;
			}
		});

		System.out.println(users);
	}

}



class User01 {
	private Integer id;
	private String text;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
