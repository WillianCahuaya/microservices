package com.bsoftgroup.springbootmq.mq;

import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues="app.pagolinea.queue.log")
public class MQReceiver {
	final static Logger logger = Logger.getLogger(MQReceiver.class);
	
	@RabbitHandler
	public void receiver(String message) {
		System.out.println(" [x] Receiver '"+message+"'");
		//Conexion conexion = 
		
		 logger.info("[x] Receiver '"+message+"'");
	}

}