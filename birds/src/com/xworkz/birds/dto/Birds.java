package com.xworkz.birds.dto;

public class Birds  {
	public String species;
	public float flyingDistance;
	public String color;
	public boolean laysEgg;
	public boolean swim;
	
	public Birds() {
		System.out.println("Invoking Birds class");
	}
	
	public String species(String species) {
		this.species=species;
		return species;
	}
	
	public float flyingDistance(float flyingDistance) {
		this.flyingDistance=flyingDistance;
		return flyingDistance;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public boolean laysEgg(boolean laysEgg) {
		this.laysEgg=laysEgg;
		return laysEgg;
	}
	
	public boolean swim(boolean swim) {
		this.swim=swim;
		return swim;
	}
}
