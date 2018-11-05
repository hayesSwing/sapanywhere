package com.xiangzi.sapanywhere.api;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.AccessToken;

public class AccessTokenApiTest extends BaseAnywhereTest {

	private AccessTokenApi accessTokenApi;

	private String apiKey = "your client_id";
	private String apiSecret = "your client_secret";
	private String refreshToken = "your refresh_token";// expire in 3 years.
	
	@Before
	public void before() throws Exception {
		super.before();
		accessTokenApi = new AccessTokenApi(apiKey, apiSecret, refreshToken);
	}

	@Ignore
	@Test
	public void get() {
		AccessToken accessToken = accessTokenApi.getAccessToken();
		logger.info("accessToken:" + accessToken);
	}

}
