package com.glm.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.glm.entity.User;
@SpringBootTest
class UserTest {
	
	
	@Autowired
	private UserService userservice;

	@Test
	void testLoginValidate() {
		User user = userservice.userLogin("sbabishekcena@gmail.com", "Abishek123");
		assertNotNull(user);
	}

}
