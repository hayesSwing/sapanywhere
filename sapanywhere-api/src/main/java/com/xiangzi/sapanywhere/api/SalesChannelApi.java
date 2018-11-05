package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.SalesChannel;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.info.SKUInfo;
import com.xiangzi.util.JSONUtil;

public class SalesChannelApi extends BaseAnywhereApi<SalesChannel> {

	@Override
	protected String getObjectUrl() {
		return "SalesChannels";
	}
	
	/**
	 * Get a list of sales channel sku with paging (optional).
	 */
	public List<SKUInfo> sku(String accessToken, String channelId, Pager pager) {
		Map<String, Object> paramMap = new HashMap<String, Object>(20);
		paramMap.put("access_token", accessToken);

		processPager(pager, paramMap);

		String dataUrl = apiBaseUrl + getObjectUrl() + "/" + channelId + "/sku";
		HttpResponse httpResponse = sendGet(dataUrl, paramMap);
		String content = httpResponse.getContent();
		
		List<SKUInfo> list = new ArrayList<>();
		if (httpResponse.isStatusOK()) {
			list.addAll(JSONUtil.parseObject(content, new TypeReference<List<SKUInfo>>() {
			}));
		}
		
		pager.setTotalCount(-1);
		pager.setList(list);
		return list;
	}
	
}
