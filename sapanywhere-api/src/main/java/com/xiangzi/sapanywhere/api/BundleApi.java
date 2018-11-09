package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.Bundle;

/**
 * Bundle-组合产品 <br/>
 */
public class BundleApi extends BaseAnywhereApi<Bundle> {

	@Override
	protected String getObjectUrl() {
		return "Bundles";
	}

}
