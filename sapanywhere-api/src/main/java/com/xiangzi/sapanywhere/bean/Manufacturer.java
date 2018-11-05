package com.xiangzi.sapanywhere.bean;

/**
 * 生产商/制造商
 */
public class Manufacturer extends BaseBean {

	private String id;// readonly,integer (int64),A unique idendifier
	// 名称
	private String name;// string,Manufacturer name
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
