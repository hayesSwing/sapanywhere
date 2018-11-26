package com.xiangzi.sapanywhere.bean;

import java.util.List;

import com.xiangzi.sapanywhere.info.VariantValueInfo;

/**
 * 产品属性/规格
 */
public class Variant extends BaseBean {

	private String id;// readonly,integer (int64),Unique identifier
	private String name;// readonly,string,Variant name
	private String description;
	private Integer displayOrder;
	private String creationTime;// readonly,string (date-time),Creation time
	private String updateTime;// readonly,string (date-time),Update time
	// Variant values for current variant
	private List<VariantValueInfo> variantValues;

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

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public List<VariantValueInfo> getVariantValues() {
		return variantValues;
	}

	public void setVariantValues(List<VariantValueInfo> variantValues) {
		this.variantValues = variantValues;
	}
	
}
