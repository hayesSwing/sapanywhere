package com.xiangzi.sapanywhere.bean;

/**
 * 销售线索状态<br/>
 */
public enum LeadStatus {

	OPEN("OPEN", "未处理"), 
	IN_PROCESS("IN_PROCESS", "处理中"), 
	COPIED("COPIED", "已生成后续单据"), 
	CLOSED("CLOSED", "已关闭");
	
	private String code;
	private String desc;

	private LeadStatus(String code, String desc) {
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
