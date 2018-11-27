package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.AmountInfo;
import com.xiangzi.sapanywhere.info.BaseDocumentLineInfo;
import com.xiangzi.sapanywhere.info.SKUInfo;
import com.xiangzi.sapanywhere.info.TaxDetailedResultInfo;
import com.xiangzi.sapanywhere.info.UoMInfo;
import com.xiangzi.sapanywhere.info.WarehouseInfo;


/**
 * Product line of sales order.
 */
public class SalesOrderProductLine extends BaseBean {

	private Map<String, Object> customFields;
	private String id;
	// 行号
	private String lineNumber;
	// 数量
	private Double quantity;// SKU quantity under sales UoM.
	// 产品
	private SKUInfo sku;
	// 属性/规格
	private String variants;// readonly,Variant values.
	// 仓库
	private WarehouseInfo warehouse;
	// 销售计量单位
	private UoMInfo salesUom;// Sales UoM.
	// 换算率/转换率
	private Double uomConversionRate;// readonly,UoM conversion rate.
	// 库存数量
	private Double inventoryUomQuantity;// readonly,Inventory UoM quantity.
	// 库存计量单位
	private UoMInfo inventoryUom;// readonly,Inventory UoM.
	// 单价-不含税
	private Double netUnitPrice;
	// 单价-含税
	private Double grossUnitPrice;
	// 标准价格-如果之后该产品的标准价格被更改了，这里仍然显示当时交易发生时（即单据创建时）该产品的标准价格。
	private Double standardPrice;
	// 折扣率
	private Double discount;// Discount percentage.
	// 税额
	private AmountInfo estimatedTax;// readonly,Total tax amount.
	// 不含税总额
	private AmountInfo netAmount;// Net line total.
	// 含税总额
	private AmountInfo grossAmount;// Gross line total.
	// Possible values: BY_DEFAULT,BY_TOTAL,BY_PRICEANDTOTAL,BY_UNITPRICE
	private SalesOrderProductLineCalculationBase calculationBase;// 计算办法
	// 成本计算方法
	private CostingMethod costingMethod;
	// 总利润%
	// readonly,Gross profit margin.
	private Double grossProfitMargin;
	// 总利润
	// readonly,Gross profit amount. Displayed in local currency.
	private Double grossProfitAmount;
	// 估算成本
	// readonly,Line unit cost. Displayed in local currency.
	private Double estimatedUnitCost;
	// 总估算成本
	// readonly,Total cost. Displayed in local currency.
	private Double estimatedTotalCost;
	// 来源单据
	// Linked base document. The field 'baseType' can only be 'SalesOrder' for
	// SalesOrderReturnLines.
	private BaseDocumentLineInfo baseDocument;
	// 业务状态
	private SalesOrderProductLogisticsStatus logisticsStatus;
	// 发票状态
	private SalesOrderProductInvoiceStatus invoiceStatus;
	// 原因，该产品不发货的原因
	// Exception reason description.
	private ExceptionReason exception;
	// readonly,Currently is preparing stock.
	private Boolean isPreparingStock;
	// 备注
	private String remark;// User comments.
	// 参考编号
	private String referenceCode;// Reference code.
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

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public SKUInfo getSku() {
		return sku;
	}

	public void setSku(SKUInfo sku) {
		this.sku = sku;
	}

	public String getVariants() {
		return variants;
	}

	public void setVariants(String variants) {
		this.variants = variants;
	}

	public WarehouseInfo getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(WarehouseInfo warehouse) {
		this.warehouse = warehouse;
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

	public Double getInventoryUomQuantity() {
		return inventoryUomQuantity;
	}

	public void setInventoryUomQuantity(Double inventoryUomQuantity) {
		this.inventoryUomQuantity = inventoryUomQuantity;
	}

	public UoMInfo getInventoryUom() {
		return inventoryUom;
	}

	public void setInventoryUom(UoMInfo inventoryUom) {
		this.inventoryUom = inventoryUom;
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

	public Double getStandardPrice() {
		return standardPrice;
	}

	public void setStandardPrice(Double standardPrice) {
		this.standardPrice = standardPrice;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public AmountInfo getEstimatedTax() {
		return estimatedTax;
	}

	public void setEstimatedTax(AmountInfo estimatedTax) {
		this.estimatedTax = estimatedTax;
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

	public SalesOrderProductLineCalculationBase getCalculationBase() {
		return calculationBase;
	}

	public void setCalculationBase(SalesOrderProductLineCalculationBase calculationBase) {
		this.calculationBase = calculationBase;
	}

	public CostingMethod getCostingMethod() {
		return costingMethod;
	}

	public void setCostingMethod(CostingMethod costingMethod) {
		this.costingMethod = costingMethod;
	}

	public Double getGrossProfitMargin() {
		return grossProfitMargin;
	}

	public void setGrossProfitMargin(Double grossProfitMargin) {
		this.grossProfitMargin = grossProfitMargin;
	}

	public Double getGrossProfitAmount() {
		return grossProfitAmount;
	}

	public void setGrossProfitAmount(Double grossProfitAmount) {
		this.grossProfitAmount = grossProfitAmount;
	}

	public Double getEstimatedUnitCost() {
		return estimatedUnitCost;
	}

	public void setEstimatedUnitCost(Double estimatedUnitCost) {
		this.estimatedUnitCost = estimatedUnitCost;
	}

	public Double getEstimatedTotalCost() {
		return estimatedTotalCost;
	}

	public void setEstimatedTotalCost(Double estimatedTotalCost) {
		this.estimatedTotalCost = estimatedTotalCost;
	}

	public BaseDocumentLineInfo getBaseDocument() {
		return baseDocument;
	}

	public void setBaseDocument(BaseDocumentLineInfo baseDocument) {
		this.baseDocument = baseDocument;
	}

	public SalesOrderProductLogisticsStatus getLogisticsStatus() {
		return logisticsStatus;
	}

	public void setLogisticsStatus(SalesOrderProductLogisticsStatus logisticsStatus) {
		this.logisticsStatus = logisticsStatus;
	}

	public SalesOrderProductInvoiceStatus getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(SalesOrderProductInvoiceStatus invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public ExceptionReason getException() {
		return exception;
	}

	public void setException(ExceptionReason exception) {
		this.exception = exception;
	}

	public Boolean getIsPreparingStock() {
		return isPreparingStock;
	}

	public void setIsPreparingStock(Boolean isPreparingStock) {
		this.isPreparingStock = isPreparingStock;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getReferenceCode() {
		return referenceCode;
	}

	public void setReferenceCode(String referenceCode) {
		this.referenceCode = referenceCode;
	}

	public List<TaxDetailedResultInfo> getDetailedTaxInfo() {
		return detailedTaxInfo;
	}

	public void setDetailedTaxInfo(List<TaxDetailedResultInfo> detailedTaxInfo) {
		this.detailedTaxInfo = detailedTaxInfo;
	}

}
