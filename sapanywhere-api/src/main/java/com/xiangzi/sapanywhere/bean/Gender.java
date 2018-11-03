package com.xiangzi.sapanywhere.bean;

/**
 * 性别
 */
public enum Gender {

	MALE("MALE", "男"), FEMALE("FEMALE", "女");

	private String code;
	private String desc;

	private Gender(String code, String desc) {
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
