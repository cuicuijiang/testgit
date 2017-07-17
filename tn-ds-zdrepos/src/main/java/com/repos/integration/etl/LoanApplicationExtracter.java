package com.repos.integration.etl;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.alibaba.fastjson.JSON;
import com.repos.model.creditvetting.AntifraudInquiry;
import com.repos.model.creditvetting.BlackandwhiteList;
import com.repos.model.creditvetting.CreditInquiry;
import com.repos.model.creditvetting.Customer;
import com.repos.model.creditvetting.CustomerFaceVerify;
import com.repos.model.creditvetting.CustomerHistory;
import com.repos.model.creditvetting.CustomerIdnoAuth;
import com.repos.model.creditvetting.DxCreditInfo;
import com.repos.model.creditvetting.DxFamiliarityInfo;
import com.repos.model.creditvetting.DxFlowInfoList;
import com.repos.model.creditvetting.DxPackageInfo;
import com.repos.model.creditvetting.DxPointInfo;
import com.repos.model.creditvetting.EncryptKey;
import com.repos.model.creditvetting.LoanApplication;
import com.repos.model.creditvetting.LoanCheck;
import com.repos.model.creditvetting.LtAccountBalance;
import com.repos.model.creditvetting.LtBillHistory;
import com.repos.model.creditvetting.LtPaymentRecord;
import com.repos.model.creditvetting.RiskpreloanResult;
import com.repos.model.creditvetting.RiskpreloanRiskuserinfo;
import com.repos.model.creditvetting.Scene;
import com.repos.model.creditvetting.SmsAndContacts;
import com.repos.model.creditvetting.TelBasicInfo;
import com.repos.model.creditvetting.TelBillHistory;
import com.repos.model.creditvetting.TelCall;
import com.repos.model.creditvetting.TelDx;
import com.repos.model.creditvetting.TelLogin;
import com.repos.model.creditvetting.TelLt;
import com.repos.model.creditvetting.TelMsg;
import com.repos.model.creditvetting.TelPackageInfo;
import com.repos.model.creditvetting.TelPointInfo;
import com.repos.model.creditvetting.TelYd;
import com.repos.model.creditvetting.TelephoneAudit;
import com.repos.model.creditvetting.TnapiRiskReport;
import com.repos.model.creditvetting.TnapiRiskresult;
import com.repos.model.creditvetting.YdBizBusiness;
import com.repos.model.creditvetting.YdDetailInfo;
import com.repos.model.creditvetting.YdPayInfo;
import com.repos.model.creditvetting.YdPointInfo;
import com.repos.model.creditvetting.YqbFengkong;
import com.repos.mongo.vetting.TelCallMongoDao;
import com.repos.mysql.jdbc.vetting.AntifraudInquiryMysqlDao;
import com.repos.mysql.jdbc.vetting.BlackandwhiteListMysqlDao;
import com.repos.mysql.jdbc.vetting.CreditInquiryMysqlDao;
import com.repos.mysql.jdbc.vetting.CustomerFaceVerifyMysqlDao;
import com.repos.mysql.jdbc.vetting.CustomerHistoryMysqlDao;
import com.repos.mysql.jdbc.vetting.CustomerIdnoAuthMysqlDao;
import com.repos.mysql.jdbc.vetting.CustomerMysqlDao;
import com.repos.mysql.jdbc.vetting.DxCreditInfoMysqlDao;
import com.repos.mysql.jdbc.vetting.DxFamiliarityInfoMysqlDao;
import com.repos.mysql.jdbc.vetting.DxFlowInfoListMysqlDao;
import com.repos.mysql.jdbc.vetting.DxPackageInfoMysqlDao;
import com.repos.mysql.jdbc.vetting.DxPointInfoMysqlDao;
import com.repos.mysql.jdbc.vetting.EncryptKeyMysqlDao;
import com.repos.mysql.jdbc.vetting.LoanApplicationMysqlDao;
import com.repos.mysql.jdbc.vetting.LoanCheckMysqlDao;
import com.repos.mysql.jdbc.vetting.LtAccountBalanceMysqlDao;
import com.repos.mysql.jdbc.vetting.LtBillHistoryMysqlDao;
import com.repos.mysql.jdbc.vetting.LtPaymentRecordMysqlDao;
import com.repos.mysql.jdbc.vetting.RiskpreloanResultMysqlDao;
import com.repos.mysql.jdbc.vetting.RiskpreloanRiskuserinfoMysqlDao;
import com.repos.mysql.jdbc.vetting.SceneMysqlDao;
import com.repos.mysql.jdbc.vetting.SmsAndContactsMysqlDao;
import com.repos.mysql.jdbc.vetting.TelBasicInfoMysqlDao;
import com.repos.mysql.jdbc.vetting.TelBillHistoryMysqlDao;
import com.repos.mysql.jdbc.vetting.TelLoginMysqlDao;
import com.repos.mysql.jdbc.vetting.TelMsgMysqlDao;
import com.repos.mysql.jdbc.vetting.TelPackageInfoMysqlDao;
import com.repos.mysql.jdbc.vetting.TelPointInfoMysqlDao;
import com.repos.mysql.jdbc.vetting.TelephoneAuditMysqlDao;
import com.repos.mysql.jdbc.vetting.TnapiRiskresultMysqlDao;
import com.repos.mysql.jdbc.vetting.YdBizBusinessMysqlDao;
import com.repos.mysql.jdbc.vetting.YdDetailInfoMysqlDao;
import com.repos.mysql.jdbc.vetting.YdPayInfoMysqlDao;
import com.repos.mysql.jdbc.vetting.YdPointInfoMysqlDao;
import com.repos.mysql.jdbc.vetting.YqbFengkongMysqlDao;
import com.repos.trans.creditvetting.RiskpreloanResultTrans;

