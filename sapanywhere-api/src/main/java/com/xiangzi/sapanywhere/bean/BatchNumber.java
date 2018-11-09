package com.xiangzi.sapanywhere.bean;

import java.util.Map;

import com.xiangzi.sapanywhere.info.SKUInfo;

/**
 * BatchNumber-批次 <br/>
 */
public class BatchNumber extends BaseBean {

	private Map<String, Object> customFields;
	private String id;// integer (int64),Unique identifier
	private SKUInfo sku;
	// 状态
	private BatchNumberStatus status;
	// 批次号
	private String batchCode;// Batch number code.
	// 过期日
	private String expiryTime;// string (date-time),Batch expiry time.
	// 备注
	private String remark;

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

	public SKUInfo getSku() {
		return sku;
	}

	public void setSku(SKUInfo sku) {
		this.sku = sku;
	}

	public BatchNumberStatus getStatus() {
		return status;
	}

	public void setStatus(BatchNumberStatus status) {
		this.status = status;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public String getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(String expiryTime) {
		this.expiryTime = expiryTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
