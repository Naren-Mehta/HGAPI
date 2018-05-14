package com.hg.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.hg.domain.Blog;

public interface BlogRepository extends CrudRepository<Blog, Integer> {

	
	public List<Blog> findByUserUserId(Integer userId); 
	
}
