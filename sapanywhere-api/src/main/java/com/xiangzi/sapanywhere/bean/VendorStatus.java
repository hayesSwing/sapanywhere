package com.xiangzi.sapanywhere.bean;

/**
 * Status of the vendor.
 */
public enum VendorStatus {

	ACTIVE("ACTIVE", "可用"), 
	INACTIVE("INACTIVE", "不可用");

	private String code;
	private String desc;

	private VendorStatus(String code, String desc) {
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
