package com.xiangzi.sapanywhere.bean;

/**
 * 长度单位 <br/>
 */
public class LengthUnit extends BaseBean {

	private String id;// integer (int64),Unique identifier
	// 编号
	private String code;
	// 名称
	private String name;
	// 容量编号
	private String volumnCode;
	// 转换率/尺寸
	private Double size;// Conversion rate between length unit.

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

	public String getVolumnCode() {
		return volumnCode;
	}

	public void setVolumnCode(String volumnCode) {
		this.volumnCode = volumnCode;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

}
