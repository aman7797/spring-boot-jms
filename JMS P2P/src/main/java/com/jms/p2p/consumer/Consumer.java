package com.jms.p2p.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import com.jms.p2p.model.Person;

@Component
public class Consumer {

	@JmsListener(destination = "${jms.queue.destination}")
	public void receive(Message message){
		if(message.getPayload() instanceof String){
			System.out.println("Recieved Message: " + message.getPayload().toString());
		}else if (message.getPayload() instanceof Person){
			System.out.println("Recieved Person: " + message.getPayload().toString());
		}else {
			System.err.println("Message Type Unkown !");
		}
	}
}
