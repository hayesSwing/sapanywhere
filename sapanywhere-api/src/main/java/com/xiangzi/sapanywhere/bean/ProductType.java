package com.xiangzi.sapanywhere.bean;

/**
 * 批次管理-无/批次管理
 */
public enum ProductType {
	
	None("None", "无"), 
	BatchProduct("BatchProduct", "批次管理");

	private String code;
	private String desc;

	private ProductType(String code, String desc) {
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
