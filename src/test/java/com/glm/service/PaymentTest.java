package com.glm.service;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PaymentTest {
	
	@Autowired
	private PaymentService paymentService;

	@Test
	void testgetAllPaymentDetails() {
		assertNotNull(paymentService.getAllPaymentDetails());
	}

}
