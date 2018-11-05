package com.xiangzi.sapanywhere.bean;

/**
 * The quotation status.
 */
public enum QuotationStatus {

	OPEN("OPEN", "未清"), 
	CLOSED("CLOSED", "已关闭"), 
	CANCELLED("CANCELLED", "已取消");
	
	private String code;
	private String desc;

	private QuotationStatus(String code, String desc) {
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
