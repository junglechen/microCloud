package cn.jungle.cloud.web.fallback;

import org.springframework.stereotype.Component;

import cn.jungle.cloud.web.api.HelloService;


@Component
public class HelloFallback implements HelloService{

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return " api error";
	}


}
