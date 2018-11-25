package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Stage;

/**
 * 阶段/销售阶段<br/>
 * 设置-客户关系管理-销售机会-阶段/销售阶段
 */
public class StageApi extends BaseAnywhereApi<Stage> {

	@Override
	protected String getObjectUrl() {
		return "Stages";
	}

}
