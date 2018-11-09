package com.xiangzi.sapanywhere.bean;

/**
 * 支付类型<br/>
 * 设置-销售-支付类型
 */
public class PaymentType extends BaseBean {
	
	private String id;
	private String code;
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
