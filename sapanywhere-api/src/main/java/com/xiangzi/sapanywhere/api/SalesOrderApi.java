package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.FulfillmentMethod;
import com.xiangzi.sapanywhere.bean.SalesOrder;
import com.xiangzi.sapanywhere.bean.SalesOrderProductLine;
import com.xiangzi.sapanywhere.bean.SalesOrderReturnLine;
import com.xiangzi.sapanywhere.bean.SalesOrderType;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.info.AmountInfo;
import com.xiangzi.sapanywhere.info.WarehouseInfo;
import com.xiangzi.util.JSONUtil;

public class SalesOrderApi extends BaseAnywhereApi<SalesOrder> {

	@Override
	protected String getObjectUrl() {
		return "SalesOrders";
	}

	/**
	 * Create a sales order using the given data.
	 * 
	 * @param accessToken
	 * @param salesOrder
	 * @return The id of the newly created sales order.
	 */
	public String create(String accessToken, SalesOrder salesOrder) {
		String url = apiBaseUrl + getObjectUrl() + "?access_token=" + accessToken;

		Map<String, Object> bodyDataMap = new HashMap<>();
		if (salesOrder.getCustomFields() != null && salesOrder.getCustomFields().size() > 0) {
			bodyDataMap.put("customFields", salesOrder.getCustomFields());
		}

		bodyDataMap.put("extOrderId", salesOrder.getExtOrderId());
		bodyDataMap.put("orderTime", salesOrder.getOrderTime());

		// 订单日期应早于到货日期。
		if (StringUtils.isNotBlank(salesOrder.getDeliveryTime())) {
			bodyDataMap.put("deliveryTime", salesOrder.getDeliveryTime());
		}

		// 销售渠道 - Field channel is required.
		Map<String, Object> salesChannelData = new HashMap<>();
		salesChannelData.put("id", salesOrder.getChannel().getId());
		// salesChannelData.put("name", salesOrder.getChannel().getName());
		bodyDataMap.put("channel", salesChannelData);

		// 客户 - Field customer is required.
		Map<String, Object> customerData = new HashMap<>();
		customerData.put("id", salesOrder.getCustomer().getId());
		// customerData.put("name", salesOrder.getCustomer().getName());
		// customerData.put("code", salesOrder.getCustomer().getCode());
		bodyDataMap.put("customer", customerData);

		// 货币 - Field currency is required
		Map<String, Object> currencyData = new HashMap<>();
		currencyData.put("code", salesOrder.getCurrency().getCode());
		// currencyData.put("isoCode", salesOrder.getCurrency().getIsoCode());
		bodyDataMap.put("currency", currencyData);

		// 产品 -
		// Response>>>>>>400>>>>>>{"errorCode":"P150B70083","message":"请添加产品。"}
		List<Map<String, Object>> productList = new ArrayList<>();
		for (SalesOrderProductLine salesOrderProductLine : salesOrder.getProductLines()) {
			Map<String, Object> productMap = new HashMap<>();
			productMap.put("quantity", salesOrderProductLine.getQuantity());

			Map<String, Object> salesUomMap = new HashMap<>();
			salesUomMap.put("id", salesOrderProductLine.getSalesUom().getId());
			// salesUomMap.put("name",
			// salesOrderProductLine.getSalesUom().getName());
			productMap.put("salesUom", salesUomMap);

			productMap.put("remark", salesOrderProductLine.getRemark());
			productMap.put("referenceCode", salesOrderProductLine.getReferenceCode());

			Map<String, Object> skuMap = new HashMap<>();
			skuMap.put("id", salesOrderProductLine.getSku().getId());
			// skuMap.put("name", salesOrderProduct.getSku().getName());
			// skuMap.put("code", salesOrderProductLine.getSku().getCode());
			productMap.put("sku", skuMap);

			// 以下是非必填项
			// 指示如何计算销售订单。
			if (salesOrderProductLine.getCalculationBase() != null) {
				productMap.put("calculationBase", salesOrderProductLine.getCalculationBase().getCode());
			}

			// 单价/销售单位单价
			// {"errorCode":"P150B70002","message":"价格不能为零。"}
			if (salesOrderProductLine.getGrossUnitPrice() != null) {
				productMap.put("grossUnitPrice", salesOrderProductLine.getGrossUnitPrice());
			}
			if (salesOrderProductLine.getNetUnitPrice() != null) {
				productMap.put("netUnitPrice", salesOrderProductLine.getNetUnitPrice());
			}

			// 销售订单的计价方式是跟所选销售渠道的计价方式一致的，不能修改。
			// {"errorCode":"P150B70002","message":"价格不能为零。"}
			// 含税总额
			if (salesOrderProductLine.getGrossAmount() != null) {
				AmountInfo grossAmount = salesOrderProductLine.getGrossAmount();
				Map<String, Object> grossAmountData = new HashMap<>();
				grossAmountData.put("amount", grossAmount.getAmount());
				productMap.put("grossAmount", grossAmountData);
			}

			// 不含税总额
			if (salesOrderProductLine.getNetAmount() != null) {
				AmountInfo netAmount = salesOrderProductLine.getNetAmount();
				Map<String, Object> netAmountData = new HashMap<>();
				netAmountData.put("amount", netAmount.getAmount());
				productMap.put("netAmount", netAmountData);
			}

			productList.add(productMap);
		}
		bodyDataMap.put("productLines", productList);
		// ----------以下为非必填项----------//
		// 交付方式 - 交付方式不处理实际的发货和库存业务
		if (salesOrder.getFulfillmentMethod() != null) {
			FulfillmentMethod fulfillmentMethod = salesOrder.getFulfillmentMethod();
			Map<String, Object> fulfillmentMethodData = new HashMap<>();
			fulfillmentMethodData.put("id", fulfillmentMethod.getId());
			bodyDataMap.put("fulfillmentMethod", fulfillmentMethodData);
		}

		// 指示如何计算销售订单。
		if (salesOrder.getHeaderCalculationBase() != null) {
			bodyDataMap.put("headerCalculationBase", salesOrder.getHeaderCalculationBase().getCode());
		}

		// 销售订单的计价方式是跟所选销售渠道的计价方式一致的，不能修改。
		// 计价方式
		if (salesOrder.getPricingMethod() != null) {
			// 这个代码无效
			bodyDataMap.put("pricingMethod", salesOrder.getPricingMethod().getCode());
		}

		// 销售订单的计价方式是跟所选销售渠道的计价方式一致的，不能修改。
		// 含税总额
		if (salesOrder.getGrossTotal() != null) {
			AmountInfo grossTotal = salesOrder.getGrossTotal();
			Map<String, Object> grossTotalData = new HashMap<>();
			grossTotalData.put("amount", grossTotal.getAmount());
			bodyDataMap.put("grossTotal", grossTotalData);
		}
		// 不含税总额
		if (salesOrder.getNetTotal() != null) {
			AmountInfo netTotal = salesOrder.getNetTotal();
			Map<String, Object> netTotalData = new HashMap<>();
			netTotalData.put("amount", netTotal.getAmount());
			bodyDataMap.put("netTotal", netTotalData);
		}

		String bodyString = JSONUtil.toJSONString(bodyDataMap);
		logger.info("SalesOrder.create:" + bodyString);
		HttpResponse httpResponse = sendPost(url, bodyString);
		String content = httpResponse.getContent();

		String id = 201 == httpResponse.getStatus() ? content : null;
		return id;
	}

