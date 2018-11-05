package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.Customer;
import com.xiangzi.sapanywhere.bean.CustomerType;
import com.xiangzi.sapanywhere.info.ContactInfo;
import com.xiangzi.util.JSONUtil;

public class CustomerApi extends BaseAnywhereApi<Customer> {

	@Override
	protected String getObjectUrl() {
		return "Customers";
	}

	/**
	 * 联系人 <br/>
	 * 
	 * Get a list of contacts with customer id.
	 */
	public List<ContactInfo> contacts(String accessToken, String customerId) {
		String dataUrl = apiBaseUrl + getObjectUrl() + "/" + customerId + "/Contacts?access_token=" + accessToken;
		HttpResponse httpResponse = sendGet(dataUrl);
		String content = httpResponse.getContent();

		List<ContactInfo> list = new ArrayList<>();
		if (httpResponse.isStatusOK()) {
			List<Object> dataList = JSONUtil.parseObject(content, new TypeReference<List<Object>>() {
			});

			for (Object obj : dataList) {
				list.add(JSONUtil.parseObject(JSONUtil.toJSONString(obj), ContactInfo.class));
			}
		}
		return list;
	}

	/**
	 * 是否启用会员 <br/>
	 * 
	 * <p>
	 * 一旦你取消启用会员功能，所有该客户的会员事件和数据都将被清空，继续取消启用吗？<br/>
	 * disableMembership,After disabled, all membership events would be
	 * removed.<br/>
	 * enableMembership,After enabled, the customer can add event.<br/>
	 * </p>
	 * 
	 * @param accessToken
	 * @param id
	 * @param enable
	 *            true-启用会员,false-取消会员
	 * @return
	 */
	public boolean enableMembership(String accessToken, String id, boolean enable) {
		String url = apiBaseUrl + getObjectUrl() + "/" + id + "/" + (enable ? "enableMembership" : "disableMembership") + "?access_token=" + accessToken;

		String bodyString = "";
		HttpResponse httpResponse = sendPost(url, bodyString);
		// 200>>>>>>78134
		return 200 == httpResponse.getStatus();
	}

	/**
	 * Create a sales order using the given data.
	 * 
	 * @param accessToken
	 * @param customer
	 * @return The id of the newly created sales order.
	 */
	public String create(String accessToken, Customer customer) {
		String url = apiBaseUrl + getObjectUrl() + "?access_token=" + accessToken;

		Map<String, Object> bodyDataMap = new HashMap<>();
		bodyDataMap.put("customerType", customer.getType());
		bodyDataMap.put("stage", customer.getStage());
		bodyDataMap.put("status", customer.getStatus());
		bodyDataMap.put("marketingStatus", customer.getMarketingStatus().getCode());

		// 以下为非必填项
		bodyDataMap.put("customerName", customer.getCorporateName());
		bodyDataMap.put("lastName", customer.getLastName());
		bodyDataMap.put("firstName", customer.getFirstName());
		bodyDataMap.put("membershipNo", customer.getMembershipNo());// 不能重复

		bodyDataMap.put("remark", customer.getRemark());

		bodyDataMap.put("phone", customer.getPhone());
		bodyDataMap.put("fax", customer.getFax());
		bodyDataMap.put("email", customer.getEmail());// 不能重复
		bodyDataMap.put("webSite", customer.getWebSite());

		bodyDataMap.put("vatRegistrationNumber", customer.getVatRegistrationNumber());
		bodyDataMap.put("taxType", customer.getTaxType());

		bodyDataMap.put("creditLimit", customer.getCreditLimit());
		bodyDataMap.put("creditLimitThreshold", customer.getCreditLimitThreshold());

		// Only used for individual type customer.
		if (StringUtils.equals(CustomerType.INDIVIDUAL_CUSTOMER.getCode(), customer.getType().getCode())) {
			bodyDataMap.put("mobile", customer.getMobile());// 个人客户手机号码不能重复
			bodyDataMap.put("gender", customer.getGender().getCode());
			bodyDataMap.put("dateOfBirth", customer.getDateOfBirth());
			bodyDataMap.put("title", customer.getTitle());
			bodyDataMap.put("position", customer.getPosition());
		}

		String bodyString = JSONUtil.toJSONString(bodyDataMap);
		HttpResponse httpResponse = sendPost(url, bodyString);
		String content = httpResponse.getContent();

		String id = 201 == httpResponse.getStatus() ? content : null;
		return id;
	}

	/**
	 * Update a customer using the given data.
	 * 
	 * @param accessToken
	 * @param customer
	 * @return
	 */
	public boolean update(String accessToken, Customer customer) {
		String id = customer.getId();
		if (StringUtils.isBlank(id)) {
			return false;
		}
		String url = apiBaseUrl + getObjectUrl() + "/" + id + "?access_token=" + accessToken;

		Map<String, Object> bodyDataMap = new HashMap<>();
		bodyDataMap.put("customerType", customer.getType());
		bodyDataMap.put("stage", customer.getStage());
		bodyDataMap.put("status", customer.getStatus());
		if (customer.getMarketingStatus() != null) {
			// 修改时该字段可为空
			bodyDataMap.put("marketingStatus", customer.getMarketingStatus().getCode());
		}

		// 以下为非必填项
		bodyDataMap.put("customerName", customer.getCorporateName());
		bodyDataMap.put("lastName", customer.getLastName());
		bodyDataMap.put("firstName", customer.getFirstName());
		bodyDataMap.put("membershipNo", customer.getMembershipNo());// 不能重复

		bodyDataMap.put("remark", customer.getRemark());

		bodyDataMap.put("phone", customer.getPhone());
		bodyDataMap.put("fax", customer.getFax());
		bodyDataMap.put("email", customer.getEmail());// 不能重复
		bodyDataMap.put("webSite", customer.getWebSite());

		bodyDataMap.put("vatRegistrationNumber", customer.getVatRegistrationNumber());
		bodyDataMap.put("taxType", customer.getTaxType());

		bodyDataMap.put("creditLimit", customer.getCreditLimit());
		bodyDataMap.put("creditLimitThreshold", customer.getCreditLimitThreshold());

		// Only used for individual type customer.
		if (StringUtils.equals(CustomerType.INDIVIDUAL_CUSTOMER.getCode(), customer.getType().getCode())) {
			bodyDataMap.put("mobile", customer.getMobile());// 个人客户手机号码不能重复
			bodyDataMap.put("gender", customer.getGender().getCode());
			bodyDataMap.put("dateOfBirth", customer.getDateOfBirth());
			bodyDataMap.put("title", customer.getTitle());
			bodyDataMap.put("position", customer.getPosition());
		}

		String bodyString = JSONUtil.toJSONString(bodyDataMap);
		HttpResponse httpResponse = sendPatch(url, bodyString);

		return 200 == httpResponse.getStatus();
	}

}
