package com.bsoftgroup.springcloudmsbconsulta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.bsoftgroup.springcloudmsbconsulta.interfaces")
public class SpringCloudMsbConsultaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMsbConsultaApplication.class, args);
	}

}
