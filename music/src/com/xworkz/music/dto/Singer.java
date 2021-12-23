package com.xworkz.music.dto;

public class Singer 
{
	
	private String name;
	private long contact;
	private String place;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setContact(long contact) {
		this.contact=contact;
	}
	public long getContact() {
		return contact;
	}
	public void setPlace(String place) {
		this.place=place;
	}
	public String getPlace() {
		return place;
	}


	public String getAll() {
		return name+"\t"+contact+"\t"+place;
	}
	}


