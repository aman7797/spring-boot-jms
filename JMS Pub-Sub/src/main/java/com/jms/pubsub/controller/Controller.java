package com.jms.pubsub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jms.pubsub.producer.Producer;

@RestController
public class Controller {

	@Autowired
	Producer producer;
	
	@GetMapping(value = "/produce")
	public String produce(@RequestBody String msg) {
		producer.sendMessage("inbound.topic", msg);
		return "Done";
	}
	
//	@RequestMapping(value = "/produce", method = RequestMethod.POST)
//	public String produce(@RequestBody Person p) {
////		producer.send(p);
//		producer.sendMessage("inbound.topic", p);
//		return "Send Person Done" + p.toString();
//	}
}
