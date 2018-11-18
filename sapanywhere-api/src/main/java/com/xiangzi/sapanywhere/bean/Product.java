package com.xiangzi.sapanywhere.bean;

import java.util.List;
import java.util.Map;

import com.xiangzi.sapanywhere.info.BrandInfo;
import com.xiangzi.sapanywhere.info.ManufacturerInfo;
import com.xiangzi.sapanywhere.info.ProductCategoryInfo;
import com.xiangzi.sapanywhere.info.SKUInfo;
import com.xiangzi.sapanywhere.info.UoMInfo;
import com.xiangzi.sapanywhere.info.UomGroupInfo;
import com.xiangzi.sapanywhere.info.VendorInfo;

/**
 * 产品
 */
public class Product extends BaseBean {

	private Map<String, Object> customFields;
	private String id;// readonly,integer (int64),A unique idendifier
	// 产品编号
	private String code;// string,code
	// 产品名称
	private String name;// string,name
	// 产品类别
	private ProductCategoryInfo category;
	// Product type
	// 批次管理-无/批次管理
	private ProductType batchSerial;
	// 保质期 integer (int32),Shelf life
	private Integer shelfLife;
	// 提前警告天数 integer (int32),Alert days before expiry
	// 提前警告天数必须在1到保质天数之间。
	private Integer alertDaysBeforeExpiry;
	// 产品纳税类别 ProductTaxClass,Product tax class
	private ProductTaxClass productTaxClass;
	// 状态
	private ProductStatus status;
	// 重量
	private Double weight;// number,Product Weight
	// 长度
	private Double length;// number,Product Length
	// 高度
	private Double height;// number,Product height
	// 宽度
	private Double width;// number,Product width
	// 重量单位
	private Integer weightUnitId;// integer (int64),Weight Unit
	// 长度单位
	private Integer lengthUnitId;// integer (int64),Length Unit
	// string,Taas Tax Class[Possible values:Standard,P20,P50,P80,G,H,I,K,M]
	private String taaSProductTaxClass;
	// 若选择允许预售，则库存不足时，网店仍允许客户下单。
	// 允许预售
	private Boolean backOrderAllowed;// boolean,Product allow back order
	// 选择允许供应商直送，则根据客户订单生成采购订单时，系统优先选择供应商直送的发货方式。
	// 允许供应商直送
	private Boolean dropShipAllowed;// boolean,Product allow dropship
	// 制造商
	private ManufacturerInfo manufacturer;// Product manufacturer
	// 品牌
	private BrandInfo brand;// Product brand
	// 在库存补货或者根据销售订单生成采购订单时，系统优先选择首选供应商。
	// 首选供应商
	private VendorInfo vendor;// Product vendor
	// readonly,boolean,enable adding SKUs for product
	// 如果你需要管理产品属性（如颜色，尺寸等），在创建产品时请启用该功能，并为产品创建相应的单品。
	// 请注意，如果出现以下任一情况，则无法更改该设置：1.产品在或曾在库存或物流中使用。2. 产品在或曾在销售渠道中上架。
	// 启用单品
	private Boolean variantEnabled;
	// readonly,boolean,enable inventory for product
	// 在创建产品时请启用该功能来查看详细的库存状态。一旦产品在库存或物流中使用，将无法更改该设置。
	// 启用库存跟踪
	private Boolean inventoryEnabled;
	// readonly,boolean,indicate a product image is uploaded
	private Boolean imageUploaded;
	// 默认销售计量单位
	private UoMInfo salesUom;// Default UoM of sales order
	// 默认采购计量单位
	private UoMInfo purchaseUom;// Default UoM of purchase order
	// 库存计量单位
	private UoMInfo inventoryUom;// Inventory UoM
	// 计量单位组
	private UomGroupInfo productUomGroup;
	// ProductImageBasicInfo,main image id of the product
	private Map<String, Object> mainImage;
	// SKUs for product
	private List<SKUInfo> skus;
	private List<ProductAttribute> attributes;// Product attributes
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

	public ProductCategoryInfo getCategory() {
		return category;
	}

	public void setCategory(ProductCategoryInfo category) {
		this.category = category;
	}

