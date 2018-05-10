package com.hg.controllers.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {

	@RequestMapping("/topics")
	public String getALlTopics() {
		return "All Topics";
	}
	
}
