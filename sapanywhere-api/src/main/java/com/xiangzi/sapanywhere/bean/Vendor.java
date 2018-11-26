package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 供应商
 */
public class Vendor extends BaseBean {

	private Map<String, Object> customFields;
	private String id;// integer (int64),A unique idendifier
	// 编号
	@JsonProperty("vendorCode")
	private String code;// string,code
	// 名称
	@JsonProperty("vendorName")
	private String name;// string,name
	// 手机
	private String mobile;
	// 座机
	private String phone;
	// 传真
	private String fax;
	// 电子邮箱
	private String email;
	// 网站
	private String webSite;
	// 状态
	private VendorStatus status;
	// 纳税分组
	private TaxGroup taxType;
	// readonly,object[],Vendor address.
	private List<VendorAddressLine> vendorAddressLines;

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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public VendorStatus getStatus() {
		return status;
	}

	public void setStatus(VendorStatus status) {
		this.status = status;
	}

	public TaxGroup getTaxType() {
		return taxType;
	}

	public void setTaxType(TaxGroup taxType) {
		this.taxType = taxType;
	}

	public List<VendorAddressLine> getVendorAddressLines() {
		return vendorAddressLines;
	}

	public void setVendorAddressLines(List<VendorAddressLine> vendorAddressLines) {
		this.vendorAddressLines = vendorAddressLines;
	}

}
