package com.microservice.usersapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.usersapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
