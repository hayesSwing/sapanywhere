package com.xiangzi.http;

public class HttpResponse {

	private int status;// 状态
	private String content;// 内容

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return true if status code if between 200 and 299
	 */
	public boolean isStatusOK() {
		return (status >= 200) && (status <= 299);
	}

	/**
	 * @return true if status code if between 300 and 399
	 */
	public boolean isStatusRedirect() {
		return (status >= 300) && (status <= 399);
	}

	/**
	 * @return true if status code if between 400 and 499
	 */
	public boolean isStatusClientError() {
		return (status >= 400) && (status <= 499);
	}

	/**
	 * @return true if status code if between 500 and 599
	 */
	public boolean isStatusServerError() {
		return (status >= 500) && (status <= 599);
	}

}
