package com.xiangzi.sapanywhere.bean;

/**
 * Language
 */
public enum Language {

	en_US("en_US", "English (US)"), 
	zh_CN("zh_CN", "中文（简体）"), 
	en_GB("en_GB", "English (UK)");

	private String code;
	private String label;

	private Language(String code, String label) {
		this.code = code;
		this.label = label;
	}

	public String getCode() {
		return code;
	}

	public String getLabel() {
		return label;
	}

}
