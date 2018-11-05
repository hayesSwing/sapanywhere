package com.xiangzi.sapanywhere.bean;

/**
 * 许可邮件状态<br/>
 * 许可邮件状态反映了你的联系人对许可式邮件所做出的反馈。其中“邮件发送失败”意味着发给该联系人邮箱的邮件已被多次退回，因此该联系人也被从订阅名单中移除。
 */
public enum MarketingStatus {

	SUBSCRIBED("SUBSCRIBED", "已订阅"), 
	UNSUBSCRIBED("UNSUBSCRIBED", "不订阅"), 
	CLEANED("CLEANED", "邮件发送失败"), 
	UNKNOWN("UNKNOWN", "未知");
	
	private String code;
	private String desc;

	private MarketingStatus(String code, String desc) {
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
