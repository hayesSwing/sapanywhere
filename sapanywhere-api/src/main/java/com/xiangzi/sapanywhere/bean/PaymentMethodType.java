package com.xiangzi.sapanywhere.bean;

/**
 * 支付方式类型
 * 
 * @author Zhang ShuXiang
 *	
 */
public enum PaymentMethodType {

	PAYPAL_PRO("PAYPAL_PRO","PAYPAL Pro"),
	PAYPAL_STD("PAYPAL_STD","PAYPAL STD"),
	STRIPE("STRIPE","Stripe"),
	ALIPAY_TB("ALIPAY_TB","支付宝（淘宝/天猫）"),
	ALIPAY_ESHOP("ALIPAY_ESHOP","支付宝（自营网店）"),
	BANK("BANK","借记卡"),
	CASH("CASH","现金"),
	OTHERS("OTHERS","其它"),
	WECHATPAY("WECHATPAY","微信支付"),
	PAYPAL_PAYFLOW("PAYPAL_PAYFLOW","PayPal Payflow"),
	MEMBERSHIP_POINTS("MEMBERSHIP_POINTS","会员积分"),
	PAYPAL_HERE("PAYPAL_HERE","PayPal Here"),
	M_POS("M_POS","UnionPay/银联"),
	PAYPAL_EC("PAYPAL_EC","PayPal快速结账");
	
	private String code;
	private String desc;

	private PaymentMethodType(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	
}
