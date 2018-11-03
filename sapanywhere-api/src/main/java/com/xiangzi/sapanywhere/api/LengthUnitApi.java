package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.LengthUnit;

/**
 * 长度单位 <br/>
 */
public class LengthUnitApi extends BaseAnywhereApi<LengthUnit> {

	@Override
	protected String getObjectUrl() {
		return "Unit/LengthUnits";
	}

}
