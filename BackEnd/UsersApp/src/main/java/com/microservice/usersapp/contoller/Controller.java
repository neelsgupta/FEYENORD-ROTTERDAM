package com.microservice.usersapp.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.usersapp.service.AccountService;

@RestController
public class Controller {
	
	private static final String GET_ACCOUNT = "/accounts";
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	public  AccountService accountService;

	@GetMapping(GET_ACCOUNT)
	public void getAccount(){
		log.info("entering to getAccount endpoint.");

		System.out.println("Hii Controller");
		log.info("exiting to getAccount endpoint.");
	}
}
