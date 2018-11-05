package com.xiangzi.sapanywhere.bean;

import com.xiangzi.sapanywhere.info.WarehouseInfo;

public class ChannelWarehouseLine extends BaseBean {

	private String id;
	// 仓库
	private WarehouseInfo warehouse;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public WarehouseInfo getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(WarehouseInfo warehouse) {
		this.warehouse = warehouse;
	}
	
}
