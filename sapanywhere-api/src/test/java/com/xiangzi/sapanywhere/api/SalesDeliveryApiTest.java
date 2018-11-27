package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.SalesDelivery;
import com.xiangzi.sapanywhere.bean.SalesDeliveryProductLine;
import com.xiangzi.sapanywhere.bean.SalesOrder;
import com.xiangzi.sapanywhere.bean.SalesOrderProductLine;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.sapanywhere.info.BaseDocumentLineInfo;
import com.xiangzi.sapanywhere.info.WarehouseInfo;
import com.xiangzi.util.JSONUtil;

public class SalesDeliveryApiTest extends BaseAnywhereTest {

	private SalesDeliveryApi salesDeliveryApi;
	private SalesOrderApi salesOrderApi;

	@Before
	public void before() throws Exception {
		super.before();
		salesDeliveryApi = new SalesDeliveryApi();
		salesOrderApi = new SalesOrderApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = salesDeliveryApi.count(accessToken.getValue());
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

		pager = salesDeliveryApi.pager(accessToken.getValue(), pager);

		logger.info("list.totalCount:" + pager.getTotalCount());
		logger.info("list.pageSize:" + pager.getPageSize());
		logger.info("list.pageCount:" + pager.getPageCount());

		List<SalesDelivery> list = (List<SalesDelivery>) pager.getList();
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (SalesDelivery salesDelivery : list) {
			logger.info("salesDelivery.json:" + JSONUtil.toJSONString(salesDelivery));
		}

	}

	@Ignore
	@Test
	public void get() {
		String id = "473";
		Expand expand = null;
		expand = new Expand("*");
		SalesDelivery salesDelivery = salesDeliveryApi.get(accessToken.getValue(), id, expand);
		logger.info("salesDelivery:" + salesDelivery);
	}

	@Ignore
	@Test
	public void allocateInventory() {
		String salesOrderId = "1297";// "id":1297,"docNumber":"2761"
		WarehouseInfo warehouse = new WarehouseInfo();
		warehouse.setId("14");
		warehouse.setCode("wh-xz-zz01");
		warehouse.setName("仓库-祥子-郑州1号库");

		boolean result = salesOrderApi.allocateInventory(accessToken.getValue(), salesOrderId, warehouse);
		logger.info("result:" + result);
	}

	@Ignore
	@Test
	public void create() {
		String salesOrderId = "1297";// "id":1297,"docNumber":"2761"
		Expand expand = null;
		expand = new Expand("*");
		SalesOrder salesOrder = salesOrderApi.get(accessToken.getValue(), salesOrderId, expand);
		logger.info("salesOrder:" + salesOrder);

		SalesDelivery salesDelivery = new SalesDelivery();
		// 此字段为必填字段customer
		salesDelivery.setRemark("来源订单编号[" + salesOrder.getDocNumber() + "]");

		// lines
		List<SalesDeliveryProductLine> lines = new ArrayList<>();
		for (SalesOrderProductLine productLine : salesOrder.getProductLines()) {
			SalesDeliveryProductLine sdpLine = new SalesDeliveryProductLine();

			BaseDocumentLineInfo baseDoc = new BaseDocumentLineInfo();
			baseDoc.setBaseId(salesOrder.getId());
			baseDoc.setBaseNumber(salesOrder.getDocNumber());
			baseDoc.setBaseType("SalesOrder");
			baseDoc.setBaseLineId(productLine.getId());
			sdpLine.setBaseDocument(baseDoc);

			sdpLine.setDeliveryQuantity(productLine.getQuantity());

			lines.add(sdpLine);
		}
		salesDelivery.setLines(lines);

		String id = salesDeliveryApi.create(accessToken.getValue(), salesDelivery);
		logger.info("id:" + id);

		// 201>>>>>>475
		// id:475

		// 400>>>>>>{"errorCode":"P153B02064","message":"销售订单 2823,行 1:
		// 备货状态不是“已预留”, 不能生成销售发货。Root/line/salesOrderLineId"}

	}

	@Ignore
	@Test
	public void cancel() {
		String id = "475";
		boolean cancelResult = salesDeliveryApi.cancel(accessToken.getValue(), id);
		logger.info("cancelResult:" + cancelResult);

		// 已取消发货单再执行该操作时-true
		// 已关闭发货单再执行该操作时-false-{"errorCode":"P153B02014","message":"不合理操作。"}
	}

	@Ignore
	@Test
	public void confirmShipping() {
		String id = "475";

		boolean confirmResult = salesDeliveryApi.confirmShipping(accessToken.getValue(), id);
		logger.info("confirmResult:" + confirmResult);

		// 新创建发货单再执行该操作时-true
		// 已取消发货单再执行该操作时-false-{"errorCode":"P153B02014","message":"不合理操作。"}
		// 已发货发货单再执行该操作时-false-{"errorCode":"P153B02014","message":"不合理操作。"}
	}

}
