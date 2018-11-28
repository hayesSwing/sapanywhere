package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.AmountInfo;
import com.xiangzi.sapanywhere.info.ContactInfo;
import com.xiangzi.sapanywhere.info.CurrencyInfo;
import com.xiangzi.sapanywhere.info.CustomerInfo;
import com.xiangzi.sapanywhere.info.UserInfo;

/**
 * 收付款单
 */
public class Payment extends BaseBean {

	private Map<String, Object> customFields;
	private String id;// integer (int64),Unique identifier
	// 单据编号
	private String docNumber;// Document number
	// 汇率
	private Double exchangeRate;// Document rate
	// 单据状态
	private PaymentDocStatus status;// readonly,Payment status.
	// 客户
	private CustomerInfo customer;// required unchangeable,Customer
	// 联系人
	private ContactInfo contactPerson;// Refer to the contact person of payment.
	// 参考编号,外部支付系统中产生的交易号
	// string,Tracking number of external payments.
	private String referenceNumber;
	// required unchangeable,string (date-time),
	// Posting date of payment document.
	private String postingTime;// 过账时间
	// readonly,string (date-time),Creation time of payment.
	// 创建时间
	private String creationTime;
	// readonly,string (date-time),Update time of payment.
	// 更新时间
	private String updateTime;
	// readonly,AmountInfo,Total amount of payment document.
	private AmountInfo amount;
	// 汇率差
	private Double rateDifference;// readonly
	// 备注
	private String remark;// string,User comments of a payment.
	// 交易货币
	private CurrencyInfo currency;
	// 是否已退款
	private Boolean refunded;// boolean,Refund status.
	// 退款错误
	private String refundError;// readonly,string,Refund error message.
	// 退款流水单号,readonly,string,Refund transaction number.
	private String refundTransactionNumber;
	// Detail information of a payment.
	private List<PaymentLine> paymentLines;// required,unchangeable
	// Payment methods used for a payment. Payment method information is
	// required when the amount of a payment is not zero.
	// 用于付款的付款方式。 当付款金额不为零时，需要付款方式信息。
	private List<PaymentMethodLine> paymentMethodLines;
	// 创建者
	private UserInfo createdBy;// readonly,UserInfo,Creator of payment.
	// 更新者
	private UserInfo updatedBy;// readonly,UserInfo,Updater of payment.

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

	public PaymentDocStatus getStatus() {
		return status;
	}

	public void setStatus(PaymentDocStatus status) {
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

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getPostingTime() {
		return postingTime;
	}

	public void setPostingTime(String postingTime) {
		this.postingTime = postingTime;
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

	public AmountInfo getAmount() {
		return amount;
	}

	public void setAmount(AmountInfo amount) {
		this.amount = amount;
	}

	public Double getRateDifference() {
		return rateDifference;
	}

	public void setRateDifference(Double rateDifference) {
		this.rateDifference = rateDifference;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public CurrencyInfo getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyInfo currency) {
		this.currency = currency;
	}

	public Boolean getRefunded() {
		return refunded;
	}

	public void setRefunded(Boolean refunded) {
		this.refunded = refunded;
	}

	public String getRefundError() {
		return refundError;
	}

	public void setRefundError(String refundError) {
		this.refundError = refundError;
	}

	public String getRefundTransactionNumber() {
		return refundTransactionNumber;
	}

	public void setRefundTransactionNumber(String refundTransactionNumber) {
		this.refundTransactionNumber = refundTransactionNumber;
	}

	public List<PaymentLine> getPaymentLines() {
		return paymentLines;
	}

	public void setPaymentLines(List<PaymentLine> paymentLines) {
		this.paymentLines = paymentLines;
	}

	public List<PaymentMethodLine> getPaymentMethodLines() {
		return paymentMethodLines;
	}

	public void setPaymentMethodLines(List<PaymentMethodLine> paymentMethodLines) {
		this.paymentMethodLines = paymentMethodLines;
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
