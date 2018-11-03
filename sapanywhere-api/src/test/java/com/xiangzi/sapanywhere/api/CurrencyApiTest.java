package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.Currency;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.util.JSONUtil;

public class CurrencyApiTest extends BaseAnywhereTest {

	private CurrencyApi currencyApi;

	@Before
	public void before() throws Exception {
		super.before();
		currencyApi = new CurrencyApi();
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

		List<Currency> list = currencyApi.all(accessToken.getValue(), criteria, orderBy, orderType);
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (Currency currency : list) {
			logger.info("currency.json:" + JSONUtil.toJSONString(currency));
		}

	}

}
