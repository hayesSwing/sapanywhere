package com.xiangzi.sapanywhere.bean;

/**
 * 计价方式/计价方法
 */
public enum PricingMethod {

	NET_PRICE("NET_PRICE", "不含税"), 
	GROSS_PRICE("GROSS_PRICE", "含税");
	
	private String code;
	private String desc;

	private PricingMethod(String code, String desc) {
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
