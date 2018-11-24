package com.xiangzi.sapanywhere.bean;

/**
 * 会员等级 <br/>
 * 设置-客户关系管理-客户忠诚度管理-会员等级设置
 */
public class MembershipLevel extends BaseBean {

	private String id;
	private String name;
	private Integer minimumPoints;// 最低积分要求
	private MembershipLevelStatus status;

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

	public Integer getMinimumPoints() {
		return minimumPoints;
	}

	public void setMinimumPoints(Integer minimumPoints) {
		this.minimumPoints = minimumPoints;
	}

	public MembershipLevelStatus getStatus() {
		return status;
	}

	public void setStatus(MembershipLevelStatus status) {
		this.status = status;
	}
	
}
