package cn.jungle.cloud.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
 

	private String from;

	@RequestMapping("/from")
	public String getFrom() {
		return from;
	}
	@Value("${zuul.routes.web.path}")
	public void setFrom(String from) {
		this.from = from;
	}
}