/**
 * LoanApplication 抽提器
 * @author zhangqingli
 *
 */
@Component
public class LoanApplicationExtracter implements Extracter<LoanApplication, Long> {
	private static final Logger LOGGER = LoggerFactory.getLogger(LoanApplicationExtracter.class);
	
	@Autowired
	private LoanApplicationMysqlDao loanApplicationMysqlDao;
	
	/**
	 * 用户相关
	 */
	@Autowired
	private CustomerMysqlDao customerMysqlDao;
	
	@Autowired
	private CustomerFaceVerifyMysqlDao customerFaceVerifyMysqlDao;
	
	@Autowired
	private CustomerHistoryMysqlDao customerHistoryMysqlDao;
	
	@Autowired
	private CustomerIdnoAuthMysqlDao customerIdnoAuthMysqlDao;
	
	@Autowired
	private TelephoneAuditMysqlDao telephoneAuditMysqlDao;
	
	@Autowired
	private BlackandwhiteListMysqlDao blackandwhiteListMysqlDao;
	
	@Autowired
	private AntifraudInquiryMysqlDao antifraudInquiryMysqlDao;
	
	@Autowired
	private CreditInquiryMysqlDao creditInquiryMysqlDao;
	
	@Autowired
	private SmsAndContactsMysqlDao smsAndContactsMysqlDao;
	
	/**
	 * 运营商相关
	 */
	@Autowired
	private TelLoginMysqlDao telLoginMysqlDao;
	
	@Autowired
	private TelBasicInfoMysqlDao telBasicInfoMysqlDao;
	
	@Autowired
	private TelCallMongoDao telCallMongoDao;
	
	@Autowired
	private TelMsgMysqlDao telMsgMysqlDao;
	
	@Autowired
	private TelPackageInfoMysqlDao telPackageInfoMysqlDao;
	
	@Autowired
	private TelPointInfoMysqlDao telPointInfoMysqlDao;

	@Autowired
	private TelBillHistoryMysqlDao telBillHistoryMysqlDao;
	
	//运营商-移动相关
	@Autowired
	private YdBizBusinessMysqlDao ydBizBusinessMysqlDao;
	@Autowired
	private YdDetailInfoMysqlDao ydDetailInfoMysqlDao;
	@Autowired
	private YdPayInfoMysqlDao ydPayInfoMysqlDao;
	@Autowired
	private YdPointInfoMysqlDao ydPointInfoMysqlDao;
	
