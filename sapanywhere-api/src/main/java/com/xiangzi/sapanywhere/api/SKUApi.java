package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.SKU;
import com.xiangzi.sapanywhere.info.PriceInfo;
import com.xiangzi.sapanywhere.info.SKUAllWarehouseInfo;
import com.xiangzi.sapanywhere.info.SKUWarehouseInfo;
import com.xiangzi.sapanywhere.info.UomPriceInfo;
import com.xiangzi.util.JSONUtil;

/**
 * SKU = Stock Keeping Unit (库存量单位)<br/>
 * <p>
 * 即库存进出计量的单位，可以是以件，盒，托盘等为单位。 SKU这是对于大型连锁超市DC（配送中心）物流管理的一个必要的方法。
 * 现在已经被我们引申为产品统一编号的简称，每种产品均对应有唯一的SKU号
 * </p>
 * 
 * <p>
 * 单品即SKU，可进行库存管理的最小单元，可根据产品不同的属性进行单品管理。如同一产品有多色系，多口味，多尺寸等等，就可以使用单品功能。
 * </p>
 */
public class SKUApi extends BaseAnywhereApi<SKU> {

	@Override
	protected String getObjectUrl() {
		return "SKUs";
	}

	/**
	 * Standard SKU price
	 * 
	 * @param accessToken
	 * @param id
	 * @return
	 */
	public List<PriceInfo> getStandardPrice(String accessToken, String id) {
		String url = apiBaseUrl + getObjectUrl() + "/" + id + "/StandardPrice?access_token=" + accessToken;

		HttpResponse httpResponse = sendGet(url);
		String content = httpResponse.getContent();

		List<PriceInfo> list = new ArrayList<>();
		if (httpResponse.isStatusOK()) {
			list.addAll(JSONUtil.parseObject(content, new TypeReference<List<PriceInfo>>() {
			}));
		}

		return list;
	}

	/**
	 * SKU price in a channel.
	 * 
	 * @param accessToken
	 * @param id
	 *            required,SKU id.
	 * @param channelId
	 *            required,Channel id.
	 * @param customerId
	 *            Customer id.
	 * @return
	 */
	public List<UomPriceInfo> getChannelPrices(String accessToken, String id, String channelId, String customerId) {
		String url = apiBaseUrl + getObjectUrl() + "/" + id + "/getChannelPrices?access_token=" + accessToken;
		url += "&channelId=" + channelId + "&customerId=" + (StringUtils.isBlank(customerId) ? "" : customerId);

		HttpResponse httpResponse = sendGet(url);
		String content = httpResponse.getContent();

		List<UomPriceInfo> list = new ArrayList<>();
		if (httpResponse.isStatusOK()) {
			list.addAll(JSONUtil.parseObject(content, new TypeReference<List<UomPriceInfo>>() {
			}));
		}

		return list;
	}

	/**
	 * All Warehouse Info of a SKU
	 * 
	 * @param accessToken
	 * @param id
	 * @return
	 */
	public SKUAllWarehouseInfo getWarehouseInfos(String accessToken, String id) {
		String url = apiBaseUrl + getObjectUrl() + "/" + id + "/WarehouseInfos?access_token=" + accessToken;

		HttpResponse httpResponse = sendGet(url);
		String content = httpResponse.getContent();

		return 200 == httpResponse.getStatus() ? JSONUtil.parseObject(content, SKUAllWarehouseInfo.class) : null;
	}

	/**
	 * SKU Warehouse Info
	 * 
	 * @param accessToken
	 * @param id
	 *            SKU id.
	 * @param warehouseId
	 *            One warehouse id of a SKU.
	 * @return
	 */
	public SKUWarehouseInfo getWarehouseInfos(String accessToken, String id, String warehouseId) {
		String url = apiBaseUrl + getObjectUrl() + "/" + id + "/WarehouseInfos/" + (StringUtils.isBlank(warehouseId) ? "null" : warehouseId) + "?access_token=" + accessToken;

		HttpResponse httpResponse = sendGet(url);
		String content = httpResponse.getContent();

		return 200 == httpResponse.getStatus() ? JSONUtil.parseObject(content, SKUWarehouseInfo.class) : null;
	}

}
