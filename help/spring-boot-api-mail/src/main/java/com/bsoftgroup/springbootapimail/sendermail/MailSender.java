package com.bsoftgroup.springbootapimail.sendermail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Component;

@Component
public class MailSender {

	public String mailSend(String mensaje) {
		//datos del proxy
				String host="smtp.gmail.com";
				String username="bsoftgroup040519@gmail.com";//emailid
				String password="falen2125@gmail.com";//emailid password
				
				// correo de envio 
				String from="jfalen25@hotmail.com";// email from which u have to send
				
				//correo destino
				String to = "falen2125@gmail.com";
				
				//Mensaje
				String subject="Website Password";
				String body=mensaje;
				boolean sessionDebug=false;
				
				
				Properties props=System.getProperties();
				props.put("mail.host",host);
				props.put("mail.transport.protocol","smtp");
				props.put("mail.smtp.starttls.enable","true");
				props.put("mail.smtp.auth", "true");
				props.put("mail.smtp.debug", "true");
				props.put("mail.smtp.socketFactory.port", "465");
				props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
				props.put("mail.smtp.socketFactory.fallback", "false");
				props.put("mail.smtp.host", "smtp.gmail.com");
				props.put("mail.smtp.port", "25"); 
				
				Session mailSession=Session.getDefaultInstance(props,null);
				mailSession.setDebug(sessionDebug);
			
				Message msg=new MimeMessage(mailSession);
				try {
					msg.setFrom(new InternetAddress(from));
				
			
				InternetAddress [] address={new InternetAddress(to)};
				msg.setRecipients(Message.RecipientType.TO,address);
				msg.setSubject(subject);
				msg.setSentDate(new Date());
				msg.setText(body);
			
				Transport tr=mailSession.getTransport("smtp");
				tr.connect(host,username,password);
				msg.saveChanges();
				tr.sendMessage(msg,msg.getAllRecipients());
				tr.close();
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
					return "Error de envio";
				}
				
				return "Mensaje Enviado";
	}

	public static void main(String[] args) {
			new MailSender().mailSend("mensaje");
	}

}
