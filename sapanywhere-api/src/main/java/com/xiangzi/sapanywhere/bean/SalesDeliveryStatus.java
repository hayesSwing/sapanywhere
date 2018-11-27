package com.xiangzi.sapanywhere.bean;

/**
 * Delivery status.
 */
public enum SalesDeliveryStatus {

	OPEN("OPEN", "未清"), 
	CLOSED("CLOSED", "已关闭"), 
	PICK("PICK", "拣货"), 
	PACK("PACK", "打包"), 
	SHIPPING("SHIPPING", "发货"), 
	PENDING("PENDING", "转为待定"), 
	CANCELLED("CANCELLED", "取消");

	private String code;
	private String desc;

	private SalesDeliveryStatus(String code, String desc) {
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
