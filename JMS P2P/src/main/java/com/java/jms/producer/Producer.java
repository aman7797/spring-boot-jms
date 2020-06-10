package com.java.jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.java.jms.model.Person;

@Component
@EnableJms
public class Producer {
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Value("${jms.queue.destination}")
	String destinationQueue;
	
	public void send(String msg){
		jmsTemplate.convertAndSend(destinationQueue, msg);
	}
	public void send(Person p){
		jmsTemplate.convertAndSend(destinationQueue, p);
	}


}