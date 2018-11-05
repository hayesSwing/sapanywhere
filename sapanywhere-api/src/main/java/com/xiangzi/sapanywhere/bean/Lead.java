package com.xiangzi.sapanywhere.bean;

import java.util.Map;

import com.xiangzi.sapanywhere.info.AddressInfo;
import com.xiangzi.sapanywhere.info.CampaignInfo;
import com.xiangzi.sapanywhere.info.SalesReasonInfo;
import com.xiangzi.sapanywhere.info.SalesSourceInfo;

/**
 * 销售线索 - Lead <br/>
 */
public class Lead extends BaseBean {

	private Map<String, Object> customFields;
	// 编号
	private String id;// integer (int64),Unique identifier
	// 描述
	private String description;
	// 资格
	// Lead Qualification: cold-可能性低, warm-可能性较高, hot-可能性高.
	private LeadQualification qualification;
	// 状态
	private LeadStatus status;
	// 客户/联系人 - Code
	// Id of related customer / contact person.
	private String relatedCode;
	// 客户/联系人 - Name
	// Name of related customer / contact person.
	private String relatedName;
	// 客户/联系人 - Type
	// Possible values: CUSTOMER,CONTACT,FREETEXT
	private String relatedType;
	// 电话
	private String phone;
	// 手机
	private String mobile;
	// 电子邮件
	private String email;
	// 备注
	private String processorRemark;
	//
	private String externalSource;
	// 地址信息
	private AddressInfo address;
	// 来源
	private SalesSourceInfo salesSource;
	// 原因
	private SalesReasonInfo salesReason;
	// 营销
	private CampaignInfo campaign;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LeadQualification getQualification() {
		return qualification;
	}

	public void setQualification(LeadQualification qualification) {
		this.qualification = qualification;
	}

	public LeadStatus getStatus() {
		return status;
	}

	public void setStatus(LeadStatus status) {
		this.status = status;
	}

	public String getRelatedCode() {
		return relatedCode;
	}

	public void setRelatedCode(String relatedCode) {
		this.relatedCode = relatedCode;
	}

	public String getRelatedName() {
		return relatedName;
	}

	public void setRelatedName(String relatedName) {
		this.relatedName = relatedName;
	}

	public String getRelatedType() {
		return relatedType;
	}

	public void setRelatedType(String relatedType) {
		this.relatedType = relatedType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProcessorRemark() {
		return processorRemark;
	}

	public void setProcessorRemark(String processorRemark) {
		this.processorRemark = processorRemark;
	}

	public String getExternalSource() {
		return externalSource;
	}

	public void setExternalSource(String externalSource) {
		this.externalSource = externalSource;
	}

	public AddressInfo getAddress() {
		return address;
	}

	public void setAddress(AddressInfo address) {
		this.address = address;
	}

	public SalesSourceInfo getSalesSource() {
		return salesSource;
	}

	public void setSalesSource(SalesSourceInfo salesSource) {
		this.salesSource = salesSource;
	}

	public SalesReasonInfo getSalesReason() {
		return salesReason;
	}

	public void setSalesReason(SalesReasonInfo salesReason) {
		this.salesReason = salesReason;
	}

	public CampaignInfo getCampaign() {
		return campaign;
	}

	public void setCampaign(CampaignInfo campaign) {
		this.campaign = campaign;
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
