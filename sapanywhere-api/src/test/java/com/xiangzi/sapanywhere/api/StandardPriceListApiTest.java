package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.StandardPriceList;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.sapanywhere.info.PriceInfo;
import com.xiangzi.util.JSONUtil;

public class StandardPriceListApiTest extends BaseAnywhereTest {

	private StandardPriceListApi standardPriceListApi;

	@Before
	public void before() throws Exception {
		super.before();
		standardPriceListApi = new StandardPriceListApi();
	}

	@Ignore
	@Test
	public void get() {
		List<String> columnList = new ArrayList<>();
		// columnList.add("name");
		Select select = new Select();
		select.setColumnList(columnList);

		Expand expand = null;
		expand = new Expand("*");

		StandardPriceList standardPriceList = standardPriceListApi.get(accessToken.getValue(), select, expand);
		logger.info("standardPriceList:" + standardPriceList);

		// Response>>>>>>200>>>>>>{"name":"标准价格列表"}
	}

	@Ignore
	@Test
	public void sku() {
		String skuId = "13857";
		// skuId = "7034";

		// SKU 单品
		// SKU
		// "id":13857,"code":"xz-product-01","name":"祥子-产品-01"
		// Product
		// "id":13261,"code":"xz-product-01","name":"祥子-产品-01"

		List<PriceInfo> list = standardPriceListApi.sku(accessToken.getValue(), skuId);
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (PriceInfo priceInfo : list) {
			logger.info("priceInfo.json:" + JSONUtil.toJSONString(priceInfo));
		}

	}

}
