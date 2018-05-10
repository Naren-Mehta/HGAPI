package com.hg.dao;

import org.springframework.data.repository.CrudRepository;

import com.hg.domain.HGUser;

public interface UserRepository extends CrudRepository<HGUser, Integer> {

	
}
