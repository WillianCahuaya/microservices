package com.bsoftgroup.com.springbootftp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.scheduling.annotation.Scheduled;

public class FTPSender {
static int i=1;
	
	@Scheduled(fixedDelay=1000, initialDelay=500)
	public void send() {
		//String message = "Message Send FTP.  to  "+i++;
	    System.out.println("Message Send x FTP "+ i++ );
	    FTPClient ftpClient = new FTPClient();
		FTPClientConfig config = new FTPClientConfig(FTPClientConfig.SYST_UNIX);
		ftpClient.configure(config);

		 try {
			 
			ftpClient.connect("colocar server ftp ", 21);
			
			System.out.println("conecto");
			
			int reply = ftpClient.getReplyCode();
			  
			System.out.println("reply"+reply);
			if (!FTPReply.isPositiveCompletion(reply)){
				ftpClient.disconnect();
				System.out.println("FTP server refused connection.");
			}
			else {
			
				ftpClient.setBufferSize(1000);
				String username = "";
				String password = "";
				if (!ftpClient.login(username, password)){
					ftpClient.logout();
					//error = true;
					//+break ;
				}
				System.out.println("FTP server me he logueado.");
			   ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
			   
				ftpClient.enterLocalPassiveMode();
		
				
					InputStream input;
					input = new FileInputStream("E:\\log\\log4j-application.log");
					ftpClient.storeFile("/file/log4j-application.log", input);
					input.close();
			

				ftpClient.logout();
				
			   
				ftpClient.disconnect();
				
			}
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
