package com.xiangzi.sapanywhere.bean;

/**
 * 纳税分组
 */
public enum TaxGroup {

	LIABLE("LIABLE", "纳税"), 
	EXEMPT("EXEMPT", "免税");

	private String code;
	private String desc;

	private TaxGroup(String code, String desc) {
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
