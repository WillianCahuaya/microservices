package com.boomdev.microserviceapirating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SecurityConfig.class)
public class MicroserviceApiRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApiRatingApplication.class, args);
	}

}
