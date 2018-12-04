package com.xiangzi.sapanywhere.api;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PrepaymentApiTest extends BaseAnywhereTest {

	private PrepaymentApi prepaymentApi;

	@Before
	public void before() throws Exception {
		super.before();
		prepaymentApi = new PrepaymentApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = prepaymentApi.count(accessToken.getValue());
		logger.info("count:" + count);
	}

}
