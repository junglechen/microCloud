
package cn.jungle.cloud.parent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RefreshScope
	@RestController
	class MessageRestController {
		@Value("${developer:world}")
		public String value;
		
		@RequestMapping("/")
		String home() {
			return "hello"+" " +value;
		}
}
}