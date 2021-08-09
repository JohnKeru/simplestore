package com.simple.person;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
	private int pid;
	private String name;
	private boolean isTyping;
	
	public Person() {
		super();
	}
	
	public Person(int pid, String name, boolean isTyping) {
		super();
		this.pid = pid;
		this.name = name;
		this.isTyping = isTyping;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public boolean isTyping() {
		return isTyping;
	}

	public void setTyping(boolean isTyping) {
		this.isTyping = isTyping;
	}
	
}
