package com.xiangzi.sapanywhere.bean;

/**
 * 计税规则-适用范围
 */
public enum TaxValidFor {

	ALL("All", "所有"), 
	PRODUCT("PRODUCT", "产品"), 
	SHIPPING("SHIPPING", "货运");

	private String code;
	private String desc;

	private TaxValidFor(String code, String desc) {
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
