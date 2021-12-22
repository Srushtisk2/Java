package com.xworkz.fruit.dto;

public class Banana {
	public String type;
	public float height;
	public String color;
	public byte width;
	public boolean healthy;
	
	public Banana() {
		System.out.println("Invoking Banana class");
	}
	
	public String type(String type) {
		this.type=type;
		return type;
	}
	
	public float height(float height) {
		this.height=height;
		return height;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public byte width(byte width) {
		this.width=width;
		return width;
	}
	
	public boolean healthy(boolean healthy) {
		this.healthy=healthy;
		return healthy;
	}
}