	/**
	 * 分配库存
	 * 
	 * @param accessToken
	 * @param id
	 * @param warehouse
	 * @return
	 */
	public boolean allocateInventory(String accessToken, String id, WarehouseInfo warehouse) {
		if (StringUtils.isBlank(id)) {
			return false;
		}

		SalesOrder salesOrder = this.get(accessToken, id, new Expand("*"));
		if (salesOrder == null) {
			return false;
		}

		String url = apiBaseUrl + getObjectUrl() + "/" + id + "?access_token=" + accessToken;

		Map<String, Object> bodyDataMap = new HashMap<>();

		// 售货订单
		List<Map<String, Object>> productList = new ArrayList<>();
		for (SalesOrderProductLine salesOrderProductLine : salesOrder.getProductLines()) {
			Map<String, Object> productMap = new HashMap<>();
			productMap.put("id", salesOrderProductLine.getId());
			if (warehouse != null) {
				Map<String, Object> warehouseData = new HashMap<>();
				warehouseData.put("id", warehouse.getId());
				productMap.put("warehouse", warehouseData);
			}

			productList.add(productMap);
		}
		bodyDataMap.put("productLines", productList);

		// 退货订单
		List<Map<String, Object>> returnList = new ArrayList<>();
		for (SalesOrderReturnLine salesOrderReturnLine : salesOrder.getReturnLines()) {
			Map<String, Object> productMap = new HashMap<>();
			productMap.put("id", salesOrderReturnLine.getId());
			if (warehouse != null) {
				Map<String, Object> warehouseData = new HashMap<>();
				warehouseData.put("id", warehouse.getId());
				productMap.put("warehouse", warehouseData);
			}

			returnList.add(productMap);
		}
		bodyDataMap.put("returnLines", returnList);

		String bodyString = JSONUtil.toJSONString(bodyDataMap);
		logger.info("SalesOrder.allocateInventory:" + bodyString);
		HttpResponse httpResponse = sendPatch(url, bodyString);
		String content = httpResponse.getContent();

		logger.error("content:" + content);
		logger.error("httpResponse.Status:" + httpResponse.getStatus());

		return 200 == httpResponse.getStatus();
	}

