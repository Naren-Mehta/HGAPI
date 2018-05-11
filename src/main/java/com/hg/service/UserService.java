package com.hg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hg.dao.UserRepository;
import com.hg.domain.HGUser;
import java.util.*;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	private List<HGUser> userList1= new ArrayList<HGUser>(Arrays.asList(
		new HGUser(1,"Naren","M","naren@gmail.com","1234567890",true),
		new HGUser(2,"Deepak","K","deepak@gmail.com","1234567890",true),
		new HGUser(3,"Hemraj","M","hemraj@gmail.com","1234567890",true),
		new HGUser(4,"Prema","H","prema@gmail.com","1234567890",true)
	));
	
	public List<HGUser> getAllUsers(){
		
		List<HGUser> userList= new ArrayList<HGUser>();
		userRepository.findAll().forEach(userList::add);
		
		return userList;
	}
	
	public HGUser getUser(Integer userId){
		Optional<HGUser> user= userRepository.findById(userId);
		if(!user.isPresent()) {
			System.out.println("===user not found===");
			return  null;
		}else {
			return user.get();
		}
		
		
	}
	
	public void addUser(HGUser user) {
		userRepository.save(user);
	}
	
	public void updateUser(HGUser user, Integer userId) {
		userRepository.save(user);
	}
	
	public void deleteUser(Integer userId) {
		userRepository.deleteById(userId);
		
	}
	
}
