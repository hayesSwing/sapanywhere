package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.CreditMemo;
import com.xiangzi.sapanywhere.bean.CreditMemoLine;
import com.xiangzi.sapanywhere.bean.SalesOrder;
import com.xiangzi.sapanywhere.bean.SalesOrderReturnLine;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.sapanywhere.info.BaseDocumentLineInfo;
import com.xiangzi.util.JSONUtil;

public class CreditMemoApiTest extends BaseAnywhereTest {

	private CreditMemoApi creditMemoApi;
	private SalesOrderApi salesOrderApi;

	@Before
	public void before() throws Exception {
		super.before();
		creditMemoApi = new CreditMemoApi();
		salesOrderApi = new SalesOrderApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = creditMemoApi.count(accessToken.getValue());
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
		pager.setPageSize(1);
		// pager.setOrderBy("");

		pager = creditMemoApi.pager(accessToken.getValue(), pager);

		logger.info("list.totalCount:" + pager.getTotalCount());
		logger.info("list.pageSize:" + pager.getPageSize());
		logger.info("list.pageCount:" + pager.getPageCount());

		List<CreditMemo> list = (List<CreditMemo>) pager.getList();
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (CreditMemo creditMemo : list) {
			logger.info("creditMemo.json:" + JSONUtil.toJSONString(creditMemo));
		}

	}

	@Ignore
	@Test
	public void create() {
		String salesOrderId = "1412";// "id":"1412","docNumber":"2916"
		salesOrderId = "1419";// "id":1419,"docNumber":"2929"
		salesOrderId = "1421";// "id":1421,"docNumber":"2931"

		Expand expand = null;
		expand = new Expand("*");
		SalesOrder salesOrder = salesOrderApi.get(accessToken.getValue(), salesOrderId, expand);
		logger.info("salesOrder:" + salesOrder);

		CreditMemo creditMemo = new CreditMemo();
		creditMemo.setRemark("来源订单编号[" + salesOrder.getDocNumber() + "]");

		// 产品
		List<CreditMemoLine> lines = new ArrayList<>();

		for (SalesOrderReturnLine returnLine : salesOrder.getReturnLines()) {
			CreditMemoLine creditMemoLine = new CreditMemoLine();
			BaseDocumentLineInfo baseDoc = new BaseDocumentLineInfo();
			baseDoc.setBaseId(salesOrder.getId());
			baseDoc.setBaseNumber(salesOrder.getDocNumber());
			baseDoc.setBaseType("SalesOrder");
			baseDoc.setBaseLineId(returnLine.getId());
			creditMemoLine.setBaseDocument(baseDoc);
			creditMemoLine.setRemark("");

			lines.add(creditMemoLine);
		}

		creditMemo.setLines(lines);

		String creditMemoId = this.creditMemoApi.create(accessToken.getValue(), creditMemo);
		logger.info("creditMemoId:" + creditMemoId);
	}

	@Ignore
	@Test
	public void get() {
		String id = "72";// "id":"72","docNumber":"153"

		Expand expand = null;
		expand = new Expand("*");
		CreditMemo creditMemo = creditMemoApi.get(accessToken.getValue(), id, expand);
		logger.info("creditMemo:" + creditMemo);
	}

}
