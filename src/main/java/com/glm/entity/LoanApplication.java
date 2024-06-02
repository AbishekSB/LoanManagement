package com.glm.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanId;
    private String fullName;
//    @DateTimeFormat(pattern = "dd/MM/yyyy")
//    private LocalDate birthDay;
    private String birthDay;
    private String gender;
    private String email;
    private String address;
    private long contactNumber;
    private String maritalStatus;
    
    private int loanAmount;
    private String purposeOfLoan;
    private String repaymentPeriod;
    private String paymentFrequency;
    private String goldDescription;
    private String bankAccHolderName;
    private String bankName;
    private String branch;
    private long accNumber;
    private String ifscCode;
    private String referenceOne;
    private String referenceTwo;
    private String status;
    
    @ManyToOne(targetEntity = Scheme.class, cascade = CascadeType.REFRESH)
    @JoinColumn(name="id")
    private Scheme scheme;

	@OneToOne(targetEntity = User.class, cascade= CascadeType.REFRESH)
	@JoinColumn(name="userId")
	private User user;

	public LoanApplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanApplication(int loanId, String fullName, String birthDay, String gender, String email, String address,
			long contactNumber, String maritalStatus, int loanAmount, String purposeOfLoan, String repaymentPeriod,
			String paymentFrequency, String goldDescription, String bankAccHolderName, String bankName, String branch,
			long accNumber, String ifscCode, String referenceOne, String referenceTwo, String status, Scheme scheme,
			User user) {
		super();
		this.loanId = loanId;
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.contactNumber = contactNumber;
		this.maritalStatus = maritalStatus;
		this.loanAmount = loanAmount;
		this.purposeOfLoan = purposeOfLoan;
		this.repaymentPeriod = repaymentPeriod;
		this.paymentFrequency = paymentFrequency;
		this.goldDescription = goldDescription;
		this.bankAccHolderName = bankAccHolderName;
		this.bankName = bankName;
		this.branch = branch;
		this.accNumber = accNumber;
		this.ifscCode = ifscCode;
		this.referenceOne = referenceOne;
		this.referenceTwo = referenceTwo;
		this.status = status;
		this.scheme = scheme;
		this.user = user;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getPurposeOfLoan() {
		return purposeOfLoan;
	}

	public void setPurposeOfLoan(String purposeOfLoan) {
		this.purposeOfLoan = purposeOfLoan;
	}

	public String getRepaymentPeriod() {
		return repaymentPeriod;
	}

	public void setRepaymentPeriod(String repaymentPeriod) {
		this.repaymentPeriod = repaymentPeriod;
	}

	public String getPaymentFrequency() {
		return paymentFrequency;
	}

	public void setPaymentFrequency(String paymentFrequency) {
		this.paymentFrequency = paymentFrequency;
	}

	public String getGoldDescription() {
		return goldDescription;
	}

	public void setGoldDescription(String goldDescription) {
		this.goldDescription = goldDescription;
	}

	public String getBankAccHolderName() {
		return bankAccHolderName;
	}

	public void setBankAccHolderName(String bankAccHolderName) {
		this.bankAccHolderName = bankAccHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getReferenceOne() {
		return referenceOne;
	}

	public void setReferenceOne(String referenceOne) {
		this.referenceOne = referenceOne;
	}

	public String getReferenceTwo() {
		return referenceTwo;
	}

	public void setReferenceTwo(String referenceTwo) {
		this.referenceTwo = referenceTwo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Scheme getScheme() {
		return scheme;
	}

	public void setScheme(Scheme scheme) {
		this.scheme = scheme;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
    
   
}

