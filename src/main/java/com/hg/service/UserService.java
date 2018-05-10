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
		return userList1.stream().filter(u -> u.getUserId().equals(userId)).findFirst().get();
		
	}
	
	public void addUser(HGUser user) {
		//userList.add(user);
		//System.out.println(userList);
		userRepository.save(user);
	}
	
	public void updateUser(HGUser user, Integer userId) {
		for(int i=0;i<userList1.size();i++) {
			HGUser u= userList1.get(i);
			if(userList1.get(i).getUserId().equals(userId)) {
				userList1.set(i, user);
				return;
			}
		}
	}
	
	public void deleteUser(Integer userId) {
		
		userList1.removeIf(u -> u.getUserId().equals(userId));
		
	}
	
}
