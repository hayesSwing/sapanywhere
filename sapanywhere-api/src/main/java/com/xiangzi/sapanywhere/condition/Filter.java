package com.xiangzi.sapanywhere.condition;

import java.io.Serializable;

public interface Filter extends Serializable {

	String toSqlString();
	
}