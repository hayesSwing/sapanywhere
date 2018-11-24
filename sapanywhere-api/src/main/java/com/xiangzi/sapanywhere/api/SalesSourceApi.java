package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.SalesSource;

/**
 * 来源<br/>
 * 设置-客户关系管理-销售机会-来源
 */
public class SalesSourceApi extends BaseAnywhereApi<SalesSource> {

	@Override
	protected String getObjectUrl() {
		return "SalesSources";
	}
	
}
