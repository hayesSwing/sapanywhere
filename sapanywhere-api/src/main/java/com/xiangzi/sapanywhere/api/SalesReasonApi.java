package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.SalesReason;

/**
 * 原因<br/>
 * 设置-客户关系管理-销售机会-原因
 */
public class SalesReasonApi extends BaseAnywhereApi<SalesReason> {

	@Override
	protected String getObjectUrl() {
		return "SalesReasons";
	}
	
}
