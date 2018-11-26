package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Variant;

/**
 * 产品属性/规格
 */
public class VariantApi extends BaseAnywhereApi<Variant> {

	@Override
	protected String getObjectUrl() {
		return "Products/Variants";
	}

}
