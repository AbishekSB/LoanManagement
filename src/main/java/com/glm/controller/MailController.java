package com.glm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.glm.service.MailService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/rest/")
public class MailController {

 
	@Autowired
	MailService serv;
 
	@PostMapping("/sendEmailOTP")
	public String sendOTPEmail(@RequestParam("email")String email, @RequestParam("name") String name, @RequestParam("amount") double amount, @RequestParam("period") int period, @RequestParam("interest") double interest, @RequestParam("rate") int rate){
		String toMail = email;
		String subject = "Interest Rate and Loan  - Estimation Confirmation";
		String body = "Dear " +  name + ", Your Loan request for the amount " + amount + " with period of " + period + " years at the interest rate " + rate +  "%, the interest amount is " + interest + ". Thanks & Regards";
		try {
			serv.sendMail(toMail, subject, body);
			return "Mail Sent Successfully";
		}catch(Exception e) {
			return "Mail Send Failure";
		}
 
	}
}
