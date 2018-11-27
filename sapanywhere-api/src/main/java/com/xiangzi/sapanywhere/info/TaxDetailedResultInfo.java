package com.xiangzi.sapanywhere.info;

/**
 * Detailed Tax Information
 */
public class TaxDetailedResultInfo extends BaseInfo {

	private String id;
	private String name;
	private String taxDocumentType;

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

	public String getTaxDocumentType() {
		return taxDocumentType;
	}

	public void setTaxDocumentType(String taxDocumentType) {
		this.taxDocumentType = taxDocumentType;
	}
	
}
