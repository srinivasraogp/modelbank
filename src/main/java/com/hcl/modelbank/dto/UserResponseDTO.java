package com.hcl.modelbank.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserResponseDTO implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private long customerId;
private String customerName;
private long accountNumber;


private String accountType;
private BigDecimal amount;
public UserResponseDTO() {
	
}
public long getCustomerId() {
	return customerId;
}
public void setCustomerId(long customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public BigDecimal getAmount() {
	return amount;
}
public void setAmount(BigDecimal amount) {
	this.amount = amount;
}
public UserResponseDTO(long customerId, String customerName, long accountNumber, String accountType,
		BigDecimal amount) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.accountNumber = accountNumber;
	this.accountType = accountType;
	this.amount = amount;
}
}
