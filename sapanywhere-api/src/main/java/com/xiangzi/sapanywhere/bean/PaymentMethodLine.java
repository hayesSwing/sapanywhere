package com.xiangzi.sapanywhere.bean;

import java.util.Map;

import com.xiangzi.sapanywhere.info.AmountInfo;
import com.xiangzi.sapanywhere.info.PaymentMethodInfo;

/**
 * Payment method line model.
 */
public class PaymentMethodLine extends BaseBean {

	private Map<String, Object> customFields;
	private String id;
	// 支付方式
	private PaymentMethodInfo paymentMethod;// Payment method.
	// 金额
	private AmountInfo amount;// Total amount.

	public Map<String, Object> getCustomFields() {
		return customFields;
	}

	public void setCustomFields(Map<String, Object> customFields) {
		this.customFields = customFields;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PaymentMethodInfo getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethodInfo paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public AmountInfo getAmount() {
		return amount;
	}

	public void setAmount(AmountInfo amount) {
		this.amount = amount;
	}

}
