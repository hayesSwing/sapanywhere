package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.SKU;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.sapanywhere.info.PriceInfo;
import com.xiangzi.sapanywhere.info.SKUAllWarehouseInfo;
import com.xiangzi.sapanywhere.info.SKUWarehouseInfo;
import com.xiangzi.sapanywhere.info.UomPriceInfo;
import com.xiangzi.util.JSONUtil;

public class SKUApiTest extends BaseAnywhereTest {

	private SKUApi skuApi;

	@Before
	public void before() throws Exception {
		super.before();
		skuApi = new SKUApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = skuApi.count(accessToken.getValue());
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
		pager.setOrderType("desc");

		pager = skuApi.pager(accessToken.getValue(), pager);

		logger.info("list.totalCount:" + pager.getTotalCount());
		logger.info("list.pageSize:" + pager.getPageSize());
		logger.info("list.pageCount:" + pager.getPageCount());

		List<SKU> list = (List<SKU>) pager.getList();
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (SKU sku : list) {
			logger.info("sku.json:" + JSONUtil.toJSONString(sku));
		}

	}

	@Ignore
	@Test
	public void get() {
		// SKU 单品
		// SKU
		// "id":13857,"code":"xz-product-01","name":"祥子-产品-01"
		// Product
		// "id":13261,"code":"xz-product-01","name":"祥子-产品-01"

		// Product:
		// "id":13275,"code":"xz-product-04","name":"产品-04"
		// "skus":[
		// {"id":13875,"name":"产品-04-黑色","code":"xz-product-04-black"},
		// {"id":13874,"name":"产品-04-红色","code":"xz-product-04-red"}
		// ]

		String skuId = "13857";
		skuId = "13874";
		skuId = "13876";
		
		Expand expand = null;
		//expand = new Expand("*");

		SKU sku = skuApi.get(accessToken.getValue(), skuId, expand);
		logger.info("sku:" + sku);
		
	}

	@Ignore
	@Test
	public void getStandardPrice() {
		String skuId = "13857";

		// SKU 单品
		// SKU
		// "id":13857,"code":"xz-product-01","name":"祥子-产品-01"
		// Product
		// "id":13261,"code":"xz-product-01","name":"祥子-产品-01"

		List<PriceInfo> list = skuApi.getStandardPrice(accessToken.getValue(), skuId);
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (PriceInfo priceInfo : list) {
			logger.info("priceInfo.json:" + JSONUtil.toJSONString(priceInfo));
		}
	}

	@Ignore
	@Test
	public void getChannelPrices() {
		String skuId = "13857";
		String channelId = "60";
		String customerId = "";
		customerId = null;

		List<UomPriceInfo> list = skuApi.getChannelPrices(accessToken.getValue(), skuId, channelId, customerId);
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (UomPriceInfo uomPriceInfo : list) {
			logger.info("uomPriceInfo.json:" + JSONUtil.toJSONString(uomPriceInfo));
		}

	}

	@Ignore
	@Test
	public void getWarehouseInfos() {
		String skuId = "13857";
		SKUAllWarehouseInfo skuAllWarehouseInfo = skuApi.getWarehouseInfos(accessToken.getValue(), skuId);
		logger.info("skuAllWarehouseInfo.json:" + JSONUtil.toJSONString(skuAllWarehouseInfo));

		List<SKUWarehouseInfo> list = skuAllWarehouseInfo.getWarehouseInfoList();
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (SKUWarehouseInfo skuWarehouseInfo : list) {
			logger.info("skuWarehouseInfo.json:" + JSONUtil.toJSONString(skuWarehouseInfo));
		}

	}

	@Ignore
	@Test
	public void getWarehouseInfosByWarehouseId() {
		String skuId = "13857";
		String warehouseId = "14";

		SKUWarehouseInfo skuWarehouseInfo = skuApi.getWarehouseInfos(accessToken.getValue(), skuId, warehouseId);
		logger.info("skuWarehouseInfo.json:" + JSONUtil.toJSONString(skuWarehouseInfo));
	}

}
