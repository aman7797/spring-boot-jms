package com.jms.p2p.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jms.p2p.model.Person;
import com.jms.p2p.producer.Producer;


@RestController
public class Controller {

	@Autowired
	Producer producer;

	@GetMapping(value = "/produce")
	public String produce(@RequestParam("msg") String msg) {
		producer.send(msg);
		return "Done";
	}

	@RequestMapping(value = "/produce", method = RequestMethod.POST)
	public String produce(@RequestBody Person p) {
		producer.send(p);
		return "Send Person Done" + p.toString();
	}
}
