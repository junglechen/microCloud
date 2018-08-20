package cn.jungle.cloud.stream.hello.service;


import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SinkSender {
	@Output(org.springframework.cloud.stream.messaging.Source.OUTPUT)
	MessageChannel output();
}