	//运营商-联通相关
	@Autowired
	private LtAccountBalanceMysqlDao ltAccountBalanceMysqlDao;
	@Autowired
	private LtBillHistoryMysqlDao ltBillHistoryMysqlDao;
	@Autowired
	private LtPaymentRecordMysqlDao ltPaymentRecordMysqlDao;
	
	//运营商-电信相关
	@Autowired
	private DxFlowInfoListMysqlDao dxFlowInfoListMysqlDao;
	@Autowired
	private DxPackageInfoMysqlDao dxPackageInfoMysqlDao;
	@Autowired
	private DxFamiliarityInfoMysqlDao dxFamiliarityInfoMysqlDao;
	@Autowired
	private DxPointInfoMysqlDao dxPointInfoMysqlDao;
	@Autowired
	private DxCreditInfoMysqlDao dxCreditInfoMysqlDao;
	
	/**
	 * 场景相关
	 */
	@Autowired
	private SceneMysqlDao sceneMysqlDao;
	
	@Autowired
	private EncryptKeyMysqlDao encryptKeyMysqlDao;
	
	/**
	 * 同盾贷前审核相关
	 */
	@Autowired
	private RiskpreloanRiskuserinfoMysqlDao riskpreloanRiskuserinfoMysqlDao;
	
	@Autowired
	private RiskpreloanResultMysqlDao riskpreloanResultMysqlDao;
	
	@Autowired
	private RiskpreloanResultTrans riskpreloanResultTrans;
	
	/**
	 * 借款审核相关
	 */
	@Autowired
	private LoanCheckMysqlDao loanCheckMysqlDao;
	
	/**
	 * 用钱宝风控相关
	 */
	@Autowired
	private YqbFengkongMysqlDao yqbFengkongMysqlDao;
	
	/**
	 * 反欺诈结果相关
	 */
	@Autowired
	private TnapiRiskresultMysqlDao tnapiRiskresultMysqlDao;
	
	
	
