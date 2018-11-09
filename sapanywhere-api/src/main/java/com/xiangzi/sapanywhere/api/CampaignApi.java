package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Campaign;

/**
 * 营销<br/>
 * 营销-营销
 */
public class CampaignApi extends BaseAnywhereApi<Campaign> {

	@Override
	protected String getObjectUrl() {
		return "Campaigns";
	}
	
}
