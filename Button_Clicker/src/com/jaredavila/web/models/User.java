package com.jaredavila.web.models;

public class User {
	private String name;
	private int clicks;
	
	public User() {}
	public User(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getClicks() {
		return this.clicks;
	}
}
