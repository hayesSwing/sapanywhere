package com.xiangzi.sapanywhere.bean;

/**
 * 会员事件 - 奖励类型<br/>
 */
public enum MembershipEventAwardType {

	POINT_GAIN_PER_UNIT("POINT_GAIN_PER_UNIT", "POINT_GAIN_PER_UNIT"), 
	CREATE_ACCOUNT("CREATE_ACCOUNT", "CREATE_ACCOUNT");
	
	private String code;
	private String desc;

	private MembershipEventAwardType(String code, String desc) {
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
