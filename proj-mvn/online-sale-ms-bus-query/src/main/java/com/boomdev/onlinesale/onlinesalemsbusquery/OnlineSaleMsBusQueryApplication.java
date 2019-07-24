package com.boomdev.onlinesale.onlinesalemsbusquery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.boomdev.onlinesale.onlinesalemsbusquery.interfaces")
public class OnlineSaleMsBusQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineSaleMsBusQueryApplication.class, args);
	}

}
