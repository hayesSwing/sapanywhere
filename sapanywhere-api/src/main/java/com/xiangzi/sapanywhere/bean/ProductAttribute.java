package com.xiangzi.sapanywhere.bean;

/**
 * 产品属性
 */
public class ProductAttribute extends BaseBean {

	private String id;
	private String attribute1;// 1st value of 4 attributes
	private String attribute2;// 2nd value of 4 attributes
	private String attribute3;// 3rd value of 4 attributes
	private String attribute4;// 4th value of 4 attributes
	private String creationTime;// readonly,string (date-time),Creation time
	private String updateTime;// readonly,string (date-time),Update time

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getAttribute3() {
		return attribute3;
	}

	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	public String getAttribute4() {
		return attribute4;
	}

	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
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
