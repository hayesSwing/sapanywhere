package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.AddressInfo;
import com.xiangzi.sapanywhere.info.CarrierInfo;
import com.xiangzi.sapanywhere.info.CustomerInfo;
import com.xiangzi.sapanywhere.info.WarehouseInfo;

/**
 * 销售发货单 <br/>
 */
public class SalesDelivery extends BaseBean {

	private Map<String, Object> customFields;
	private String id;// Unique identifier for a sales delivery.
	// 单据编号
	private String docNumber;// Document number for a sales delivery.
	// 状态
	private SalesDeliveryStatus status;// Delivery status.
	// 客户
	private CustomerInfo customer;// unchangeable
	// 仓库
	private WarehouseInfo warehouse;// unchangeable
	// Shipping to address of a sales delivery.
	// 收货地址
	private AddressInfo shippingAddress;
	// Creation time of the sales delivery.
	private String creationTime;// readonly,string (date-time)
	// Update time of the sales delivery.
	private String updateTime;// readonly,string (date-time)
	// Actual time when products are shipped from warehouse.
	// 货物从仓库发货的时间，系统会将发货的实际系统时间自动填入。
	// 实际发货时间
	private String shippingTime;// readonly,string (date-time)
	// Earliest time when products should be shipped to customer.
	// 最早发货时间
	private String earliestShippingTime;// string (date-time)
	// 最后发货时间
	private String latestShippingTime;
	// 记录客户期望的最迟送达时间，作为准备发货的参考。
	// 最早到货时间
	private String earliestDeliveryTime;
	// 到货时间
	private String latestDeliveryTime;
	// 物流公司
	private CarrierInfo carrier;// Carrier info for a sales delivery.
	// 物流单号指的是此次发货包裹所用的物流单号。记录物流单号用以跟踪发出包裹的物流状态。
	// 物流单号
	private String trackingNumber;
	// 备注
	private String remark;
	// required,Product Lines for a sales delivery.
	private List<SalesDeliveryProductLine> lines;

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

	public SalesDeliveryStatus getStatus() {
		return status;
	}

	public void setStatus(SalesDeliveryStatus status) {
		this.status = status;
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

	public AddressInfo getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(AddressInfo shippingAddress) {
		this.shippingAddress = shippingAddress;
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

	public String getShippingTime() {
		return shippingTime;
	}

	public void setShippingTime(String shippingTime) {
		this.shippingTime = shippingTime;
	}

	public String getEarliestShippingTime() {
		return earliestShippingTime;
	}

	public void setEarliestShippingTime(String earliestShippingTime) {
		this.earliestShippingTime = earliestShippingTime;
	}

	public String getLatestShippingTime() {
		return latestShippingTime;
	}

	public void setLatestShippingTime(String latestShippingTime) {
		this.latestShippingTime = latestShippingTime;
	}

	public String getEarliestDeliveryTime() {
		return earliestDeliveryTime;
	}

	public void setEarliestDeliveryTime(String earliestDeliveryTime) {
		this.earliestDeliveryTime = earliestDeliveryTime;
	}

	public String getLatestDeliveryTime() {
		return latestDeliveryTime;
	}

	public void setLatestDeliveryTime(String latestDeliveryTime) {
		this.latestDeliveryTime = latestDeliveryTime;
	}

	public CarrierInfo getCarrier() {
		return carrier;
	}

	public void setCarrier(CarrierInfo carrier) {
		this.carrier = carrier;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<SalesDeliveryProductLine> getLines() {
		return lines;
	}

	public void setLines(List<SalesDeliveryProductLine> lines) {
		this.lines = lines;
	}

}
