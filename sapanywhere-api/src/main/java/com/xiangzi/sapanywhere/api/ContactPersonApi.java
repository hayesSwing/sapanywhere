package com.xiangzi.sapanywhere.api;

import com.xiangzi.sapanywhere.bean.ContactPerson;

/**
 * 联系人 - ContactPerson <br/>
 */
public class ContactPersonApi extends BaseAnywhereApi<ContactPerson> {

	@Override
	protected String getObjectUrl() {
		return "ContactPersons";
	}

}
