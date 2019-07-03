package com.bsoftgroup.springbootmq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootMqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMqApplication.class, args);
	}
	
	@Profile("usage_message")
	@Bean
	public CommandLineRunner usage() {
		return args -> {
			System.out.println("This app uses Spring Profiles to control its behavior.\n");
			System.out.println("Options are:");
			System.out.println("java -jar mqmessagelog.jar --spring.profiles.active=prf.mq.log,receiver");
			System.out.println("java -jar mqmessagelog.jar --spring.profiles.active=prf.mq.log,sender");
		};
	}
	
	@Profile("!usage_message")
	@Bean
	public CommandLineRunner tutorial() {
		return new RabbitAmqpRunner();
	}

}
