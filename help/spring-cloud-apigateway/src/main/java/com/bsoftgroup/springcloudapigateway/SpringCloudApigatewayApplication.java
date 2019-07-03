package com.bsoftgroup.springcloudapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class SpringCloudApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApigatewayApplication.class, args);
	}

}
