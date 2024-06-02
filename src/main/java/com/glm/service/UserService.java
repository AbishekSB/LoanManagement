package com.glm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glm.entity.User;
import com.glm.repo.UserRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
	
@Autowired(required = true)
UserRepo repo;

public void addUser(User user) {
	repo.addUser(user);
}
public User userLogin(String userEmail, String userPassword) {
	return repo.userLogin(userEmail, userPassword);
}


}



























































//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.glm.entity.User;
//import com.glm.repo.UserRepo;
//
//
//
//
//@Service
//public class UserService {
//
//	@Autowired
//	private UserRepo userRepo;	  
//
//	public ResponseEntity<String> regUser(@RequestBody User user) {			
//
//		String email = user.getUserEmail();
//		System.out.println(email);
//
//		boolean validate = userRepo.existsByuserEmail(email);
//		System.out.println(validate);
//		if (validate) {
//			return ResponseEntity.badRequest().body("User Already Present");
//		} else {
//
//			userRepo.save(user);
//			return ResponseEntity.ok("Registration Successfull");
//		}
//	}  
//
//
//	public ResponseEntity<String> loginUser(User user) {
//
//		if (userRepo.existsByuserEmail(user.getUserEmail()) && userRepo.existsByuserPassword(user.getUserPassword())) {
//			if(user.getUserEmail().equals("admin@gmail.com")) {
//				
//				return ResponseEntity.ok("Admin");
//			}
//			else
//			{
//			return ResponseEntity.ok("User");
//			}
//
//		} else {
//
//			return ResponseEntity.badRequest().body("Invalid Email or Password");
//		}
//	}
//}


