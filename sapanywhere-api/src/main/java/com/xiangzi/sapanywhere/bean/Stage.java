package com.xiangzi.sapanywhere.bean;

/**
 * 阶段<br/>
 * 设置-客户关系管理-销售机会-阶段
 */
public class Stage extends BaseBean {

	private String id;
	private String name;// 阶段名称
	private String stageNo;// 阶段编号
	private String closingPercentage;// 进度 %
	// 销售机会在某特定阶段停留的最大天数。
	private String maximumDays;// 阶段天数不应超过
	// 每个阶段的最佳销售机会数量。在销售机会漏斗这张报表里，你可以看到销售机会实际数量和最佳数量之间的对比分析。
	private String opportunityNumber;// 销售机会最佳数量
	private StageStatus status;// 状态
	
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

	public String getStageNo() {
		return stageNo;
	}

	public void setStageNo(String stageNo) {
		this.stageNo = stageNo;
	}

	public String getClosingPercentage() {
		return closingPercentage;
	}

	public void setClosingPercentage(String closingPercentage) {
		this.closingPercentage = closingPercentage;
	}

	public String getMaximumDays() {
		return maximumDays;
	}

	public void setMaximumDays(String maximumDays) {
		this.maximumDays = maximumDays;
	}

	public String getOpportunityNumber() {
		return opportunityNumber;
	}

	public void setOpportunityNumber(String opportunityNumber) {
		this.opportunityNumber = opportunityNumber;
	}

	public StageStatus getStatus() {
		return status;
	}

	public void setStatus(StageStatus status) {
		this.status = status;
	}

}

