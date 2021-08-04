package com.simple.subjects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students/{id}/subjects")
public class SubjectsController {
	
	@Autowired
	private SubjectsServices subjectsServices;
	
	@GetMapping
	public ResponseEntity<?> getAllSubjectsByStudentId(@PathVariable int id){
		return subjectsServices.getAllSubjectsByStudentId(id);
	}
	@GetMapping("/{subjectId}")
	public ResponseEntity<?> getSubject(@PathVariable int subjectId) {
		return subjectsServices.getSubject(subjectId);
	}
	@PostMapping
	public ResponseEntity<?> addSubject(@PathVariable int id, @RequestBody Subjects subj) {
		return subjectsServices.addSubject(id, subj);
	}
}
