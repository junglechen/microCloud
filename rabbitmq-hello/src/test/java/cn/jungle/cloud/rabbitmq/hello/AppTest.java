package cn.jungle.cloud.rabbitmq.hello;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.jungle.cloud.rabbitmq.hello.service.Sender;

/**
 * Unit test for simple App.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
	@Resource
	private Sender sender;
	
	@Test
	public void hello() {
		String content=" send message";
		sender.send(content);
	}
}
