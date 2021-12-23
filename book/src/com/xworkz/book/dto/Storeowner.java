package com.xworkz.book.dto;

public class Storeowner 
{
	
	private String oname;
	private long contact;
	private String place;
	public void setOname(String oname) {
		this.oname=oname;
	}
	public String getOname() {
		return oname;
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
		return oname+"\t"+contact+"\t"+place;
	}
}



