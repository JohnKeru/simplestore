package com.simple.messenger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*", maxAge=3600)
@RequestMapping("/messages")
public class MessagesController {
	@Autowired
	private MessagesRepository messageRepo;
	
	@PostMapping
	public Messages message(@RequestBody Messages message) {
		return messageRepo.save(message);
	}
	@GetMapping
	public List<Messages> messages(){
		return messageRepo.findAll();
	}
}

