package com.xiangzi.sapanywhere.bean;

/**
 * Status of the sales channel.
 */
public enum SalesChannelStatus {

	ACTIVE("ACTIVE", "可用"), // 启用
	INACTIVE("INACTIVE", "不可用");// 未启用
	
	private String code;
	private String desc;

	private SalesChannelStatus(String code, String desc) {
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
