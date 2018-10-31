package com.xiangzi.sapanywhere.condition;

import java.io.Serializable;

public class Expand implements Serializable {

	private static final long serialVersionUID = 2975683201853508459L;
	
	private String value;

	public Expand(String value) {
		super();
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
