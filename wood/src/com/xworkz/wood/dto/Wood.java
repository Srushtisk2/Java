package com.xworkz.wood.dto;

public class Wood extends Table{
	public String name;
	public int types;
	public String color;
	public long cost;
	public boolean helpful;
	
	public Wood() {
		System.out.println("Invoking Wood class");
	}
	
	public String name(String name) {
		this.name=name;
		return name;
	}
	
	public int types(int types) {
		this.types=types;
		return types;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public long cost(long cost) {
		this.cost=cost;
		return cost;
	}
	
	public boolean helpful(boolean helpful) {
		this.helpful=helpful;
		return helpful;
	}
}
