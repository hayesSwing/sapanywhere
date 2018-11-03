package com.xiangzi.sapanywhere.bean;

/**
 * User
 */
public class User extends BaseBean {

	private String id;// readonly,integer (int64),Unique identifier
	private String code;// readonly,string,User code.
	private String email;// readonly,string,User email address.
	/**
	 * readonly,string,Language culture code, format in {language}-{region}.
	 */
	private String language;
	private String companyCode;// readonly,string,Company code.
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
}
