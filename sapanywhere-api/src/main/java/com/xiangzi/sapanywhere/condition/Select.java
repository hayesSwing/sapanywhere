package com.xiangzi.sapanywhere.condition;

import java.io.Serializable;
import java.util.List;

public class Select implements Serializable {

	private static final long serialVersionUID = -9187933411345806023L;
	
	private List<String> columnList;

	public Select() {
		super();
	}
	
	public Select(List<String> columnList) {
		super();
		this.columnList = columnList;
	}

	public List<String> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<String> columnList) {
		this.columnList = columnList;
	}
	
}
