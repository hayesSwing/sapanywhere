package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.SKUUomBarCodeInfo;
import com.xiangzi.sapanywhere.info.VariantValueInfo;

/**
 * SKU
 * 单品即SKU，可进行库存管理的最小单元，可根据产品不同的属性进行单品管理。如同一产品有多色系，多口味，多尺寸等等，就可以使用单品功能。
 */
public class SKU extends BaseBean {

	private Map<String, Object> customFields;
	private String id;// readonly,integer (int64),A unique idendifier
	// 编号
	private String code;// string,code
	// 名称
	private String name;
	// 状态
	private SKUStatus status;
	// 不含税采购价格
	private Double netPurchasePrice;
	// 含税采购价格
	private Double grossPurchasePrice;
	// 重量
	private Double weight;
	// 长度
	private Double length;
	// 高度
	private Double height;
	// 宽度
	private Double width;
	private String model;// string,SKU model
	// 是否组合产品
	// readonly,boolean,SKU bundle status indicator
	private Boolean bundleEnabled;
	// SKU相关产品
	private Product product;
	// SKU uom bar codes
	private List<SKUUomBarCodeInfo> uomBarCodes;
	// SKU variantValue ids
	private List<VariantValueInfo> relatedVariantValues;
	private String creationTime;// readonly,string (date-time),Creation time
	private String updateTime;// readonly,string (date-time),Update time

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

	public SKUStatus getStatus() {
		return status;
	}

	public void setStatus(SKUStatus status) {
		this.status = status;
	}

	public Double getNetPurchasePrice() {
		return netPurchasePrice;
	}

	public void setNetPurchasePrice(Double netPurchasePrice) {
		this.netPurchasePrice = netPurchasePrice;
	}

	public Double getGrossPurchasePrice() {
		return grossPurchasePrice;
	}

	public void setGrossPurchasePrice(Double grossPurchasePrice) {
		this.grossPurchasePrice = grossPurchasePrice;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Boolean getBundleEnabled() {
		return bundleEnabled;
	}

	public void setBundleEnabled(Boolean bundleEnabled) {
		this.bundleEnabled = bundleEnabled;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<SKUUomBarCodeInfo> getUomBarCodes() {
		return uomBarCodes;
	}

	public void setUomBarCodes(List<SKUUomBarCodeInfo> uomBarCodes) {
		this.uomBarCodes = uomBarCodes;
	}

	public List<VariantValueInfo> getRelatedVariantValues() {
		return relatedVariantValues;
	}

	public void setRelatedVariantValues(List<VariantValueInfo> relatedVariantValues) {
		this.relatedVariantValues = relatedVariantValues;
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
	
}
