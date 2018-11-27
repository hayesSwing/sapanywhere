package com.xiangzi.sapanywhere.bean;

/**
 * 指示如何计算销售订单。
 */
public enum SalesOrderProductLineCalculationBase {

	BY_DEFAULT("BY_DEFAULT", "BY_DEFAULT"), 
	BY_TOTAL("BY_TOTAL", "BY_TOTAL"), 
	BY_PRICEANDTOTAL("BY_PRICEANDTOTAL", "BY_PRICEANDTOTAL"), 
	BY_UNITPRICE("BY_UNITPRICE", "BY_UNITPRICE");
	
	private String code;
	private String desc;

	private SalesOrderProductLineCalculationBase(String code, String desc) {
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
