package com.xiangzi.sapanywhere.bean;

/**
 * 支付状态
 */
public enum PaymentStatus {
	
	NOT_PAID("NOT_PAID", "未付款"), 
	PARTIALLY_PAID("PARTIALLY_PAID", "部分付款"), 
	PRE_PAID("PRE_PAID", "已预付款"),
	PAID("PAID", "已付款"), 
	FULLY_PAID("FULLY_PAID", "已全额收款");
	
	private String code;
	private String desc;

	private PaymentStatus(String code, String desc) {
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
