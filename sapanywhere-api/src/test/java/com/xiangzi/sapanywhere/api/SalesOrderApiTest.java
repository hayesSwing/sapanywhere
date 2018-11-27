package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.PricingMethod;
import com.xiangzi.sapanywhere.bean.SalesOrder;
import com.xiangzi.sapanywhere.bean.SalesOrderProductLine;
import com.xiangzi.sapanywhere.bean.SalesOrderReturnLine;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.sapanywhere.info.BaseDocumentLineInfo;
import com.xiangzi.util.DateUtils;
import com.xiangzi.util.JSONUtil;
import com.xiangzi.util.RandomUtil;

public class SalesOrderApiTest extends BaseAnywhereTest {

	private SalesOrderApi salesOrderApi;

	@Before
	public void before() throws Exception {
		super.before();
		salesOrderApi = new SalesOrderApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = salesOrderApi.count(accessToken.getValue());
		logger.info("count:" + count);
	}

	@Ignore
	@Test
	@SuppressWarnings("unchecked")
	public void pager() {
		Filter filter = null;
		// filter = Restrictions.eq("pricingMethod", "NET_PRICE");// 计价方式-不含税
		// filter = Restrictions.eq("pricingMethod", "GROSS_PRICE");// 计价方式-含税
		// filter = Restrictions.eq("docNumber", "2899");
		// filter = Restrictions.eq("docNumber", "2904");
		// filter = Restrictions.eq("docNumber", "2903");

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
		pager.setPageSize(2);
		// pager.setOrderBy("");

		pager = salesOrderApi.pager(accessToken.getValue(), pager);

		logger.info("list.totalCount:" + pager.getTotalCount());
		logger.info("list.pageSize:" + pager.getPageSize());
		logger.info("list.pageCount:" + pager.getPageCount());

		List<SalesOrder> list = (List<SalesOrder>) pager.getList();
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (SalesOrder salesOrder : list) {
			logger.info("salesOrder.json:" + JSONUtil.toJSONString(salesOrder));
		}

	}

	@Ignore
	@Test
	public void get() {
		String id = "1297";// "id":1297,"docNumber":"2761"
		Expand expand = null;
		expand = new Expand("*");
		SalesOrder salesOrder = salesOrderApi.get(accessToken.getValue(), id, expand);
		logger.info("salesOrder:" + salesOrder);
	}

	@Ignore
	@Test
	public void customFieldsMeta() {
		Map<String, Object> customFields = salesOrderApi.customFieldsMeta(accessToken.getValue());
		logger.info("customFields:" + customFields);
	}

	@Ignore
	@Test
	public void createReturnOrder() {
		String salesOrderId = "1409";// "id":"1409","docNumber":"2908"
		Expand expand = null;
		expand = new Expand("*");
		SalesOrder salesOrder = salesOrderApi.get(accessToken.getValue(), salesOrderId, expand);
		logger.info("salesOrder:" + salesOrder);
		
		// 计价方式/计价方法
		PricingMethod pricingMethod = salesOrder.getPricingMethod();// 销售订单的计价方式与销售渠道设定的计价方式一致，并且无法修改。

		SalesOrder returnOrder = new SalesOrder();
		// 自定义字段
		Map<String, Object> customFields = new HashMap<>();
		// {fieldName=ext_default_operator,fieldLabel=操作员,fieldType=String}
		customFields.put("ext_default_operator", "xiangzi");
		returnOrder.setCustomFields(customFields);

		returnOrder.setExtOrderId("xz-th-" + DateUtils.format(new Date(), DateUtils.DATETIME_FORMAT) + RandomUtil.randomInt(10, 20));

		// 销售渠道
		returnOrder.setChannel(salesOrder.getChannel());
		// 客户
		returnOrder.setCustomer(salesOrder.getCustomer());
		// 交易货币
		returnOrder.setCurrency(salesOrder.getCurrency());
		// 产品
		List<SalesOrderReturnLine> returnLines = new ArrayList<>();
		for (SalesOrderProductLine salesOrderProductLine : salesOrder.getProductLines()) {
			SalesOrderReturnLine sorLine = new SalesOrderReturnLine();
			sorLine.setQuantity(salesOrderProductLine.getQuantity());// 数量
			sorLine.setSalesUom(salesOrderProductLine.getSalesUom());// 销售计量单位
			sorLine.setSku(salesOrderProductLine.getSku());

			// 以下是非必填项
			// 指示如何计算销售订单。
			sorLine.setCalculationBase(salesOrderProductLine.getCalculationBase());

			if (StringUtils.equalsIgnoreCase(PricingMethod.GROSS_PRICE.getCode(), pricingMethod.getCode())) {
				// 单价/销售单位单价
				sorLine.setGrossUnitPrice(salesOrderProductLine.getGrossUnitPrice());// 原价
				// 含税总额
				sorLine.setGrossAmount(salesOrderProductLine.getGrossAmount());
			} else if (StringUtils.equalsIgnoreCase(PricingMethod.NET_PRICE.getCode(), pricingMethod.getCode())) {
				// 单价/销售单位单价
				sorLine.setNetUnitPrice(salesOrderProductLine.getNetUnitPrice());// 原价
				// 不含税总额
				sorLine.setNetAmount(salesOrderProductLine.getNetAmount());
			}

			// 原单据
			BaseDocumentLineInfo baseDoc = new BaseDocumentLineInfo();
			baseDoc.setBaseId(salesOrder.getId());
			baseDoc.setBaseNumber(salesOrder.getDocNumber());
			baseDoc.setBaseType("SalesOrder");
			baseDoc.setBaseLineId(salesOrderProductLine.getId());
			sorLine.setBaseDocument(baseDoc);

			returnLines.add(sorLine);
		}

		returnOrder.setReturnLines(returnLines);

		// ------以上为必填信息------//
		// 非必填项
		returnOrder.setFulfillmentMethod(salesOrder.getFulfillmentMethod());
		// 指示如何计算销售订单。
		returnOrder.setHeaderCalculationBase(salesOrder.getHeaderCalculationBase());

		// 计价方式
		returnOrder.setPricingMethod(pricingMethod);// 销售订单的计价方式与销售渠道设定的计价方式一致，并且无法修改。
		if (StringUtils.equalsIgnoreCase(PricingMethod.GROSS_PRICE.getCode(), pricingMethod.getCode())) {
			// 含税总额
			returnOrder.setGrossTotal(salesOrder.getGrossTotal());
		} else if (StringUtils.equalsIgnoreCase(PricingMethod.NET_PRICE.getCode(), pricingMethod.getCode())) {
			// 不含税总额
			returnOrder.setNetTotal(salesOrder.getNetTotal());
		}

		// Return reason.Used in return order only.
		returnOrder.setReturnReason("我要退货");

		String id = salesOrderApi.createReturnOrder(accessToken.getValue(), returnOrder);
		logger.info("id:" + id);

		// 基于同一销售订单的所有退货订单中的退货数量总和已超过原销售订单中的产品行数量。
	}

}
