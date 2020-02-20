package com.microservice.usersapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.usersapp.entity.Account;
import com.microservice.usersapp.repository.AccountRepository;

public class AccountService {

	Logger logger = LoggerFactory.getLogger(AccountService.class);

	@Autowired
	private AccountRepository accountRepository;

	public Account getAccountDetails(final long accountId) {
		return accountRepository.getOne(accountId);
	}
}
