package com.xiangzi.sapanywhere.bean;

/**
 * 支付方式<br/>
 * 设置-销售-支付方式
 */
public class PaymentMethod extends BaseBean {

	private String id;// readonly,integer (int64),unique identifier
	// 账户
	private String account;// required,string,The account of a payment method.
	// 方式描述
	private String description;// required,string
	// 方式类型
	private PaymentMethodType type;// required unchangeable,string
	// 状态
	private PaymentMethodStatus status;// required,string
	// 备注
	private String remark;// string,The remark of a payment method.
	// 系统默认
	// Indicate whether a payment method is the default one.
	private Boolean defaultMethod;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PaymentMethodType getType() {
		return type;
	}

	public void setType(PaymentMethodType type) {
		this.type = type;
	}

	public PaymentMethodStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentMethodStatus status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Boolean getDefaultMethod() {
		return defaultMethod;
	}

	public void setDefaultMethod(Boolean defaultMethod) {
		this.defaultMethod = defaultMethod;
	}
	
}
