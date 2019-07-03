package com.bsoftgroup.springbootmq.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class MQSender {
   static int i=1;
	
	@Autowired
	private RabbitTemplate template;
	
	@Autowired
	private Queue queue;
	
	@Scheduled(fixedDelay=1000, initialDelay=500)
	public void send() {
		String message = "Message Send to "+queue.getName() +" "+i++;
		
		this.template.convertAndSend(queue.getName(),message);
		System.out.println("Message Send to "+queue.getName() +" "+ i );
	}

}