package com.xworkz.developer.dto;

public class Employee {
	
	public String name;
	public long contact;
	public String address;
	public char gender;
	public boolean goodjob;
	
	public Employee() {
		System.out.println("Invoking Employee class");
	}
	
	public String name(String name) {
		this.name=name;
		return name;
	}
	
	public long contact(long contact) {
		this.contact=contact;
		return contact;
	}
	
	public String address(String address) {
		this.address=address;
		return address;
	}
	
	public boolean goodjob(boolean goodjob) {
		this.goodjob=goodjob;
		return goodjob;
	}
	
	public char gender(char gender) {
		this.gender=gender;
		return gender;
	}
}



