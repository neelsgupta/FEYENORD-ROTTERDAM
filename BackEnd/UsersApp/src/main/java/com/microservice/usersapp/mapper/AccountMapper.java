package com.microservice.usersapp.mapper;

import com.microservice.usersapp.entity.Account;
import com.microservice.usersapp.entity.ChildAccount;

public class AccountMapper {
	
	
	public ChildAccount mapToChildAccount(Account account, long accountId, long childAccountId){
		
		ChildAccount childAccount = new ChildAccount();
		return childAccount;
		
	}

}
