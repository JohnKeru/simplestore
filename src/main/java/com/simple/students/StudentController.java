package com.simple.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentServices services;
	
	@GetMapping
	public List<Student> getAllStudents(){
		return services.getAllStudent();
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> getStudent(@PathVariable int id) {
		return services.getStudent(id);
	}
}
