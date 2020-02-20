package com.microservice.usersapp.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.usersapp.entity.Account;
import com.microservice.usersapp.entity.User;
import com.microservice.usersapp.repository.UserRepository;

@Service
public class UserService {

	Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	public User getUser(final long userId) {

		logger.debug("Fetching detail for user: " + userId);

		return userRepository.getOne(userId);
	}

	public User getUser1(final long userId) {

		logger.debug("Fetching detail for user: " + userId);
		User user = new User();
		user.setEvents(null);

		List<Account> accounts = new ArrayList<>();
		Account account = new Account();
		account.setId(10);
		account.setName("Savings");
		account.setNumber("99999");
		account.setBalance(new BigDecimal("54545"));
		accounts.add(account);

		Account paymentAccount = new Account();
		paymentAccount.setId(11);
		paymentAccount.setName("Payment");
		paymentAccount.setNumber("88888");
		paymentAccount.setBalance(new BigDecimal("3455648"));
		accounts.add(paymentAccount);

		Account mortgage = new Account();
		mortgage.setId(12);
		mortgage.setName("Mortgage");
		mortgage.setNumber("77777");
		mortgage.setBalance(new BigDecimal("987525"));
		accounts.add(mortgage);
		user.setAccounts(accounts);

		user.setId(userId);
		user.setName("ING-USER");
		return user;
	}
}
