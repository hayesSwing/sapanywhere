package com.xiangzi.http;

import org.apache.http.HttpResponse;

public interface HTTPResponseCallback {

	void response(HttpResponse response);

	void fail(Exception e);
	
}
