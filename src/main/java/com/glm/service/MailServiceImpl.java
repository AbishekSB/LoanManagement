package com.glm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

	@Autowired
	private JavaMailSender mailsender;
	
	public void sendMail(String toMail ,String subject,String body) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("sbabishekcena@gmail.com");
		message.setTo(toMail);
		message.setText(body);
		message.setSubject(subject);
		mailsender.send(message);
		System.out.println("sended");
	}
}