package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.ProductTaxClass;

/**
 * 产品纳税类别 </br>
 */
public class ProductTaxClassApi extends BaseAnywhereApi<ProductTaxClass> {

	@Override
	protected String getObjectUrl() {
		return "Products/ProductTaxClasses";
	}
	
}
