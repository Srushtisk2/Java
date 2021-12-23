package com.xworkz.metal.dto;

public class Metal {
	
	float weight;
	String color;
	double price;
	
	public Metal() {
		System.out.println("invoking  default constructor");
	}
	
	public Metal(float weight,String color,double price) {
		System.out.println("calling parameter constructor");
		this.weight = weight;
		this.color = color;
		this.price = price;
	}

}
