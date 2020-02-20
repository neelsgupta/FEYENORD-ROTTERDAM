package com.microservice.usersapp.contoller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.usersapp.entity.User;
import com.microservice.usersapp.service.AccountService;
import com.microservice.usersapp.service.UserService;

@RestController
public class Controller {
	
	private static final String GET_ACCOUNT = "/accounts";
	
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	public  UserService userService;
	
	

	@GetMapping(GET_ACCOUNT)
	public ResponseEntity<User> getAccount(@RequestParam(value = "user") long userId){
		log.info("entering to getAccount endpoint.");
		User userAccount = userService.getUser(userId);
		
		ResponseEntity<User> response;
		
		if (userAccount == null) {
			response = ResponseEntity.notFound().build();
	    } else {
	    	response = ResponseEntity.ok(userAccount);
	    }
		
		log.info("exiting to getAccount endpoint.");
		
		return response;
	}
	
	
}
