package com.boomdev.microserviceapibook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SecurityConfig.class)
public class MicroserviceApiBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApiBookApplication.class, args);
	}

}
