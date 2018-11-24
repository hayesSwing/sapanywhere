package com.xiangzi.sapanywhere.bean;

/**
 * Opportunity status.
 */
public enum OpportunityStatus {

	OPEN("OPEN", "未清"), 
	MISSED("MISSED", "丢单"), 
	SOLD("SOLD", "赢单");

	private String code;
	private String desc;

	private OpportunityStatus(String code, String desc) {
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
