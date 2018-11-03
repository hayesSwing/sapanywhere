package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.AddressInfo;

/**
 * 仓库
 */
public class Warehouse extends BaseBean {

	private Map<String, Object> customFields;
	private String id;
	// 编号
	private String code;
	// 名称
	private String name;
	// 状态
	private WarehouseStatus status;
	// 传真
	private String fax;
	// 电子邮箱
	private String email;
	// 地址
	private AddressInfo address;
	// boolean,To indicate if a warehouse is a default one.
	// 默认仓库
	private Boolean isDefaultWarehouse;
	// Operators of a warehouse.
	// 库管
	private List<WarehouseOperator> warehouseOperators;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WarehouseStatus getStatus() {
		return status;
	}

	public void setStatus(WarehouseStatus status) {
		this.status = status;
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

	public AddressInfo getAddress() {
		return address;
	}

	public void setAddress(AddressInfo address) {
		this.address = address;
	}

	public Boolean getIsDefaultWarehouse() {
		return isDefaultWarehouse;
	}

	public void setIsDefaultWarehouse(Boolean isDefaultWarehouse) {
		this.isDefaultWarehouse = isDefaultWarehouse;
	}

	public List<WarehouseOperator> getWarehouseOperators() {
		return warehouseOperators;
	}

	public void setWarehouseOperators(List<WarehouseOperator> warehouseOperators) {
		this.warehouseOperators = warehouseOperators;
	}
	
}
