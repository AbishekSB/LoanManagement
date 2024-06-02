package com.glm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Scheme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String NBFC;
    private String interestRate;
    private String loanAmount;
    
	public Scheme() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Scheme(int id, String nBFC, String interestRate, String loanAmount) {
		super();
		this.id = id;
		this.NBFC = nBFC;
		this.interestRate = interestRate;
		this.loanAmount = loanAmount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNBFC() {
		return NBFC;
	}
	public void setNBFC(String nBFC) {
		NBFC = nBFC;
	}
	public String getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
    
    
    
    
	
	}
	
		