package cn.jungle.cloud.web;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;




@RestController
public class TestService {

	@Resource
	private RestTemplate restTemplate;

	@RequestMapping(value = "/get")
	@HystrixCommand(fallbackMethod="helloFallback")
	public String getHello() {
		System.out.println("getHello start");
		ResponseEntity<String> forEntity = restTemplate.getForEntity("http://EUREKA-API/hello", String.class);
		return forEntity.getBody();
	}
	
	public String helloFallback() {
		return "hello fallback successfully";
	}
	

}