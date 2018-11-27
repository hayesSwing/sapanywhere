package com.xiangzi.sapanywhere.bean;

/**
 * 发票状态
 */
public enum SalesOrderProductInvoiceStatus {

	NOT_INVOICED("NOT_INVOICED", "未开票"),
	// PartiallyInvoiced("PartiallyInvoiced", "部分开票"),
	INVOICED("INVOICED", "已开票");

	private String code;
	private String desc;

	private SalesOrderProductInvoiceStatus(String code, String desc) {
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
