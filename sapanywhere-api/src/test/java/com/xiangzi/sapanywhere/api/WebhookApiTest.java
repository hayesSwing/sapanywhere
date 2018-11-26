package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.Webhook;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.sapanywhere.event.EventKey;
import com.xiangzi.util.JSONUtil;

public class WebhookApiTest extends BaseAnywhereTest {

	private WebhookApi webhookApi;

	@Before
	public void before() throws Exception {
		super.before();
		webhookApi = new WebhookApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = webhookApi.count(accessToken.getValue());
		logger.info("count:" + count);
	}

	@Ignore
	@Test
	@SuppressWarnings("unchecked")
	public void pager() {
		Filter filter = null;
		// filter = Restrictions.eq("pricingMethod", "GROSS_PRICE");// 计价方式-含税

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

		Pager pager = new Pager();
		pager.setCriteria(criteria);
		pager.setPageNumber(1);
		pager.setPageSize(10);
		pager.setOrderBy("");

		pager = webhookApi.pager(accessToken.getValue(), pager);

		logger.info("list.totalCount:" + pager.getTotalCount());
		logger.info("list.pageSize:" + pager.getPageSize());
		logger.info("list.pageCount:" + pager.getPageCount());

		List<Webhook> list = (List<Webhook>) pager.getList();
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (Webhook webhook : list) {
			logger.info("webhook.json:" + JSONUtil.toJSONString(webhook));
		}

	}

	@Ignore
	@Test
	public void create() {
		String callbackUrl = "http://azkoss.vicp.net/sapsync/sap/callback";

		Webhook webhook = new Webhook();
		webhook.setCallbackUrl(callbackUrl);
		// webhook.setEventType(EventKey.LOGIN.getKey());
		// webhook.setEventType(EventKey.SALES_ORDER_CREATE.getKey());
		// webhook.setEventType(EventKey.PRODUCT_CREATE.getKey());
		// webhook.setEventType(EventKey.SKU_CREATE.getKey());
		webhook.setEventType(EventKey.PRODUCT_UPDATE.getKey());

		String id = webhookApi.create(accessToken.getValue(), webhook);
		logger.info("id:" + id);

		// Request.Post>>>>>>{"callbackUrl":"http://azkoss.vicp.net/sapsync/sap/callback","eventType":"Login"}
		// Response>>>>>>400>>>>>>{"errorCode":"P100D00003","message":"Webhook不支持该事件类型。"}

		// Request.Post>>>>>>{"callbackUrl":"http://azkoss.vicp.net/sapsync/sap/callback","eventType":"SalesOrder/CREATE"}
		// Response>>>>>>201>>>>>>2
		// id:2

		// Request.Post>>>>>>{"callbackUrl":"http://azkoss.vicp.net/sapsync/sap/callback","eventType":"SalesOrder/CREATE"}
		// Response>>>>>>400>>>>>>{"errorCode":"P100D00007","message":"Webhook注册失败，已存在该事件类型的Webhook。"}

		// Request.Post>>>>>>{"callbackUrl":"http://azkoss.vicp.net/sapsync/sap/callback","eventType":"Product/CREATE"}
		// Response>>>>>>201>>>>>>3
		// id:3

		// Request.Post>>>>>>{"callbackUrl":"http://azkoss.vicp.net/sapsync/sap/callback","eventType":"SKU/CREATE"}
		// Response>>>>>>201>>>>>>4
		// id:4

		// Request.Post>>>>>>{"callbackUrl":"http://azkoss.vicp.net/sapsync/sap/callback","eventType":"Product/UPDATE"}
		// Response>>>>>>201>>>>>>5
		// id:5
		
	}

	@Ignore
	@Test
	public void get() {
		String id = "2";
		Expand expand = null;
		Webhook webhook = webhookApi.get(accessToken.getValue(), id, expand);
		logger.info("webhook:" + webhook);
	}

}
