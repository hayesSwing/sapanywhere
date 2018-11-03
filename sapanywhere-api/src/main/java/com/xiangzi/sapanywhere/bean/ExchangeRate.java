package com.xiangzi.sapanywhere.bean;

import com.xiangzi.sapanywhere.info.CurrencyInfo;

/**
 * ExchangeRate-汇率 <br/>
 * 设置-初始设置-货币与汇率-汇率
 */
public class ExchangeRate extends BaseBean {

	// Foreign currency to which the exchange rate apply.
	private CurrencyInfo currency;
	private Double rate;// Exchange rate value.
	// Valid date of the exchange rate.
	private String rateDate;// string (date-time),某个日期当天的汇率

	public CurrencyInfo getCurrency() {
		return currency;
	}
	
	public void setCurrency(CurrencyInfo currency) {
		this.currency = currency;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getRateDate() {
		return rateDate;
	}

	public void setRateDate(String rateDate) {
		this.rateDate = rateDate;
	}

}
