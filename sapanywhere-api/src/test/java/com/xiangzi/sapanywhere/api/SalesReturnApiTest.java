package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.SalesOrder;
import com.xiangzi.sapanywhere.bean.SalesOrderReturnLine;
import com.xiangzi.sapanywhere.bean.SalesReturn;
import com.xiangzi.sapanywhere.bean.SalesReturnProductBatchLine;
import com.xiangzi.sapanywhere.bean.SalesReturnProductLine;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.condition.Restrictions;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.sapanywhere.info.BaseDocumentLineInfo;
import com.xiangzi.sapanywhere.info.BatchNumberInfo;
import com.xiangzi.util.JSONUtil;

public class SalesReturnApiTest extends BaseAnywhereTest {

	private SalesReturnApi salesReturnApi;
	private SalesOrderApi salesOrderApi;

	@Before
	public void before() throws Exception {
		super.before();
		salesReturnApi = new SalesReturnApi();
		salesOrderApi = new SalesOrderApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = salesReturnApi.count(accessToken.getValue());
		logger.info("count:" + count);
	}

	@Ignore
	@Test
	@SuppressWarnings("unchecked")
	public void pager() {
		Filter filter = null;
		filter = Restrictions.eq("docNumber", "56");

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
		pager.setPageSize(3);
		pager.setOrderBy("id");

		pager = salesReturnApi.pager(accessToken.getValue(), pager);

		logger.info("list.totalCount:" + pager.getTotalCount());
		logger.info("list.pageSize:" + pager.getPageSize());
		logger.info("list.pageCount:" + pager.getPageCount());

		List<SalesReturn> list = (List<SalesReturn>) pager.getList();
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (SalesReturn salesReturn : list) {
			logger.info("salesReturn.json:" + JSONUtil.toJSONString(salesReturn));
		}

	}

	@Ignore
	@Test
	public void create() {
		// "id":"1405","docNumber":"2904"
		// "id":"1406","docNumber":"2905"
		String salesOrderId = "1405";
		salesOrderId = "1406";
		salesOrderId = "1417";// "id":1417,"docNumber":"2926"
		salesOrderId = "1421";// "id":1421,"docNumber":"2931"

		Expand expand = null;
		expand = new Expand("*");
		// 退货订单
		SalesOrder salesOrder = salesOrderApi.get(accessToken.getValue(), salesOrderId, expand);
		logger.info("salesOrder:" + salesOrder);

		SalesReturn salesReturn = new SalesReturn();
		salesReturn.setRemark("来源订单编号[" + salesOrder.getDocNumber() + "]");

		// {"errorCode":"P150B70083","message":"请添加产品。"}
		// lines
		List<SalesReturnProductLine> lines = new ArrayList<>();

		// Response>>>>>>400>>>>>>{"errorCode":"P153B02085","message":"无法创建销售退货单。请至少添加一行信息。"}

		SalesOrderReturnLine returnLine = salesOrder.getReturnLines().get(0);
		SalesReturnProductLine srpLine = new SalesReturnProductLine();

		BaseDocumentLineInfo baseDoc = new BaseDocumentLineInfo();
		baseDoc.setBaseId(salesOrder.getId());
		baseDoc.setBaseNumber(salesOrder.getDocNumber());
		baseDoc.setBaseType("SalesOrder");
		baseDoc.setBaseLineId(returnLine.getId());
		baseDoc.setBaseLineNumber(returnLine.getLineNumber());
		srpLine.setBaseDocument(baseDoc);

		srpLine.setReturnedQuantity(returnLine.getQuantity());

		List<SalesReturnProductBatchLine> batches = new ArrayList<>();
		SalesReturnProductBatchLine skuBatch = new SalesReturnProductBatchLine();
		// {"customFields":{},"id":"9","sku":{"id":"13898","name":"产品-05-批次管理-红色","code":"xz-product-05-red"},"status":"ACTIVE","batchCode":"20170207001","expiryTime":"2017-02-28T00:00:00.000Z","remark":null}
		BatchNumberInfo batchNumInfo = new BatchNumberInfo();
		batchNumInfo.setId("9");
		batchNumInfo.setBatchCode("20170207001");
		skuBatch.setBatch(batchNumInfo);
		skuBatch.setDocQuantity(returnLine.getQuantity());
		batches.add(skuBatch);
		srpLine.setBatches(batches);

		lines.add(srpLine);

		salesReturn.setLines(lines);

		// ------以上为必填信息------//

		String id = salesReturnApi.create(accessToken.getValue(), salesReturn);
		logger.info("id:" + id);

		// id:63

	}

	@Ignore
	@Test
	public void confirmReturn() {
		String id = "73";
		id = "75";
		
		// 接受退货入库,产品启用批次后发货需要选批次,销售退货单中也需要加入批次信息。接受退货入库,把退货产品计入相应批次库存.
		boolean confirmResult = salesReturnApi.confirmReturn(accessToken.getValue(), id);
		logger.info("confirmResult:" + confirmResult);

	}

}
