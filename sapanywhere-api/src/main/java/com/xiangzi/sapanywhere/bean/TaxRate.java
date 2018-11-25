package com.xiangzi.sapanywhere.bean;

/**
 * TaxRate-计税规则-税率 </br>
 * 设置-初始设置-税-税/计税规则
 */
public class TaxRate extends BaseBean {

	private String id;
	// 税率类别
	private TaxRateType rateType;
	// 税率
	private Double rateValue;
	// 生效日期
	private String effectiveFrom;// string (date-time)
	// 失效日期
	private String effectiveTo;// string (date-time)

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TaxRateType getRateType() {
		return rateType;
	}

	public void setRateType(TaxRateType rateType) {
		this.rateType = rateType;
	}

	public Double getRateValue() {
		return rateValue;
	}

	public void setRateValue(Double rateValue) {
		this.rateValue = rateValue;
	}

	public String getEffectiveFrom() {
		return effectiveFrom;
	}

	public void setEffectiveFrom(String effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public String getEffectiveTo() {
		return effectiveTo;
	}

	public void setEffectiveTo(String effectiveTo) {
		this.effectiveTo = effectiveTo;
	}
	
}
