package com.hg.controllers.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

	
	
	@RequestMapping("/")
	public String sayHi() {
		System.out.println("====hi  api-====");
		return "Hi";
	}
	
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("====hello  api-====");
		return "Hello";
	}
	
	@RequestMapping("/usersignup")
	public String userSignUp() {
		return "Hello";
	}
	
	
}
