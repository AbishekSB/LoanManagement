package com.glm.service;

import java.util.List;



import com.glm.entity.Payment;




public interface PaymentService {
	
	public boolean addPayment(Payment payment);
	public List<Payment> getAllPaymentDetails();
	
}
