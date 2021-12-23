package com.xworkz.transport.dto;

public class Transportdetails 
{
	
	private String name;
	private String color;
	private long price;
	private Tsize size;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(long price) {
		this.price=price;
	}
	public long getPrice() {
		return price;
	}
	public void setSize(Tsize size) {
		this.size=size;
	}
	public Tsize getSize() {
		return size;
	}
	
	public String getAll() {
		return name +"\t" + price +"\t" +color + size.getAll();
	}
}



