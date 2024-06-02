package com.glm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glm.entity.Payment;
import com.glm.repo.PaymentRepo;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	PaymentRepo em;
	
	@Override
	public boolean addPayment(Payment payment) {
		em.addPayment(payment);
		return true;
	}

	@Override
	public List<Payment> getAllPaymentDetails() {
		
		return em.getAllPaymentDetails();
	}

}
