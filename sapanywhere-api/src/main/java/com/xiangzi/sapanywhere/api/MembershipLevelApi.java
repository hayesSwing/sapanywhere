package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.MembershipLevel;

/**
 * 会员等级<br/>
 * 设置-客户关系管理-客户忠诚度管理-会员等级设置
 */
public class MembershipLevelApi extends BaseAnywhereApi<MembershipLevel> {

	@Override
	protected String getObjectUrl() {
		return "MembershipLevels";
	}

}
