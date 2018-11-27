package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.BaseDocumentLineInfo;
import com.xiangzi.sapanywhere.info.SKUInfo;
import com.xiangzi.sapanywhere.info.UoMInfo;

/**
 * Product line of sales delivery
 */
public class SalesDeliveryProductLine extends BaseBean {

	private Map<String, Object> customFields;
	private String id;
	// 行号
	private String lineNumber;
	// 产品
	private SKUInfo sku;
	// 库存计量单位
	private UoMInfo inventoryUom;// Inventory UoM.
	// 销售计量单位
	private UoMInfo salesUom;// Sales UoM.
	// 换算率/转换率
	private Double uomConversionRate;// readonly,UoM conversion rate.
	// To indicate the id of sales order and the order line id that the delivery
	// line based on.
	// 来源单据
	private BaseDocumentLineInfo baseDocument;
	// Delivery quantity based on inventory UoM of SKU.
	// 所需数量-库存单位计算后的值
	private Double inventoryUomDeliveryQuantity;// readonly
	// 订单数量
	private Double requiredQuantity;
	// 发货数量不能大于订单数量。
	// 发货数量
	private Double deliveryQuantity;// required
	// Product batch line of the sales delivery.
	// 批次号
	private List<SalesDeliveryProductBatchLine> batches;

	public Map<String, Object> getCustomFields() {
		return customFields;
	}

	public void setCustomFields(Map<String, Object> customFields) {
		this.customFields = customFields;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public SKUInfo getSku() {
		return sku;
	}

	public void setSku(SKUInfo sku) {
		this.sku = sku;
	}

	public UoMInfo getInventoryUom() {
		return inventoryUom;
	}

	public void setInventoryUom(UoMInfo inventoryUom) {
		this.inventoryUom = inventoryUom;
	}

	public UoMInfo getSalesUom() {
		return salesUom;
	}

	public void setSalesUom(UoMInfo salesUom) {
		this.salesUom = salesUom;
	}

	public Double getUomConversionRate() {
		return uomConversionRate;
	}

	public void setUomConversionRate(Double uomConversionRate) {
		this.uomConversionRate = uomConversionRate;
	}

	public BaseDocumentLineInfo getBaseDocument() {
		return baseDocument;
	}

	public void setBaseDocument(BaseDocumentLineInfo baseDocument) {
		this.baseDocument = baseDocument;
	}

	public Double getInventoryUomDeliveryQuantity() {
		return inventoryUomDeliveryQuantity;
	}

	public void setInventoryUomDeliveryQuantity(Double inventoryUomDeliveryQuantity) {
		this.inventoryUomDeliveryQuantity = inventoryUomDeliveryQuantity;
	}

	public Double getRequiredQuantity() {
		return requiredQuantity;
	}

	public void setRequiredQuantity(Double requiredQuantity) {
		this.requiredQuantity = requiredQuantity;
	}

	public Double getDeliveryQuantity() {
		return deliveryQuantity;
	}

	public void setDeliveryQuantity(Double deliveryQuantity) {
		this.deliveryQuantity = deliveryQuantity;
	}

	public List<SalesDeliveryProductBatchLine> getBatches() {
		return batches;
	}

	public void setBatches(List<SalesDeliveryProductBatchLine> batches) {
		this.batches = batches;
	}

}
