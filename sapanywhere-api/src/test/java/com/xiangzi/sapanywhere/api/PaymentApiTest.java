package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.CreditMemo;
import com.xiangzi.sapanywhere.bean.Payment;
import com.xiangzi.sapanywhere.bean.PaymentLine;
import com.xiangzi.sapanywhere.bean.PaymentMethodLine;
import com.xiangzi.sapanywhere.bean.SalesOrder;
import com.xiangzi.sapanywhere.condition.Criteria;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.condition.Filter;
import com.xiangzi.sapanywhere.condition.Pager;
import com.xiangzi.sapanywhere.condition.Select;
import com.xiangzi.sapanywhere.info.AmountInfo;
import com.xiangzi.sapanywhere.info.DocumentInfo;
import com.xiangzi.sapanywhere.info.PaymentMethodInfo;
import com.xiangzi.util.JSONUtil;

public class PaymentApiTest extends BaseAnywhereTest {

	private PaymentApi paymentApi;
	private CreditMemoApi creditMemoApi;
	private SalesOrderApi salesOrderApi;

	@Before
	public void before() throws Exception {
		super.before();
		paymentApi = new PaymentApi();
		creditMemoApi = new CreditMemoApi();
		salesOrderApi = new SalesOrderApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = paymentApi.count(accessToken.getValue());
		logger.info("count:" + count);
	}

	@Ignore
	@Test
	@SuppressWarnings("unchecked")
	public void pager() {
		Filter filter = null;

		Expand expand = null;
		expand = new Expand("*");

		List<String> columnList = new ArrayList<>();
		// columnList.add("id");
		// columnList.add("name");
		Select select = new Select();
		select.setColumnList(columnList);

		Criteria criteria = new Criteria();
		criteria.setFilter(filter);
		criteria.setExpand(expand);
		criteria.setSelect(select);

		Pager pager = new Pager();
		pager.setCriteria(criteria);
		pager.setPageNumber(1);
		pager.setPageSize(2);
		// pager.setOrderBy("");

		pager = paymentApi.pager(accessToken.getValue(), pager);

		logger.info("list.totalCount:" + pager.getTotalCount());
		logger.info("list.pageSize:" + pager.getPageSize());
		logger.info("list.pageCount:" + pager.getPageCount());

		List<Payment> list = (List<Payment>) pager.getList();
		logger.info("list.size:" + list.size());
		logger.info("list.json:" + JSONUtil.toJSONString(list));

		for (Payment payment : list) {
			logger.info("payment.json:" + JSONUtil.toJSONString(payment));
		}

	}

	@Ignore
	@Test
	public void get() {
		String id = "986";
		id = "987";

		Expand expand = null;
		expand = new Expand("*");
		Payment payment = paymentApi.get(accessToken.getValue(), id, expand);
		logger.info("payment:" + payment);

		// Response>>>>>>200>>>>>>{"customFields":{},"id":986,"docNumber":"1085","exchangeRate":1,"status":"CLOSED","customer":{"id":78107,"name":"JW
		// Test","code":"IC021"},"contactPerson":null,"referenceNumber":"xz-th-2017020614153511","postingTime":"2017-02-06T06:15:00.000Z","creationTime":"2017-02-07T01:40:48.836Z","updateTime":"2017-02-07T01:40:48.836Z","amount":{"amount":-46,"amountLocalCurrency":-46},"rateDifference":0,"remark":"来源订单编号[2916]","currency":{"code":"RMB","isoCode":"CNY"},"refunded":false,"refundError":null,"refundTransactionNumber":null,"paymentLines":[{"customFields":{},"id":999,"number":1,"transactionDocument":{"id":72,"number":"153","type":"CreditMemo"},"totalAmount":{"amount":46,"amountLocalCurrency":null},"appliedAmount":{"amount":46,"amountLocalCurrency":46}}],"paymentMethodLines":[{"customFields":{},"id":1065,"paymentMethod":{"id":1,"name":"现金","type":"CASH"},"amount":{"amount":-46,"amountLocalCurrency":-46}}],"createdBy":{"id":24,"name":"Bizerba
		// Test"},"updatedBy":{"id":24,"name":"Bizerba Test"}}

	}

