package com.xworkz.flower.dto;

public class Lotus extends Flower {
	public String type;
	public int petals;
	public String color;
	public int price;
	public boolean beautiful;
	
	public Lotus() {
		this("Lilly",false);
		System.out.println("Invoking Lotus class");
	}
	
	public Lotus(String type ,boolean beautiful) {
		super();
		System.out.println(type + " " + beautiful);
	}
	
	public String type(String type) {
		this.type=type;
		return type;
	}
	
	public int petals(int petals) {
		this.petals=petals;
		return petals;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public boolean beautiful(boolean beautiful) {
		this.beautiful=beautiful;
		return beautiful;
	}
	
	public int price(int price) {
		this.price=price;
		return price;
	}
}
