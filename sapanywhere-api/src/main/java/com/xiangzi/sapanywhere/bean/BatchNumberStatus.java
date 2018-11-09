package com.xiangzi.sapanywhere.bean;

/**
 * Batch number status.
 */
public enum BatchNumberStatus {

	ACTIVE("ACTIVE", "可用"), INACTIVE("INACTIVE", "不可用");

	private String code;
	private String desc;

	private BatchNumberStatus(String code, String desc) {
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
