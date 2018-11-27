package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.AddressInfo;
import com.xiangzi.sapanywhere.info.AmountInfo;
import com.xiangzi.sapanywhere.info.CampaignInfo;
import com.xiangzi.sapanywhere.info.CarrierInfo;
import com.xiangzi.sapanywhere.info.ContactInfo;
import com.xiangzi.sapanywhere.info.CurrencyInfo;
import com.xiangzi.sapanywhere.info.CustomerInfo;
import com.xiangzi.sapanywhere.info.ExternalMerchantInfo;
import com.xiangzi.sapanywhere.info.PaymentTermInfo;
import com.xiangzi.sapanywhere.info.PromotionInfo;
import com.xiangzi.sapanywhere.info.SalesChannelInfo;
import com.xiangzi.sapanywhere.info.TaxDetailedResultInfo;
import com.xiangzi.sapanywhere.info.UserInfo;

/**
 * 销售订单
 */
public class SalesOrder extends BaseBean {

	private Map<String, Object> customFields;
	private String id;// integer (int64),Unique identifier
	// 单据编号
	private String docNumber;// unchangeable,string,Document number
	// 汇率
	private Double exchangeRate;// Document rate for a sales order.
	// 外部订单-在外部渠道系统中产生的订单编号。
	private String extOrderId;// External sales order id.
	// 销售渠道
	private SalesChannelInfo channel;// required,unchangeable
	// 客户
	private CustomerInfo customer;// required,unchangeable
	// 联系人
	private ContactInfo contactPerson;
	// 订单时间
	private String orderTime;// Time when customer placed the order.
	// 到货时间
	private String deliveryTime;// Customer expected latest delivery time.
	// 发货时间
	private String shippingTime;// Expected shipping date and time.
	// 总状态-Possible values:
	// CANCEL-取消,OPEN-未清,CLOSED,DRAFT,WAITING_APPROVAL,APPROVED
	private SalesOrderStatus status;// readonly,The sales order status.
	// 支付状态
	private PaymentStatus paymentStatus;// readonly
	// readonly,number,Total amount copied to invoice. Only displayed in
	// transaction currency.
	private Double invoicedTotal;// 开票总计
	// readonly,number,Total amount is paid for this order. Only displayed in
	// transaction currency.
	private Double paidTotal;// 支付金额
	// 交付方式 - 交付方式不处理实际的发货和库存业务
	private FulfillmentMethod fulfillmentMethod;
	// 支付类型
	private PaymentType paymentType;
	// External or 3rd like amazon channel info.
	private ExternalMerchantInfo extMerchantInfo;
	// 物流公司
	private CarrierInfo carrier;// The carrier.
	// 营销
	private CampaignInfo campaign;// Campaign information.
	// 订单类型分三类：售货、退货和换货。默认订单类型有可能根据退货/发货产品的删除/添加而发生变化。
	private SalesOrderType orderType;// unchangeable,string
	// 促销信息
	private PromotionInfo promotion;
	// 销售员工
	private UserInfo salesEmployee;
	// 交易货币
	private CurrencyInfo currency;// required,Transaction currency.
	// 计价方式:不含税,含税
	private PricingMethod pricingMethod;
	// 总额
	// 产品线和返回线(退货)的总销售额与当地货币。
	// Total sell amount of product line and return line with local currency.
	private Double salesTotal;// readonly,number
	// 不含税总额
	private AmountInfo netTotal;// Net total amount of sales order.
	// 含税总额
	private AmountInfo grossTotal;// Gross total amount of sales order.
	// 税额
	private AmountInfo taxAmount;// Total tax amount of sales order.
	// 产品附加折扣率
	private Double discount;// number,Discount percentage.
	// 产品附加折扣额-不含税
	private AmountInfo netDiscountSum;// Net discount sum.
	// 产品附加折扣额-含税
	private AmountInfo grossDiscountSum;// Gross discount sum.
	// 总重量
	private Double totalWeight;// readonly,number,Total weight.
	// 运费
	// readonly,number,Shipping cost in transaction currency.
	private Double shippingCost;
	// 收货地址
	private AddressInfo shippingAddress;// Shipping address.
	// 发票地址
	private AddressInfo billingAddress;// Billing address.
	// 经办人备注
	private String processorRemark;
	// 客户备注
	private String customerRemark;
	// 毛利润%，毛利率以当地货币计算。
	private Double grossProfitMargin;// readonly,number
	// 毛利润，毛利润以当地货币计算。
	private Double grossProfitAmount;// readonly,number
	// Product line for sales order. Product line is used in sell and exchange
	// orders for delivering products to customers.
	private List<SalesOrderProductLine> productLines;
	// Return line for return order or exchange order. Return line is used in
	// return and exchange orders for receiving returned products from customer.
	private List<SalesOrderReturnLine> returnLines;
	// Shipping line for sales order. Shipping line is used for sell and
	// exchange orders to record shipping fees.
	private List<Map<String, Object>> shippingLines;
	// Detailed tax information.
	private List<TaxDetailedResultInfo> detailedTaxInfo;// readonly
	// The system creation time of the sales order.
	private String creationTime;// readonly,string (date-time)
	// The system update time of the sales order.
	private String updateTime;// readonly,string (date-time)
	// Return reason.Used in return order only.
	private String returnReason;// string
	// 支付条款
	private PaymentTermInfo paymentTerm;// Payment term information.
	// 指示如何计算销售订单
	// Indicate how the sales order is calculated.
	private SalesOrderHeaderCalculationBase headerCalculationBase;
	private UserInfo owner;// readonly,UserInfo,Owner of sales order.
	private UserInfo createdBy;// readonly,UserInfo,Creator of sales order.
	private UserInfo updatedBy;// readonly,UserInfo,Updater of sales order.

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

