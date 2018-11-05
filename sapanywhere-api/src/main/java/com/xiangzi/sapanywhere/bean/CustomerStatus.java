package com.xiangzi.sapanywhere.bean;

/**
 * 客户状态
 */
public enum CustomerStatus {

	ACTIVE("ACTIVE", "可用"), 
	INACTIVE("INACTIVE", "不可用"),
	DUPLICATED("DUPLICATED", "重复");
	
	private String code;
	private String desc;

	private CustomerStatus(String code, String desc) {
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
