package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.MembershipEvent;
import com.xiangzi.util.JSONUtil;
import com.xiangzi.util.UTCDateUtil;

/**
 * 会员事件 <br/>
 * 
 * 客户-启用会员-会员事件<br/>
 * 
 * 事件类型:增加积分,扣减积分等.<br/>
 * 
 * @author Zhang ShuXiang
 *
 */
public class MembershipEventApi extends BaseAnywhereApi<MembershipEvent> {

	@Override
	protected String getObjectUrl() {
		return "Customers/{Customer_Id}/MembershipEvents";
	}

	/**
	 * 会员事件 <br/>
	 * 
	 * Get a list of membership events with customer id.
	 */
	public List<MembershipEvent> list(String accessToken, String customerId) {
		String dataUrl = apiBaseUrl + getObjectUrl().replace("{Customer_Id}", customerId) + "/?access_token=" + accessToken;
		HttpResponse httpResponse = sendGet(dataUrl);
		String content = httpResponse.getContent();

		List<MembershipEvent> list = new ArrayList<>();
		if (httpResponse.isStatusOK()) {
			List<Object> dataList = JSONUtil.parseObject(content, new TypeReference<List<Object>>() {
			});

			for (Object obj : dataList) {
				list.add(JSONUtil.parseObject(JSONUtil.toJSONString(obj), MembershipEvent.class));
			}
		}
		return list;
	}

	/**
	 * Create a manual type membership event for customer.<br/>
	 * "type":"MANUAL_ADJUSTMENT"
	 * 
	 * @param accessToken
	 * @param customerId
	 * @param membershipEvent
	 * @return
	 */
	public String create(String accessToken, String customerId, MembershipEvent membershipEvent) {
		String url = apiBaseUrl + getObjectUrl().replace("{Customer_Id}", customerId) + "/?access_token=" + accessToken;

		Map<String, Object> bodyDataMap = new HashMap<>();
		// bodyDataMap.put("type", membershipEvent.getType().getCode());
		// 400>>>>>>{"errorCode":"P105B00001","message":"Field type is
		// read-only.;Field point is required."}

		bodyDataMap.put("point", membershipEvent.getPoint());
		bodyDataMap.put("comment", membershipEvent.getComment());
		if (StringUtils.isNotBlank(membershipEvent.getExpirationDate())) {
			String expirationDate = UTCDateUtil.local2Utc(membershipEvent.getExpirationDate());
			bodyDataMap.put("expirationDate", expirationDate);
		}

		// bodyDataMap.put("awardType", "CREATE_ACCOUNT");
		// 400>>>>>>{"errorCode":"P105B00001","message":"Field awardType is
		// read-only."}

		String bodyString = JSONUtil.toJSONString(bodyDataMap);

		HttpResponse httpResponse = sendPost(url, bodyString);
		String content = httpResponse.getContent();

		String id = 201 == httpResponse.getStatus() ? content : null;
		return id;
	}

}
