package com.xiangzi.sapanywhere.info;

import com.xiangzi.sapanywhere.bean.BaseBean;

public class BaseDocumentLineInfo extends BaseBean {

	private String baseId;// required
	private String baseNumber;// 来源单据类型
	private String baseType;// 来源单据类型
	private String baseLineId;// required
	private String baseLineNumber;// 来源单据类型

	public String getBaseId() {
		return baseId;
	}

	public void setBaseId(String baseId) {
		this.baseId = baseId;
	}

	public String getBaseNumber() {
		return baseNumber;
	}

	public void setBaseNumber(String baseNumber) {
		this.baseNumber = baseNumber;
	}

	public String getBaseType() {
		return baseType;
	}

	public void setBaseType(String baseType) {
		this.baseType = baseType;
	}

	public String getBaseLineId() {
		return baseLineId;
	}

	public void setBaseLineId(String baseLineId) {
		this.baseLineId = baseLineId;
	}

	public String getBaseLineNumber() {
		return baseLineNumber;
	}

	public void setBaseLineNumber(String baseLineNumber) {
		this.baseLineNumber = baseLineNumber;
	}

}
