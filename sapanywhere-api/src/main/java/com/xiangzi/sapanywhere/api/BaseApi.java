package com.xiangzi.sapanywhere.api;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xiangzi.http.HTTPRequest;
import com.xiangzi.http.HttpTool;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.condition.Select;

public abstract class BaseApi {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	protected static final String accessTokenUrl = "https://my.sapanywhere.cn:443/oauth2/token/";
	protected static final String apiBaseUrl = "https://api.sapanywhere.cn:443/v1/";

	private com.xiangzi.http.HttpResponse parseHttpResponse(HttpResponse response) {
		String content = HttpTool.getResponseAsString(response);
		if (StringUtils.startsWith(content, "[")) {
			logger.debug("Response>>>>>>" + HttpTool.getStatus(response) + ">>>>>>列表数据不输出");
			// logger.debug("Response>>>>>>" + HttpTool.getStatus(response) +
			// ">>>>>>列表数据不输出" + content);
		} else {
			logger.debug("Response>>>>>>" + HttpTool.getStatus(response) + ">>>>>>" + content);
		}
		com.xiangzi.http.HttpResponse httpResponse = new com.xiangzi.http.HttpResponse();
		httpResponse.setStatus(HttpTool.getStatus(response));
		httpResponse.setContent(content);
		return httpResponse;
	}

	protected com.xiangzi.http.HttpResponse sendPost(String url, Map<String, Object> paramMap) {
		HTTPRequest httpRequest = HttpTool.url(url);
		HttpResponse response = httpRequest.form(paramMap).post();
		return parseHttpResponse(response);
	}

	protected com.xiangzi.http.HttpResponse sendPost(String url, String bodyString) {
		HTTPRequest httpRequest = new HTTPRequest(url);
		httpRequest.contentType("application/json;charset=UTF-8");
		logger.debug("Request.Post>>>>>>" + bodyString);
		HttpResponse response = httpRequest.body(bodyString).post();
		return parseHttpResponse(response);
	}

	protected com.xiangzi.http.HttpResponse sendGet(String url, Map<String, Object> paramMap) {
		HTTPRequest httpRequest = HttpTool.url(url);
		for (String key : paramMap.keySet()) {
			httpRequest.queryParam(key, paramMap.get(key).toString());
		}
		HttpResponse response = httpRequest.get();
		return parseHttpResponse(response);
	}

	protected com.xiangzi.http.HttpResponse sendGet(String url) {
		HTTPRequest httpRequest = HttpTool.url(url);
		HttpResponse response = httpRequest.get();
		return parseHttpResponse(response);
	}

	protected com.xiangzi.http.HttpResponse sendDelete(String url) {
		HTTPRequest httpRequest = HttpTool.url(url);
		HttpResponse response = httpRequest.delete();
		return parseHttpResponse(response);
	}

	protected com.xiangzi.http.HttpResponse sendPatch(String url, String bodyString) {
		HTTPRequest httpRequest = new HTTPRequest(url);
		httpRequest.contentType("application/json;charset=UTF-8");
		HttpResponse response = httpRequest.body(bodyString).patch();
		return parseHttpResponse(response);
	}
	
	private void processFilter(Filter filter, Map<String, Object> paramMap) {
		if (filter == null) {
			return;
		}
		paramMap.put("filter", filter.toSqlString());
	}

	private void processExpand(Expand expand, Map<String, Object> paramMap) {
		if (expand == null) {
			return;
		}
		paramMap.put("expand", expand.getValue());
	}

	private void processSelect(Select select, Map<String, Object> paramMap) {
		if (select != null && select.getColumnList() != null) {
			StringBuffer columns = new StringBuffer();
			for (String col : select.getColumnList()) {
				columns.append(col).append(",");
			}

			if (columns.length() > 0) {
				paramMap.put("select", columns.substring(0, columns.length() - 1));
			}
		}
	}

	protected void processPager(Pager pager, Map<String, Object> paramMap) {
		if (pager == null) {
			pager = new Pager();
		}

		Criteria criteria = pager.getCriteria();
		if (criteria != null) {
			processFilter(criteria.getFilter(), paramMap);
			processExpand(criteria.getExpand(), paramMap);
			processSelect(criteria.getSelect(), paramMap);
		}

		// Orderby
		// paramMap.put("orderby", "updateTime");//asc
		// paramMap.put("orderby", "updateTime desc");
		if (StringUtils.isNotBlank(pager.getOrderBy()) && StringUtils.isNotBlank(pager.getOrderType())) {
			paramMap.put("orderby", pager.getOrderBy() + " " + pager.getOrderType().toLowerCase());
		}

		// Offset and Limit
		// index 11 to 15
		// paramMap.put("offset", "0");
		paramMap.put("offset", pager.getOffset());
		// The maximum number of limit you can specify is 100.
		// paramMap.put("limit", "5");
		paramMap.put("limit", pager.getLimit());
	}

}
