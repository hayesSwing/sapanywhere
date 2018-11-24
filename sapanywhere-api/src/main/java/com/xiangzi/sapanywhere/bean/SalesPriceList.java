package com.xiangzi.sapanywhere.bean;

import com.xiangzi.sapanywhere.info.CurrencyInfo;

/**
 * 销售价格列表<br/>
 * 产品-价格和促销<br/>
 * 可以添加多个<br/>
 * 
 * 销售价格列表 销售价格列表可针对特定客户、特定渠道选择不同的销售价格列表。譬如不同等级的经销商、不同的销售渠道，可有不同产品销售价格。
 * 销售价格列表可以手动创建或导入。
 */
public class SalesPriceList extends BaseBean {

	private String id;
	private String name;
	private String validFrom;// 生效时间,YYYY-MM-DD HH:mm
	private String validTo;// 失效时间,YYYY-MM-DD HH:mm
	private CurrencyInfo currency;// 货币
	private PricingMethod pricingMethod;// 计价方式
	private String creationTime;
	private String updateTime;
	
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

	public String getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}

	public String getValidTo() {
		return validTo;
	}

	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}

	public CurrencyInfo getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyInfo currency) {
		this.currency = currency;
	}

	public PricingMethod getPricingMethod() {
		return pricingMethod;
	}

	public void setPricingMethod(PricingMethod pricingMethod) {
		this.pricingMethod = pricingMethod;
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
