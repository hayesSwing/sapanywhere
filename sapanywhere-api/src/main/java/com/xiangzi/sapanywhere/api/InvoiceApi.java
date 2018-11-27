package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.Invoice;
import com.xiangzi.sapanywhere.bean.InvoiceLine;
import com.xiangzi.util.JSONUtil;

/**
 * 销售发票<br/>
 */
public class InvoiceApi extends BaseAnywhereApi<Invoice> {

	@Override
	protected String getObjectUrl() {
		return "SalesInvoices";
	}

	/**
	 * Create an invoice using the given data.
	 * 
	 * @param accessToken
	 * @param invoice
	 * @return The id of the newly created invoice.
	 */
	public String create(String accessToken, Invoice invoice) {
		String url = apiBaseUrl + getObjectUrl() + "?access_token=" + accessToken;

		Map<String, Object> bodyDataMap = new HashMap<>();
		// bodyDataMap.put("exchangeRate", invoice.getExchangeRate());
		bodyDataMap.put("remark", invoice.getRemark());

		// invoiceLines
		List<Map<String, Object>> invoiceLineList = new ArrayList<>();
		for (InvoiceLine invoiceLine : invoice.getInvoiceLines()) {
			Map<String, Object> invoiceLineMap = new HashMap<>();

			Map<String, Object> baseDocMap = new HashMap<>();
			baseDocMap.put("baseId", invoiceLine.getBaseDocument().getBaseId());
			baseDocMap.put("baseNumber", invoiceLine.getBaseDocument().getBaseNumber());
			baseDocMap.put("baseType", invoiceLine.getBaseDocument().getBaseType());
			baseDocMap.put("baseLineId", invoiceLine.getBaseDocument().getBaseLineId());
			// baseDocMap.put("baseLineNumber",
			// invoiceLine.getBaseDocument().getBaseLineNumber());
			invoiceLineMap.put("baseDocument", baseDocMap);

			invoiceLineMap.put("remark", invoiceLine.getRemark());

			// invoiceLineMap.put("quantity", invoiceLine.getQuantity());
			//
			// Map<String, Object> skuMap = new HashMap<>();
			// skuMap.put("id", invoiceLine.getSku().getId());
			// skuMap.put("name", invoiceLine.getSku().getName());
			// skuMap.put("code", invoiceLine.getSku().getCode());
			// invoiceLineMap.put("sku", skuMap);
			//
			// Map<String, Object> salesUomMap = new HashMap<>();
			// salesUomMap.put("id", invoiceLine.getSalesUom().getId());
			// salesUomMap.put("name", invoiceLine.getSalesUom().getName());
			// invoiceLineMap.put("salesUom", salesUomMap);
			//
			// Map<String, Object> inventoryUomMap = new HashMap<>();
			// inventoryUomMap.put("id", invoiceLine.getInventoryUom().getId());
			// inventoryUomMap.put("name",
			// invoiceLine.getInventoryUom().getName());
			// invoiceLineMap.put("inventoryUom", inventoryUomMap);

			invoiceLineList.add(invoiceLineMap);
		}
		bodyDataMap.put("invoiceLines", invoiceLineList);

		// // 客户
		// Map<String, Object> customerData = new HashMap<>();
		// customerData.put("id", invoice.getCustomer().getId());
		// customerData.put("name", invoice.getCustomer().getName());
		// customerData.put("code", invoice.getCustomer().getCode());
		// bodyDataMap.put("customer", customerData);

		String bodyString = JSONUtil.toJSONString(bodyDataMap);

		HttpResponse httpResponse = sendPost(url, bodyString);
		String content = httpResponse.getContent();

		String id = 201 == httpResponse.getStatus() ? content : null;
		return id;
	}

}
