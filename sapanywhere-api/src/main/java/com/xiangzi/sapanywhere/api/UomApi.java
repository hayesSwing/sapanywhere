package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Uom;

/**
 * 计量单位<br/>
 * 
 * uom：unit of measure度量单位
 */
public class UomApi extends BaseAnywhereApi<Uom> {

	@Override
	protected String getObjectUrl() {
		return "Uoms";
	}

}
