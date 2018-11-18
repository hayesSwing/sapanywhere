package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Product;

public class ProductApi extends BaseAnywhereApi<Product> {

	@Override
	protected String getObjectUrl() {
		return "Products";
	}
	
}
