package com.xiangzi.sapanywhere.bean;

/**
 * 客户类型
 */
public enum CustomerType {

	CORPORATE_CUSTOMER("CORPORATE_CUSTOMER", "公司客户"), 
	INDIVIDUAL_CUSTOMER("INDIVIDUAL_CUSTOMER", "个人客户");
	
	private String code;
	private String desc;

	private CustomerType(String code, String desc) {
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
