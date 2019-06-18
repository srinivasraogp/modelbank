package com.hcl.modelbank.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionResDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@JsonProperty
	private Long fromAccount;
	public Long getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(Long fromAccount) {
		this.fromAccount = fromAccount;
	}
	public Long getToAccount() {
		return toAccount;
	}
	public void setToAccount(Long toAccount) {
		this.toAccount = toAccount;
	}
	public Date getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(Date transactionType) {
		this.transactionType = transactionType;
	}
	@JsonProperty
	private Long toAccount;	
	@JsonProperty
	private Date transactionType;
}
	