package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

/**
 * 营销<br/>
 * 营销-营销
 */
public class Campaign extends BaseBean {

	private Map<String, Object> customFields;
	// 营销编号
	private String id;
	// 名称
	private String name;
	// 描述
	private String description;
	// 类型
	private String type;// string,Campaign types: Email-邮件, Phone-电话, Letter-书信,
						// Social-社交媒体
	// 开始时间
	private String startDate;
	// 结束时间
	private String endDate;
	// 营销状态
	private String status;
	// 营销消息状态
	private String socialStatus;
	// 成本
	private Double costAmount;
	// 社交媒体消息
	// 若事先未绑定社交媒体，首先你需要先找一名高级用户前往业务设置中的公司详细信息，将你的社交媒体账户和SAP Anywhere绑定在一起。
	// 然后你就可以直接在SAP Anywhere里面撰写和编辑消息，并在完成编辑后将这些消息发表在你的社交媒体上。快点击“+”按钮开始体验吧！
	private List<Map<String, Object>> twitterContents;
	private List<Map<String, Object>> facebookContents;
	private List<Map<String, Object>> pinterestContents;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSocialStatus() {
		return socialStatus;
	}

	public void setSocialStatus(String socialStatus) {
		this.socialStatus = socialStatus;
	}

	public Double getCostAmount() {
		return costAmount;
	}

	public void setCostAmount(Double costAmount) {
		this.costAmount = costAmount;
	}

	public List<Map<String, Object>> getTwitterContents() {
		return twitterContents;
	}

	public void setTwitterContents(List<Map<String, Object>> twitterContents) {
		this.twitterContents = twitterContents;
	}

	public List<Map<String, Object>> getFacebookContents() {
		return facebookContents;
	}

	public void setFacebookContents(List<Map<String, Object>> facebookContents) {
		this.facebookContents = facebookContents;
	}

	public List<Map<String, Object>> getPinterestContents() {
		return pinterestContents;
	}

	public void setPinterestContents(List<Map<String, Object>> pinterestContents) {
		this.pinterestContents = pinterestContents;
	}

}
