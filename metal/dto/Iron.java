package com.xworkz.metal.dto;

public class Iron extends Metal {

	public String chemicalName;
	public float meltingPoint; 
	public String catalyst;
	public byte automicNumber; 
	public byte electrons;

	public Iron() {
		System.out.println("Platinum : Invoking Default Contructor");
	}

	public Iron(byte electrons,String chemicalName,float meltingPoint,double weight, String color, boolean isductile, double price, float size, String catalyst, byte automicNumber) {
		super(weight, color, isductile, price, size);
		this.meltingPoint = meltingPoint;
		this.chemicalName = chemicalName;
		this.catalyst = catalyst;
		this.automicNumber = automicNumber;
		this.electrons = electrons;
		System.out.println("Iron : Invoking Param Contructor");
	}

}
