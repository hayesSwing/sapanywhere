package com.xiangzi.sapanywhere.info;

/**
 * External & 3rd Merchant Info
 */
public class ExternalMerchantInfo extends BaseInfo {

	private String shipServiceLevel;
	private String earliestShipTime;
	private String earliestDeliveryTime;
	private String merchantFulfillmentID;
	private String shipperTrackingNumber;

	public String getShipServiceLevel() {
		return shipServiceLevel;
	}

	public void setShipServiceLevel(String shipServiceLevel) {
		this.shipServiceLevel = shipServiceLevel;
	}

	public String getEarliestShipTime() {
		return earliestShipTime;
	}

	public void setEarliestShipTime(String earliestShipTime) {
		this.earliestShipTime = earliestShipTime;
	}

	public String getEarliestDeliveryTime() {
		return earliestDeliveryTime;
	}

	public void setEarliestDeliveryTime(String earliestDeliveryTime) {
		this.earliestDeliveryTime = earliestDeliveryTime;
	}

	public String getMerchantFulfillmentID() {
		return merchantFulfillmentID;
	}

	public void setMerchantFulfillmentID(String merchantFulfillmentID) {
		this.merchantFulfillmentID = merchantFulfillmentID;
	}

	public String getShipperTrackingNumber() {
		return shipperTrackingNumber;
	}

	public void setShipperTrackingNumber(String shipperTrackingNumber) {
		this.shipperTrackingNumber = shipperTrackingNumber;
	}
	
}
