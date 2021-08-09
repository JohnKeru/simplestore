package com.simple.messenger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="messages")
public class Messages {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mid;
	private String date;
	private String name;
	private String message;
	private int pid;
	
	public Messages() {
		super();
	}

	public Messages(int mid, String date, String name, String message, int pid) {
		super();
		this.mid = mid;
		this.date = date;
		this.name = name;
		this.message = message;
		this.pid = pid;
	}
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}	
}
