package com.xiangzi.sapanywhere.bean;

/**
 * 会员事件 - 相关事件/事件类型<br/>
 */
public enum MembershipEventType {

	MANUAL_ADJUSTMENT("MANUAL_ADJUSTMENT", "手动调整"), //增加积分，扣减积分
	DOCUMENT("DOCUMENT", "文件"), 
	EXPIRED_POINTS("EXPIRED_POINTS", "已过期"), 
	AUTO("AUTO", "自动");
	
	private String code;
	private String desc;

	private MembershipEventType(String code, String desc) {
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
