package com.xworkz.transport.dto;

public class Bus extends Transport{
	String name;
	byte noOfSeats;
	short length;
	byte weight;
	int cost;
	public void travelling() {
		System.out.println("Bus is use for travelling");
	}
	public void drive() {
		System.out.println("We can drive bus");
	}
	public void doors() {
		System.out.println("We can have doors");
	}
}

