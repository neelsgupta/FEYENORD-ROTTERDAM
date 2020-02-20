package com.microservice.usersapp.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Account {
	
	@Id
	@GeneratedValue
	private long id;
	
	private BigDecimal balance;
	
	private String number;
	
	private String name;
	
	private List<ChildAccount> childAccounts;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<ChildAccount> getChildAccounts() {
		return childAccounts;
	}

	public void setChildAccounts(List<ChildAccount> childAccounts) {
		this.childAccounts = childAccounts;
	}
	
	
}