package cn.jungle.cloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker
public class ApiApp {

	public static void main(String[] args) {
		SpringApplication.run(ApiApp.class, args);
		System.out.println("Hello api!");
	}

}