package com.xworkz.choclate.dto;

public class ChocalateDTO {
	
	
	
	private String name;
	private int price;
	private float weight;
	private float calories;
	
	
	
	public String getName() {
		return name;
		}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public float getWeight() {
		return weight;
	}
	
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	public float getCalories() {
		return calories;
	}
	
	
	public void setCalories(float calories) {
		this.calories = calories;
	}
	
	
	
	public String toString() {
		return "ChocalateDTO [name=" + name + ", price=" + price + ", weight=" + weight + ", calories=" + calories
				+ "]";
	}
	
}
