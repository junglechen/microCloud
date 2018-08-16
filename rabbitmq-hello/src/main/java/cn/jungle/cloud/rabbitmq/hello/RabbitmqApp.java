package cn.jungle.cloud.rabbitmq.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class RabbitmqApp {
	public static void main(String[] args) {
		SpringApplication.run(RabbitmqApp.class, args);
		System.out.println("Hello RabbitmqApp!");
	}
}
