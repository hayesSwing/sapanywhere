package com.xiangzi.sapanywhere.bean;

/**
 * Webhook
 */
public class Webhook extends BaseBean {

	private String id;// readonly,integer (int64),Unique identifier
	private String callbackUrl;// required,string
	private String eventType;// required,string

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

}
