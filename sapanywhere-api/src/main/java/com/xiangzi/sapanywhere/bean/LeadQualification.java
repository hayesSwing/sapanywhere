package com.xiangzi.sapanywhere.bean;

/**
 * 销售线索资格<br/>
 */
public enum LeadQualification {
	
	COLD("cold", "可能性低"), 
	WARM("warm", "可能性较高"), 
	HOT("hot", "可能性高");

	private String code;
	private String desc;

	private LeadQualification(String code, String desc) {
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
