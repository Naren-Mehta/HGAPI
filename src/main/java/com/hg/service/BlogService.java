package com.hg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hg.dao.BlogRepository;
import com.hg.dao.UserRepository;
import com.hg.domain.Blog;
import com.hg.domain.HGUser;
import java.util.*;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;

	public List<Blog> getAllBlogs(Integer userId){
		
		List<Blog> blogList= new ArrayList<Blog>();
		blogRepository.findByUserUserId(userId).forEach(blogList::add);
		
		return blogList;
	}
	
	public Blog getBlog(Integer blogId){
		Optional<Blog> blog= blogRepository.findById(blogId);
		if(!blog.isPresent()) {
			System.out.println("===user not found===");
			return  null;
		}else {
			return blog.get();
		}
		
		
	}
	
	public void addBlog(Blog blog) {
		blogRepository.save(blog);
	}
	
	public void updateBlog(Blog blog) {
		blogRepository.save(blog);
	}
	
	public void deleteBlog(Integer blogId) {
		blogRepository.deleteById(blogId);
		
	}
	
}
