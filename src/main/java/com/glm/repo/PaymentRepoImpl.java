package com.glm.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.glm.entity.Payment;

import jakarta.persistence.EntityManager;

@Repository
public class PaymentRepoImpl implements PaymentRepo {

	@Autowired
	EntityManager emPayment;
	@Override
	public boolean addPayment(Payment payment) {
		emPayment.persist(payment);
		return true;
	}

	@Override
	public List<Payment> getAllPaymentDetails() {
		
		return emPayment.createQuery("from Payment").getResultList();
	}

}
