package com.xiangzi.sapanywhere.info;

/**
 * VariantInfo
 */
public class VariantInfo extends BaseInfo {

	private String id;// readonly,integer (int64),Unique identifier
	private String name;// readonly,string,Variant name
	private String description;
	private Integer displayOrder;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}
	
}
