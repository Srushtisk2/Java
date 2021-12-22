package com.xworkz.xworkz.dto;

public class Institute {
	public String name;
	public int classrooms;
	public String hr;
	public int placements;
	public boolean goodquality;
	
	public Institute() {
		System.out.println("Invoking Institute class");
	}
	
	public String name(String name) {
		this.name=name;
		return name;
	}
	
	public int classrooms(int classrooms) {
		this.classrooms=classrooms;
		return classrooms;
	}
	
	public String hr(String hr) {
		this.hr=hr;
		return hr;
	}
	
	public boolean goodquality(boolean goodquality) {
		this.goodquality=goodquality;
		return goodquality;
	}
	
	public int placements(int placements) {
		this.placements=placements;
		return placements;
	}
}

