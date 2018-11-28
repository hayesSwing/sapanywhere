package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.AddressInfo;
import com.xiangzi.sapanywhere.info.AmountInfo;
import com.xiangzi.sapanywhere.info.ContactInfo;
import com.xiangzi.sapanywhere.info.CurrencyInfo;
import com.xiangzi.sapanywhere.info.CustomerInfo;
import com.xiangzi.sapanywhere.info.TaxDetailedResultInfo;
import com.xiangzi.sapanywhere.info.UserInfo;

/**
 * 销售红字发票 - CreditMemo <br/>
 */
public class CreditMemo extends BaseBean {

	private Map<String, Object> customFields;
	private String id;
	// 单据编号
	private String docNumber;
	// 汇率
	private Double exchangeRate;
	// 状态
	private CreditMemoStatus status;
	// 客户
	private CustomerInfo customer;
	// 联系人
	private ContactInfo contactPerson;
	// 支付状态
	// Possible values: NOT_PAID,PARTIALLY_PAID,FULLY_PAID
	private PaymentStatus paymentStatus;// readonly
	// 计价方式
	private PricingMethod pricingMethod;
	// 创建时间
	private String postingTime;
	// 到期时间
	private String dueTime;
	// 创建时间
	private String creationTime;
	// 更新时间
	private String updateTime;
	// 手动关闭
	private Boolean manuallyClosed;
	// 备注
	private String remark;
	// 不含税总计
	private AmountInfo netTotal;
	// 含税总计
	private AmountInfo grossTotal;
	// 税额/税费总额
	private AmountInfo taxAmount;// readonly
	// 未付金额
	private AmountInfo amountDue;
	// 交易货币
	private CurrencyInfo currency;// required
	// 收货地址
	private AddressInfo shippingAddress;
	// 发票地址
	private AddressInfo billingAddress;
	// 产品,object[],Credit memo lines.
	private List<CreditMemoLine> lines;
	// readonly,object[],Detailed tax information.
	private List<TaxDetailedResultInfo> detailedTaxInfo;
	// 创建者
	private UserInfo createdBy;
	// 更新者
	private UserInfo updatedBy;

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

	public CreditMemoStatus getStatus() {
		return status;
	}

	public void setStatus(CreditMemoStatus status) {
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

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
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

	public CurrencyInfo getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyInfo currency) {
		this.currency = currency;
	}

	public AddressInfo getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(AddressInfo shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public AddressInfo getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(AddressInfo billingAddress) {
		this.billingAddress = billingAddress;
	}

	public List<CreditMemoLine> getLines() {
		return lines;
	}

	public void setLines(List<CreditMemoLine> lines) {
		this.lines = lines;
	}

	public List<TaxDetailedResultInfo> getDetailedTaxInfo() {
		return detailedTaxInfo;
	}

	public void setDetailedTaxInfo(List<TaxDetailedResultInfo> detailedTaxInfo) {
		this.detailedTaxInfo = detailedTaxInfo;
	}

	public UserInfo getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(UserInfo createdBy) {
		this.createdBy = createdBy;
	}

	public UserInfo getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(UserInfo updatedBy) {
		this.updatedBy = updatedBy;
	}

}
