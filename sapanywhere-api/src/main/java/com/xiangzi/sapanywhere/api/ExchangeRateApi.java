package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.ExchangeRate;

/**
 * ExchangeRate <br/>
 */
public class ExchangeRateApi extends BaseAnywhereApi<ExchangeRate> {

	@Override
	protected String getObjectUrl() {
		return "ExchangeRates";
	}

}
