package com.xworkz.forest.dto;

public class Nagarahole {
	public String type;
	public int animals;
	public String place;
	public int birds;
	public boolean goodmaintenance;
	
	public Nagarahole() {
		System.out.println("Invoking Nagarahole class");
	}
	
	public String type(String type) {
		this.type=type;
		return type;
	}
	
	public int animals(int animals) {
		this.animals=animals;
		return animals;
	}
	
	public String place(String place) {
		this.place=place;
		return place;
	}
	
	public boolean goodmaintenance(boolean goodmaintenance) {
		this.goodmaintenance=goodmaintenance;
		return goodmaintenance;
	}
	
	public int birds(int birds) {
		this.birds=birds;
		return birds;
	}
}
