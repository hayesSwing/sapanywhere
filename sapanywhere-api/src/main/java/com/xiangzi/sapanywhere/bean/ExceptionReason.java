package com.xiangzi.sapanywhere.bean;

public class ExceptionReason extends BaseBean {

	private String id;// readonly,integer (int64),Unique identifier
	// Description of exception reason.
	private String description;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
