package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.FulfillmentMethod;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.util.JSONUtil;

public class FulfillmentMethodApiTest extends BaseAnywhereTest {

	private FulfillmentMethodApi fulfillmentMethodApi;

	@Before
	public void before() throws Exception {
		super.before();
		fulfillmentMethodApi = new FulfillmentMethodApi();
	}

	@Ignore
	@Test
	public void all() {
		Filter filter = null;

		Expand expand = null;

		List<String> columnList = new ArrayList<>();
		// columnList.add("id");
		Select select = new Select();
		select.setColumnList(columnList);

		Criteria criteria = new Criteria();
		criteria.setFilter(filter);
		criteria.setExpand(expand);
		criteria.setSelect(select);

		String orderBy = null;
		String orderType = null;

		List<FulfillmentMethod> list = fulfillmentMethodApi.all(accessToken.getValue(), criteria, orderBy, orderType);
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (FulfillmentMethod fulfillmentMethod : list) {
			logger.info("fulfillmentMethod.json:" + JSONUtil.toJSONString(fulfillmentMethod));
		}

	}

}
