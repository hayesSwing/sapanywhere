package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.VariantValue;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.util.JSONUtil;

public class VariantValueApiTest extends BaseAnywhereTest {

	private VariantValueApi variantValueApi;

	@Before
	public void before() throws Exception {
		super.before();
		variantValueApi = new VariantValueApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = variantValueApi.count(accessToken.getValue());
		logger.info("count:" + count);
	}

	@Ignore
	@Test
	@SuppressWarnings("unchecked")
	public void pager() {
		Filter filter = null;

		Expand expand = null;
		expand = new Expand("*");

		List<String> columnList = new ArrayList<>();
		// columnList.add("id");
		// columnList.add("name");
		Select select = new Select();
		select.setColumnList(columnList);

		Criteria criteria = new Criteria();
		criteria.setFilter(filter);
		criteria.setExpand(expand);
		criteria.setSelect(select);

		Pager pager = new Pager();
		pager.setCriteria(criteria);
		pager.setPageNumber(1);
		pager.setPageSize(20);
		pager.setOrderBy("id");
		// pager.setOrderType("asc");
		pager.setOrderType("desc");

		pager = variantValueApi.pager(accessToken.getValue(), pager);

		logger.info("list.totalCount:" + pager.getTotalCount());
		logger.info("list.pageSize:" + pager.getPageSize());
		logger.info("list.pageCount:" + pager.getPageCount());

		List<VariantValue> list = (List<VariantValue>) pager.getList();
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (VariantValue variantValue : list) {
			logger.info("variantValue.json:" + JSONUtil.toJSONString(variantValue));
		}

	}

}
