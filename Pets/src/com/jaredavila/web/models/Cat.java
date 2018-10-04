package com.jaredavila.web.models;

public class Cat extends Animal implements pet{
	public Cat(String name, int weight, String breed) {
		super();
		
		this.setName(name);
		this.setBreed(breed);
		this.setWeight(weight);
		
	}
	public String showAffection() {
		return "Your " + this.getBreed() + ", " + this.getName() + ", looked at your with some affection. You think.";
	}
}
