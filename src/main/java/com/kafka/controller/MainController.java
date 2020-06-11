package com.kafka.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.service.Services;

@RestController
public class MainController{
	
	@Autowired
	Services service;
	
	@RequestMapping("/ping")
	String UpandRunning()
	{
		return "Pong";
	}
	
	@RequestMapping("/userDetails")
	String EnterUserDetails(HttpServletRequest  request, HttpServletResponse res)
	{
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phoneNo = request.getParameter("phoneNo");
		String gender = request.getParameter("gender");
		
		service.inserintoDB(name,email,phoneNo,gender);
		return "Entered";
	}
}

