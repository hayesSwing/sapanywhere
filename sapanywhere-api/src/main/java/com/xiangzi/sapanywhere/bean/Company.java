package com.xiangzi.sapanywhere.bean;

/**
 * 公司 <br/>
 */
public class Company extends BaseBean {

	private String code;// readonly,An unique code for a company.
	private String name;// readonly,Company name.
	private String timeZone;// readonly,TimeZone.
	/**
	 * readonly,Company locale, format in {language}-{region}.
	 */
	private String locale;

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

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

}
