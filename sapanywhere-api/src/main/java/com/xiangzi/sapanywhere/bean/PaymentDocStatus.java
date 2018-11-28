package com.xiangzi.sapanywhere.bean;

/**
 * 收付款单状态
 */
public enum PaymentDocStatus {

	OPEN("OPEN", "开放"), 
	CANCEL("CANCEL", "已取消"), 
	CLOSED("CLOSED", "已关闭");
	
	private String code;
	private String desc;

	private PaymentDocStatus(String code, String desc) {
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
