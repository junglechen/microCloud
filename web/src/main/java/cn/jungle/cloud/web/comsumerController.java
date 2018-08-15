package cn.jungle.cloud.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.jungle.cloud.web.api.HelloService;

@RestController
public class comsumerController {

	@Resource
	private HelloService helloService;

	@RequestMapping(value = "feign-consumer")
	public String feign() {
		return helloService.hello();
	}

}
