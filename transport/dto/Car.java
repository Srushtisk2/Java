package com.xworkz.transport.dto;

public class Car extends Transport {
	String model;
	byte noOfSeats;
	public void travelling() {
		System.out.println("Car is use for travelling");
	}
	public void drive() {
		System.out.println("We can drive car");
	}
	public void playmusic() {
		System.out.println("We can play music");
	}

}
