package com.jaredavila.web.models;

public class Animal {
	private String name;
	private Integer weight;
	private String breed;
	
	public Animal() {}
	public Animal(String name, int weight, String breed) {
		this.name= name;
		this.weight = weight;
		this.breed = breed;
	}
	
	public String getName() {
		return this.name;
	}
	public String getBreed() {
		return this.breed;
	}
	public int getWeight() {
		return this.weight;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
}
