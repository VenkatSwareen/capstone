package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.User;
import com.project.service.UserService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	public UserService service;
	
//	@PostMapping("/user")
//	public User addUser(@RequestBody User user) {
//		return service.addUser(user);
//	}

		@PutMapping("/user")
		public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
			
		}

		@GetMapping("/users")
		public List<User> getAllUsers() {
			return service.getAllUsers();
		}
		
		
		@PostMapping("/user/login")
		public User Login(@RequestBody User user) throws Exception
		{
			String emailId=user.getEmailId();
			String pwd=user.getPwd();
			
			User userobj=null;

			if(emailId!=null && pwd!=null)

			{
				userobj=service.getUserByEmailIdAndPwd(emailId, pwd);

			}
			if(userobj==null)
			{
	       throw new Exception("Invalid credentials");
	}
		return userobj;

			}
			
		
		@PostMapping("/user/register")
		public User Register(@RequestBody User user) throws Exception {
				String emailId=user.getEmailId();
				String pwd=user.getPwd();
				User userobj=null;
				if(emailId!=null && pwd!=null)
				{
					userobj=service.getUserByEmailIdAndPwd(emailId, pwd);
					
				}
				
				if(service.getUserByEmailId(emailId)==null&&userobj==null)
				{
				 return service.addUser(user);
				}
				else {
					throw new Exception("user already exists");
				}
				
			}
}
