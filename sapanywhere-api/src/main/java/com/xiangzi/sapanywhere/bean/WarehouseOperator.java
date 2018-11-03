package com.xiangzi.sapanywhere.bean;

import com.xiangzi.sapanywhere.info.EmployeeInfo;

/**
 * 库管
 */
public class WarehouseOperator extends BaseBean {

	private String id;
	// Employee as warehouse operator.
	private EmployeeInfo warehouseEmployee;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public EmployeeInfo getWarehouseEmployee() {
		return warehouseEmployee;
	}

	public void setWarehouseEmployee(EmployeeInfo warehouseEmployee) {
		this.warehouseEmployee = warehouseEmployee;
	}
	
}
