package com.xiangzi.sapanywhere.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AccessToken extends BaseBean {

	@JsonProperty("access_token")
	private String value;
	@JsonProperty("token_type")
	private String type;
	@JsonProperty("refresh_token")
	private String refreshToken;
	@JsonProperty("expires_in")
	private long expiresIn;//单位:秒,expire in 12 hours
	@JsonProperty("scope")
	private String scope;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(long expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

}
