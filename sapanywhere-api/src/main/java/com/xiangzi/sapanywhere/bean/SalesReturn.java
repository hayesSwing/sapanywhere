package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.AddressInfo;
import com.xiangzi.sapanywhere.info.CustomerInfo;
import com.xiangzi.sapanywhere.info.WarehouseInfo;

/**
 * 销售退货单 <br/>
 */
public class SalesReturn extends BaseBean {

	private Map<String, Object> customFields;
	private String id;// integer (int64),Unique identifier
	// 单据编号
	private String docNumber;// readonly,string,Document number
	// 客户
	private CustomerInfo customer;// readonly
	// 仓库,Warehouse used in the sales return.
	private WarehouseInfo warehouse;// readonly
	// 创建时间,Creation time of the sales return.
	private String creationTime;// readonly,string (date-time)
	// 更新时间,Update time of the sales return.
	private String updateTime;// readonly,string (date-time)
	// 收货地址,Shipping to address of a sales return.
	private AddressInfo shippingAddress;// readonly
	// 发票地址,Billing to address of a sales return.
	private AddressInfo billingAddress;// readonly
	// 备注
	private String remark;// string,Used for recording comments.
	// 产品,Product Lines for a sales return.
	private List<SalesReturnProductLine> lines;// required
	
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

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	public CustomerInfo getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerInfo customer) {
		this.customer = customer;
	}

	public WarehouseInfo getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(WarehouseInfo warehouse) {
		this.warehouse = warehouse;
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

	public AddressInfo getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(AddressInfo shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public AddressInfo getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(AddressInfo billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<SalesReturnProductLine> getLines() {
		return lines;
	}

	public void setLines(List<SalesReturnProductLine> lines) {
		this.lines = lines;
	}

}
