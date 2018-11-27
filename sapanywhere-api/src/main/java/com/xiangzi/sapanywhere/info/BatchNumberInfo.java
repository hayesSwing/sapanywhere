package com.xiangzi.sapanywhere.info;

import com.xiangzi.sapanywhere.bean.BatchNumberStatus;

/**
 * Batch Number
 */
public class BatchNumberInfo extends BaseInfo {

	private String id;// integer (int64),Batch number id.
	// 批次号
	private String batchCode;// Batch code.
	// 状态
	private BatchNumberStatus status;// Batch status.
	// 过期日
	private String expiryTime;// string (date-time),Batch expiry time.
	// 备注
	private String remark;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public BatchNumberStatus getStatus() {
		return status;
	}

	public void setStatus(BatchNumberStatus status) {
		this.status = status;
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
