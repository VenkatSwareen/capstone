package com.project.service;

import java.util.List;

import com.project.model.User;

public interface UserService {


	public boolean authenticate(String emailId,String pwd);
	public User getUserByEmailId(String emailId);
	public User updateUser(User user);
	public List<User>getAllUsers();
	public User addUser(User user);
	public User getUserByEmailIdAndPwd(String emailId, String pwd);
}
