package com.xworkz.radio.dto;

public class RadiodetailsDTO 
{
	
	private String company;
	private int price;
	private String color;
	private byte noOfRs;
	private SizeDTO size;
	public void setCompany(String company) {
		this.company=company;
	}
	public String getCompany() {
		return company;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setNoOfRs(byte noOfRs) {
		this.noOfRs=noOfRs;
	}
	public byte getNoOfRs() {
		return noOfRs;
	}
	public void setSize(SizeDTO size) {
		this.size=size;
	}
	public SizeDTO getSize() {
		return size;
	}
	public String getAll() {
		return company +"\t" + price +"\t" +color +"\t" +noOfRs +"\t" + size.getAll();
	}
	}





