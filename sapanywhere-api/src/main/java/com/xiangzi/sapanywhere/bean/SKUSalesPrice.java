package com.xiangzi.sapanywhere.bean;

import java.util.List;

import com.xiangzi.sapanywhere.info.SKUSalesPriceInfo;

public class SKUSalesPrice extends BaseBean {

	private String id;
	private List<SKUSalesPriceInfo> skuPrices;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<SKUSalesPriceInfo> getSkuPrices() {
		return skuPrices;
	}

	public void setSkuPrices(List<SKUSalesPriceInfo> skuPrices) {
		this.skuPrices = skuPrices;
	}

}
