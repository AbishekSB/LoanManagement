package com.glm.repo;

import java.util.List;

import com.glm.entity.Payment;

public interface PaymentRepo {

	public boolean addPayment(Payment payment);
	
	public List<Payment> getAllPaymentDetails();
		
	
}
