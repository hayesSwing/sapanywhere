package com.xiangzi.sapanywhere.bean;

/**
 * Logistics status.
 */
public enum SalesOrderProductLogisticsStatus {
	
	ORDERED("ORDERED", "ORDERED"), 
	ALLOCATED("ALLOCATED", "ALLOCATED"),
	PURCHASED("PURCHASED", "PURCHASED"),
	TO_BE_DELIVERED("TO_BE_DELIVERED", "TO_BE_DELIVERED"),
	DELIVERED("DELIVERED", "DELIVERED"),
	RETURNED("RETURNED", "RETURNED"),
	RETURN_REQUESTED("RETURN_REQUESTED", "RETURN_REQUESTED"),
	DROPSHIP("DROPSHIP", "DROPSHIP"),
	CANCELLED("CANCELLED", "CANCELLED"),
	NA("NA", "NA");
	
	private String code;
	private String desc;

	private SalesOrderProductLogisticsStatus(String code, String desc) {
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
