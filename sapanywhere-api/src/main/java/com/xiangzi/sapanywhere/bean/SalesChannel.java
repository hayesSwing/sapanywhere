package com.xiangzi.sapanywhere.bean;

import java.util.List;

/**
 * 销售渠道
 */
public class SalesChannel extends BaseBean {

	private String id;
	// 名称
	private String name;
	// 状态
	private SalesChannelStatus status;
	// 渠道类型
	private SalesChannelType type;
	// 默认渠道
	private Boolean isDefault;
	// 仓库
	private List<ChannelWarehouseLine> warehouses;

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

	public SalesChannelStatus getStatus() {
		return status;
	}

	public void setStatus(SalesChannelStatus status) {
		this.status = status;
	}

	public SalesChannelType getType() {
		return type;
	}

	public void setType(SalesChannelType type) {
		this.type = type;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	public List<ChannelWarehouseLine> getWarehouses() {
		return warehouses;
	}

	public void setWarehouses(List<ChannelWarehouseLine> warehouses) {
		this.warehouses = warehouses;
	}
	
}
