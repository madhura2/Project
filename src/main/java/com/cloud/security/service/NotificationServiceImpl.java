package com.cloud.security.service;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;  

@Service("notificationService")
@Transactional
public class NotificationServiceImpl implements NotificationService{	 
	public boolean sendMail(String to, String subject, String msg) {
	   /*   String host = "localhost";
	      String from = "admin@sudarshanwabale.info";
	      Properties properties = System.getProperties();  
	      properties.setProperty("mail.smtp.host", host);  
	      Session session = Session.getDefaultInstance(properties);  
	  
	      try{  
	         MimeMessage message = new MimeMessage(session);  
	         message.setFrom(new InternetAddress(from));  
	         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
	         message.setSubject(subject);  
	         message.setText(msg);
	  
	         Transport.send(message);  
	         return true;
	      }catch (MessagingException mex) {
	    	  mex.printStackTrace();
	    	  return false;
	      }
	      */
		return true;
	}
}	
