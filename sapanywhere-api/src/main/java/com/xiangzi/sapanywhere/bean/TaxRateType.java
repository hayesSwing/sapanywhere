package com.xiangzi.sapanywhere.bean;

/**
 * 税率类别
 */
public enum TaxRateType {

	RATIO("RATIO", "%"), 
	EXEMPT("EXEMPT", "免税");

	private String code;
	private String desc;

	private TaxRateType(String code, String desc) {
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
