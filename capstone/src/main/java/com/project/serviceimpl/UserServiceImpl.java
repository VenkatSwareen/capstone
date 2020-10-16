package com.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.User;
import com.project.repository.UserRepository;
import com.project.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository dao;
	
	@Override
	public boolean authenticate(String emailId, String pwd) {
	
	
		
	if(dao.existsByEmailId(emailId)&&dao.findByEmailId(emailId).equals(dao.findByPwd(pwd))) {
		return true;
	}
	else
	return false;
	}

	@Override
	public User getUserByEmailId(String emailId) {
		return dao.findByEmailId(emailId);
	}

	@Override
	public User updateUser(User user) {
		return dao.save(user);
		
	}

	@Override
	public List<User> getAllUsers() {
		return dao.findAll();
	}

	@Override
	public User addUser(User user) {
		return dao.save(user);
	}

	@Override
	public User getUserByEmailIdAndPwd(String emailId, String pwd) {
		return dao.findByEmailIdAndPwd(emailId, pwd);
	}

}
