package com.glm.service;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoanApplicationTest {

	@Autowired
	private LoanApplicationService loanService;

	
	
	@Test
	void testGetAllSCheme() {
		assertNotNull(loanService.getAllApplicantDetails());
	}
	
	@Test
	void testGetAllEmail()
	{
		assertNotNull(loanService.getEmailListt());
	}
	
	@Test
	void testGetAllIdList()
	{
		assertNotNull(loanService.getApplicantId());
		
	}
	
	@Test
	void testGetAllNameList()
	{
		assertNotNull(loanService.getApplicantName());
	}
	
	

}
