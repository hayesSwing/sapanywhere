package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Warehouse;

/**
 * 仓库
 */
public class WarehouseApi extends BaseAnywhereApi<Warehouse> {

	@Override
	protected String getObjectUrl() {
		return "Warehouses";
	}
	
}
