package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.Campaign;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.util.JSONUtil;

public class CampaignApiTest extends BaseAnywhereTest {

	private CampaignApi campaignApi;

	@Before
	public void before() throws Exception {
		super.before();
		campaignApi = new CampaignApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = campaignApi.count(accessToken.getValue());
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
		pager.setPageSize(40);
		pager.setOrderBy("id");
		pager.setOrderType("asc");

		pager = campaignApi.pager(accessToken.getValue(), pager);
		
		logger.info("list.totalCount:" + pager.getTotalCount());
		logger.info("list.pageSize:" + pager.getPageSize());
		logger.info("list.pageCount:" + pager.getPageCount());

		List<Campaign> list = (List<Campaign>) pager.getList();
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (Campaign campaign : list) {
			logger.info("campaign.json:" + JSONUtil.toJSONString(campaign));
		}
		
	}
	
	@Ignore
	@Test
	public void get() {
		String id = "26";
		Expand expand = null;
		expand = new Expand("*");
		Campaign campaign = campaignApi.get(accessToken.getValue(), id, expand);
		logger.info("campaign:" + campaign);
	}
	
}
