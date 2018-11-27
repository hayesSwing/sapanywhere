package com.xiangzi.sapanywhere.bean;

/**
 * 指示如何计算销售订单。
 */
public enum SalesOrderHeaderCalculationBase {

	BY_DEFAULT("BY_DEFAULT", "BY_DEFAULT"), 
	BY_TOTAL("BY_TOTAL", "BY_TOTAL"), 
	BY_DISCOUNT_SUM("BY_DISCOUNT_SUM", "BY_DISCOUNT_SUM");

	private String code;
	private String desc;

	private SalesOrderHeaderCalculationBase(String code, String desc) {
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
