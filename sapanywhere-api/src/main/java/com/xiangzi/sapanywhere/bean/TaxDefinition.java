package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

/**
 * TaxDefinition-计税规则 </br>
 * 设置-初始设置-税-税/计税规则
 */
public class TaxDefinition extends BaseBean {

	private Map<String, Object> customFields;
	private String id;
	// 名称
	private String name;
	// 类别
	private TaxDocumentType type;
	// 国家/地区
	private String countryCode;
	// 省（直辖市）
	private String stateCode;
	// 省（直辖市）名称
	private String state;
	// 市
	private String cityName;
	// 邮编
	private String zipCode;
	// 适用于
	private TaxValidFor validFor;
	// 产品纳税类别
	private ProductTaxClass productTaxClass;
	private TaxGroup taxBusinessPartnerGroup;// 纳税分组
	// 税率
	private List<TaxRate> taxRates;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TaxDocumentType getType() {
		return type;
	}

	public void setType(TaxDocumentType type) {
		this.type = type;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public TaxValidFor getValidFor() {
		return validFor;
	}

	public void setValidFor(TaxValidFor validFor) {
		this.validFor = validFor;
	}

	public ProductTaxClass getProductTaxClass() {
		return productTaxClass;
	}

	public void setProductTaxClass(ProductTaxClass productTaxClass) {
		this.productTaxClass = productTaxClass;
	}

	public TaxGroup getTaxBusinessPartnerGroup() {
		return taxBusinessPartnerGroup;
	}

	public void setTaxBusinessPartnerGroup(TaxGroup taxBusinessPartnerGroup) {
		this.taxBusinessPartnerGroup = taxBusinessPartnerGroup;
	}

	public List<TaxRate> getTaxRates() {
		return taxRates;
	}

	public void setTaxRates(List<TaxRate> taxRates) {
		this.taxRates = taxRates;
	}
	
}
