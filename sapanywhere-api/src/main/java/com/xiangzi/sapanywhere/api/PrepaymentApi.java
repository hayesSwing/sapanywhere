package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Prepayment;

/**
 * 预付款
 */
public class PrepaymentApi extends BaseAnywhereApi<Prepayment> {

	@Override
	protected String getObjectUrl() {
		return "Prepayments";
	}
	
}
