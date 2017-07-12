package com.repos.trans.creditvetting;

import java.util.List;
import org.springframework.stereotype.Component;
import com.alibaba.fastjson.JSON;
import com.repos.model.creditvetting.RiskpreloanResult;
import com.repos.model.creditvetting.riskpreloan.Address_detect;
import com.repos.model.creditvetting.riskpreloan.Card_mobile_check;
import com.repos.model.creditvetting.riskpreloan.Card_name_check;
import com.repos.model.creditvetting.riskpreloan.Court_detail;
import com.repos.model.creditvetting.riskpreloan.Degree_query;
import com.repos.model.creditvetting.riskpreloan.Device_info;
import com.repos.model.creditvetting.riskpreloan.Frequency_detail_list;
import com.repos.model.creditvetting.riskpreloan.Geo_ip;
import com.repos.model.creditvetting.riskpreloan.Geo_trueip;
import com.repos.model.creditvetting.riskpreloan.Item_detail;
import com.repos.model.creditvetting.riskpreloan.Kunta_call_result;
import com.repos.model.creditvetting.riskpreloan.Mobile_id_number_check;
import com.repos.model.creditvetting.riskpreloan.Mobile_id_number_name_check;
import com.repos.model.creditvetting.riskpreloan.Mobile_name_check;
import com.repos.model.creditvetting.riskpreloan.Namelist_hit_detail;
import com.repos.model.creditvetting.riskpreloan.Overdue_detail;
import com.repos.model.creditvetting.riskpreloan.Platform_detail_dimension;
import com.repos.model.creditvetting.riskpreloan.Proxy_info;
import com.repos.model.creditvetting.riskpreloan.Real_name_check;
import com.repos.model.creditvetting.riskpreloan.Risk_item;

/**
 * 
 * @author zhangqingli
 *
 */
@Component
public class RiskpreloanResultTrans {

