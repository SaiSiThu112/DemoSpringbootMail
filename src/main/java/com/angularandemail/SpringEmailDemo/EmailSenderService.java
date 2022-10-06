package com.angularandemail.SpringEmailDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void sendMail(String toEmail, String subject , String body) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("enter mail@gmail.com");
		message.setTo(toEmail);
		message.setSubject(subject);
		message.setText(body);
		mailSender.send(message);
		System.out.println("Mail sent Successfully...");
		
	}
}
