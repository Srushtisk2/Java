package com.xworkz.metal.dto;

public class Gold extends Metal{
	
	private static Object weight;
	String type;
	float meltingPoint;
	
	public Gold(String type,float mp) {
		super(weight);
		super.color = "Gold";
		super.price = 47000;
		System.out.println("calling default constructor");
	}
	
	

}
