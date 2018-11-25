package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.TaxDefinition;

/**
 * TaxDefinition-计税规则 </br>
 * 设置-初始设置-税-税/计税规则
 */
public class TaxDefinitionApi extends BaseAnywhereApi<TaxDefinition> {
	
	@Override
	protected String getObjectUrl() {
		return "TaxRules";
	}
	
}
