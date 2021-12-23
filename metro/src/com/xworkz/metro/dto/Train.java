package com.xworkz.metro.dto;

public class Train {
	public String route;
	public short passengers;
	public float speed;
	public byte length;
	public String color;
	
	public Train() {
		System.out.println("Invoking Train class");
	}

	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public short passengers(short passengers) {
		this.passengers=passengers;
		return passengers;
	}
	
	public float speed(float speed) {
		this.speed=speed;
		return speed;
	}
	
	public byte length(byte length) {
		this.length=length;
		return length;
	}
	
	public String route(String route) {
		this.route=route;
		return route;
	}
}
