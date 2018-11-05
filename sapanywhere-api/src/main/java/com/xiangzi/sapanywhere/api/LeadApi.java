package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Lead;

/**
 * 销售线索 - Lead <br/>
 */
public class LeadApi extends BaseAnywhereApi<Lead> {

	@Override
	protected String getObjectUrl() {
		return "Leads";
	}
	
}
