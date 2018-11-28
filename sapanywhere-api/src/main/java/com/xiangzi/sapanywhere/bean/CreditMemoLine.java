package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.AmountInfo;
import com.xiangzi.sapanywhere.info.BaseDocumentLineInfo;
import com.xiangzi.sapanywhere.info.SKUInfo;
import com.xiangzi.sapanywhere.info.TaxDetailedResultInfo;
import com.xiangzi.sapanywhere.info.UoMInfo;

/**
 * CreditMemo line model.
 */
public class CreditMemoLine extends BaseBean {

	private Map<String, Object> customFields;
	private String id;
	// 行号
	private String lineNumber;
	// required,unchangeable,Indicate the id of return order the credit memo
	// line based on.
	// 来源单据
	private BaseDocumentLineInfo baseDocument;
	// 备注
	private String remark;// User comments.
	// 产品
	private SKUInfo sku;
	// 数量
	private Double quantity;// SKU quantity under sales UoM.
	// 销售计量单位
	private UoMInfo salesUom;// Sales UoM.
	// 库存计量单位
	private UoMInfo inventoryUom;// readonly,Inventory UoM.
	// 换算率/转换率
	private Double uomConversionRate;// readonly,UoM conversion rate.
	// 库存数量
	private Double inventoryUomQuantity;// readonly,Inventory UoM quantity.
	// Possible values: BY_DEFAULT,BY_TOTAL,BY_PRICEANDTOTAL,BY_UNITPRICE
	private SalesOrderProductLineCalculationBase calculationBase;// 计算办法
	// 单价-不含税
	private Double netUnitPrice;
	// 单价-含税
	private Double grossUnitPrice;
	// 不含税总额
	private AmountInfo netAmount;// Net line total.
	// 含税总额
	private AmountInfo grossAmount;// Gross line total.
	// 税额
	private AmountInfo taxAmount;// readonly,Total tax amount.
	// readonly,Detailed tax information.
	private List<TaxDetailedResultInfo> detailedTaxInfo;

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

	public Double getUomConversionRate() {
		return uomConversionRate;
	}

	public void setUomConversionRate(Double uomConversionRate) {
		this.uomConversionRate = uomConversionRate;
	}

	public Double getInventoryUomQuantity() {
		return inventoryUomQuantity;
	}

	public void setInventoryUomQuantity(Double inventoryUomQuantity) {
		this.inventoryUomQuantity = inventoryUomQuantity;
	}

	public SalesOrderProductLineCalculationBase getCalculationBase() {
		return calculationBase;
	}

	public void setCalculationBase(SalesOrderProductLineCalculationBase calculationBase) {
		this.calculationBase = calculationBase;
	}

	public Double getNetUnitPrice() {
		return netUnitPrice;
	}

	public void setNetUnitPrice(Double netUnitPrice) {
		this.netUnitPrice = netUnitPrice;
	}

	public Double getGrossUnitPrice() {
		return grossUnitPrice;
	}

	public void setGrossUnitPrice(Double grossUnitPrice) {
		this.grossUnitPrice = grossUnitPrice;
	}

	public AmountInfo getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(AmountInfo netAmount) {
		this.netAmount = netAmount;
	}

	public AmountInfo getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(AmountInfo grossAmount) {
		this.grossAmount = grossAmount;
	}
	
	public AmountInfo getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(AmountInfo taxAmount) {
		this.taxAmount = taxAmount;
	}

	public List<TaxDetailedResultInfo> getDetailedTaxInfo() {
		return detailedTaxInfo;
	}

	public void setDetailedTaxInfo(List<TaxDetailedResultInfo> detailedTaxInfo) {
		this.detailedTaxInfo = detailedTaxInfo;
	}

}
