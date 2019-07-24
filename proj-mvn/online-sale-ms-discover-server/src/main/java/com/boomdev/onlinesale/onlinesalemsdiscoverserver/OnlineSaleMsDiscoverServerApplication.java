package com.boomdev.onlinesale.onlinesalemsdiscoverserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlineSaleMsDiscoverServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineSaleMsDiscoverServerApplication.class, args);
	}

}
