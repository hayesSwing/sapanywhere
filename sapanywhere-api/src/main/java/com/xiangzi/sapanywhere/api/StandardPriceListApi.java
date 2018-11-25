package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.StandardPriceList;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.sapanywhere.info.PriceInfo;
import com.xiangzi.util.JSONUtil;

/**
 * 标准价格列表<br/>
 * 产品-价格和促销<br/>
 * 标准价格列表只有一个，可以设置产品价格
 */
public class StandardPriceListApi extends BaseAnywhereApi<StandardPriceList> {

	@Override
	protected String getObjectUrl() {
		return "StandardPriceList";
	}

	/**
	 * Get the standard price list.
	 * 
	 * @param accessToken
	 * @return
	 */
	public StandardPriceList get(String accessToken, Select select, Expand expand) {
		String url = apiBaseUrl + getObjectUrl() + "?access_token=" + accessToken;
		if (select != null && select.getColumnList() != null) {
			StringBuffer columns = new StringBuffer();
			for (String col : select.getColumnList()) {
				columns.append(col).append(",");
			}

			if (columns.length() > 0) {
				url += "&select=" + columns.substring(0, columns.length() - 1);
			}
		}

		if (expand != null) {
			url += "&expand=" + expand.getValue();
		}

		HttpResponse httpResponse = sendGet(url);
		String content = httpResponse.getContent();

		return 200 == httpResponse.getStatus() ? JSONUtil.parseObject(content, StandardPriceList.class) : null;
	}

	/**
	 * Get standard price for a SKU using the given data.
	 * 
	 * @param accessToken
	 * @param skuId       SKU id.
	 * @return
	 */
	public List<PriceInfo> sku(String accessToken, String skuId) {
		String url = apiBaseUrl + getObjectUrl() + "/SKU/" + skuId + "?access_token=" + accessToken;

		HttpResponse httpResponse = sendGet(url);
		String content = httpResponse.getContent();

		List<PriceInfo> list = new ArrayList<>();
		if (httpResponse.isStatusOK()) {
			list.addAll(JSONUtil.parseObject(content, new TypeReference<List<PriceInfo>>() {
			}));
		}

		return list;
	}

}
