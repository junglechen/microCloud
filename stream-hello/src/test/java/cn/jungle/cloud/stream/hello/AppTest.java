package cn.jungle.cloud.stream.hello;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import cn.jungle.cloud.stream.hello.service.SinkSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest 
{
	@Resource
	private SinkSender sinkSender;
	@Resource
	private MessageChannel input;
	@Test
	public void contextLoad() {
		input.send(MessageBuilder.withPayload("from sinksender").build());
	}
}
