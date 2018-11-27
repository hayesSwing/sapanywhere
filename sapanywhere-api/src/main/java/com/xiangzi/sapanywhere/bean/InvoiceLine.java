package com.xiangzi.sapanywhere.bean;

import java.util.Map;

import com.xiangzi.sapanywhere.info.BaseDocumentLineInfo;
import com.xiangzi.sapanywhere.info.SKUInfo;
import com.xiangzi.sapanywhere.info.UoMInfo;

/**
 * InvoiceLine
 */
public class InvoiceLine extends BaseBean {

	private Map<String, Object> customFields;
	private String id;// integer (int64),Unique identifier
	private String lineNumber;// readonly,integer (int64)
	private BaseDocumentLineInfo baseDocument;
	private String remark;
	private SKUInfo sku;
	private Double quantity;
	private UoMInfo salesUom;
	private UoMInfo inventoryUom;

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

	public BaseDocumentLineInfo getBaseDocument() {
		return baseDocument;
	}

	public void setBaseDocument(BaseDocumentLineInfo baseDocument) {
		this.baseDocument = baseDocument;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public SKUInfo getSku() {
		return sku;
	}

	public void setSku(SKUInfo sku) {
		this.sku = sku;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public UoMInfo getSalesUom() {
		return salesUom;
	}

	public void setSalesUom(UoMInfo salesUom) {
		this.salesUom = salesUom;
	}

	public UoMInfo getInventoryUom() {
		return inventoryUom;
	}

	public void setInventoryUom(UoMInfo inventoryUom) {
		this.inventoryUom = inventoryUom;
	}
	
}
