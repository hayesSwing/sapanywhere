package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.BatchNumber;

/**
 * BatchNumber-批次 <br/>
 */
public class BatchNumberApi extends BaseAnywhereApi<BatchNumber> {

	@Override
	protected String getObjectUrl() {
		return "SKUs/BatchNumbers";
	}

}
