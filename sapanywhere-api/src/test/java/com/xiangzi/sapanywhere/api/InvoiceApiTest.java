package com.xiangzi.sapanywhere.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.xiangzi.sapanywhere.bean.Invoice;
import com.xiangzi.sapanywhere.bean.InvoiceLine;
import com.xiangzi.sapanywhere.bean.SalesOrder;
import com.xiangzi.sapanywhere.bean.SalesOrderProductLine;
import com.xiangzi.sapanywhere.condition.Expand;
import com.xiangzi.sapanywhere.info.BaseDocumentLineInfo;

public class InvoiceApiTest extends BaseAnywhereTest {

	private InvoiceApi invoiceApi;
	private SalesOrderApi salesOrderApi;

	@Before
	public void before() throws Exception {
		super.before();
		invoiceApi = new InvoiceApi();
		salesOrderApi = new SalesOrderApi();
	}

	@Ignore
	@Test
	public void count() {
		int count = invoiceApi.count(accessToken.getValue());
		logger.info("count:" + count);
	}

	@Ignore
	@Test
	public void create() {
		String salesOrderId = "1412";// "id":"1412","docNumber":"2916"
		Expand expand = null;
		expand = new Expand("*");
		SalesOrder salesOrder = salesOrderApi.get(accessToken.getValue(), salesOrderId, expand);
		logger.info("salesOrder:" + salesOrder);

		Invoice invoice = new Invoice();
		// invoice.setExchangeRate(1.0);
		invoice.setRemark("来源订单编号[" + salesOrder.getDocNumber() + "]");

		// invoiceLines
		List<InvoiceLine> invoiceLines = new ArrayList<>();

		for (SalesOrderProductLine productLine : salesOrder.getProductLines()) {
			InvoiceLine invoiceLine = new InvoiceLine();
			BaseDocumentLineInfo baseDoc = new BaseDocumentLineInfo();
			baseDoc.setBaseId(salesOrder.getId());
			baseDoc.setBaseNumber(salesOrder.getDocNumber());
			baseDoc.setBaseType("SalesOrder");
			baseDoc.setBaseLineId(productLine.getId());
			invoiceLine.setBaseDocument(baseDoc);
			invoiceLine.setRemark("");

			invoiceLine.setQuantity(productLine.getQuantity());
			invoiceLine.setSku(productLine.getSku());
			invoiceLine.setSalesUom(productLine.getSalesUom());
			invoiceLine.setInventoryUom(productLine.getInventoryUom());

			invoiceLines.add(invoiceLine);
		}

		invoice.setInvoiceLines(invoiceLines);

		String salesInvoiceId = this.invoiceApi.create(accessToken.getValue(), invoice);
		logger.info("salesInvoiceId:" + salesInvoiceId);

	}

}
