package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.SalesChannel;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.sapanywhere.info.SKUInfo;
import com.xiangzi.util.JSONUtil;

public class SalesChannelApiTest extends BaseAnywhereTest {

	private SalesChannelApi salesChannelApi;

	@Before
	public void before() throws Exception {
		super.before();
		salesChannelApi = new SalesChannelApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = salesChannelApi.count(accessToken.getValue());
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
		pager.setOrderType("asc");

		pager = salesChannelApi.pager(accessToken.getValue(), pager);

		logger.info("list.totalCount:" + pager.getTotalCount());
		logger.info("list.pageSize:" + pager.getPageSize());
		logger.info("list.pageCount:" + pager.getPageCount());

		List<SalesChannel> list = (List<SalesChannel>) pager.getList();
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (SalesChannel salesChannel : list) {
			logger.info("salesChannel.json:" + JSONUtil.toJSONString(salesChannel));
		}
		
	}

	@Ignore
	@Test
	public void get() {
		String id = "60";
		Expand expand = null;
		expand = new Expand("*");
		SalesChannel salesChannel = salesChannelApi.get(accessToken.getValue(), id, expand);
		logger.info("salesChannel:" + salesChannel);
		// {"id":60,"name":"销售渠道-门店-祥子-01","status":"ACTIVE","type":"POS","isDefault":false,"warehouses":[]}
	}

	@Ignore
	@Test
	public void sku() {
		Criteria criteria = null;

		Pager pager = new Pager();
		pager.setCriteria(criteria);
		pager.setPageNumber(1);
		pager.setPageSize(200);
		pager.setOrderBy("");

		String channelId = "60";

		List<SKUInfo> list = salesChannelApi.sku(accessToken.getValue(), channelId, pager);
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (SKUInfo skuInfo : list) {
			logger.info("skuInfo.json:" + JSONUtil.toJSONString(skuInfo));
		}

		// [{"id":13857,"name":"祥子-产品-01","code":"xz-product-01"}]

	}

}
