package cn.jungle.cloud.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.jungle.cloud.TestApi;

@RestController
public class TestApiIml implements TestApi{

	@Override
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod="helloFallback")
	public String testHello() {
		
		return "hi geek from 8182";
	}
	public String helloFallback() {
		return "api fallback successfully";
	}
}
