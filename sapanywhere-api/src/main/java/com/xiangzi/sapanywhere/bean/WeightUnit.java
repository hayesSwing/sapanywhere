package com.xiangzi.sapanywhere.bean;

/**
 * 重量单位 <br/>
 */
public class WeightUnit extends BaseBean {

	private String id;// integer (int64),Unique identifier
	// 编号
	private String code;
	// 名称
	private String name;
	// 转换率/尺寸
	private Double size;// Conversion rate between weight unit.

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

}
