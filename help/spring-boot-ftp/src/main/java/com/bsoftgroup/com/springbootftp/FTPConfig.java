package com.bsoftgroup.com.springbootftp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"prf.ftp.log"})
@Configuration
public class FTPConfig {
	
	@Profile("sender")
	@Bean
	public FTPSender sender(){
		return new FTPSender();
	}

}