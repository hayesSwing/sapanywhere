package com.xiangzi.sapanywhere.info;

import java.util.List;

public class SKUAllWarehouseInfo extends BaseInfo {

	// 存货量
	// Total in stock SKU quantity.
	private Long inStockTotal;
	// 待收数量
	// Total ordered SKU quantity.
	private Long orderedTotal;
	// 承诺数量
	// Total committed SKU quantity.
	private Long committedTotal;
	// Every warhouse info of the SKU.
	private List<SKUWarehouseInfo> warehouseInfoList;

	public Long getInStockTotal() {
		return inStockTotal;
	}

	public void setInStockTotal(Long inStockTotal) {
		this.inStockTotal = inStockTotal;
	}

	public Long getOrderedTotal() {
		return orderedTotal;
	}

	public void setOrderedTotal(Long orderedTotal) {
		this.orderedTotal = orderedTotal;
	}

	public Long getCommittedTotal() {
		return committedTotal;
	}

	public void setCommittedTotal(Long committedTotal) {
		this.committedTotal = committedTotal;
	}

	public List<SKUWarehouseInfo> getWarehouseInfoList() {
		return warehouseInfoList;
	}

	public void setWarehouseInfoList(List<SKUWarehouseInfo> warehouseInfoList) {
		this.warehouseInfoList = warehouseInfoList;
	}

}
