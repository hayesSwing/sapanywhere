package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xiangzi.http.HttpResponse;
import com.xiangzi.sapanywhere.bean.Payment;
import com.xiangzi.sapanywhere.bean.PaymentLine;
import com.xiangzi.sapanywhere.bean.PaymentMethodLine;
import com.xiangzi.util.JSONUtil;

/**
 * 收付款单
 */
public class PaymentApi extends BaseAnywhereApi<Payment> {

	@Override
	protected String getObjectUrl() {
		return "Payments";
	}

	/**
	 * Create a payment using given data.
	 * 
	 * @param accessToken
	 * @param payment
	 * @return The id of the newly created payment.
	 */
	public String create(String accessToken, Payment payment) {
		String url = apiBaseUrl + getObjectUrl() + "?access_token=" + accessToken;

		Map<String, Object> bodyDataMap = new HashMap<>();
		bodyDataMap.put("remark", payment.getRemark());
		bodyDataMap.put("referenceNumber", payment.getReferenceNumber());
		// Field postingTime is required.
		bodyDataMap.put("postingTime", payment.getPostingTime());

		// 客户 - Field customer is required.
		Map<String, Object> customerData = new HashMap<>();
		customerData.put("id", payment.getCustomer().getId());
		// customerData.put("name", payment.getCustomer().getName());
		// customerData.put("code", payment.getCustomer().getCode());
		bodyDataMap.put("customer", customerData);

		// 货币 - Field currency is required.
		Map<String, Object> currencyData = new HashMap<>();
		currencyData.put("code", payment.getCurrency().getCode());
		// currencyData.put("isoCode", payment.getCurrency().getIsoCode());
		bodyDataMap.put("currency", currencyData);

		// paymentLines - Field paymentLines is required.
		List<Map<String, Object>> payLineList = new ArrayList<>();
		for (PaymentLine payLine : payment.getPaymentLines()) {
			Map<String, Object> payLineMap = new HashMap<>();

			Map<String, Object> appliedAmountMap = new HashMap<>();
			appliedAmountMap.put("amount", payLine.getAppliedAmount().getAmount());
			payLineMap.put("appliedAmount", appliedAmountMap);

			Map<String, Object> tranDoc = new HashMap<>();
			tranDoc.put("id", payLine.getTransactionDocument().getId());
			tranDoc.put("type", payLine.getTransactionDocument().getType());
			payLineMap.put("transactionDocument", tranDoc);

			payLineList.add(payLineMap);
		}
		bodyDataMap.put("paymentLines", payLineList);

		// paymentMethodLines - 未找到支付方式。请指定支付方式。
		List<Map<String, Object>> payMtdLineList = new ArrayList<>();
		for (PaymentMethodLine payMtdLine : payment.getPaymentMethodLines()) {
			Map<String, Object> payMtdLineMap = new HashMap<>();

			Map<String, Object> amountMap = new HashMap<>();
			amountMap.put("amount", payMtdLine.getAmount().getAmount());
			payMtdLineMap.put("amount", amountMap);

			Map<String, Object> payMtd = new HashMap<>();
			payMtd.put("id", payMtdLine.getPaymentMethod().getId());
			// payMtd.put("type", payMtdLine.getPaymentMethod().getType());
			payMtdLineMap.put("paymentMethod", payMtd);

			payMtdLineList.add(payMtdLineMap);
		}

		// 退货订单/销售红字发票 相关
		if (payment.getRefunded() != null) {
			bodyDataMap.put("refunded", payment.getRefunded());// 是否已退款,该值为false的话后台还可以点退款操作,该值可以调用修改api修改
		}
		
		bodyDataMap.put("paymentMethodLines", payMtdLineList);

		String bodyString = JSONUtil.toJSONString(bodyDataMap);
		logger.info("Payment.create:" + bodyString);
		HttpResponse httpResponse = sendPost(url, bodyString);
		String content = httpResponse.getContent();

		String id = 201 == httpResponse.getStatus() ? content : null;
		return id;
	}

}
