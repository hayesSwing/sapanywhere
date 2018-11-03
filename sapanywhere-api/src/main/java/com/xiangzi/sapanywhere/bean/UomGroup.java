package com.xiangzi.sapanywhere.bean;

import java.util.List;

/**
 * 计量单位组
 */
public class UomGroup extends BaseBean {

	private String id;
	private String name;// required
	private String description;
	private Uom baseUom;// required
	private List<UomGroupItem> uomList;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Uom getBaseUom() {
		return baseUom;
	}

	public void setBaseUom(Uom baseUom) {
		this.baseUom = baseUom;
	}

	public List<UomGroupItem> getUomList() {
		return uomList;
	}

	public void setUomList(List<UomGroupItem> uomList) {
		this.uomList = uomList;
	}
	
}
