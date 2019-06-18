package com.hcl.modelbank.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@JsonProperty
	private long customerId;
	@JsonProperty
	private String password;
	@JsonProperty
	private String name;
	@JsonProperty
	private long accountNumber;
	private double amount;
	
	public UserResDTO() {
		
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}