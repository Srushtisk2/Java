package com.xworkz.fruit.dto;

public class Fruits extends Banana {
	public String name;
	public int price;
	public String color;
	public int types;
	public boolean tasty;
	
	public Fruits() {
		System.out.println("Invoking Fruits class");
	}
	
	public String name(String name) {
		this.name=name;
		return name;
	}
	
	public int price(int price) {
		this.price=price;
		return price;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public boolean tasty(boolean tasty) {
		this.tasty=tasty;
		return tasty;
	}
	
	public int types(int types) {
		this.types=types;
		return types;
	}
}

