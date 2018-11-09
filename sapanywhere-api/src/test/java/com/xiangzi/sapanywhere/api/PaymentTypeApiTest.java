package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.PaymentType;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.util.JSONUtil;

public class PaymentTypeApiTest extends BaseAnywhereTest {

	private PaymentTypeApi paymentTypeApi;

	@Before
	public void before() throws Exception {
		super.before();
		paymentTypeApi = new PaymentTypeApi();
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
		String orderType = "asc";

		List<PaymentType> list = paymentTypeApi.all(accessToken.getValue(), criteria, orderBy, orderType);
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (PaymentType paymentType : list) {
			logger.info("paymentType.json:" + JSONUtil.toJSONString(paymentType));
		}

	}

	@Ignore
	@Test
	public void get() {
		String id = "1";
		Expand expand = null;
		PaymentType paymentType = paymentTypeApi.get(accessToken.getValue(), id, expand);
		logger.info("paymentType:" + paymentType);
	}

}
