package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.AmountInfo;
import com.xiangzi.sapanywhere.info.CampaignInfo;
import com.xiangzi.sapanywhere.info.ContactInfo;
import com.xiangzi.sapanywhere.info.CurrencyInfo;
import com.xiangzi.sapanywhere.info.CustomerInfo;
import com.xiangzi.sapanywhere.info.SalesChannelInfo;

/**
 * 销售报价
 */
public class Quotation extends BaseBean {

	private Map<String, Object> customFields;
	private String id;
	// 报价编号
	private String docNumber;
	// 销售渠道
	private SalesChannelInfo channel;// required,unchangeable
	// 报价日期
	private String quotationTime;// string (date-time)
	// 过期日期
	private String expirationTime;// string (date-time)
	// 备注
	private String remark;
	// The quotation status.
	private QuotationStatus status;
	// 客户
	private CustomerInfo customer;
	// 联系人
	private ContactInfo contactPerson;
	// 交易货币
	private CurrencyInfo currency;// required
	// 汇率
	private Double exchangeRate;
	// 指示如何计算报价。
	// Possible values:
	// BY_DEFAULT,BY_TOTAL,BY_DISCOUNT_SUM,BY_DISCOUNT_PERCENTAGE
	private String headerCalculationBase;
	// 营销,Campaign information.
	private CampaignInfo campaign;
	// 计价方式
	private PricingMethod pricingMethod;
	// 不含税
	private AmountInfo netTotal;
	// 含税
	private AmountInfo grossTotal;
	// 税费总额
	private AmountInfo taxAmount;// readonly
	// 净折扣总额。
	private AmountInfo netDiscountSum;
	// 折扣额
	private AmountInfo grossDiscountSum;
	// object[],Quotation lines.(QuotationLine)
	private List<Map<String, Object>> lines;
	// readonly,object[],Detailed tax information.(TaxDetailedResultInfo)
	private List<Map<String, Object>> detailedTaxInfo;

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

	public SalesChannelInfo getChannel() {
		return channel;
	}

	public void setChannel(SalesChannelInfo channel) {
		this.channel = channel;
	}

	public String getQuotationTime() {
		return quotationTime;
	}

	public void setQuotationTime(String quotationTime) {
		this.quotationTime = quotationTime;
	}

	public String getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(String expirationTime) {
		this.expirationTime = expirationTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public QuotationStatus getStatus() {
		return status;
	}

	public void setStatus(QuotationStatus status) {
		this.status = status;
	}

	public CustomerInfo getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerInfo customer) {
		this.customer = customer;
	}

	public ContactInfo getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(ContactInfo contactPerson) {
		this.contactPerson = contactPerson;
	}

	public CurrencyInfo getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyInfo currency) {
		this.currency = currency;
	}

	public Double getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getHeaderCalculationBase() {
		return headerCalculationBase;
	}

	public void setHeaderCalculationBase(String headerCalculationBase) {
		this.headerCalculationBase = headerCalculationBase;
	}

	public CampaignInfo getCampaign() {
		return campaign;
	}

	public void setCampaign(CampaignInfo campaign) {
		this.campaign = campaign;
	}

	public PricingMethod getPricingMethod() {
		return pricingMethod;
	}

	public void setPricingMethod(PricingMethod pricingMethod) {
		this.pricingMethod = pricingMethod;
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

	public AmountInfo getNetDiscountSum() {
		return netDiscountSum;
	}

	public void setNetDiscountSum(AmountInfo netDiscountSum) {
		this.netDiscountSum = netDiscountSum;
	}

	public AmountInfo getGrossDiscountSum() {
		return grossDiscountSum;
	}

	public void setGrossDiscountSum(AmountInfo grossDiscountSum) {
		this.grossDiscountSum = grossDiscountSum;
	}

	public List<Map<String, Object>> getLines() {
		return lines;
	}

	public void setLines(List<Map<String, Object>> lines) {
		this.lines = lines;
	}

	public List<Map<String, Object>> getDetailedTaxInfo() {
		return detailedTaxInfo;
	}

	public void setDetailedTaxInfo(List<Map<String, Object>> detailedTaxInfo) {
		this.detailedTaxInfo = detailedTaxInfo;
	}
	
}
