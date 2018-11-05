package com.xiangzi.sapanywhere.api;

import java.util.HashMap;
import java.util.Map;

import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.AccessToken;
import com.xiangzi.util.JSONUtil;

/**
 * AccessToken
 */
public class AccessTokenApi extends BaseApi {

	private String apiKey;
	private String apiSecret;
	private String refreshToken;// expire in 3 years.

	public AccessTokenApi(String apiKey, String apiSecret, String refreshToken) {
		super();
		this.apiKey = apiKey;
		this.apiSecret = apiSecret;
		this.refreshToken = refreshToken;
	}

	public AccessToken getAccessToken() {
		String url = accessTokenUrl;
		Map<String, Object> paramMap = new HashMap<String, Object>(20);
		paramMap.put("client_id", apiKey);
		paramMap.put("client_secret", apiSecret);
		paramMap.put("grant_type", "refresh_token");
		paramMap.put("refresh_token", refreshToken);

		HttpResponse httpResponse = sendPost(url, paramMap);
		String content = httpResponse.getContent();
		AccessToken accessToken = httpResponse.isStatusOK() ? JSONUtil.parseObject(content, AccessToken.class) : null;
		return accessToken;
	}

}
