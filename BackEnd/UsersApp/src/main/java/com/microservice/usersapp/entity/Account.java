package com.microservice.usersapp.entity;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class Account {
	
	@Id
	@GeneratedValue
	private long id;
	
	private BigDecimal balance;
	
	private String number;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name="user")
	private User user; 
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToMany
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
