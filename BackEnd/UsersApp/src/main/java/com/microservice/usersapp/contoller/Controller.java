package com.microservice.usersapp.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.usersapp.entity.Account;
import com.microservice.usersapp.entity.ChildAccount;
import com.microservice.usersapp.entity.User;
import com.microservice.usersapp.mapper.AccountMapper;
import com.microservice.usersapp.service.AccountService;
import com.microservice.usersapp.service.UserService;

@RestController
public class Controller {
	
	private static final String GET_USER_ACCOUNT = "user/{userId}/accounts";
	
	private static final String GET_USER_SUB_ACCOUNT = "user/{userId}/account/{accountId}/{childAccountId}";
	
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	public  UserService userService;
	
	@Autowired
	public  AccountService accountService;
	
	@Autowired
	public  AccountMapper accountMapper;
	
	
	

	@GetMapping(GET_USER_SUB_ACCOUNT)
	public ResponseEntity<ChildAccount> getAccount(@PathVariable(value = "userId") long userId, @PathVariable(value = "accountId") long accountId, @PathVariable(value = "childAccountId") long childAccountId){
		log.info("entering to getAccount endpoint.");
		Account account = accountService.getAccountDetails(accountId);
		ChildAccount childAccount = accountMapper.mapToChildAccount(account, accountId, childAccountId);
		
		
		ResponseEntity<ChildAccount> response;
		
		if (account == null) {
			response = ResponseEntity.notFound().build();
	    } else {
	    	response = ResponseEntity.ok(childAccount);
	    }
		
		log.info("exiting to getAccount endpoint.");
		
		return response;
	}
	
	
	
	
}
