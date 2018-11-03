package com.xiangzi.sapanywhere.bean;

public class UomGroupItem extends BaseBean {

	private String id;// Unique idendifier of uom group item.
	private Uom uom;// 对应的uom-Corresponding uom.
	private Boolean forSales;// Is for sale purpose.
	private Boolean forPurchase;// Is purchase purpose.
	// 换算率/转换率
	private Double conversionRate;// Conversion rate between uoms.
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Uom getUom() {
		return uom;
	}

	public void setUom(Uom uom) {
		this.uom = uom;
	}

	public Boolean getForSales() {
		return forSales;
	}

	public void setForSales(Boolean forSales) {
		this.forSales = forSales;
	}

	public Boolean getForPurchase() {
		return forPurchase;
	}

	public void setForPurchase(Boolean forPurchase) {
		this.forPurchase = forPurchase;
	}

	public Double getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(Double conversionRate) {
		this.conversionRate = conversionRate;
	}

}
