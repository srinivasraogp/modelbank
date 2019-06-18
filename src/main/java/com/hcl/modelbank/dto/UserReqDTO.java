package com.hcl.modelbank.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserReqDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonProperty
	private long customerId;
	@JsonProperty
	private String password;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserReqDTO() {
		super();
		
	}
	public UserReqDTO(long customerId, String password) {
		super();
		this.customerId = customerId;
		this.password = password;
	}
	
}