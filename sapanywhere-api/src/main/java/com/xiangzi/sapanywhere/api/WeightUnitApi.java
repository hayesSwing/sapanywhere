package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.WeightUnit;

/**
 * 重量单位 <br/>
 */
public class WeightUnitApi extends BaseAnywhereApi<WeightUnit> {

	@Override
	protected String getObjectUrl() {
		return "Unit/WeightUnits";
	}

}
