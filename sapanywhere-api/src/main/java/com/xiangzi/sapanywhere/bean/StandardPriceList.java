package com.xiangzi.sapanywhere.bean;

import java.util.List;

import com.xiangzi.sapanywhere.info.PriceListCurrencyAndPriceMethodInfo;


/**
 * 标准价格列表<br/>
 * 产品-价格和促销<br/>
 */
public class StandardPriceList extends BaseBean {

	private String id;
	// 价格列表名
	private String name;
	private String validFrom;
	private String validTo;
	// 货币和计价方式
	private List<PriceListCurrencyAndPriceMethodInfo> priceOption;

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

	public List<PriceListCurrencyAndPriceMethodInfo> getPriceOption() {
		return priceOption;
	}

	public void setPriceOption(List<PriceListCurrencyAndPriceMethodInfo> priceOption) {
		this.priceOption = priceOption;
	}
	
}
