package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.UomGroup;

/**
 * 计量单位组<br/>
 */
public class UomGroupApi extends BaseAnywhereApi<UomGroup> {

	@Override
	protected String getObjectUrl() {
		return "UomGroups";
	}
	
}
