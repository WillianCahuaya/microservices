package com.bsoftgroup.springbootmq.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"prf.mq.log"})
@Configuration
public class MQConfig {
	
	@Bean
	public Queue log() {
		return new Queue("app.pagolinea.queue.log");
	}
	
	@Profile("receiver")
	@Bean
	public MQReceiver receiver() {
		
		return new MQReceiver();
	}
	
	@Profile("sender")
	@Bean
	public MQSender sender(){
		return new MQSender();
	}

}