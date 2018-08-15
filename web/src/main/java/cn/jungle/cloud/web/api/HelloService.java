package cn.jungle.cloud.web.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jungle.cloud.web.fallback.HelloFallback;


@FeignClient(name="EUREKA-API",fallback=HelloFallback.class)
public interface HelloService {

	@RequestMapping(value="/hello")
	String hello();
}