	/**
	 * RiskpreloanResult 表json数据解析
	 * @param riskpreloanResult
	 * @return
	 */
	public RiskpreloanResult trans(RiskpreloanResult riskpreloanResult) {

		if (riskpreloanResult.getProxyInfo() != null && !riskpreloanResult.getProxyInfo().isEmpty()) {
			String proxy_info_json = riskpreloanResult.getProxyInfo();
			List<Proxy_info> proxy_infos = JSON.parseArray(proxy_info_json, Proxy_info.class);
			for (Proxy_info p : proxy_infos) {
				p.setProxy_info(proxy_info_json);
				p.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
			}
			riskpreloanResult.setResult_proxy_infos(proxy_infos);
		}
		
		if (riskpreloanResult.getDeviceInfo() != null && !riskpreloanResult.getDeviceInfo().toString().isEmpty()) {
			String device_info_json = riskpreloanResult.getDeviceInfo();
			
			Device_info device_info = JSON.parseObject(device_info_json, Device_info.class);
			device_info.setDevice_info(device_info_json);
			device_info.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
			riskpreloanResult.setResult_device_info(device_info);
		}
		
		if (riskpreloanResult.getGeoIp() != null && !riskpreloanResult.getGeoIp().toString().isEmpty()) {
			String geo_ip_json = riskpreloanResult.getGeoIp();
			Geo_ip geo_ip = JSON.parseObject(geo_ip_json, Geo_ip.class);
			geo_ip.setGeo_ip(geo_ip_json);
			geo_ip.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
			riskpreloanResult.setResult_geo_ip(geo_ip);
		}
		
		if (riskpreloanResult.getGeoTrueip() != null && !riskpreloanResult.getGeoTrueip().toString().isEmpty()) {
			String geo_trueip_json = riskpreloanResult.getGeoTrueip();
			Geo_trueip geo_trueip = JSON.parseObject(geo_trueip_json, Geo_trueip.class);
			geo_trueip.setGeo_trueip(geo_trueip_json);
			geo_trueip.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
			riskpreloanResult.setResult_geo_trueip(geo_trueip);
		}
		
		if (riskpreloanResult.getKuntaCallResult() != null && !riskpreloanResult.getKuntaCallResult().toString().isEmpty()) {
			String kunta_call_result_json = riskpreloanResult.getKuntaCallResult().toString();
			Kunta_call_result kunta_call_result = JSON.parseObject(kunta_call_result_json, Kunta_call_result.class);
			kunta_call_result.setKunta_call_result(kunta_call_result_json);
			kunta_call_result.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
			riskpreloanResult.setResult_kunta_call_result(kunta_call_result);
			
			String real_name_check_json = kunta_call_result.getReal_name_check();
			String card_name_check_json = kunta_call_result.getCard_name_check();
			String card_mobile_check_json = kunta_call_result.getCard_mobile_check();
			String mobile_name_check_json = kunta_call_result.getMobile_name_check();
			String mobile_id_number_check_json = kunta_call_result.getMobile_id_number_check();
			String mobile_id_number_name_check_json = kunta_call_result.getMobile_id_number_name_check();
			String degree_query_json = kunta_call_result.getDegree_query();

			if (real_name_check_json != null && !real_name_check_json.isEmpty()) {
				List<Real_name_check> real_name_checks = JSON.parseArray(real_name_check_json, Real_name_check.class);
				for (Real_name_check r : real_name_checks) {
					r.setReal_name_check(real_name_check_json);
					r.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
					kunta_call_result.setResult_real_name_check(r);
				}
			}
			if (card_name_check_json != null && !card_name_check_json.isEmpty()) {
				List<Card_name_check> card_name_checks = JSON.parseArray(card_name_check_json, Card_name_check.class);
				for (Card_name_check c : card_name_checks) {
					c.setCard_name_check(card_name_check_json);
					c.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
					kunta_call_result.setResult_card_name_check(c);
				}
			}
			if (card_mobile_check_json != null && !card_mobile_check_json.isEmpty()) {
				List<Card_mobile_check> card_mobile_checks = JSON.parseArray(card_mobile_check_json,
						Card_mobile_check.class);
				for (Card_mobile_check c : card_mobile_checks) {
					c.setCard_mobile_check(card_mobile_check_json);
					c.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
					kunta_call_result.setResult_card_mobile_check(c);
				}
			}
			if (mobile_name_check_json != null && !mobile_name_check_json.isEmpty()) {
				List<Mobile_name_check> mobile_name_checks = JSON.parseArray(mobile_name_check_json,
						Mobile_name_check.class);
				for (Mobile_name_check m : mobile_name_checks) {
					m.setMobile_name_check(mobile_name_check_json);
					m.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
					kunta_call_result.setResult_mobile_name_check(m);
				}
			}
			if (mobile_id_number_check_json != null && !mobile_id_number_check_json.isEmpty()) {
				List<Mobile_id_number_check> mobile_id_number_checks = JSON.parseArray(mobile_id_number_check_json,
						Mobile_id_number_check.class);
				for (Mobile_id_number_check m : mobile_id_number_checks) {
					m.setMobile_id_number_check(mobile_id_number_check_json);
					m.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
					kunta_call_result.setResult_mobile_id_number_check(m);
				}
			}
			if (mobile_id_number_name_check_json != null && !mobile_id_number_name_check_json.isEmpty()) {
				List<Mobile_id_number_name_check> mobile_id_number_name_checks = JSON
						.parseArray(mobile_id_number_name_check_json, Mobile_id_number_name_check.class);
				for (Mobile_id_number_name_check m : mobile_id_number_name_checks) {
					m.setMobile_id_number_name_check(mobile_id_number_name_check_json);
					m.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
					kunta_call_result.setResult_mobile_id_number_name_check(m);
				}
			}
			if (degree_query_json != null && !degree_query_json.isEmpty()) {
				List<Degree_query> degree_querys = JSON.parseArray(degree_query_json, Degree_query.class);
				for (Degree_query d : degree_querys) {
					d.setDegree_query(degree_query_json);
					d.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
					kunta_call_result.setResult_degree_query(d);
				}
			}
		}
		
		
		if (riskpreloanResult.getRiskItems() != null && !riskpreloanResult.getRiskItems().isEmpty()) {
			String risk_items_json = riskpreloanResult.getRiskItems();
			List<Risk_item> risk_items = JSON.parseArray(risk_items_json, Risk_item.class);
			riskpreloanResult.setResult_risk_items(risk_items);
			
			for (Risk_item r : risk_items) {
				r.setRisk_items(risk_items_json);
				r.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
				
				if (r.getItem_detail() != null && !r.getItem_detail().toString().isEmpty()) {
					String item_detail_json = r.getItem_detail().toString();
					Item_detail item_detail = JSON.parseObject(item_detail_json, Item_detail.class);
					item_detail.setItem_detail(item_detail_json);
					item_detail.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
					
					if (item_detail.getOverdue_details() != null && !item_detail.getOverdue_details().isEmpty()) {
						String overdue_details_json = item_detail.getOverdue_details();
						List<Overdue_detail> overdue_details = JSON.parseArray(overdue_details_json,
								Overdue_detail.class);
						for (Overdue_detail o : overdue_details) {
							o.setOverdue_detail(overdue_details_json);
							o.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
						}
					}
					if (item_detail.getPlatform_detail_dimension() != null
							&& !item_detail.getPlatform_detail_dimension().isEmpty()) {
						String platform_detail_dimension_json = item_detail.getPlatform_detail_dimension();
						List<Platform_detail_dimension> platform_detail_dimensions = JSON
								.parseArray(platform_detail_dimension_json, Platform_detail_dimension.class);
						for (Platform_detail_dimension p : platform_detail_dimensions) {
							p.setPlatform_detail_dimension(platform_detail_dimension_json);
							p.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
						}
					}
					if (item_detail.getCourt_details() != null && !item_detail.getCourt_details().isEmpty()) {
						String court_details_json = item_detail.getCourt_details();
						List<Court_detail> court_details = JSON.parseArray(court_details_json, Court_detail.class);
						for (Court_detail c : court_details) {
							c.setCourt_details(court_details_json);
							c.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
						}
					}
					if (item_detail.getFrequency_detail_list() != null
							&& !item_detail.getFrequency_detail_list().isEmpty()) {
						String frequency_detail_list_json = item_detail.getFrequency_detail_list();
						List<Frequency_detail_list> frequency_detail_lists = JSON.parseArray(frequency_detail_list_json,
								Frequency_detail_list.class);
						for (Frequency_detail_list f : frequency_detail_lists) {
							f.setFrequency_detail_list(frequency_detail_list_json);
							f.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
						}
					}
					if (item_detail.getNamelist_hit_details() != null
							&& !item_detail.getNamelist_hit_details().isEmpty()) {
						String namelist_hit_details_json = item_detail.getNamelist_hit_details();
						List<Namelist_hit_detail> namelist_hit_details = JSON.parseArray(namelist_hit_details_json,
								Namelist_hit_detail.class);
						for (Namelist_hit_detail n : namelist_hit_details) {
							n.setNamelist_hit_details(namelist_hit_details_json);
							n.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
							
							if (n.getCourt_details() != null && !n.getCourt_details().isEmpty()) {
								String court_details_json = n.getCourt_details();
								List<Court_detail> court_details = JSON.parseArray(court_details_json,
										Court_detail.class);
								for (Court_detail c : court_details) {
									c.setCourt_details(court_details_json);
									c.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
								}
							}
						}
					}
				}
			}
		}
		
		if (riskpreloanResult.getAddressDetect() != null
				&& !riskpreloanResult.getAddressDetect().toString().isEmpty()) {
			String address_detect_json = riskpreloanResult.getAddressDetect();
			Address_detect address_detect = JSON.parseObject(address_detect_json, Address_detect.class);
			address_detect.setAddress_detect(address_detect_json);
			address_detect.setUserInfoId(riskpreloanResult.getUserInfoId().intValue());
			
			riskpreloanResult.setResult_address_detect(address_detect);
		}

		
		return riskpreloanResult;
	}
}
