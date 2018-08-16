package cn.jungle.cloud.rabbitmq.hello.service;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(queues="hello")
public class Receiver {
	@RabbitHandler
	public  void process(String content) {
		System.out.println("receive:"+ content);
		
	}

}
