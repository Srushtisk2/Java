package com.xworkz.transport.dto;

public class Train extends Transport{
	String name;
	byte noOfSeats;
	short length;
	byte weight;
	int cost;
	public void travelling() {
		System.out.println("Train is use for travelling");
	}
	public void drive() {
		System.out.println("We can drive train");
	}
	public void blocks() {
		System.out.println("We can have blocks");
	}

}
