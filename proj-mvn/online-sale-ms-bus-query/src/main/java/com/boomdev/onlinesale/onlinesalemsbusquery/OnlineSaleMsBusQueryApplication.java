package com.boomdev.onlinesale.onlinesalemsbusquery;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@EnableFeignClients("com.boomdev.onlinesale.onlinesalemsbusquery.client.feign")
public class OnlineSaleMsBusQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineSaleMsBusQueryApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		//Id Generator
		return Sampler.ALWAYS_SAMPLE;
	}
}
