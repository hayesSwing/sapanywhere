package com.xiangzi.sapanywhere.bean;

/**
 * The status of a payment method.
 */
public enum PaymentMethodStatus {

	ACTIVE("ACTIVE", "可用"), 
	INACTIVE("INACTIVE", "不可用");

	private String code;
	private String desc;
	
	private PaymentMethodStatus(String code, String desc) {
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
