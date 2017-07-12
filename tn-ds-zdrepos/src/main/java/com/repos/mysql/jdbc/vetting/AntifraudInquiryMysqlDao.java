package com.repos.mysql.jdbc.vetting;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;
import com.repos.model.commons.StateCode.DataCodeEnum;
import com.repos.model.creditvetting.AntifraudInquiry;

/**
 * 
 * @author zhangqingli
 *
 */
@Repository
public class AntifraudInquiryMysqlDao extends CreditVettingBaseDao<AntifraudInquiry> {
	{
		tableName = "b_antifraud_inquiry";
		primaryIdName = "id";
	}
	
	
	@Override
	public List<AntifraudInquiry> findByColumn(Class<AntifraudInquiry> entityType, String columnName,
			Object columnValue) {
		
		long start = System.currentTimeMillis();
		String sql = "select * from " + tableName + " where "+ columnName +"=?";
		LOGGER.info("sql> {}", sql);
		LOGGER.info("sql params> {}", columnValue);
		
		List<AntifraudInquiry> results = jdbcTemplate.query(sql, new BeanPropertyRowMapper<AntifraudInquiry>() {
			@Override
			public AntifraudInquiry mapRow(ResultSet rs, int rowNumber) throws SQLException {
				AntifraudInquiry antifraudInquiry = new AntifraudInquiry();
				
				Long id = rs.getLong("id");
				Long scene_id = rs.getLong("scene_id");
				String apply_no = rs.getString("apply_no");
				String result = rs.getString("result");
				
				String resultData = null;
				byte[] resultDataBytes = lobHandler.getBlobAsBytes(rs, "result_data");
				if (resultDataBytes != null) {
					resultData = new String(resultDataBytes);
				}
				
				String code = rs.getString("code");
				String msg = rs.getString("msg");
				String serialNo = rs.getString("serialNo");
				String ccx_SerialNo = rs.getString("ccx_SerialNo");
				Date create_date = rs.getDate("create_date");
				
				antifraudInquiry.setId(id);
				antifraudInquiry.setSceneId(scene_id);
				antifraudInquiry.setApplyNo(apply_no);
				antifraudInquiry.setResult(result);
				antifraudInquiry.setResultData(resultData);
				antifraudInquiry.setCode(code);
				antifraudInquiry.setMsg(msg);
				antifraudInquiry.setSerialNo(serialNo);
				antifraudInquiry.setCcxSerialNo(ccx_SerialNo);
				antifraudInquiry.setCreateDate(create_date);
				return antifraudInquiry;
			}
		}, columnValue);
		
		
		if (results.isEmpty()) {
			LOGGER.info(DataCodeEnum.DATA_IS_NULL.getDesc());
		}
		
		LOGGER.info("sql> 耗时：{} s", (System.currentTimeMillis()-start)/1000.0);
		return results;
	}
}
