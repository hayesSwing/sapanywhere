package com.xiangzi.sapanywhere.bean;

import java.util.Map;

import com.xiangzi.sapanywhere.info.CustomerInfo;
import com.xiangzi.sapanywhere.info.LanguageInfo;
import com.xiangzi.sapanywhere.info.UserInfo;

/**
 * 联系人 - ContactPerson <br/>
 */
public class ContactPerson extends BaseBean {

	private Map<String, Object> customFields;
	private String id;
	// 客户
	private CustomerInfo customer;
	// 名
	private String firstName;
	// 姓
	private String lastName;
	// 称谓
	private String title;// 先生,女士,小姐,夫人,教授
	// 职位
	private String position;
	// 手机
	private String mobile;
	// 电话
	private String phone;
	// 传真
	private String fax;
	// 电子邮箱
	private String email;// 不能重复
	// 状态
	private String webSite;// Website.
	// 状态
	private ContactPersonStatus status;
	// 语言
	private LanguageInfo language;
	// 性别
	private Gender gender;
	// 生日
	private String dateOfBirth;// string (date-time)
	// 许可邮件状态
	private MarketingStatus marketingStatus;// required,string
	// 备注
	private String remark;// Remark.
	// Display name.
	private String displayName;// readonly
	// 创建时间
	private String creationTime;// readonly,string (date-time),Creation time.
	// 更新时间
	private String updateTime;// readonly,string (date-time),Update time.
	// 创建者
	private UserInfo createdBy;
	private UserInfo owner;

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

	public CustomerInfo getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerInfo customer) {
		this.customer = customer;
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

	public ContactPersonStatus getStatus() {
		return status;
	}

	public void setStatus(ContactPersonStatus status) {
		this.status = status;
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

	public MarketingStatus getMarketingStatus() {
		return marketingStatus;
	}

	public void setMarketingStatus(MarketingStatus marketingStatus) {
		this.marketingStatus = marketingStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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

	public UserInfo getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(UserInfo createdBy) {
		this.createdBy = createdBy;
	}

	public UserInfo getOwner() {
		return owner;
	}

	public void setOwner(UserInfo owner) {
		this.owner = owner;
	}

}
