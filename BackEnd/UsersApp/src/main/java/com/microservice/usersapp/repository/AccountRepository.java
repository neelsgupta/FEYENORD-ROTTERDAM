package com.microservice.usersapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.usersapp.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	
}