package com.simple.subjects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.simple.students.Student;
import com.simple.students.StudentRepository;

@Service
public class SubjectsServices {
	@Autowired
	private SubjectsRepository repo;
	@Autowired
	private StudentRepository studRepo;
	
	public ResponseEntity<?> getAllSubjectsByStudentId(int id) {
		if(repo.existsById(id))
			return new ResponseEntity<>(repo.findByStudentId(id), HttpStatus.OK);
		return new ResponseEntity<>("No Student with id "+id+" exists!", HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<?> getSubject(int id) {
		if(repo.existsById(id))
			return ResponseEntity.ok(repo.findById(id).get());
		return new ResponseEntity<String>("No subject with id "+id+" found!", HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<?> addSubject(int id, Subjects subj) {
		if(studRepo.existsById(id)) {
			final Student stud = studRepo.findById(id);
			subj.setStudent(stud);
			return new ResponseEntity<Subjects>(repo.save(subj), HttpStatus.OK);
		}
		return new ResponseEntity<String>("You cannot add subject to unknown student." , HttpStatus.NOT_FOUND);
	}
}
