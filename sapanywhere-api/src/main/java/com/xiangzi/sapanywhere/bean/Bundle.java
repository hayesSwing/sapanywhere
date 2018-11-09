package com.xiangzi.sapanywhere.bean;

import java.util.List;

import com.xiangzi.sapanywhere.info.SKUInfo;

/**
 * Bundle-组合产品 <br/>
 */
public class Bundle extends BaseBean {

	private String id;
	private String description;
	private SKUInfo sku;// SKU related to the bundle
	private List<BundleComponent> bundleComponents;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SKUInfo getSku() {
		return sku;
	}

	public void setSku(SKUInfo sku) {
		this.sku = sku;
	}

	public List<BundleComponent> getBundleComponents() {
		return bundleComponents;
	}

	public void setBundleComponents(List<BundleComponent> bundleComponents) {
		this.bundleComponents = bundleComponents;
	}
	
}
