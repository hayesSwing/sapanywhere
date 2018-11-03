package com.xiangzi.sapanywhere.api;

import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.User;
import com.xiangzi.util.JSONUtil;

/**
 * User
 */
public class UserApi extends BaseAnywhereApi<User> {

	@Override
	protected String getObjectUrl() {
		return "Users";
	}

	/**
	 * Get current user info.
	 * 
	 * @param accessToken
	 * @return
	 */
	public User me(String accessToken) {
		String url = apiBaseUrl + getObjectUrl() + "/me?access_token=" + accessToken;

		HttpResponse httpResponse = sendGet(url);
		String content = httpResponse.getContent();

		return 200 == httpResponse.getStatus() ? JSONUtil.parseObject(content, User.class) : null;
		// return 200 == httpResponse.getStatus() ?
		// JSONUtil.parseObject(content, this.entityClass) : null;
	}

}
