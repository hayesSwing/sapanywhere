package com.xiangzi.sapanywhere.bean;

import com.xiangzi.sapanywhere.info.AddressInfo;

public class VendorAddressLine extends BaseBean {

	private String id;
	private AddressInfo address;
	// Whether the address is the default billing address of the vendor.
	// 该地址是否为供应商的默认帐单地址。
	private Boolean defaultBillingAddress;// 默认发票地址
	// Whether the address is the default shipping address of the vendor.
	// 地址是否是供应商的默认送货地址。
	private Boolean defaultShippingAddress;// 默认发货地址

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AddressInfo getAddress() {
		return address;
	}

	public void setAddress(AddressInfo address) {
		this.address = address;
	}

	public Boolean getDefaultBillingAddress() {
		return defaultBillingAddress;
	}

	public void setDefaultBillingAddress(Boolean defaultBillingAddress) {
		this.defaultBillingAddress = defaultBillingAddress;
	}

	public Boolean getDefaultShippingAddress() {
		return defaultShippingAddress;
	}

	public void setDefaultShippingAddress(Boolean defaultShippingAddress) {
		this.defaultShippingAddress = defaultShippingAddress;
	}

}
