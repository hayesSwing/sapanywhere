package com.xiangzi.sapanywhere.bean;

/**
 * 计税规则-类别
 */
public enum TaxDocumentType {

	SALES("SALES", "销售"), 
	PURCHASE("PURCHASE", "采购"), 
	SALES_PURCHASE("SALES_PURCHASE", "销售/采购");

	private String code;
	private String desc;

	private TaxDocumentType(String code, String desc) {
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
