package com.mindtree.bohorooms.service;

import java.util.List;

import com.mindtree.bohorooms.entity.User;
import com.mindtree.bohorooms.exception.ThisEmailisalreadyExist;

public interface UserService {
	
	public User addUser(User user);
	
	public List<User> allUsers();
	
	public User findById(int id);
	
	public User registerUser(User user) throws ThisEmailisalreadyExist;

}
