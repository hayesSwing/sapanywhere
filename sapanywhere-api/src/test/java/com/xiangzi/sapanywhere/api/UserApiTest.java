package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.User;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.util.JSONUtil;


public class UserApiTest extends BaseAnywhereTest {

	private UserApi userApi;

	@Before
	public void before() throws Exception {
		super.before();
		userApi = new UserApi();
	}

	@Ignore
	@Test
	public void all() {
		Filter filter = null;

		Expand expand = null;
		// expand = new Expand("*");

		List<String> columnList = new ArrayList<>();
		// columnList.add("id");
		Select select = new Select();
		select.setColumnList(columnList);

		Criteria criteria = new Criteria();
		criteria.setFilter(filter);
		criteria.setExpand(expand);
		criteria.setSelect(select);

		String orderBy = "id";
		String orderType = null;

		List<User> allUsers = userApi.all(accessToken.getValue(), criteria, orderBy, orderType);
		logger.info("allUsers.size:" + allUsers.size());
		logger.info("allUsers.json:" + JSONUtil.toJSONString(allUsers));

		for (User user : allUsers) {
			logger.info("user.json:" + JSONUtil.toJSONString(user));
		}

	}
	
	@Ignore
	@Test
	public void me() {
		User currentUser = userApi.me(accessToken.getValue());
		logger.info("currentUser:" + JSONUtil.toJSONString(currentUser));
	}
	
}
