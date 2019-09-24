package com.boomdev.onlinesale.onlinesalemsbusinessquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.boomdev.onlinesale.onlinesalemsbusinessquery.client.feign")
public class OnlineSaleMsBusinessQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineSaleMsBusinessQueryApplication.class, args);
	}

}
