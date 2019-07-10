package com.boomdev.onlinesale.onlinesalemseurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlineSaleMsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineSaleMsEurekaServerApplication.class, args);
	}

}