	public ProductType getBatchSerial() {
		return batchSerial;
	}

	public void setBatchSerial(ProductType batchSerial) {
		this.batchSerial = batchSerial;
	}

	public Integer getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(Integer shelfLife) {
		this.shelfLife = shelfLife;
	}

	public Integer getAlertDaysBeforeExpiry() {
		return alertDaysBeforeExpiry;
	}

	public void setAlertDaysBeforeExpiry(Integer alertDaysBeforeExpiry) {
		this.alertDaysBeforeExpiry = alertDaysBeforeExpiry;
	}

	public ProductTaxClass getProductTaxClass() {
		return productTaxClass;
	}

	public void setProductTaxClass(ProductTaxClass productTaxClass) {
		this.productTaxClass = productTaxClass;
	}

	public ProductStatus getStatus() {
		return status;
	}

	public void setStatus(ProductStatus status) {
		this.status = status;
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

	public Integer getWeightUnitId() {
		return weightUnitId;
	}

	public void setWeightUnitId(Integer weightUnitId) {
		this.weightUnitId = weightUnitId;
	}

	public Integer getLengthUnitId() {
		return lengthUnitId;
	}

	public void setLengthUnitId(Integer lengthUnitId) {
		this.lengthUnitId = lengthUnitId;
	}

	public String getTaaSProductTaxClass() {
		return taaSProductTaxClass;
	}

	public void setTaaSProductTaxClass(String taaSProductTaxClass) {
		this.taaSProductTaxClass = taaSProductTaxClass;
	}

	public Boolean getBackOrderAllowed() {
		return backOrderAllowed;
	}

	public void setBackOrderAllowed(Boolean backOrderAllowed) {
		this.backOrderAllowed = backOrderAllowed;
	}

	public Boolean getDropShipAllowed() {
		return dropShipAllowed;
	}

	public void setDropShipAllowed(Boolean dropShipAllowed) {
		this.dropShipAllowed = dropShipAllowed;
	}

	public ManufacturerInfo getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(ManufacturerInfo manufacturer) {
		this.manufacturer = manufacturer;
	}

	public BrandInfo getBrand() {
		return brand;
	}

	public void setBrand(BrandInfo brand) {
		this.brand = brand;
	}

	public VendorInfo getVendor() {
		return vendor;
	}

	public void setVendor(VendorInfo vendor) {
		this.vendor = vendor;
	}

	public Boolean getVariantEnabled() {
		return variantEnabled;
	}

	public void setVariantEnabled(Boolean variantEnabled) {
		this.variantEnabled = variantEnabled;
	}

	public Boolean getInventoryEnabled() {
		return inventoryEnabled;
	}

	public void setInventoryEnabled(Boolean inventoryEnabled) {
		this.inventoryEnabled = inventoryEnabled;
	}

	public Boolean getImageUploaded() {
		return imageUploaded;
	}

	public void setImageUploaded(Boolean imageUploaded) {
		this.imageUploaded = imageUploaded;
	}

	public UoMInfo getSalesUom() {
		return salesUom;
	}

	public void setSalesUom(UoMInfo salesUom) {
		this.salesUom = salesUom;
	}

	public UoMInfo getPurchaseUom() {
		return purchaseUom;
	}

	public void setPurchaseUom(UoMInfo purchaseUom) {
		this.purchaseUom = purchaseUom;
	}

	public UoMInfo getInventoryUom() {
		return inventoryUom;
	}

	public void setInventoryUom(UoMInfo inventoryUom) {
		this.inventoryUom = inventoryUom;
	}

	public UomGroupInfo getProductUomGroup() {
		return productUomGroup;
	}

	public void setProductUomGroup(UomGroupInfo productUomGroup) {
		this.productUomGroup = productUomGroup;
	}

	public Map<String, Object> getMainImage() {
		return mainImage;
	}

	public void setMainImage(Map<String, Object> mainImage) {
		this.mainImage = mainImage;
	}

	public List<SKUInfo> getSkus() {
		return skus;
	}

	public void setSkus(List<SKUInfo> skus) {
		this.skus = skus;
	}

	public List<ProductAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<ProductAttribute> attributes) {
		this.attributes = attributes;
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