	/**
	 * 创建退货订单
	 * 
	 * @param accessToken
	 * @param salesOrder
	 * @return
	 */
	public String createReturnOrder(String accessToken, SalesOrder salesOrder) {
		String url = apiBaseUrl + getObjectUrl() + "?access_token=" + accessToken;

		Map<String, Object> bodyDataMap = new HashMap<>();
		if (salesOrder.getCustomFields() != null && salesOrder.getCustomFields().size() > 0) {
			bodyDataMap.put("customFields", salesOrder.getCustomFields());
		}

		bodyDataMap.put("extOrderId", salesOrder.getExtOrderId());
		bodyDataMap.put("orderTime", salesOrder.getOrderTime());

		// {"errorCode":"P150B70192","message":"售货订单不能包含退货产品。"}
		bodyDataMap.put("orderType", SalesOrderType.RETURN_ORDER.getCode());

		// 销售渠道 - Field channel is required.
		Map<String, Object> salesChannelData = new HashMap<>();
		salesChannelData.put("id", salesOrder.getChannel().getId());
		// salesChannelData.put("name", salesOrder.getChannel().getName());
		bodyDataMap.put("channel", salesChannelData);

		// 客户 - Field customer is required.
		Map<String, Object> customerData = new HashMap<>();
		customerData.put("id", salesOrder.getCustomer().getId());
		// customerData.put("name", salesOrder.getCustomer().getName());
		// customerData.put("code", salesOrder.getCustomer().getCode());
		bodyDataMap.put("customer", customerData);

		// 货币 - Field currency is required
		Map<String, Object> currencyData = new HashMap<>();
		currencyData.put("code", salesOrder.getCurrency().getCode());
		// currencyData.put("isoCode", salesOrder.getCurrency().getIsoCode());
		bodyDataMap.put("currency", currencyData);

		// 产品
		List<Map<String, Object>> returnList = new ArrayList<>();
		for (SalesOrderReturnLine salesOrderReturnLine : salesOrder.getReturnLines()) {
			Map<String, Object> returnMap = new HashMap<>();

			returnMap.put("quantity", salesOrderReturnLine.getQuantity());

			Map<String, Object> salesUomMap = new HashMap<>();
			salesUomMap.put("id", salesOrderReturnLine.getSalesUom().getId());
			salesUomMap.put("name", salesOrderReturnLine.getSalesUom().getName());
			returnMap.put("salesUom", salesUomMap);

			returnMap.put("remark", salesOrderReturnLine.getRemark());
			returnMap.put("referenceCode", salesOrderReturnLine.getReferenceCode());

			Map<String, Object> skuMap = new HashMap<>();
			skuMap.put("id", salesOrderReturnLine.getSku().getId());
			skuMap.put("name", salesOrderReturnLine.getSku().getName());
			skuMap.put("code", salesOrderReturnLine.getSku().getCode());
			returnMap.put("sku", skuMap);

			// 以下是非必填项
			// 指示如何计算销售订单。
			if (salesOrderReturnLine.getCalculationBase() != null) {
				returnMap.put("calculationBase", salesOrderReturnLine.getCalculationBase().getCode());
			}

			// 单价/销售单位单价
			if (salesOrderReturnLine.getGrossUnitPrice() != null) {
				returnMap.put("grossUnitPrice", salesOrderReturnLine.getGrossUnitPrice());
			}
			if (salesOrderReturnLine.getNetUnitPrice() != null) {
				returnMap.put("netUnitPrice", salesOrderReturnLine.getNetUnitPrice());
			}

			// 销售订单的计价方式是跟所选销售渠道的计价方式一致的，不能修改。
			// 含税总额
			if (salesOrderReturnLine.getGrossAmount() != null) {
				AmountInfo grossAmount = salesOrderReturnLine.getGrossAmount();
				Map<String, Object> grossAmountData = new HashMap<>();
				grossAmountData.put("amount", grossAmount.getAmount());
				returnMap.put("grossAmount", grossAmountData);
			}

			// 不含税总额
			if (salesOrderReturnLine.getNetAmount() != null) {
				AmountInfo netAmount = salesOrderReturnLine.getNetAmount();
				Map<String, Object> netAmountData = new HashMap<>();
				netAmountData.put("amount", netAmount.getAmount());
				returnMap.put("netAmount", netAmountData);
			}

			// ExceptionReason
			if (salesOrderReturnLine.getException() != null) {
				Map<String, Object> exceptionMap = new HashMap<>();
				exceptionMap.put("id", salesOrderReturnLine.getException().getId());
				exceptionMap.put("description", salesOrderReturnLine.getException().getDescription());
				returnMap.put("exception", exceptionMap);
			}

			// 原单据,baseDocument
			if (salesOrderReturnLine.getBaseDocument() != null) {
				Map<String, Object> baseDocMap = new HashMap<>();
				baseDocMap.put("baseId", salesOrderReturnLine.getBaseDocument().getBaseId());
				baseDocMap.put("baseNumber", salesOrderReturnLine.getBaseDocument().getBaseNumber());
				// 第null行：请指定一个有效的来源单据类型。
				baseDocMap.put("baseType", salesOrderReturnLine.getBaseDocument().getBaseType());
				baseDocMap.put("baseLineId", salesOrderReturnLine.getBaseDocument().getBaseLineId());
				baseDocMap.put("baseLineNumber", salesOrderReturnLine.getBaseDocument().getBaseLineNumber());
				returnMap.put("baseDocument", baseDocMap);
			}

			returnList.add(returnMap);
		}
		bodyDataMap.put("returnLines", returnList);

		// ----------以下为非必填项----------//
		// 交付方式 - 交付方式不处理实际的发货和库存业务
		if (salesOrder.getFulfillmentMethod() != null) {
			FulfillmentMethod fulfillmentMethod = salesOrder.getFulfillmentMethod();
			Map<String, Object> fulfillmentMethodData = new HashMap<>();
			fulfillmentMethodData.put("id", fulfillmentMethod.getId());
			bodyDataMap.put("fulfillmentMethod", fulfillmentMethodData);
		}

		// 指示如何计算销售订单。
		if (salesOrder.getHeaderCalculationBase() != null) {
			bodyDataMap.put("headerCalculationBase", salesOrder.getHeaderCalculationBase().getCode());
		}

		// 销售订单的计价方式是跟所选销售渠道的计价方式一致的，不能修改。
		// 计价方式
		if (salesOrder.getPricingMethod() != null) {
			// 这个代码无效
			bodyDataMap.put("pricingMethod", salesOrder.getPricingMethod().getCode());
		}

		// 销售订单的计价方式是跟所选销售渠道的计价方式一致的，不能修改。
		// 含税总额
		if (salesOrder.getGrossTotal() != null) {
			AmountInfo grossTotal = salesOrder.getGrossTotal();
			Map<String, Object> grossTotalData = new HashMap<>();
			grossTotalData.put("amount", grossTotal.getAmount());
			bodyDataMap.put("grossTotal", grossTotalData);
		}
		// 不含税总额
		if (salesOrder.getNetTotal() != null) {
			AmountInfo netTotal = salesOrder.getNetTotal();
			Map<String, Object> netTotalData = new HashMap<>();
			netTotalData.put("amount", netTotal.getAmount());
			bodyDataMap.put("netTotal", netTotalData);
		}

		// Return reason.Used in return order only.
		bodyDataMap.put("returnReason", salesOrder.getReturnReason());

		String bodyString = JSONUtil.toJSONString(bodyDataMap);
		logger.info("SalesOrder.Return.create:" + bodyString);
		HttpResponse httpResponse = sendPost(url, bodyString);
		String content = httpResponse.getContent();

		String id = 201 == httpResponse.getStatus() ? content : null;
		return id;
	}

}
