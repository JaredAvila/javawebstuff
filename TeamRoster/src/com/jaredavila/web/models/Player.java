package com.jaredavila.web.models;

public class Player {
	private String fName;
	private String lName;
	private int age;
	
	public Player() {}
	public Player(String fName, String lName, int age) {
		this.fName = fName;
		this.lName = lName;
		this.age = age;
	}
	
	public String getFName() {
		return this.fName;
	}

	public String getLName() {
		return this.lName;
	}
	
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setFName(String fName) {
		this.fName = fName;
	}
	public void setLName(String lName) {
		this.lName = lName;
	}
}
