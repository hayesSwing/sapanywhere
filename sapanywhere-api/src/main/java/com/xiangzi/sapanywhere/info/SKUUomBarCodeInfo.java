package com.xiangzi.sapanywhere.info;

/**
 * Uom bar code for SKU
 */
public class SKUUomBarCodeInfo extends BaseInfo {
	
	private UoMInfo uom;
	private String barCode;
	private Boolean forPurchase;
	private Boolean forSales;

	public UoMInfo getUom() {
		return uom;
	}

	public void setUom(UoMInfo uom) {
		this.uom = uom;
	}

	public String getBarCode() {
		return barCode;
	}

	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public Boolean getForPurchase() {
		return forPurchase;
	}

	public void setForPurchase(Boolean forPurchase) {
		this.forPurchase = forPurchase;
	}

	public Boolean getForSales() {
		return forSales;
	}

	public void setForSales(Boolean forSales) {
		this.forSales = forSales;
	}
	
}
