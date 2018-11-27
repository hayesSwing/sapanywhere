package com.xiangzi.sapanywhere.info;

/**
 * 促销信息
 * 
 * Promotion Rule and Description
 */
public class PromotionInfo extends BaseInfo {

	private String id;
	private String description;
	private String itemId;

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

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
}
