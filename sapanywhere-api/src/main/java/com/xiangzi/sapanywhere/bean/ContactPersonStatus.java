package com.xiangzi.sapanywhere.bean;

/**
 * Status of the contact: active, inactive.
 */
public enum ContactPersonStatus {

	ACTIVE("ACTIVE", "可用"), 
	INACTIVE("INACTIVE", "不可用");
	
	private String code;
	private String desc;

	private ContactPersonStatus(String code, String desc) {
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
