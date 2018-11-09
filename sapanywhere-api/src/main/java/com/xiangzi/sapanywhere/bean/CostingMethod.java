package com.xiangzi.sapanywhere.bean;

/**
 * 成本计算方法
 */
public enum CostingMethod {

	NO_COST("NO_COST", "无成本"), 
	EST_COST("EST_COST", "估算成本"), 
	EST_COST_DELIVERY("EST_COST_DELIVERY", "发货估算成本"), 
	PURCHASE_PRICE("PURCHASE_PRICE", "采购价格"), 
	EST_COST_RETURN("EST_COST_RETURN", "退货估算成本");
	
	private String code;
	private String desc;

	private CostingMethod(String code, String desc) {
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
