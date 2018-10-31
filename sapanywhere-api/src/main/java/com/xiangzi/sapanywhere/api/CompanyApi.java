package com.xiangzi.sapanywhere.api;

import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.Company;
import com.xiangzi.util.JSONUtil;

public class CompanyApi extends BaseAnywhereApi<Company> {

	@Override
	protected String getObjectUrl() {
		return "Company";
	}

	/**
	 * Get company info.
	 * 
	 * @param accessToken
	 * @return
	 */
	public Company get(String accessToken) {
		String url = apiBaseUrl + getObjectUrl() + "?access_token=" + accessToken;

		HttpResponse httpResponse = sendGet(url);
		String content = httpResponse.getContent();

		return 200 == httpResponse.getStatus() ? JSONUtil.parseObject(content, Company.class) : null;
	}

}
