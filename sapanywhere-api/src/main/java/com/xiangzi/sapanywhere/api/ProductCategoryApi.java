package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.ProductCategory;

/**
 * 产品类别 </br>
 */
public class ProductCategoryApi extends BaseAnywhereApi<ProductCategory> {

	@Override
	protected String getObjectUrl() {
		return "ProductCategories";
	}
	
}
