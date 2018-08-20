package cn.jungle.cloud.stream.hello.service;
import javax.xml.transform.Source;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(value= {Sink.class,SinkSender.class,Source.class})
public class SinkReceiver {
  
	@StreamListener(Sink.INPUT)
	public void receive(Object payload) {
		System.out.println("recevied:"+payload);
	}
}

