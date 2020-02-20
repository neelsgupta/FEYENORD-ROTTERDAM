package com.microservice.usersapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice.usersapp.entity.User;
import com.microservice.usersapp.repository.UserRepository;

public class UserService {
	
	Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
    private UserRepository userRepository;
	
	public User getUser(final long userId) {
		
		logger.debug("Fetching detail for user: " + userId);
		
		return userRepository.getOne(userId);
	}
	
}
