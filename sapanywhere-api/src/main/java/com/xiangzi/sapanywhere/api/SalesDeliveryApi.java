package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.SalesDelivery;
import com.xiangzi.sapanywhere.bean.SalesDeliveryProductBatchLine;
import com.xiangzi.sapanywhere.bean.SalesDeliveryProductLine;
import com.xiangzi.sapanywhere.info.WarehouseInfo;
import com.xiangzi.util.JSONUtil;

public class SalesDeliveryApi extends BaseAnywhereApi<SalesDelivery> {

	@Override
	protected String getObjectUrl() {
		return "SalesDeliveries";
	}

	/**
	 * Create a delivery using the given data.
	 * 
	 * @param accessToken
	 * @param salesDelivery
	 * @return The id of the newly created sales delivery.
	 */
	public String create(String accessToken, SalesDelivery salesDelivery) {
		String url = apiBaseUrl + getObjectUrl() + "?access_token=" + accessToken;

		Map<String, Object> bodyDataMap = new HashMap<>();
		bodyDataMap.put("remark", salesDelivery.getRemark());

		// 仓库
		if (salesDelivery.getWarehouse() != null) {
			WarehouseInfo warehouse = salesDelivery.getWarehouse();
			Map<String, Object> warehouseData = new HashMap<>();
			warehouseData.put("id", warehouse.getId());
			bodyDataMap.put("warehouse", warehouseData);
		}

		// lines - Field lines is required.
		List<Map<String, Object>> lineList = new ArrayList<>();
		for (SalesDeliveryProductLine sdpLine : salesDelivery.getLines()) {
			Map<String, Object> sdpLineMap = new HashMap<>();

			Map<String, Object> baseDocMap = new HashMap<>();
			baseDocMap.put("baseId", sdpLine.getBaseDocument().getBaseId());
			baseDocMap.put("baseNumber", sdpLine.getBaseDocument().getBaseNumber());
			baseDocMap.put("baseType", sdpLine.getBaseDocument().getBaseType());
			baseDocMap.put("baseLineId", sdpLine.getBaseDocument().getBaseLineId());
			sdpLineMap.put("baseDocument", baseDocMap);
			sdpLineMap.put("deliveryQuantity", sdpLine.getDeliveryQuantity());

			List<SalesDeliveryProductBatchLine> batchList = sdpLine.getBatches();
			if (batchList != null) {
				List<Map<String, Object>> batches = new ArrayList<>();
				for (SalesDeliveryProductBatchLine dpbLine : batchList) {
					Map<String, Object> dpbLineData = new HashMap<>();
					// 批次信息
					Map<String, Object> batchNumMap = new HashMap<>();
					batchNumMap.put("id", dpbLine.getBatch().getId());
					batchNumMap.put("batchCode", dpbLine.getBatch().getBatchCode());
					dpbLineData.put("batch", batchNumMap);
					// 发货数量
					dpbLineData.put("docQuantity", dpbLine.getDocQuantity());
					
					batches.add(dpbLineData);
				}
				sdpLineMap.put("batches", batches);
			}

			lineList.add(sdpLineMap);
		}
		bodyDataMap.put("lines", lineList);

		String bodyString = JSONUtil.toJSONString(bodyDataMap);
		logger.info("SalesDelivery.create:" + bodyString);

		HttpResponse httpResponse = sendPost(url, bodyString);
		String content = httpResponse.getContent();

		String id = 201 == httpResponse.getStatus() ? content : null;
		return id;
	}

	/**
	 * 取消
	 * 
	 * @param accessToken
	 * @param id
	 * @return
	 */
	public boolean cancel(String accessToken, String id) {
		String url = apiBaseUrl + getObjectUrl() + "/" + id + "/cancel?access_token=" + accessToken;
		String bodyString = "";
		HttpResponse httpResponse = sendPost(url, bodyString);
		return 200 == httpResponse.getStatus();
	}

	/**
	 * 确认发货
	 * 
	 * @param accessToken
	 * @param id
	 * @return
	 */
	public boolean confirmShipping(String accessToken, String id) {
		String url = apiBaseUrl + getObjectUrl() + "/" + id + "/confirmShipping?access_token=" + accessToken;
		String bodyString = "";
		HttpResponse httpResponse = sendPost(url, bodyString);
		return 200 == httpResponse.getStatus();
	}

}
