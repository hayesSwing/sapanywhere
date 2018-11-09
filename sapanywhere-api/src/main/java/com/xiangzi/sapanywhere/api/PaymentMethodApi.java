package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.PaymentMethod;

/**
 * 支付方式<br/>
 * 设置-销售-支付方式
 */
public class PaymentMethodApi extends BaseAnywhereApi<PaymentMethod> {

	@Override
	protected String getObjectUrl() {
		return "PaymentMethods";
	}

}
