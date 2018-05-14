package com.hg.controllers.rest;

import java.util.ArrayList;

import com.hg.domain.Blog;
import com.hg.service.BlogService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

	@Autowired
	private BlogService blogService;

	@RequestMapping("/blogs")
	public List<Blog> getAllUsers() {

		return blogService.getAllBlogs();
	}

	@RequestMapping("/users/{userId}")
	public HGUser getUser(@PathVariable Integer userId) {
		return userService.getUser(userId);
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public void addUser(@RequestBody HGUser user) {

		System.out.println("===="+user);
		userService.addUser(user);		
	}
	
	
	@RequestMapping(value="/updateuser/{userId}",method=RequestMethod.PUT)
	public void updateUser(@RequestBody HGUser user, @PathVariable Integer userId) {
		userService.updateUser(user, userId);
	}
	
	@RequestMapping(value="/deleteuser/{userId}")
	public void deleteUser(@PathVariable Integer userId) {
		userService.deleteUser(userId);
	}
	

}
