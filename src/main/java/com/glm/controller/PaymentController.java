package com.glm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.glm.entity.Payment;
import com.glm.service.PaymentService;

@RestController
@CrossOrigin("http://localhost:3000")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/addPaymentDetails")
	public boolean addPayment(@RequestBody Payment payment )
	{
		return paymentService.addPayment(payment);
	}
	
	@GetMapping("/getAllDetailsOfPayment")
	public List<Payment> getAllDetailsOfPayment()
	{
		return paymentService.getAllPaymentDetails();
	}

}
