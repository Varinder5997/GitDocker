package com.mindtree.bohorooms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bohorooms.entity.User;
import com.mindtree.bohorooms.exception.ThisEmailisalreadyExist;
import com.mindtree.bohorooms.repository.UserRepo;
import com.mindtree.bohorooms.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	@Override
	public User registerUser(User user) throws ThisEmailisalreadyExist {
		
		String mail=user.getEmailId();
		int count=0;
		List<User>allUser=this.userRepo.findAll();
		for (User user2 : allUser) {
			if(user2.getEmailId().compareTo(mail)==0) {
				count++;
			}
		}
		if(count==0) {
		return this.userRepo.save(user);
		}
		else {
			throw new ThisEmailisalreadyExist("This email is already Exist");
		}
	}

	@Override
	public List<User> allUsers() {
		return this.userRepo.findAll();
	}

	@Override
	public User findById(int id) {
		return this.userRepo.findById(id).get();
	}

	@Override
	public User addUser(User user) {
		
		return this.userRepo.save(user);
	}

}