	/**
	 * 销售红字发票-支付
	 */
	@Ignore
	@Test
	public void create4CreditMemo() {
		// 退货订单
		String salesOrderId = "1412";// "id":"1412","docNumber":"2916"
		salesOrderId = "1419";// "id":1419,"docNumber":"2929"
		salesOrderId = "1421";// "id":1421,"docNumber":"2931"

		Expand expand = null;
		expand = new Expand("*");
		SalesOrder salesOrder = salesOrderApi.get(accessToken.getValue(), salesOrderId, expand);
		logger.info("salesOrder:" + salesOrder);

		// 销售红字发票
		String creditMemoId = "72";// "id":"72","docNumber":"153"
		creditMemoId = "76";// "id":"76","docNumber":"157"
		creditMemoId = "77";// "id":"77","docNumber":"158"

		expand = null;
		expand = new Expand("*");
		CreditMemo creditMemo = creditMemoApi.get(accessToken.getValue(), creditMemoId, expand);
		logger.info("creditMemo:" + creditMemo);

		Payment payment = new Payment();

		// Field postingTime is required.
		payment.setPostingTime(salesOrder.getOrderTime());

		DocumentInfo tranDoc = new DocumentInfo();
		// Invoice-销售发票, CreditMemo-销售红字发票, Prepayment-预付款.
		tranDoc.setType("CreditMemo");
		tranDoc.setId(creditMemo.getId());// 单据ID
		tranDoc.setNumber(creditMemo.getDocNumber());// 单据号

		payment.setRemark("来源订单编号[" + salesOrder.getDocNumber() + "]");
		payment.setReferenceNumber(salesOrder.getExtOrderId());

		// 退货订单/销售红字发票 相关
		payment.setRefunded(true);// 是否已退款,该值为false的话后台还可以点退款操作,该值可以调用修改api修改

		// 客户
		payment.setCustomer(salesOrder.getCustomer());
		// 交易货币
		payment.setCurrency(salesOrder.getCurrency());

		List<PaymentLine> paymentLines = new ArrayList<>();
		List<PaymentMethodLine> paymentMethodLines = new ArrayList<>();

		PaymentLine paymentLine = new PaymentLine();
		paymentLine.setTransactionDocument(tranDoc);

		AmountInfo appliedAmount = new AmountInfo();
		appliedAmount.setAmount(creditMemo.getAmountDue().getAmount());// amountDue-未付金额
		paymentLine.setAppliedAmount(appliedAmount);

		paymentLines.add(paymentLine);

		PaymentMethodInfo paymentMethodCash = new PaymentMethodInfo();
		paymentMethodCash.setId("1");
		paymentMethodCash.setName("现金");
		// paymentMethodCash.setType(PaymentMethodType.CASH);

		PaymentMethodLine paymentMethodLine = new PaymentMethodLine();
		// Response>>>>>>400>>>>>>{"errorCode":"P150B79026","message":"无法创建收付款单。单据总金额与行上的金额总和不符。"}
		/****** 这个金额必须为负数 ******/
		AmountInfo paymentMethodAmount = new AmountInfo();
		paymentMethodAmount.setAmount(-creditMemo.getAmountDue().getAmount());// amountDue-未付金额

		paymentMethodLine.setAmount(paymentMethodAmount);
		paymentMethodLine.setPaymentMethod(paymentMethodCash);
		paymentMethodLines.add(paymentMethodLine);

		payment.setPaymentLines(paymentLines);
		payment.setPaymentMethodLines(paymentMethodLines);

		logger.info("payment:" + JSONUtil.toJSONString(payment));

		String paymentId = this.paymentApi.create(accessToken.getValue(), payment);
		logger.info("paymentId:" + paymentId);

		// Request.Post>>>>>>{"referenceNumber":"xz-th-2017020614153511","paymentLines":[{"transactionDocument":{"id":"72","type":"CreditMemo"},"appliedAmount":{"amount":46.0}}],"remark":"来源订单编号[2916]","currency":{"code":"RMB"},"paymentMethodLines":[{"amount":{"amount":-46.0},"paymentMethod":{"id":"1"}}],"postingTime":"2017-02-06T06:15:00.000Z","customer":{"id":"78107"}}
		// Response>>>>>>201>>>>>>986
		// paymentId:986
		// paymentId:987
		// paymentId:988

	}

}
