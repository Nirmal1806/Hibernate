package com.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kafka.entity.User;
import com.kafka.repo.Repo;


public class Services {

	@Autowired
	User user;
	
	@Autowired
	Repo repo;
	
	 public void inserintoDB(String name,String email,String phoneNo,String gender)
	{
	
		user.setEmail(email);
		user.setGender(gender);
		user.setName(name);
		user.setPhoneNo(phoneNo);
		
		repo.persist(user);
		
	}
}
