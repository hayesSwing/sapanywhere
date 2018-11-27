package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.AmountInfo;
import com.xiangzi.sapanywhere.info.CurrencyInfo;
import com.xiangzi.sapanywhere.info.CustomerInfo;

/**
 * 发票 <br/>
 * 设置-销售-销售订单-是否允许给未发货销售订单开票
 */
public class Invoice extends BaseBean {

	private Map<String, Object> customFields;
	private String id;// readonly,integer (int64),Unique identifier
	// 单据号
	private String docNumber;// readonly,string,Document number
	private Double exchangeRate;// Document rate
	// Possible values: OPEN,CLOSED,CANCEL
	private String status;// readonly,Invoice status.
	// 支付状态-Possible values: NOT_PAID,PARTIALLY_PAID-部分付款,FULLY_PAID
	private String paymentStatus;// readonly,Invoice payment status.
	// Possible values: NET_PRICE,GROSS_PRICE
	private PricingMethod pricingMethod;// readonly,string,Pricing method of invoice.
	// 过账时间
	private String postingTime;// unchangeable,string (date-time),Posting time of invoice.
	// 到期时间
	private String dueTime;// unchangeable,string (date-time),Due time of invoice.
	private String creationTime;// readonly,string (date-time),Creation time of invoice.
	private String updateTime;// readonly,string (date-time),Update time of invoice.
	// 手动关闭
	private Boolean manuallyClosed;// readonly,boolean,Indicate if the invoice is Manually Closed.
	// 备注
	private String remark;// User comments of invoice.

	// 不含税总计
	private AmountInfo netTotal;// readonly,Net total amount of invoice.
	// 含税总计
	private AmountInfo grossTotal;// readonly,Gross total amount of invoice.
	// 税额
	private AmountInfo taxAmount;// readonly,Tax total amount of invoice.
	// 未收金额
	private AmountInfo amountDue;// readonly,Balance total amount of invoice.
	// 客户
	private CustomerInfo customer;// readonly,Refer to the customer of invoice.
	// 交易货币
	private CurrencyInfo currency;// readonly,Transaction currency of invoice.
	// invoiceLines
	private List<InvoiceLine> invoiceLines;// required,Invoice lines.

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

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	public Double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public PricingMethod getPricingMethod() {
		return pricingMethod;
	}

	public void setPricingMethod(PricingMethod pricingMethod) {
		this.pricingMethod = pricingMethod;
	}

	public String getPostingTime() {
		return postingTime;
	}

	public void setPostingTime(String postingTime) {
		this.postingTime = postingTime;
	}

	public String getDueTime() {
		return dueTime;
	}

	public void setDueTime(String dueTime) {
		this.dueTime = dueTime;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Boolean getManuallyClosed() {
		return manuallyClosed;
	}

	public void setManuallyClosed(Boolean manuallyClosed) {
		this.manuallyClosed = manuallyClosed;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public AmountInfo getNetTotal() {
		return netTotal;
	}

	public void setNetTotal(AmountInfo netTotal) {
		this.netTotal = netTotal;
	}

	public AmountInfo getGrossTotal() {
		return grossTotal;
	}

	public void setGrossTotal(AmountInfo grossTotal) {
		this.grossTotal = grossTotal;
	}

	public AmountInfo getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(AmountInfo taxAmount) {
		this.taxAmount = taxAmount;
	}

	public AmountInfo getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(AmountInfo amountDue) {
		this.amountDue = amountDue;
	}

	public CustomerInfo getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerInfo customer) {
		this.customer = customer;
	}

	public CurrencyInfo getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyInfo currency) {
		this.currency = currency;
	}

	public List<InvoiceLine> getInvoiceLines() {
		return invoiceLines;
	}

	public void setInvoiceLines(List<InvoiceLine> invoiceLines) {
		this.invoiceLines = invoiceLines;
	}

}
