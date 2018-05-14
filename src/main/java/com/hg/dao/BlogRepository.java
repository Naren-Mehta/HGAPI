package com.hg.dao;

import org.springframework.data.repository.CrudRepository;

import com.hg.domain.Blog;

public interface BlogRepository extends CrudRepository<Blog, Integer> {

	
}
