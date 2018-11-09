package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.PaymentType;

/**
 * 支付类型<br/>
 * 设置-销售-支付类型
 */
public class PaymentTypeApi extends BaseAnywhereApi<PaymentType> {

	@Override
	protected String getObjectUrl() {
		return "SalesOrders/PaymentTypes";
	}
	
}
