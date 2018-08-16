package cn.jungle.cloud.rabbitmq.hello.service;

import javax.annotation.Resource;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
public class Sender {

	@Resource
	private AmqpTemplate amqpTemplate ;
	
	public void send( String message) {
		this.amqpTemplate.convertAndSend("hello", message);
		System.out.println(message);
	}
}
