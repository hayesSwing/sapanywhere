package com.xiangzi.sapanywhere.bean;

import com.xiangzi.sapanywhere.info.BatchNumberInfo;

/**
 * Product batch line of sales delivery
 */
public class SalesDeliveryProductBatchLine extends BaseBean {

	private String id;
	// Batch number info of certain delivery batch product line.
	// 批次信息
	private BatchNumberInfo batch;
	// Delivery quantity in batch of sales delivery UoM.
	private Double docQuantity;
	// Delivery quantity in batch of inventory UoM.
	private Double inventoryQuantity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BatchNumberInfo getBatch() {
		return batch;
	}

	public void setBatch(BatchNumberInfo batch) {
		this.batch = batch;
	}

	public Double getDocQuantity() {
		return docQuantity;
	}

	public void setDocQuantity(Double docQuantity) {
		this.docQuantity = docQuantity;
	}

	public Double getInventoryQuantity() {
		return inventoryQuantity;
	}

	public void setInventoryQuantity(Double inventoryQuantity) {
		this.inventoryQuantity = inventoryQuantity;
	}

}
