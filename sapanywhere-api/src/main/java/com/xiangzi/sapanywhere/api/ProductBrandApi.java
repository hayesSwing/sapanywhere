package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.ProductBrand;

public class ProductBrandApi extends BaseAnywhereApi<ProductBrand> {

	@Override
	protected String getObjectUrl() {
		return "Products/Brands";
	}
	
}
