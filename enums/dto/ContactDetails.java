package com.xworkz.enums.dto;

public class ContactDetails 
{
	private long contactNumber;
	private String email;
	private String address;
	
	public long getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return getClass().getSimpleName() + "contactNumber=" + contactNumber + ", email=" +email + ", +address=" +address;
		
	}

	public void setAdress(String address) {
	this.address = address;
		
	}

	
}
