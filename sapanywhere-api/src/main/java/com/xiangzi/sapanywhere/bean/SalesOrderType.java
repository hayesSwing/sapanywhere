package com.xiangzi.sapanywhere.bean;

/**
 * 销售订单类型
 * 
 * 订单类型分三类：售货、退货和换货。默认订单类型有可能根据退货/发货产品的删除/添加而发生变化。 Possible values:
 * SELL_ORDER,RETURN_ORDER,EXCHANGE_ORDER
 */
public enum SalesOrderType {

	SELL_ORDER("SELL_ORDER", "售货"), 
	RETURN_ORDER("RETURN_ORDER", "退货"), 
	EXCHANGE_ORDER("EXCHANGE_ORDER", "换货");

	private String code;
	private String desc;

	private SalesOrderType(String code, String desc) {
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
