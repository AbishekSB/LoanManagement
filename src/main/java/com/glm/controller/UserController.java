package com.glm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.glm.entity.LoanApplication;
import com.glm.entity.User;
import com.glm.service.UserService;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	UserService service;


@PostMapping("/registerUser")
public String userRegister(@RequestBody User user) {
	service.addUser(user);
	String msg = "User Object Saved";
	return msg;
}

@GetMapping("/userLogin/{userEmail}/{userPassword}")
public User validateLogin(@PathVariable("userEmail") String userEmail, @PathVariable("userPassword") String userPassword) {
	return service.userLogin(userEmail, userPassword);
}




}













































































//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.glm.entity.User;
//import com.glm.service.UserService;
//
//
//
//
//
//@RestController
//@CrossOrigin("http://localhost:3000")
//public class UserController {
//
//	@Autowired
//	private UserService userService;	
//	
//		@PostMapping("/RegisterUser")
//		public ResponseEntity<String> RegsUser(@RequestBody User user) {
//			
//			return userService.regUser(user);
//			
//		}
//		
//		@PostMapping("/validateLogin")
//		public ResponseEntity<String> ValidateLogin(@RequestBody User user) {
//	 
//			return userService.loginUser(user);
//			
//		}
			
	    
	   





