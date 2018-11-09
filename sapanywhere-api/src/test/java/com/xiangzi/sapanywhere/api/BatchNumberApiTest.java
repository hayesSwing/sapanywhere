package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.BatchNumber;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.util.JSONUtil;

public class BatchNumberApiTest extends BaseAnywhereTest {

	private BatchNumberApi batchNumberApi;

	@Before
	public void before() throws Exception {
		super.before();
		batchNumberApi = new BatchNumberApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = batchNumberApi.count(accessToken.getValue());
		logger.info("count:" + count);
	}

	@Ignore
	@Test
	@SuppressWarnings("unchecked")
	public void pager() {
		Filter filter = null;
		// filter = Restrictions.eq("pricingMethod", "NET_PRICE");// 计价方式-不含税
		// filter = Restrictions.eq("pricingMethod", "GROSS_PRICE");// 计价方式-含税

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
		pager.setPageSize(10);
		pager.setOrderBy("id");
		pager.setOrderType("asc");

		pager = batchNumberApi.pager(accessToken.getValue(), pager);

		logger.info("list.totalCount:" + pager.getTotalCount());
		logger.info("list.pageSize:" + pager.getPageSize());
		logger.info("list.pageCount:" + pager.getPageCount());

		List<BatchNumber> list = (List<BatchNumber>) pager.getList();
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (BatchNumber batchNumber : list) {
			logger.info("batchNumber.json:" + JSONUtil.toJSONString(batchNumber));
		}

	}

	@Ignore
	@Test
	public void get() {
		String id = "1";
		Expand expand = null;
		// expand = new Expand("*");
		BatchNumber batchNumber = batchNumberApi.get(accessToken.getValue(), id, expand);
		logger.info("batchNumber:" + batchNumber);
	}

}
