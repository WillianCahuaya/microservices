package com.boomdev.onlinesale.onlinesalemsconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OnlineSaleMsConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineSaleMsConfigServerApplication.class, args);
	}

}
