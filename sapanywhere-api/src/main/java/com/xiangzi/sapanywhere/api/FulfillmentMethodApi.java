package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.FulfillmentMethod;

/**
 * FulfillmentMethod-交付方式 <br/>
 * 设置-销售-交付方式
 */
public class FulfillmentMethodApi extends BaseAnywhereApi<FulfillmentMethod> {

	@Override
	protected String getObjectUrl() {
		return "SalesOrders/FulfillmentMethods";
	}

}
