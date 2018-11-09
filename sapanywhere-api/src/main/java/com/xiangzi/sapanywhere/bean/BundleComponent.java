package com.xiangzi.sapanywhere.bean;

import com.xiangzi.sapanywhere.info.SKUInfo;

public class BundleComponent extends BaseBean {

	private String id;
	private SKUInfo sku;
	private Double quantity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SKUInfo getSku() {
		return sku;
	}

	public void setSku(SKUInfo sku) {
		this.sku = sku;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

}
