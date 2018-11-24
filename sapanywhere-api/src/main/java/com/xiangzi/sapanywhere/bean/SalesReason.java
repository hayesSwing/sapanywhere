package com.xiangzi.sapanywhere.bean;

/**
 * 原因<br/>
 * 设置-客户关系管理-销售机会-原因
 */
public class SalesReason extends BaseBean {

	private String id;
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
