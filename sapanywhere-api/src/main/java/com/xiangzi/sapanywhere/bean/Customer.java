package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xiangzi.sapanywhere.info.LanguageInfo;
import com.xiangzi.sapanywhere.info.MembershipLevelInfo;
import com.xiangzi.sapanywhere.info.UserInfo;

/**
 * 客户
 * 
 * @author Zhang ShuXiang
 *
 */
public class Customer extends BaseBean {

	private Map<String, Object> customFields;
	private String id;// integer (int64),Unique identifier
	// 客户编号
	@JsonProperty("customerCode")
	private String code;// string,customerCode,Unique code
	// 客户类型
	@JsonProperty("customerType")
	private CustomerType type;
	// 公司名称,Corporate name of the customer.
	@JsonProperty("customerName")
	private String corporateName;// string,customerName
	// 名
	private String firstName;
	// 姓
	private String lastName;
	private String displayName;// readonly
	// 会员卡号
	private String membershipNo;
	// 增值税号
	private String vatRegistrationNumber;
	// 称谓
	// mr-先生;ms-女士;miss-小姐;mrs-夫人;dr-教授;
	// valid values,Title. Only used for individual type customer.
	private String title;
	// 职位
	// valid values,Position. Only used for individual type customer.
	private String position;
	// integer (int64),Main contact person for the customer. Only used for
	// corporate type customer.
	// 主要联系人ID
	private Integer mainContactId;
	// 阶段,Possible values: SUSPECT-潜在客户,PROSPECT-目标客户,CUSTOMER-现有客户
	private CustomerStage stage;// required,string,Stage of the customer.
	// 手机
	// string,Mobile. Only used for individual typecustomer.
	private String mobile;
	// 电话
	private String phone;
	// 传真
	private String fax;
	// 电子邮箱
	private String email;// 不能重复
	// 网址
	private String webSite;// Website.
	// owner
	private UserInfo owner;
	// 创建者
	private UserInfo createdBy;
	// 更新者
	private UserInfo updatedBy;
	// required string,Status of the customer: active, inactive, duplicated.
	// Cannot create or update the duplicated customer.
	// Possible values: ACTIVE-可用,INACTIVE-不可用,DUPLICATED
	// 状态
	private CustomerStatus status;
	// 备注
	private String remark;
	// 信用额度
	// 客户在一定时期可以赊购商品的最大限额。你可以在"审批流程设置"中启用“信用额度检查”来判断并决定客户的销售订单是否需要审批。否则，该字段仅限参考。
	private Double creditLimit;
	// 信用限额阈值
	private Double creditLimitThreshold;
	// 语言
	private LanguageInfo language;
	// 性别
	private Gender gender;
	// 生日
	private String dateOfBirth;// string (date-time)
	// Date of last marketing campaign.
	private String lastMarketingCampaign;
	// 许可邮件状态
	private MarketingStatus marketingStatus;// required,string
	// 纳税分组
	private TaxGroup taxType;
	// 创建时间
	private String creationTime;
	// 更新时间
	private String updateTime;
	// 启用会员,一旦你取消启用会员功能，所有该客户的会员事件和数据都将被清空，继续取消启用吗？
	// Membership enablement switch.
	private Boolean membershipEnabled;// readonly
	// 会员可用积分
	private Double membershipBalance;
	// 会员等级
	private MembershipLevelInfo membershipLevelInfo;
	// 价格列表
	// Customer price list.
	private List<Map<String, Object>> customerPriceListLines;
	// 地址
	// Customer address.
	private List<Map<String, Object>> customerAddressLines;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public CustomerType getType() {
		return type;
	}

	public void setType(CustomerType type) {
		this.type = type;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getMembershipNo() {
		return membershipNo;
	}

	public void setMembershipNo(String membershipNo) {
		this.membershipNo = membershipNo;
	}

	public String getVatRegistrationNumber() {
		return vatRegistrationNumber;
	}

	public void setVatRegistrationNumber(String vatRegistrationNumber) {
		this.vatRegistrationNumber = vatRegistrationNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getMainContactId() {
		return mainContactId;
	}

	public void setMainContactId(Integer mainContactId) {
		this.mainContactId = mainContactId;
	}

	public CustomerStage getStage() {
		return stage;
	}

	public void setStage(CustomerStage stage) {
		this.stage = stage;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
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

	public CustomerStatus getStatus() {
		return status;
	}

	public void setStatus(CustomerStatus status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Double getCreditLimitThreshold() {
		return creditLimitThreshold;
	}

	public void setCreditLimitThreshold(Double creditLimitThreshold) {
		this.creditLimitThreshold = creditLimitThreshold;
	}

	public LanguageInfo getLanguage() {
		return language;
	}

	public void setLanguage(LanguageInfo language) {
		this.language = language;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getLastMarketingCampaign() {
		return lastMarketingCampaign;
	}

	public void setLastMarketingCampaign(String lastMarketingCampaign) {
		this.lastMarketingCampaign = lastMarketingCampaign;
	}

	public MarketingStatus getMarketingStatus() {
		return marketingStatus;
	}

	public void setMarketingStatus(MarketingStatus marketingStatus) {
		this.marketingStatus = marketingStatus;
	}

	public TaxGroup getTaxType() {
		return taxType;
	}

	public void setTaxType(TaxGroup taxType) {
		this.taxType = taxType;
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

	public Boolean getMembershipEnabled() {
		return membershipEnabled;
	}

	public void setMembershipEnabled(Boolean membershipEnabled) {
		this.membershipEnabled = membershipEnabled;
	}

	public Double getMembershipBalance() {
		return membershipBalance;
	}

	public void setMembershipBalance(Double membershipBalance) {
		this.membershipBalance = membershipBalance;
	}

	public MembershipLevelInfo getMembershipLevelInfo() {
		return membershipLevelInfo;
	}

	public void setMembershipLevelInfo(MembershipLevelInfo membershipLevelInfo) {
		this.membershipLevelInfo = membershipLevelInfo;
	}

	public List<Map<String, Object>> getCustomerPriceListLines() {
		return customerPriceListLines;
	}

	public void setCustomerPriceListLines(List<Map<String, Object>> customerPriceListLines) {
		this.customerPriceListLines = customerPriceListLines;
	}

	public List<Map<String, Object>> getCustomerAddressLines() {
		return customerAddressLines;
	}

	public void setCustomerAddressLines(List<Map<String, Object>> customerAddressLines) {
		this.customerAddressLines = customerAddressLines;
	}

}
