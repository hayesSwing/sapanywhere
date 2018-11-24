package com.xiangzi.sapanywhere.api;

import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.SKUSalesPrice;
import com.xiangzi.sapanywhere.bean.SalesPriceList;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.util.JSONUtil;

/**
 * 销售价格列表<br/>
 * 产品-价格和促销<br/>
 */
public class SalesPriceListApi extends BaseAnywhereApi<SalesPriceList> {

	@Override
	protected String getObjectUrl() {
		return "SalesPriceLists";
	}

	/**
	 * Get sales price list using the given data.
	 * 
	 * @param accessToken
	 * @param id
	 * @param skuId
	 */
	public SKUSalesPrice getSkuPrice(String accessToken, String id, String skuId, Expand expand) {
		String url = apiBaseUrl + getObjectUrl() + "/" + id + "/SKUPrice/" + skuId + "?access_token=" + accessToken;
		if (expand != null) {
			url += "&expand=" + expand.getValue();
		}

		HttpResponse httpResponse = sendGet(url);
		String content = httpResponse.getContent();

		return 200 == httpResponse.getStatus() ? JSONUtil.parseObject(content, SKUSalesPrice.class) : null;
	}

}
