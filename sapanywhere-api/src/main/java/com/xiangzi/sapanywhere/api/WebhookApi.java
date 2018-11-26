package com.xiangzi.sapanywhere.api;

import java.util.HashMap;
import java.util.Map;

import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.Webhook;
import com.xiangzi.util.JSONUtil;

public class WebhookApi extends BaseAnywhereApi<Webhook> {

	@Override
	protected String getObjectUrl() {
		return "Webhooks";
	}

	/**
	 * Create a webhook.
	 */
	public String create(String accessToken, Webhook webhook) {
		String url = apiBaseUrl + getObjectUrl() + "?access_token=" + accessToken;

		Map<String, Object> bodyDataMap = new HashMap<>();
		bodyDataMap.put("callbackUrl", webhook.getCallbackUrl());
		bodyDataMap.put("eventType", webhook.getEventType());
		String bodyString = JSONUtil.toJSONString(bodyDataMap);

		HttpResponse httpResponse = sendPost(url, bodyString);
		String content = httpResponse.getContent();

		String id = 201 == httpResponse.getStatus() ? content : null;
		return id;
	}

}
