package com.xiangzi.sapanywhere.bean;

/**
 * 货币
 */
public class Currency extends BaseBean {

	private String id;// integer (int64),Unique identifier
	private String symbol;// 符号
	private String code;
	private String isoCode;// string,ISO code of a currency.
	private String name;
	// required,number,Default exchange rate of a currency.
	private Double defaultRate;
	// Possible values:ACTIVE,INACTIVE
	private CurrencyStatus status;// string,Status of a currency.
	// Possible values:NO_DECIMAL,ONE,TWO,THREE,FOUR,FIVE,SIX,DEFAULT
	private String decimals;// required,string,Decimal place of a currency.

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDefaultRate() {
		return defaultRate;
	}

	public void setDefaultRate(Double defaultRate) {
		this.defaultRate = defaultRate;
	}

	public CurrencyStatus getStatus() {
		return status;
	}

	public void setStatus(CurrencyStatus status) {
		this.status = status;
	}

	public String getDecimals() {
		return decimals;
	}

	public void setDecimals(String decimals) {
		this.decimals = decimals;
	}
	
}
