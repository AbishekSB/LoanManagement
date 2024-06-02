package com.glm.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentId;
	private int interestRate;
	private int tenure;
	private int amount;
	
	
	
	@ManyToOne(targetEntity = Scheme.class, cascade = CascadeType.REFRESH)
    @JoinColumn(name="id")
    private Scheme scheme;
	
	@ManyToOne(targetEntity = LoanApplication.class, cascade = CascadeType.REFRESH)
	@JoinColumn(name="loanId")
	private LoanApplication loanApplication;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int paymentId, int interestRate, int tenure, int amount, Scheme scheme,
			LoanApplication loanApplication) {
		super();
		this.paymentId = paymentId;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.amount = amount;
		this.scheme = scheme;
		this.loanApplication = loanApplication;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}

	public LoanApplication getLoanApplication() {
		return loanApplication;
	}

	public void setLoanApplication(LoanApplication loanApplication) {
		this.loanApplication = loanApplication;
	}
	


}
