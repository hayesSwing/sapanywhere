package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Manufacturer;

/**
 * 生产商/制造商
 */
public class ManufacturerApi extends BaseAnywhereApi<Manufacturer> {

	@Override
	protected String getObjectUrl() {
		return "Products/Manufacturers";
	}
	
}
