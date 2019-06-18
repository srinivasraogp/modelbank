package com.hcl.modelbank.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transactions")

public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long tansactionId;
	@Column
	private Long fromAccount;
	@Column
	private Long toAccount;
	@Column
	private String description;
	@Column
	private Date transactionDate;
	@Column
	private Date transactionType;

	public Date getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(Date transactionType) {
		this.transactionType = transactionType;
	}

	@Column
	private BigDecimal amount;

	public Transaction() {
	}

	public Long getTansactionId() {
		return tansactionId;
	}

	public void setTansactionId(Long tansactionId) {
		this.tansactionId = tansactionId;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
