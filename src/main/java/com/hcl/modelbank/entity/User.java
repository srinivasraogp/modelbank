package com.hcl.modelbank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue
	private Long userId;
private long customerId;
private String password;
private String name;
private long accountNumber;
private double amount;
public User() {
	
}
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
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
public User(Long userId, long customer_Id, String password, String name, long accountNumber, double amount) {
	super();
	this.userId = userId;
	this.customerId = customerId;
	this.password = password;
	this.name = name;
	this.accountNumber = accountNumber;
	this.amount = amount;
}


}