package com.xiangzi.sapanywhere.api;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.Company;

public class CompanyApiTest extends BaseAnywhereTest {

	private CompanyApi companyApi;

	@Before
	public void before() throws Exception {
		super.before();
		companyApi = new CompanyApi();
	}

//	@Ignore
	@Test
	public void get() {
		Company company = companyApi.get(accessToken.getValue());
		logger.info("company:" + company);
	}

}
