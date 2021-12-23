package com.xworkz.transport.dto;

public class Flight extends Transport{
	String name;
	byte noOfSeats;
	short length;
	byte weight;
	int cost;
	public void travelling() {
		System.out.println("Flight is use for travelling");
	}
	public void drive() {
		System.out.println("We can drive flight");
	}
	public void windows() {
		System.out.println("We can have windows");
	}

}
