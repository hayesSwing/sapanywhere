package com.xiangzi.sapanywhere.bean;

import java.util.Map;

import com.xiangzi.sapanywhere.info.AmountInfo;
import com.xiangzi.sapanywhere.info.DocumentInfo;

/**
 * PaymentLine model.
 */
public class PaymentLine extends BaseBean {

	private Map<String, Object> customFields;
	private String id;// integer (int64),Unique identifier
	private String number;// readonly,integer (int64)
	/**
	 * Related transaction document. The "type" field of transactionDocument
	 * should be one of Invoice-销售发票, CreditMemo-销售红字发票, Prepayment-预付款.
	 */
	private DocumentInfo transactionDocument;
	// 总金额
	private AmountInfo totalAmount;// readonly,Total amount to be paid.
	// 收付金额
	private AmountInfo appliedAmount;// required,Total amount applied.

	public Map<String, Object> getCustomFields() {
		return customFields;
	}
	
	public void setCustomFields(Map<String, Object> customFields) {
		this.customFields = customFields;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public DocumentInfo getTransactionDocument() {
		return transactionDocument;
	}

	public void setTransactionDocument(DocumentInfo transactionDocument) {
		this.transactionDocument = transactionDocument;
	}

	public AmountInfo getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(AmountInfo totalAmount) {
		this.totalAmount = totalAmount;
	}

	public AmountInfo getAppliedAmount() {
		return appliedAmount;
	}

	public void setAppliedAmount(AmountInfo appliedAmount) {
		this.appliedAmount = appliedAmount;
	}

}
