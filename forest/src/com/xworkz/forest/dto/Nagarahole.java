package com.xworkz.forest.dto;

public class Nagarahole extends Forest {
	public String type;
	public int noOfanimals;
	public String place;
	public int noOfbirds;
	public boolean goodmaintenance;
	
	public Nagarahole() {
		this(650,"Rajstan");
		System.out.println("Invoking Nagarahole class");
	}
	
	public Nagarahole(int noOfanimals,String place) {
		super();
		System.out.println(noOfanimals + " " + place);
	}
	
	public String type(String type) {
		this.type=type;
		return type;
	}
	
	public int animals(int noOfanimals) {
		this.noOfanimals=noOfanimals;
		return noOfanimals;
	}
	
	public String place(String place) {
		this.place=place;
		return place;
	}
	
	public boolean goodmaintenance(boolean goodmaintenance) {
		this.goodmaintenance=goodmaintenance;
		return goodmaintenance;
	}
	
	public int birds(int noOfbirds) {
		this.noOfbirds=noOfbirds;
		return noOfbirds;
	}
}
