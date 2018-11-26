package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.VariantValue;

/**
 * 属性值/规格值
 */
public class VariantValueApi extends BaseAnywhereApi<VariantValue> {

	@Override
	protected String getObjectUrl() {
		return "Products/VariantValues";
	}

}
