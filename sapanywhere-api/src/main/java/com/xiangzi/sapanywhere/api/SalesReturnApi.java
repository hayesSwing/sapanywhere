package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.SalesReturn;
import com.xiangzi.sapanywhere.bean.SalesReturnProductBatchLine;
import com.xiangzi.sapanywhere.bean.SalesReturnProductLine;
import com.xiangzi.util.JSONUtil;

public class SalesReturnApi extends BaseAnywhereApi<SalesReturn> {

	@Override
	protected String getObjectUrl() {
		return "SalesReturns";
	}

	/**
	 * Create a sales return using the given data.
	 * <p>
	 * 注意,如果产品启用批次并且创建销售退货单时指定了退货的批次信息，就不用再操作接受退货入库(confirmReturn)了。
	 * </p>
	 * @param accessToken
	 * @param salesReturn
	 * @return The id of the newly created sales return.
	 */
	public String create(String accessToken, SalesReturn salesReturn) {
		String url = apiBaseUrl + getObjectUrl() + "?access_token=" + accessToken;

		Map<String, Object> bodyDataMap = new HashMap<>();
		if (salesReturn.getCustomFields() != null && salesReturn.getCustomFields().size() > 0) {
			bodyDataMap.put("customFields", salesReturn.getCustomFields());
		}

		bodyDataMap.put("remark", salesReturn.getRemark());

		// 产品 -
		// {"errorCode":"P105B00001","message":"Field lines is required."}
		List<Map<String, Object>> lines = new ArrayList<>();
		for (SalesReturnProductLine srpLine : salesReturn.getLines()) {
			Map<String, Object> srpLineMap = new HashMap<>();

			Map<String, Object> baseDocMap = new HashMap<>();
			baseDocMap.put("baseId", srpLine.getBaseDocument().getBaseId());
			baseDocMap.put("baseNumber", srpLine.getBaseDocument().getBaseNumber());
			baseDocMap.put("baseType", srpLine.getBaseDocument().getBaseType());
			baseDocMap.put("baseLineId", srpLine.getBaseDocument().getBaseLineId());
			baseDocMap.put("baseLineNumber", srpLine.getBaseDocument().getBaseLineNumber());
			srpLineMap.put("baseDocument", baseDocMap);

			srpLineMap.put("returnedQuantity", srpLine.getReturnedQuantity());

			List<SalesReturnProductBatchLine> batchList = srpLine.getBatches();
			if (batchList != null) {
				List<Map<String, Object>> batches = new ArrayList<>();
				for (SalesReturnProductBatchLine srpbLine : batchList) {
					Map<String, Object> srpbLineData = new HashMap<>();
					// 批次信息
					Map<String, Object> batchNumMap = new HashMap<>();
					batchNumMap.put("id", srpbLine.getBatch().getId());
					batchNumMap.put("batchCode", srpbLine.getBatch().getBatchCode());
					srpbLineData.put("batch", batchNumMap);
					// 退货数量
					srpbLineData.put("docQuantity", srpbLine.getDocQuantity());

					batches.add(srpbLineData);
				}
				srpLineMap.put("batches", batches);
			}

			lines.add(srpLineMap);
		}
		bodyDataMap.put("lines", lines);

		String bodyString = JSONUtil.toJSONString(bodyDataMap);
		logger.info("SalesReturn.create:" + bodyString);
		HttpResponse httpResponse = sendPost(url, bodyString);
		String content = httpResponse.getContent();

		String id = 201 == httpResponse.getStatus() ? content : null;
		return id;
	}

	/**
	 * 接受退货入库<br/>
	 * <p>
	 * Description:<br/>
	 * Confirm receiving the batch products.<br/>
	 * </p>
	 * 
	 * <p>
	 * 注意:<br/>
	 * 产品启用批次后发货需要选批次,销售退货单中也需要加入批次信息。接受退货入库,把退货产品计入相应批次库存.<br/>
	 * </p>
	 * 
	 * @param accessToken
	 * @param id
	 * @return
	 */
	public boolean confirmReturn(String accessToken, String id) {
		String url = apiBaseUrl + getObjectUrl() + "/" + id + "/confirmReturn?access_token=" + accessToken;
		String bodyString = "";
		HttpResponse httpResponse = sendPost(url, bodyString);
		return 200 == httpResponse.getStatus();
	}
	
}
