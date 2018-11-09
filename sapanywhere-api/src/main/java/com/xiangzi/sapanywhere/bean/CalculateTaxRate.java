package com.xiangzi.sapanywhere.bean;

/**
 * 计算税额根据 <br/>
 * 设置-初始设置-税与货币-税-计税设置
 */
public enum CalculateTaxRate {

	ShippingAddress("ShippingAddress", "收货地址（客户与供应商）"), 
	BillingAddress("BillingAddress", "发票地址（客户与供应商）"), 
	BaseLocation("BaseLocation", "公司地址");
	
	private String code;
	private String desc;

	private CalculateTaxRate(String code, String desc) {
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
