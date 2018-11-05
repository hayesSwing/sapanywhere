package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Quotation;

public class QuotationApi extends BaseAnywhereApi<Quotation> {

	@Override
	protected String getObjectUrl() {
		return "Quotations";
	}
	
}
