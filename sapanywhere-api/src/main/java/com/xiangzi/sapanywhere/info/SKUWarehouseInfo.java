package com.xiangzi.sapanywhere.info;

/**
 * One Warhouse Info of an SKU
 */
public class SKUWarehouseInfo extends BaseInfo {

	// Warehouse id.
	private String warehouseId;
	// Warehouse code.
	private String warehouseCode;
	// Warehouse name.
	private String warehouseName;
	// 存货量
	// In stock SKU quantity.
	private Long inStock;
	// 待收数量
	// Ordered SKU quantity.
	private Long ordered;
	// 承诺数量
	// ICommitted SKU quantity.
	private Long committed;
	// 最小库存水平
	// Minimal inventory SKU quantity.
	private Long minInventory;
	// 建议采购量
	// Re-ordered SKU quantity.
	private Long reOrderQuantity;
	// 可售数量
	// ATS.
	private Long ats;
	// Remark.
	private String remark;

	public String getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public Long getInStock() {
		return inStock;
	}

	public void setInStock(Long inStock) {
		this.inStock = inStock;
	}

	public Long getOrdered() {
		return ordered;
	}

	public void setOrdered(Long ordered) {
		this.ordered = ordered;
	}

	public Long getCommitted() {
		return committed;
	}

	public void setCommitted(Long committed) {
		this.committed = committed;
	}

	public Long getMinInventory() {
		return minInventory;
	}

	public void setMinInventory(Long minInventory) {
		this.minInventory = minInventory;
	}

	public Long getReOrderQuantity() {
		return reOrderQuantity;
	}

	public void setReOrderQuantity(Long reOrderQuantity) {
		this.reOrderQuantity = reOrderQuantity;
	}

	public Long getAts() {
		return ats;
	}

	public void setAts(Long ats) {
		this.ats = ats;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
