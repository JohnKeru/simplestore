package com.simple.subjects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.simple.students.Student;
@Entity
@Table(name="Subjects")
public class Subjects {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subjectId;
	private String firstSubject;
	private String secondSubject;
	
	@ManyToOne
	private Student student;
	
	public Subjects() {
		super();
	}
	public Subjects(int subjectId, String firstSubject, String secondSubject) {
		super();
		this.subjectId = subjectId;
		this.firstSubject = firstSubject;
		this.secondSubject = secondSubject;
	}

	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getFirstSubject() {
		return firstSubject;
	}
	public void setFirstSubject(String firstSubject) {
		this.firstSubject = firstSubject;
	}
	public String getSecondSubject() {
		return secondSubject;
	}
	public void setSecondSubject(String secondSubject) {
		this.secondSubject = secondSubject;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
