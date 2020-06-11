package com.kafka.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.kafka.entity.User;
import com.kafka.service.Services;

@Component
public class Beans {
	
	
	  @Bean public Services service() { return new Services(); }
	 
	 @Bean public User user() { return new User(); }
	 
}
