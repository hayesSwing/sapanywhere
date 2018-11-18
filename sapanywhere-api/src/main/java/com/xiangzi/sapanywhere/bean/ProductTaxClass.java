package com.xiangzi.sapanywhere.bean;

/**
 * 产品纳税类别
 */
public class ProductTaxClass extends BaseBean {

	private String id;// readonly,integer (int64),A unique idendifier
	private String description;// string,Description

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
