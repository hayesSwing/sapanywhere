package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Opportunity;

/**
 * 销售机会
 */
public class OpportunityApi extends BaseAnywhereApi<Opportunity> {

	@Override
	protected String getObjectUrl() {
		return "Opportunities";
	}

}
