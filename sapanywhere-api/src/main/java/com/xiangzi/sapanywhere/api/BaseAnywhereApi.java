package com.xiangzi.sapanywhere.api;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.util.JSONUtil;

public abstract class BaseAnywhereApi<T> extends BaseApi {

	protected abstract String getObjectUrl();

	protected Class<T> entityClass = null;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public BaseAnywhereApi() {
		this.entityClass = null;
		Class c = getClass();
		Type type = c.getGenericSuperclass();
		if (type instanceof ParameterizedType) {
			Type[] parameterizedType = ((ParameterizedType) type).getActualTypeArguments();
			this.entityClass = (Class<T>) parameterizedType[0];
		}
	}

	/**
	 * Get the count
	 */
	public int count(String accessToken) {
		String url = apiBaseUrl + getObjectUrl() + "/count";
		Map<String, Object> paramMap = new HashMap<String, Object>(20);
		paramMap.put("access_token", accessToken);

		HttpResponse httpResponse = sendGet(url, paramMap);

		int count = httpResponse.isStatusOK() ? Integer.valueOf(httpResponse.getContent()) : 0;
		return count;
	}

	/**
	 * Get a object by id.
	 * 
	 * @param accessToken
	 * @param id
	 * @return
	 */
	public T get(String accessToken, String id, Expand expand) {
		String url = apiBaseUrl + getObjectUrl() + "/" + id + "?access_token=" + accessToken;
		if (expand != null) {
			url += "&expand=" + expand.getValue();
		}

		HttpResponse httpResponse = sendGet(url);
		String content = httpResponse.getContent();

		return 200 == httpResponse.getStatus() ? JSONUtil.parseObject(content, entityClass) : null;
	}

	/**
	 * Delete a object by id.
	 * 
	 * @param accessToken
	 * @param id
	 * @return
	 */
	public boolean delete(String accessToken, String id) {
		String url = apiBaseUrl + getObjectUrl() + "/" + id + "?access_token=" + accessToken;

		HttpResponse httpResponse = sendDelete(url);
		return 200 == httpResponse.getStatus();
	}

	/**
	 * Get a list of object with paging (optional).
	 */
	public Pager pager(String accessToken, Pager pager) {
		Map<String, Object> paramMap = new HashMap<String, Object>(20);
		paramMap.put("access_token", accessToken);

		processPager(pager, paramMap);

		String countUrl = apiBaseUrl + getObjectUrl() + "/count";
		HttpResponse httpResponse = sendGet(countUrl, paramMap);
		int totalCount = httpResponse.isStatusOK() ? Integer.valueOf(httpResponse.getContent()) : 0;
		pager.setTotalCount(totalCount);
		logger.debug("pager>>>>>>[" + pager.getPageNumber() + "/" + pager.getPageCount() + "," + pager.getPageSize() + "," + pager.getTotalCount() + "]");

		String dataUrl = apiBaseUrl + getObjectUrl();
		httpResponse = sendGet(dataUrl, paramMap);
		String content = httpResponse.getContent();

		List<T> list = new ArrayList<>();
		if (httpResponse.isStatusOK()) {
			List<Object> dataList = JSONUtil.parseObject(content, new TypeReference<List<Object>>() {
			});

			for (Object obj : dataList) {
				list.add(JSONUtil.parseObject(JSONUtil.toJSONString(obj), entityClass));
			}

			// 下面这种写法获取到的是List<Map<String,Object>>
			// list.addAll(JSONUtil.parseObject(content, new
			// TypeReference<List<T>>() {
			// }));

		}

		pager.setList(list);
		return pager;
	}

	/**
	 * Get all objects.
	 */
	public List<T> all(String accessToken, Criteria criteria, String orderBy, String orderType) {
		Pager pager = new Pager();
		pager.setCriteria(criteria);
		pager.setPageNumber(1);
		pager.setPageSize(1000);
		pager.setOrderBy("");
		if (StringUtils.isNotBlank(orderBy)) {
			pager.setOrderBy(orderBy);
		}
		if (StringUtils.isNotBlank(orderType)) {
			pager.setOrderType(orderType);
		}

		Map<String, Object> paramMap = new HashMap<String, Object>(20);
		paramMap.put("access_token", accessToken);

		processPager(pager, paramMap);

		String dataUrl = apiBaseUrl + getObjectUrl();
		HttpResponse httpResponse = sendGet(dataUrl, paramMap);
		String content = httpResponse.getContent();

		List<T> list = new ArrayList<>();
		if (httpResponse.isStatusOK()) {
			List<Object> dataList = JSONUtil.parseObject(content, new TypeReference<List<Object>>() {
			});

			for (Object obj : dataList) {
				list.add(JSONUtil.parseObject(JSONUtil.toJSONString(obj), entityClass));
			}
		}
		return list;
	}

	public Map<String, Object> customFieldsMeta(String accessToken) {
		String url = apiBaseUrl + getObjectUrl() + "/CustomFieldsMeta?access_token=" + accessToken;

		HttpResponse httpResponse = sendGet(url);
		String content = httpResponse.getContent();
		logger.debug("content:" + content);

		return 200 == httpResponse.getStatus() ? JSONUtil.parseObject(content, new TypeReference<Map<String, Object>>() {
		}) : null;
	}

	/**
	 * 返回字段的有效值的列表.<br/>
	 * Return a list of valid values of the field.<br/>
	 * 
	 * @param accessToken
	 * @param fieldName
	 *            The field name whose valid values to return.
	 * @return
	 */
	public List<String> validValues(String accessToken, String fieldName) {
		String url = apiBaseUrl + getObjectUrl() + "/validValues?access_token=" + accessToken;

		Map<String, Object> paramMap = new HashMap<String, Object>(20);
		paramMap.put("fieldName", fieldName);

		HttpResponse httpResponse = sendGet(url, paramMap);
		String content = httpResponse.getContent();
		logger.debug("content:" + content);

		return 200 == httpResponse.getStatus() ? JSONUtil.parseObject(content, new TypeReference<List<String>>() {
		}) : null;
	}

}
