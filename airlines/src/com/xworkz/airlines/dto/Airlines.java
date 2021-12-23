package com.xworkz.airlines.dto;

public class Airlines extends Indigo{
	public String place;
	public int ratings;
	public String manager;
	public int workers;
	public boolean safety;
	
	public Airlines() {
		this("America",200);
		System.out.println("Invoking Aielines class");
	}
	
	public Airlines(String place,int ratings) {
		super();
		System.out.println(place + " " + ratings);
	}
		
	public String place(String place) {
		this.place=place;
		return place;
	}
	
	public int ratings(int ratings) {
		this.ratings=ratings;
		return ratings;
	}
	
	public String manager(String manager) {
		this.manager=manager;
		return manager;
	}
	
	public boolean safety(boolean safety) {
		this.safety=safety;
		return safety;
	}
	
	public int workers(int workers) {
		this.workers=workers;
		return workers;
	}
}