	/**
	 * 提取LoanApplication相关数据
	 */
	@Override
	public LoanApplication extract(Long applicationId) {
		LoanApplication loanApplication = null;
		long start = System.currentTimeMillis();
		LOGGER.info("> 开始提取数据");
		
		
		// LoanApplication
		loanApplication = loanApplicationMysqlDao.findForObjectById(LoanApplication.class, applicationId);
		if (loanApplication==null) {
			return null;
		}
		
		// LoanApplication-CustomerHistory
		CustomerHistory customerHistory = customerHistoryMysqlDao.findForObjectByColumn(CustomerHistory.class, "application_id", loanApplication.getApplicationId());
		loanApplication.setCustomerHistory(customerHistory);
		
		/*
		 * 用户相关数据
		 */
		// LoanApplication-Customer
		Long customerId = loanApplication.getCustomerId();
		Customer customer = customerMysqlDao.findForObjectById(Customer.class, customerId);
		loanApplication.setCustomer(customer);
		
		if (customer != null) {
			// LoanApplication-Customer-CustomerFaceVerify
			List<CustomerFaceVerify> customerFaceVerifies = customerFaceVerifyMysqlDao.findByColumn(CustomerFaceVerify.class, "customer_id", customer.getCustomerId());
			customer.setCustomerFaceVerifies(customerFaceVerifies);
			
			// LoanApplication-Customer-CustomerIdnoAuth
			List<CustomerIdnoAuth> customerIdnoAuths = customerIdnoAuthMysqlDao.findByColumn(CustomerIdnoAuth.class, "customer_id", customer.getCustomerId());
			customer.setCustomerIdnoAuths(customerIdnoAuths);
			
			// LoanApplication-Customer-TelephoneAudit
			List<TelephoneAudit> telephoneAudits = telephoneAuditMysqlDao.findByColumn(TelephoneAudit.class, "customer_id", customer.getCustomerId());
			customer.setTelephoneAudits(telephoneAudits);
			
			// LoanApplication-Customer-BlackandwhiteList
			String mobile = customer.getMobile();
			String idCard = customer.getIdcard();
			Long sceneId = customer.getSceneId();
			List<BlackandwhiteList> blackandwhiteLists = blackandwhiteListMysqlDao.findByMobileOrIdCardAndSceneId(mobile, idCard, sceneId);
			customer.setBlackandwhiteLists(blackandwhiteLists);
			
			// LoanApplication-Customer-AntifraudInquiry
			List<AntifraudInquiry> antifraudInquiries = antifraudInquiryMysqlDao.findByColumn(AntifraudInquiry.class, "apply_no", loanApplication.getApplicationUuid());
			customer.setAntifraudInquiries(antifraudInquiries);
			
			// LoanApplication-Customer-CreditInquiry
			List<CreditInquiry> creditInquiries = creditInquiryMysqlDao.findByIdCardAndMobileAndBankcardAndSceneId(customer.getIdcard(), customer.getMobile(), customer.getBankCard(), customer.getSceneId());
			customer.setCreditInquiries(creditInquiries);
			
			// LoanApplication-Customer-SmsAndContacts
			List<SmsAndContacts> smsAndContactses = smsAndContactsMysqlDao.findByUsernumberAndSceneId(customer.getMobileRegister(), customer.getSceneId());
			customer.setSmsAndContactses(smsAndContactses);
		}
		
		
		/*
		 * 运行商相关数据
		 */
		// LoanApplication-TelLogin
		TelLogin telLogin = telLoginMysqlDao.findForObjectByColumn(TelLogin.class, "application_id", loanApplication.getApplicationUuid());
		if (telLogin==null) {
			telLogin = telLoginMysqlDao.findByIdcardOrUsernumberAndCreateTimeToday(customer.getIdcard(), customer.getMobile(), loanApplication.getApplyDate());
		}
		loanApplication.setTelLogin(telLogin);
		
		if (telLogin != null) {
			// LoanApplication-TelLogin-TelBasicInfo
			TelBasicInfo telBasicInfo = telBasicInfoMysqlDao.findForObjectByColumn(TelBasicInfo.class, "task_id", telLogin.getTaskId());
			if (telBasicInfo == null) {
				telBasicInfo = telBasicInfoMysqlDao.findByIdcardOrUsernumberAndInquiryTimeToday(customer.getIdcard(), customer.getMobile(), loanApplication.getApplyDate());
			}
			telLogin.setTelBasicInfo(telBasicInfo);
			
			if (telBasicInfo != null) {
				// LoanApplication-TelLogin-TelBasicInfo-TelCall    //data from mongodb
				List<TelCall> telCalls = telCallMongoDao.findByBasicInfoId(telBasicInfo.getId());
				telBasicInfo.setTelCalls(telCalls);
				
				// LoanApplication-TelLogin-TelBasicInfo-TelMsg
				List<TelMsg> telMsgs = telMsgMysqlDao.findByColumn(TelMsg.class, "basic_info_id", telBasicInfo.getId());
				telBasicInfo.setTelMsgs(telMsgs);
				
				// LoanApplication-TelLogin-TelBasicInfo-TelPackageInfo
				List<TelPackageInfo> telPackageInfos = telPackageInfoMysqlDao.findByColumn(TelPackageInfo.class, "basic_info_id", telBasicInfo.getId());
				telBasicInfo.setTelPackageInfos(telPackageInfos);
				
				// LoanApplication-TelLogin-TelBasicInfo-TelPointInfo
				List<TelPointInfo> telPointInfos = telPointInfoMysqlDao.findByColumn(TelPointInfo.class, "basic_info_id", telBasicInfo.getId());
				telBasicInfo.setTelPointInfos(telPointInfos);
				
				// LoanApplication-TelLogin-TelBasicInfo-TelBillHistory
				List<TelBillHistory> telBillHistorys = telBillHistoryMysqlDao.findByColumn(TelBillHistory.class, "basic_info_id", telBasicInfo.getId());
				telBasicInfo.setTelBillHistories(telBillHistorys);
				
				
				/*
				 * 运营商-移动相关
				 */
				// LoanApplication-TelLogin-TelBasicInfo-TelYd
				// LoanApplication-TelLogin-TelBasicInfo-TelYd-YdBizBusiness
				// LoanApplication-TelLogin-TelBasicInfo-TelYd-YdDetailInfo
				// LoanApplication-TelLogin-TelBasicInfo-TelYd-YdPayInfo
				// LoanApplication-TelLogin-TelBasicInfo-TelYd-YdPointInfo
				TelYd telYd = new TelYd();
				telBasicInfo.setTelYd(telYd);
				
				List<YdBizBusiness> ydBizBusinesses = ydBizBusinessMysqlDao.findByColumn(YdBizBusiness.class, "basic_info_id", telBasicInfo.getId());
				telYd.setYdBizBusinesses(ydBizBusinesses);
				
				List<YdDetailInfo> ydDetailInfos = ydDetailInfoMysqlDao.findByColumn(YdDetailInfo.class, "basic_info_id", telBasicInfo.getId());
				telYd.setYdDetailInfos(ydDetailInfos);
				
				List<YdPayInfo> ydPayInfos = ydPayInfoMysqlDao.findByColumn(YdPayInfo.class, "basic_info_id", telBasicInfo.getId());
				telYd.setYdPayInfos(ydPayInfos);
				
				List<YdPointInfo> ydPointInfos = ydPointInfoMysqlDao.findByColumn(YdPointInfo.class, "basic_info_id", telBasicInfo.getId());
				telYd.setYdPointInfos(ydPointInfos);
				
				
				/*
				 * 运营商-联通相关
				 */
				// LoanApplication-TelLogin-TelBasicInfo-TelLt
				// LoanApplication-TelLogin-TelBasicInfo-TelLt-LtAccountBalance
				// LoanApplication-TelLogin-TelBasicInfo-TelLt-LtBillHistory
				// LoanApplication-TelLogin-TelBasicInfo-TelLt-LtPaymentRecord
				TelLt telLt = new TelLt();
				telBasicInfo.setTelLt(telLt);
				
				List<LtAccountBalance> ltAccountBalances = ltAccountBalanceMysqlDao.findByColumn(LtAccountBalance.class, "basic_info_id", telBasicInfo.getId());
				telLt.setLtAccountBalances(ltAccountBalances);
				
				List<LtBillHistory> ltBillHistories = ltBillHistoryMysqlDao.findByColumn(LtBillHistory.class, "basic_info_id", telBasicInfo.getId());
				telLt.setLtBillHistories(ltBillHistories);
				
				List<LtPaymentRecord> ltPaymentRecords = ltPaymentRecordMysqlDao.findByColumn(LtPaymentRecord.class, "basic_info_id", telBasicInfo.getId());
				telLt.setLtPaymentRecords(ltPaymentRecords);
				
				/*
				 * 运营商-电信相关
				 */
				// LoanApplication-TelLogin-TelBasicInfo-TelDx
				// LoanApplication-TelLogin-TelBasicInfo-TelDx-DxFlowInfoList
				// LoanApplication-TelLogin-TelBasicInfo-TelDx-DxPackageInfo
				// LoanApplication-TelLogin-TelBasicInfo-TelDx-DxFamiliarityInfo
				// LoanApplication-TelLogin-TelBasicInfo-TelDx-DxPointInfo
				// LoanApplication-TelLogin-TelBasicInfo-TelDx-DxCreditInfo
				TelDx telDx = new TelDx();
				telBasicInfo.setTelDx(telDx);
				
				List<DxFlowInfoList> dxFlowInfoLists = dxFlowInfoListMysqlDao.findByColumn(DxFlowInfoList.class, "basic_info_id", telBasicInfo.getId());
				telDx.setDxFlowInfoLists(dxFlowInfoLists);
				
				List<DxPackageInfo> dxPackageInfos = dxPackageInfoMysqlDao.findByColumn(DxPackageInfo.class, "basic_info_id", telBasicInfo.getId());
				telDx.setDxPackageInfos(dxPackageInfos);
				
				List<DxFamiliarityInfo> dxFamiliarityInfos = dxFamiliarityInfoMysqlDao.findByColumn(DxFamiliarityInfo.class, "basic_info_id", telBasicInfo.getId());
				telDx.setDxFamiliarityInfos(dxFamiliarityInfos);
				
				List<DxPointInfo> dxPointInfos = dxPointInfoMysqlDao.findByColumn(DxPointInfo.class, "basic_info_id", telBasicInfo.getId());
				telDx.setDxPointInfos(dxPointInfos);
				
				List<DxCreditInfo> dxCreditInfos = dxCreditInfoMysqlDao.findByColumn(DxCreditInfo.class, "basic_info_id", telBasicInfo.getId());
				telDx.setDxCreditInfos(dxCreditInfos);
			}
		}
		
		
		/*
		 * 场景相关数据
		 */
		Scene scene = sceneMysqlDao.findForObjectById(Scene.class, loanApplication.getSceneId());
		loanApplication.setScene(scene);
		if (scene!=null) {
			EncryptKey encryptKey = encryptKeyMysqlDao.findForObjectByColumn(EncryptKey.class, "scene_id", scene.getSceneId());
			scene.setEncryptKey(encryptKey);
		}
		
		
		/*
		 * 同盾贷前审核报告相关
		 */
		RiskpreloanRiskuserinfo riskpreloanRiskuserinfo = riskpreloanRiskuserinfoMysqlDao.findForObjectByColumn(RiskpreloanRiskuserinfo.class, "userInfoId", loanApplication.getApplicationId());
		loanApplication.setRiskpreloanRiskuserinfo(riskpreloanRiskuserinfo);
		if (riskpreloanRiskuserinfo != null) {
			RiskpreloanResult riskpreloanResult = riskpreloanResultMysqlDao.findForObjectByColumn(RiskpreloanResult.class, "userInfoId", riskpreloanRiskuserinfo.getUserInfoId());
			riskpreloanRiskuserinfo.setRiskpreloanResult(riskpreloanResult);
			
			//解析riskpreloanResult
			riskpreloanResultTrans.trans(riskpreloanResult);
		}
		
		
		/*
		 * 借款审核相关
		 */
		LoanCheck loanCheck = loanCheckMysqlDao.findForObjectByColumn(LoanCheck.class, "application_id", loanApplication.getApplicationId());
		loanApplication.setLoanCheck(loanCheck);
		
		
		/*
		 * 用钱宝风控相关
		 */
		YqbFengkong yqbFengkong = yqbFengkongMysqlDao.findForObjectByColumn(YqbFengkong.class, "order_id", loanApplication.getApplicationUuid());
		loanApplication.setYqbFengkong(yqbFengkong);
		
		
		/*
		 * 反欺诈结果
		 */
		TnapiRiskresult tnapiRiskresult = tnapiRiskresultMysqlDao.findForObjectByColumn(TnapiRiskresult.class, "apply_no", loanApplication.getApplicationUuid());
		loanApplication.setTnapiRiskresult(tnapiRiskresult);
		
		if (tnapiRiskresult != null) {
			String antifraudResultJson = tnapiRiskresult.getAntifraudResultJson();
			TnapiRiskReport tnapiRiskReport = JSON.parseObject(antifraudResultJson, TnapiRiskReport.class);
			tnapiRiskresult.setTnapiRiskReport(tnapiRiskReport);
		}
		
		long end = System.currentTimeMillis();
		LOGGER.info("> 数据提取总耗时：{} s", (end-start)/1000.0);
		return loanApplication;
	}
	
	
	
	@Override
	public List<LoanApplication> extract(Long start, Long end) {
		List<LoanApplication> list = new ArrayList<LoanApplication>();
		
		for (Long currentId = start; currentId <= end; currentId++) {
			LoanApplication loanApplication = extract(currentId);
			list.add(loanApplication);
		}
		return list;
	}

	@Override
	public Long getLastestId() {
		return loanApplicationMysqlDao.maxId();
	}

}
