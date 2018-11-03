package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Currency;

/**
 * 货币 <br/>
 */
public class CurrencyApi extends BaseAnywhereApi<Currency> {

	@Override
	protected String getObjectUrl() {
		return "Currencies";
	}
	
}
