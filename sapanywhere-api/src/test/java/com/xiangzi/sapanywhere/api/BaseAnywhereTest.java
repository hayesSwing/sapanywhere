package com.xiangzi.sapanywhere.api;

import org.junit.Before;

import com.xiangzi.BaseTest;
import com.xiangzi.sapanywhere.bean.AccessToken;
import com.xiangzi.util.JSONUtil;

public class BaseAnywhereTest extends BaseTest {

	protected AccessToken accessToken;

	@Before
	public void before() throws Exception {
		String accessTokenJSON = "{}";
		accessToken = JSONUtil.parseObject(accessTokenJSON, AccessToken.class);
	}
	
}
