package com.xworkz.developer.dto;

public class Employee extends Developer{
	
	public String name;
	public long contact;
	public String address;
	public char gender;
	public boolean goodjob;
	
	public Employee() 
	{
		this("Suchitra",58784555);
		System.out.println("Invoking Employee class");
	}
	public Employee(String name,long contact) {
		super();
		System.out.println(name + " " +contact);
		
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



