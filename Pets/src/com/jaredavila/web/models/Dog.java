package com.jaredavila.web.models;

public class Dog extends Animal implements pet{
	public Dog(String name, int weight, String breed) {
		super();
		
		this.setName(name);
		this.setBreed(breed);
		this.setWeight(weight);
	}
	public String showAffection() {
		if (this.getWeight() < 30) {
			return this.getName() + " hopped into your lap and cuddled you!";
		} else {
			return this.getName() + " curled up next to you";
		}
		
	}
}
