package com.glm.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Scheme {

	@Autowired
	private SchemeService schemeService;
	
	@Test
	void testGetAllSCheme() {
		assertNotNull(schemeService.getAllSchemes());
	}
	
	@Test
	void testGetNameList()
	{
		assertNotNull(schemeService.getSchemeNameList());
	}
	
	@Test
	void testGetIdList()
	{
		assertNotNull(schemeService.getSchemeIdList());
	}

}
