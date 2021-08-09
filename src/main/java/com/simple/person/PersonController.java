package com.simple.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
@CrossOrigin(origins="*", maxAge=3600)
public class PersonController {
	
	@Autowired
	private PersonRepository repo;
	
	@GetMapping
	public List<Person> getAllPerson(){
		return repo.findAll();
	}
	@GetMapping("/{pid}")
	public Person person(@PathVariable int pid) {
		return repo.findById(pid).get();
	}
	@PutMapping("/{pid}")
	public Person updatePerson(@PathVariable int pid, @RequestBody IsTyping isTyping) {
		final Person person = repo.findById(pid).get();
		person.setTyping(isTyping.isTyping());
		return repo.save(person);
	}
	@PostMapping
	public Person addPerson(@RequestBody Person person) {
		return repo.save(person);
	}
}
