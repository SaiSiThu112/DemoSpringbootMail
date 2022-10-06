package com.angularandemail.SpringEmailDemo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailDemoApplication {

	@Autowired
	private EmailSenderService emailService;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailDemoApplication.class, args);
		
	}

	@EventListener(ApplicationReadyEvent.class)
	public void mail() {
		emailService.sendMail("enter mail@gmail.com", "enter subject", "enter mail body");

	}

}
