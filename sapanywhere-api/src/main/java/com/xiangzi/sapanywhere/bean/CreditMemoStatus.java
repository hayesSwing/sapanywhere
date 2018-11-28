package com.xiangzi.sapanywhere.bean;

/**
 * Credit memo status.
 */
public enum CreditMemoStatus {

	OPEN("OPEN", "未清"), 
	CLOSED("CLOSED", "已清"), 
	CANCELLED("CANCELLED", "已取消");

	private String code;
	private String desc;

	private CreditMemoStatus(String code, String desc) {
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