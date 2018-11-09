package com.xiangzi.sapanywhere.info;

import com.xiangzi.sapanywhere.bean.PaymentMethodType;

/**
 * Payment Method
 */
public class PaymentMethodInfo extends BaseInfo {

	private String id;// readonly,integer (int64),unique identifier
	// 方式描述/方式名称
	private String name;// required,string
	// 方式类型
	private PaymentMethodType type;// required unchangeable,string

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

	public PaymentMethodType getType() {
		return type;
	}

	public void setType(PaymentMethodType type) {
		this.type = type;
	}

}
