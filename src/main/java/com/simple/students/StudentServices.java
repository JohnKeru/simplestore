package com.simple.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentServices {
	
	@Autowired
	private StudentRepository repo;
	
	public List<Student> getAllStudent() {
		return repo.findAll();
	}
	public ResponseEntity<?> getStudent(int id) {
		if(repo.existsById(id)) {
			return ResponseEntity.ok(repo.findById(id));	
		}
		return new ResponseEntity<>("No "+id+" Student Found.",HttpStatus.NOT_FOUND);
	}
}
