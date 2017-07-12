package com.repos.model.commons;

public interface StateCode {
	
	/**
	 * 系统内部业务处理码
	 */
	public static enum SysCodeEnum {
		SYS_INIT("0100", "系统初始化"),
		SUCCESS("0200", "数据处理成功"),
		ERROR("0500", "系统内部异常");
		
		private String code;
		private String desc;
		private SysCodeEnum(String code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		public String getCode() {
			return code;
		}
		public String getDesc() {
			return desc;
		}
	}
	
	
	/**
	 * 数据状态码
	 */
	public static enum DataCodeEnum {
		DATA_IS_NOMAL("1200", "数据正常"),
		DATA_IS_INVALID("1100", "数据无效"),
		DATA_IS_NULL("1000", "数据为空");
		
		private String code;
		private String desc;
		private DataCodeEnum(String code, String desc) {
			this.code = code;
			this.desc = desc;
		}
		public String getCode() {
			return code;
		}
		public String getDesc() {
			return desc;
		}
	}
}
