package com.microservice.usersapp.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.usersapp.entity.Account;
import com.microservice.usersapp.entity.ChildAccount;
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
		
		List<ChildAccount> childAccounts = new ArrayList<>();
		ChildAccount childAccount  = new ChildAccount();
		childAccount.setId(1);
		childAccount.setName("Orange Savings Account");
		childAccounts.add(childAccount);
		
		ChildAccount childAccount2  = new ChildAccount();
		childAccount2.setId(2);
		childAccount2.setName("Bonus Interest Account");
		childAccounts.add(childAccount2);
		
		ChildAccount childAccount3  = new ChildAccount();
		childAccount3.setId(2);
		childAccount3.setName("Savings Deposit");
		childAccounts.add(childAccount3);
		account.setChildAccounts(childAccounts);
		
		accounts.add(account);

		Account paymentAccount = new Account();
		paymentAccount.setId(11);
		paymentAccount.setName("Payment");
		paymentAccount.setNumber("88888");
		paymentAccount.setBalance(new BigDecimal("3455648"));
		
		List<ChildAccount> childAccounts2 = new ArrayList<>();
		ChildAccount childAccount4  = new ChildAccount();
		childAccount4.setId(1);
		childAccount4.setName("Debit Card");
		childAccounts2.add(childAccount4);
		
		ChildAccount childAccount6  = new ChildAccount();
		childAccount6.setId(2);
		childAccount6.setName("Quarterly Limit");
		childAccounts2.add(childAccount6);
		
		ChildAccount childAccount7  = new ChildAccount();
		childAccount7.setId(2);
		childAccount7.setName("Continiously Limit");
		childAccounts2.add(childAccount7);
		
		ChildAccount childAccount14  = new ChildAccount();
		childAccount14.setId(2);
		childAccount14.setName("Payments Account");
		childAccounts2.add(childAccount14);
		
		paymentAccount.setChildAccounts(childAccounts2);
		
		accounts.add(paymentAccount);

		Account mortgage = new Account();
		mortgage.setId(12);
		mortgage.setName("Mortgage");
		mortgage.setNumber("77777");
		mortgage.setBalance(new BigDecimal("987525"));
		
		List<ChildAccount> childAccounts10 = new ArrayList<>();
		ChildAccount childAccount11  = new ChildAccount();
		childAccount11.setId(1);
		childAccount11.setName("Banking Saving Mortgage");
		childAccounts10.add(childAccount11);
		
		ChildAccount childAccount12  = new ChildAccount();
		childAccount12.setId(2);
		childAccount12.setName("Interest Only");
		childAccounts10.add(childAccount12);
		
		
		mortgage.setChildAccounts(childAccounts10);
		accounts.add(mortgage);
		user.setAccounts(accounts);

		user.setId(userId);
		user.setName("ING-USER");
		return user;
	}
}
