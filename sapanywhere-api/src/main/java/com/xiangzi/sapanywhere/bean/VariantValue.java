package com.xiangzi.sapanywhere.bean;

import com.xiangzi.sapanywhere.info.VariantInfo;

/**
 * 属性值/规格值
 */
public class VariantValue extends BaseBean {

	private String id;// readonly,integer (int64),Unique identifier
	// 属性值
	private String value;// Variant value
	// 编号
	private String code;
	private Integer displayOrder;// Variant display order
	private VariantInfo variant;// Variant which this variant value belonged
	private String creationTime;// readonly,string (date-time),Creation time
	private String updateTime;// readonly,string (date-time),Update time

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public VariantInfo getVariant() {
		return variant;
	}

	public void setVariant(VariantInfo variant) {
		this.variant = variant;
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

}