	public String getExtOrderId() {
		return extOrderId;
	}

	public void setExtOrderId(String extOrderId) {
		this.extOrderId = extOrderId;
	}

	public SalesChannelInfo getChannel() {
		return channel;
	}

	public void setChannel(SalesChannelInfo channel) {
		this.channel = channel;
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

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public String getShippingTime() {
		return shippingTime;
	}

	public void setShippingTime(String shippingTime) {
		this.shippingTime = shippingTime;
	}

	public SalesOrderStatus getStatus() {
		return status;
	}

	public void setStatus(SalesOrderStatus status) {
		this.status = status;
	}

	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Double getInvoicedTotal() {
		return invoicedTotal;
	}

	public void setInvoicedTotal(Double invoicedTotal) {
		this.invoicedTotal = invoicedTotal;
	}

	public Double getPaidTotal() {
		return paidTotal;
	}

	public void setPaidTotal(Double paidTotal) {
		this.paidTotal = paidTotal;
	}

	public FulfillmentMethod getFulfillmentMethod() {
		return fulfillmentMethod;
	}

	public void setFulfillmentMethod(FulfillmentMethod fulfillmentMethod) {
		this.fulfillmentMethod = fulfillmentMethod;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public ExternalMerchantInfo getExtMerchantInfo() {
		return extMerchantInfo;
	}

	public void setExtMerchantInfo(ExternalMerchantInfo extMerchantInfo) {
		this.extMerchantInfo = extMerchantInfo;
	}

	public CarrierInfo getCarrier() {
		return carrier;
	}

	public void setCarrier(CarrierInfo carrier) {
		this.carrier = carrier;
	}

	public CampaignInfo getCampaign() {
		return campaign;
	}

	public void setCampaign(CampaignInfo campaign) {
		this.campaign = campaign;
	}

	public SalesOrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(SalesOrderType orderType) {
		this.orderType = orderType;
	}

	public PromotionInfo getPromotion() {
		return promotion;
	}

	public void setPromotion(PromotionInfo promotion) {
		this.promotion = promotion;
	}

	public UserInfo getSalesEmployee() {
		return salesEmployee;
	}

	public void setSalesEmployee(UserInfo salesEmployee) {
		this.salesEmployee = salesEmployee;
	}

	public CurrencyInfo getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyInfo currency) {
		this.currency = currency;
	}

	public PricingMethod getPricingMethod() {
		return pricingMethod;
	}

	public void setPricingMethod(PricingMethod pricingMethod) {
		this.pricingMethod = pricingMethod;
	}

	public Double getSalesTotal() {
		return salesTotal;
	}

	public void setSalesTotal(Double salesTotal) {
		this.salesTotal = salesTotal;
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

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
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

	public Double getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(Double totalWeight) {
		this.totalWeight = totalWeight;
	}

	public Double getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(Double shippingCost) {
		this.shippingCost = shippingCost;
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

	public String getProcessorRemark() {
		return processorRemark;
	}

	public void setProcessorRemark(String processorRemark) {
		this.processorRemark = processorRemark;
	}

	public String getCustomerRemark() {
		return customerRemark;
	}

	public void setCustomerRemark(String customerRemark) {
		this.customerRemark = customerRemark;
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

	public List<SalesOrderProductLine> getProductLines() {
		return productLines;
	}

	public void setProductLines(List<SalesOrderProductLine> productLines) {
		this.productLines = productLines;
	}

	public List<SalesOrderReturnLine> getReturnLines() {
		return returnLines;
	}

	public void setReturnLines(List<SalesOrderReturnLine> returnLines) {
		this.returnLines = returnLines;
	}

	public List<Map<String, Object>> getShippingLines() {
		return shippingLines;
	}

	public void setShippingLines(List<Map<String, Object>> shippingLines) {
		this.shippingLines = shippingLines;
	}

	public List<TaxDetailedResultInfo> getDetailedTaxInfo() {
		return detailedTaxInfo;
	}

	public void setDetailedTaxInfo(List<TaxDetailedResultInfo> detailedTaxInfo) {
		this.detailedTaxInfo = detailedTaxInfo;
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

	public String getReturnReason() {
		return returnReason;
	}

	public void setReturnReason(String returnReason) {
		this.returnReason = returnReason;
	}

	public PaymentTermInfo getPaymentTerm() {
		return paymentTerm;
	}

	public void setPaymentTerm(PaymentTermInfo paymentTerm) {
		this.paymentTerm = paymentTerm;
	}

	public SalesOrderHeaderCalculationBase getHeaderCalculationBase() {
		return headerCalculationBase;
	}

	public void setHeaderCalculationBase(SalesOrderHeaderCalculationBase headerCalculationBase) {
		this.headerCalculationBase = headerCalculationBase;
	}

	public UserInfo getOwner() {
		return owner;
	}

	public void setOwner(UserInfo owner) {
		this.owner = owner;
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
