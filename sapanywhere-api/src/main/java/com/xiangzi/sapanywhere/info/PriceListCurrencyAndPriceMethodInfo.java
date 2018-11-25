package com.xiangzi.sapanywhere.info;

import com.xiangzi.sapanywhere.bean.PricingMethod;

public class PriceListCurrencyAndPriceMethodInfo extends BaseInfo {

	private CurrencyInfo currency;
	// 计价方式
	private PricingMethod pricingMethod;// Price method.

	public CurrencyInfo getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyInfo currency) {
		this.currency = currency;
	}

	public PricingMethod getPricingMethod() {
		return pricingMethod;
	}

	public void setPricingMethod(PricingMethod pricingMethod) {
		this.pricingMethod = pricingMethod;
	}

}
