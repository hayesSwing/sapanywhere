package com.xiangzi.sapanywhere.bean;

/**
 * SKU status
 */
public enum SKUStatus {

	Active("Active", "可用"), 
	Inactive("Inactive", "不可用");

	private String code;
	private String desc;

	private SKUStatus(String code, String desc) {
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
