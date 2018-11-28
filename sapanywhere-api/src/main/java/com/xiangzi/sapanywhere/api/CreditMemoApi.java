package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.CreditMemo;
import com.xiangzi.sapanywhere.bean.CreditMemoLine;
import com.xiangzi.util.JSONUtil;

/**
 * 销售红字发票 - CreditMemo <br/>
 */
public class CreditMemoApi extends BaseAnywhereApi<CreditMemo> {

	@Override
	protected String getObjectUrl() {
		return "/SalesCreditMemos";
	}

	/**
	 * Create a credit memo using the given data.
	 * 
	 * @param accessToken
	 * @param creditMemo
	 * @return The id of the newly created credit memo.
	 */
	public String create(String accessToken, CreditMemo creditMemo) {
		String url = apiBaseUrl + getObjectUrl() + "?access_token=" + accessToken;

		Map<String, Object> bodyDataMap = new HashMap<>();
		bodyDataMap.put("remark", creditMemo.getRemark());

		// lines
		List<Map<String, Object>> lineList = new ArrayList<>();
		for (CreditMemoLine creditMemoLine : creditMemo.getLines()) {
			Map<String, Object> lineMap = new HashMap<>();

			Map<String, Object> baseDocMap = new HashMap<>();
			baseDocMap.put("baseId", creditMemoLine.getBaseDocument().getBaseId());
			baseDocMap.put("baseNumber", creditMemoLine.getBaseDocument().getBaseNumber());
			baseDocMap.put("baseType", creditMemoLine.getBaseDocument().getBaseType());
			baseDocMap.put("baseLineId", creditMemoLine.getBaseDocument().getBaseLineId());
			baseDocMap.put("baseLineNumber", creditMemoLine.getBaseDocument().getBaseLineNumber());
			lineMap.put("baseDocument", baseDocMap);

			lineMap.put("remark", creditMemoLine.getRemark());

			lineList.add(lineMap);
		}
		bodyDataMap.put("lines", lineList);

		String bodyString = JSONUtil.toJSONString(bodyDataMap);

		HttpResponse httpResponse = sendPost(url, bodyString);
		String content = httpResponse.getContent();

		String id = 201 == httpResponse.getStatus() ? content : null;
		return id;
	}

}
