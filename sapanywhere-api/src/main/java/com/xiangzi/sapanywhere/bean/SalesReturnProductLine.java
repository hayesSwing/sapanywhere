package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.BaseDocumentLineInfo;
import com.xiangzi.sapanywhere.info.SKUInfo;
import com.xiangzi.sapanywhere.info.UoMInfo;

/**
 * Product line of sales return
 */
public class SalesReturnProductLine extends BaseBean {

	private Map<String, Object> customFields;
	private String id;// integer (int64),Unique identifier in line level.
	// 行号,Line number user can see in the table.
	private String lineNumber;// readonly,integer (int64)
	// 产品
	private SKUInfo sku;// readonly,SKU used in the line.
	// 库存计量单位
	private UoMInfo inventoryUoM;// readonly,Inventory UoM.
	// 销售计量单位
	private UoMInfo salesUoM;// readonly,Sales UoM.
	// 换算率/转换率
	private Double uomConversionRate;// readonly,UoM conversion rate.
	// 存货量/库存数量,Original inventory quantity based on inventory UoM of SKU.
	private Double inStockQuantity;// readonly
	// ,Returned quantity based on sales UoM of SKU referenced from sales
	// order line.
	private Double referenceReturnedQuantity;// readonly
	// ,Returned quantity based on inventory UoM of SKU.
	private Double inventoryReturnedQuantity;// readonly
	// To indicate the id of sales order and the order line number that the
	// return line based on.
	// 来源单据
	private BaseDocumentLineInfo baseDocument;// required,unchangeable
	// 退货数量,Returned quantity based on sales UoM of SKU.
	private Double returnedQuantity;
	// Product batch line of the sales return.
	// 批次号
	private List<SalesReturnProductBatchLine> batches;

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

	public UoMInfo getInventoryUoM() {
		return inventoryUoM;
	}

	public void setInventoryUoM(UoMInfo inventoryUoM) {
		this.inventoryUoM = inventoryUoM;
	}

	public UoMInfo getSalesUoM() {
		return salesUoM;
	}

	public void setSalesUoM(UoMInfo salesUoM) {
		this.salesUoM = salesUoM;
	}

	public Double getUomConversionRate() {
		return uomConversionRate;
	}

	public void setUomConversionRate(Double uomConversionRate) {
		this.uomConversionRate = uomConversionRate;
	}

	public Double getInStockQuantity() {
		return inStockQuantity;
	}

	public void setInStockQuantity(Double inStockQuantity) {
		this.inStockQuantity = inStockQuantity;
	}

	public Double getReferenceReturnedQuantity() {
		return referenceReturnedQuantity;
	}

	public void setReferenceReturnedQuantity(Double referenceReturnedQuantity) {
		this.referenceReturnedQuantity = referenceReturnedQuantity;
	}

	public Double getInventoryReturnedQuantity() {
		return inventoryReturnedQuantity;
	}

	public void setInventoryReturnedQuantity(Double inventoryReturnedQuantity) {
		this.inventoryReturnedQuantity = inventoryReturnedQuantity;
	}

	public BaseDocumentLineInfo getBaseDocument() {
		return baseDocument;
	}

	public void setBaseDocument(BaseDocumentLineInfo baseDocument) {
		this.baseDocument = baseDocument;
	}

	public Double getReturnedQuantity() {
		return returnedQuantity;
	}

	public void setReturnedQuantity(Double returnedQuantity) {
		this.returnedQuantity = returnedQuantity;
	}

	public List<SalesReturnProductBatchLine> getBatches() {
		return batches;
	}

	public void setBatches(List<SalesReturnProductBatchLine> batches) {
		this.batches = batches;
	}

}
