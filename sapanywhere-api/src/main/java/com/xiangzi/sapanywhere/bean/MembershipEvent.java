package com.xiangzi.sapanywhere.bean;

import com.xiangzi.sapanywhere.info.DocumentInfo;

/**
 * 会员事件 <br/>
 * 
 * 客户-启用会员-会员事件<br/>
 * 
 * 事件类型: 自动,手动调整(增加积分,扣减积分)等.<br/>
 */
public class MembershipEvent extends BaseBean {

	private String id;// integer (int64),Membership event id.
	// 相关事件/事件类型
	private MembershipEventType type;// readonly,string,Membership event type.
	// 积分(正值增加,负值扣减)
	// Membership point adjusted by the event.
	private int point;// required,unchangeable,integer (int64)
	// 到期日期
	// Membership event expiration date.
	private String expirationDate;// unchangeable,string (date-time)
	// 奖励类型
	private MembershipEventAwardType awardType;
	// 备注
	private String comment;// unchangeable,string,Membership event comment.
	// 相关文档(单据)信息
	private DocumentInfo documentInfo;// readonly,Related document information.

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MembershipEventType getType() {
		return type;
	}

	public void setType(MembershipEventType type) {
		this.type = type;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public MembershipEventAwardType getAwardType() {
		return awardType;
	}

	public void setAwardType(MembershipEventAwardType awardType) {
		this.awardType = awardType;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public DocumentInfo getDocumentInfo() {
		return documentInfo;
	}

	public void setDocumentInfo(DocumentInfo documentInfo) {
		this.documentInfo = documentInfo;
	}

}
