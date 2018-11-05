package com.xiangzi.sapanywhere.bean;

/**
 * 客户阶段
 */
public enum CustomerStage {

	SUSPECT("SUSPECT", "潜在客户"), PROSPECT("PROSPECT", "目标客户"), CUSTOMER("CUSTOMER", "现有客户");

	private String code;
	private String desc;

	private CustomerStage(String code, String desc) {
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
