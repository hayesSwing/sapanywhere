package com.xiangzi.sapanywhere.bean;

/**
 * Sales channel type.
 */
public enum SalesChannelType {

	GENERAL("GENERAL", "通用"), // 通用渠道
	ESHOP("ESHOP", "网店"), // 网店(目标客户：个人客户-B2C网店，公司客户-B2B网店，)
	AMAZON("AMAZON", "亚马逊"), 
	POS("POS", "门店"), 
	MARKETPLACE("MARKETPLACE", "其他电商");
	
	private String code;
	private String desc;

	private SalesChannelType(String code, String desc) {
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
