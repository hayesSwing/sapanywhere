package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Vendor;

/**
 * 供应商
 */
public class VendorApi extends BaseAnywhereApi<Vendor> {

	@Override
	protected String getObjectUrl() {
		return "Vendors";
	}
	
}
