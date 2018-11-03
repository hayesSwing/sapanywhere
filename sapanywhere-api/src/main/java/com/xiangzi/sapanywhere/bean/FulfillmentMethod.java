package com.xiangzi.sapanywhere.bean;

/**
 * FulfillmentMethod-交付方式 <br/>
 * 设置-销售-交付方式
 */
public class FulfillmentMethod extends BaseBean {

	private String id;// integer (int64),Unique identifier
	// 编号
	private String code;
	// 名称
	private String name;

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
	
}
