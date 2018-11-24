package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.AmountInfo;
import com.xiangzi.sapanywhere.info.CurrencyInfo;
import com.xiangzi.sapanywhere.info.CustomerInfo;
import com.xiangzi.sapanywhere.info.SalesChannelInfo;
import com.xiangzi.sapanywhere.info.UserInfo;

/**
 * 销售机会
 */
public class Opportunity extends BaseBean {

	private Map<String, Object> customFields;
	// 单据号
	private String id;
	// 销售渠道
	private SalesChannelInfo channel;
	// 客户
	private CustomerInfo customer;
	// 描述
	private String description;
	// 阶段
	private Stage stage;
	// 状态
	private OpportunityStatus status;
	// 原因
	private SalesReason salesReason;
	// 起始日期
	private String startDate;
	// 预计结束日期
	private String predictedClosingDate;
	// 预估金额
	// 你可以选择直接填入一个预估金额，或选择在机会中添加产品，产品的总金额也会随后自动更新在这一栏。
	private AmountInfo potentialAmount;
	// 加权金额
	// 它指的是销售机会的加权销售收入额，计算方式是预估金额×销售进度。
	private AmountInfo weightedAmount;
	// 进度
	private Double closingPercentage;
	// 来源
	private SalesSource salesSource;
	// 备注
	private String remarks;
	// 附加折扣
	private Double discountPercent;
	// object[],Product Lines for opportunity.,(OpportunityLine)
	private List<Map<String, Object>> opportunityLines;
	// 交易货币
	private CurrencyInfo currency;// required
	// 汇率
	private Double exchangeRate;
	// owner
	private UserInfo owner;
	// 创建者
	private UserInfo createdBy;
	// 更新者
	private UserInfo updatedBy;
	// 创建时间
	private String creationTime;
	// 更新时间
	private String updateTime;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public OpportunityStatus getStatus() {
		return status;
	}

	public void setStatus(OpportunityStatus status) {
		this.status = status;
	}

	public SalesReason getSalesReason() {
		return salesReason;
	}

	public void setSalesReason(SalesReason salesReason) {
		this.salesReason = salesReason;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getPredictedClosingDate() {
		return predictedClosingDate;
	}

	public void setPredictedClosingDate(String predictedClosingDate) {
		this.predictedClosingDate = predictedClosingDate;
	}

	public AmountInfo getPotentialAmount() {
		return potentialAmount;
	}

	public void setPotentialAmount(AmountInfo potentialAmount) {
		this.potentialAmount = potentialAmount;
	}

	public AmountInfo getWeightedAmount() {
		return weightedAmount;
	}

	public void setWeightedAmount(AmountInfo weightedAmount) {
		this.weightedAmount = weightedAmount;
	}

	public Double getClosingPercentage() {
		return closingPercentage;
	}

	public void setClosingPercentage(Double closingPercentage) {
		this.closingPercentage = closingPercentage;
	}

	public SalesSource getSalesSource() {
		return salesSource;
	}

	public void setSalesSource(SalesSource salesSource) {
		this.salesSource = salesSource;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(Double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public List<Map<String, Object>> getOpportunityLines() {
		return opportunityLines;
	}

	public void setOpportunityLines(List<Map<String, Object>> opportunityLines) {
		this.opportunityLines = opportunityLines;
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

}
