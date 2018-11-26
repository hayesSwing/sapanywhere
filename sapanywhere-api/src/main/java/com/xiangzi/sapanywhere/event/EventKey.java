package com.xiangzi.sapanywhere.event;

public enum EventKey {

	// Product
	PRODUCT_CREATE("Product", "Product/CREATE", "Product/CREATE"), 
	PRODUCT_UPDATE("Product", "Product/UPDATE", "Product/UPDATE"), 
	PRODUCT_DELETE("Product", "Product/DELETE", "Product/DELETE"),
	
	// SKU
	SKU_CREATE("SKU", "SKU/CREATE", "SKU/CREATE"), 
	SKU_UPDATE("SKU", "SKU/UPDATE", "SKU/UPDATE"),
	
	// Customer
	LEAD_CREATE("Lead", "Lead/CREATE", "Lead/CREATE"), 
	LEAD_UPDATE("Lead", "Lead/UPDATE", "Lead/UPDATE"),
	
	// Opportunity 机会
	OPPORTUNITY_CREATE("Opportunity", "Opportunity/CREATE", "Opportunity/CREATE"), 
	OPPORTUNITY_UPDATE("Opportunity", "Opportunity/UPDATE", "Opportunity/UPDATE"), 
	
	// SalesOrder
	SALES_ORDER_CREATE("SalesOrder", "SalesOrder/CREATE", "SalesOrder/CREATE"), 
	SALES_ORDER_UPDATE("SalesOrder", "SalesOrder/UPDATE", "SalesOrder/UPDATE"), 
	SALES_ORDER_CANCEL("SalesOrder", "SalesOrder/CANCEL", "SalesOrder/CANCEL"), 
	
	// Invoice
	INVOICE_CREATE("Invoice", "Invoice/CREATE", "Invoice/CREATE"), 
	INVOICE_UPDATE("Invoice", "Invoice/UPDATE", "Invoice/UPDATE"), 
	INVOICE_CANCEL("Invoice", "Invoice/CANCEL", "Invoice/CANCEL"), 
	INVOICE_CLOSE("Invoice", "Invoice/CLOSE", "Invoice/CLOSE"),
	
	// CreditMemo
	CREDITMEMO_CREATE("CreditMemo", "CreditMemo/CREATE", "CreditMemo/CREATE"),
	CREDITMEMO_CANCEL("CreditMemo", "CreditMemo/CANCEL", "CreditMemo/CANCEL"),
	CREDITMEMO_CLOSE("CreditMemo", "CreditMemo/CLOSE", "CreditMemo/CLOSE"),
	
	// SalesDelivery
	SALES_DELIVERY_CREATE("SalesDelivery", "SalesDelivery/CREATE", "SalesDelivery/CREATE"),
	SALES_DELIVERY_UPDATE("SalesDelivery", "SalesDelivery/UPDATE", "SalesDelivery/UPDATE"),
	SALES_DELIVERY_CANCEL("SalesDelivery", "SalesDelivery/CANCEL", "SalesDelivery/CANCEL"),
	
	// SalesReturn
	SALES_RETURN_CREATE("SalesReturn", "SalesReturn/CREATE", "SalesReturn/CREATE"),
	SALES_RETURN_UPDATE("SalesReturn", "SalesReturn/UPDATE", "SalesReturn/UPDATE"),
	SALES_RETURN_CONFIRMRETURN("SalesReturn", "SalesReturn/CONFIRMRETURN", "SalesReturn/CONFIRMRETURN"),
	
	// Payment
	PAYMENT_CREATE("Payment", "Payment/CREATE", "Payment/CREATE"),
	PAYMENT_UPDATE("Payment", "Payment/UPDATE", "Payment/UPDATE"),
	PAYMENT_CANCEL("Payment", "Payment/CANCEL", "Payment/CANCEL"),
	
	// Prepayment
	PREPAYMENT_CREATE("Prepayment", "Prepayment/CREATE", "Prepayment/CREATE"),
	PREPAYMENT_UPDATE("Prepayment", "Prepayment/UPDATE", "Prepayment/UPDATE"),
	PREPAYMENT_CANCEL("Prepayment", "Prepayment/CANCEL", "Prepayment/CANCEL"),
	
	// PurchaseOrder
	PURCHASE_ORDER_CREATE("PurchaseOrder", "PurchaseOrder/CREATE", "PurchaseOrder/CREATE"),
	PURCHASE_ORDER_UPDATE("PurchaseOrder", "PurchaseOrder/UPDATE", "PurchaseOrder/UPDATE"),
	
	// PurchaseReceipt 采购收货单
	PURCHASE_RECEIPT_CREATE("PurchaseReceipt", "PurchaseReceipt/CREATE", "PurchaseReceipt/CREATE"),
	
	// PurchaseReturn 采购退货单
	PURCHASE_RETURN_CREATE("PurchaseReturn", "PurchaseReturn/CREATE", "PurchaseReturn/CREATE"),
	PURCHASE_RETURN_UPDATE("PurchaseReturn", "PurchaseReturn/UPDATE", "PurchaseReturn/UPDATE"),
	
	// Login
	LOGIN("Login", "Login", "Login");
	
	private String category;
	private String key;
	private String name;

	private EventKey(String category, String key, String name) {
		this.category = category;
		this.key = key;
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public String getKey() {
		return key;
	}

	public String getName() {
		return name;
	}

}
