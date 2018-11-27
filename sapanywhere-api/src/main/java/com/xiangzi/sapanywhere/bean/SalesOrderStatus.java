package com.xiangzi.sapanywhere.bean;

/**
 * 销售订单总状态
 */
public enum SalesOrderStatus {

	CANCEL("CANCEL", "取消"), 
	OPEN("OPEN", "未清"), 
	CLOSED("CLOSED", "关闭"), 
	DRAFT("DRAFT", "DRAFT"), 
	WAITING_APPROVAL("WAITING_APPROVAL", "WAITING_APPROVAL"), 
	APPROVED("APPROVED", "APPROVED");
	
	private String code;
	private String desc;

	private SalesOrderStatus(String code, String desc) {
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
