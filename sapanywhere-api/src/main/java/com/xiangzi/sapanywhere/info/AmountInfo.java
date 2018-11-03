package com.xiangzi.sapanywhere.info;

/**
 * Amount displayed in transaction currency and local currency.
 */
public class AmountInfo extends BaseInfo {
	
	private Double amount;// Amount
	private Double amountLocalCurrency;// readonly,Amount in local currency

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getAmountLocalCurrency() {
		return amountLocalCurrency;
	}

	public void setAmountLocalCurrency(Double amountLocalCurrency) {
		this.amountLocalCurrency = amountLocalCurrency;
	}

}
