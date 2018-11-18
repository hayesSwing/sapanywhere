package com.xiangzi.sapanywhere.info;

import com.xiangzi.sapanywhere.bean.PricingMethod;

public class UomPriceInfo extends BaseInfo {

	private CurrencyInfo currency;
	// 计价方式
	private PricingMethod pricingMethod;// Price method.
	private Double price;// Price value.
	private UoMInfo uom;

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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public UoMInfo getUom() {
		return uom;
	}

	public void setUom(UoMInfo uom) {
		this.uom = uom;
	}
	
}
