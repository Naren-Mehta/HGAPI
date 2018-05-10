package com.hg.controllers.rest;

import org.springframework.web.bind.annotation.RequestMapping;

public class TestController {

	@RequestMapping("/hello1")
	public String sayHello() {
		System.out.println("====hello  api-====");
		return "Hello";
	}
}
