package com.hg.controllers.rest;

import java.util.ArrayList;

import com.hg.domain.Blog;
import com.hg.domain.HGUser;
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

	@RequestMapping("/users/{userId}/blogs")
	public List<Blog> getAllBlogs(@PathVariable Integer userId) {

		return blogService.getAllBlogs(userId);
	}

	@RequestMapping("/users/{userId}/blogs/{blogId}")
	public Blog getBlog(@PathVariable Integer userId,@PathVariable Integer blogId) {
		return blogService.getBlog(blogId);
	}

	@RequestMapping(value = "/users/{userId}/addBlog", method = RequestMethod.POST)
	public void addBlog(@RequestBody Blog blog, @PathVariable Integer userId) {

		HGUser user=new HGUser();
		user.setUserId(userId);
		blog.setUser(user);
		System.out.println("===="+blog);
		blogService.addBlog(blog);		
	}
	
	
	@RequestMapping(value="/users/{userId}/updateblog/{blogId}",method=RequestMethod.PUT)
	public void updateBlog(@RequestBody Blog blog, @PathVariable Integer userId, @PathVariable Integer blogId) {
		HGUser user=new HGUser();
		user.setUserId(userId);
		blog.setUser(user);
		blogService.updateBlog(blog);
	}
	
	@RequestMapping(value="/users/{userId}/deleteblog/{blogId}")
	public void deleteBlog(@PathVariable Integer blogId) {
		blogService.deleteBlog(blogId);
	}
	

}
