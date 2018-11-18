package com.xiangzi.sapanywhere.bean;

import com.xiangzi.sapanywhere.info.ProductCategoryInfo;

/**
 * 产品类别
 */
public class ProductCategory extends BaseBean {

	private String id;// readonly,integer (int64),A unique idendifier
	private String name;// string,Category name
	private Boolean isLeaf;// readonly,boolean,Is a leaf node
	// Parent category of current category
	private ProductCategoryInfo parent;// unchangeable,CategoryInfo
	private String creationTime;// readonly,string (date-time),Creation time
	private String updateTime;// readonly,string (date-time),Update time

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

	public Boolean getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(Boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	public ProductCategoryInfo getParent() {
		return parent;
	}

	public void setParent(ProductCategoryInfo parent) {
		this.parent = parent;
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
