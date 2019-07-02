package com.bsoftgroup.springbootapimail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bsoftgroup.springbootapimail.bean.MailBean;
import com.bsoftgroup.springbootapimail.sendermail.MailSender;

@RestController
public class RestMailController {

	@Autowired
	MailSender mailsender;
	
	@PostMapping(path="/senderemail")
	public void senderEmail(@RequestBody MailBean mensaje) {
		
		
		System.out.println(mensaje.getMessage());
		mailsender.mailSend(mensaje.getMessage());
		
	}
}