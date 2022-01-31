package com.xworkz.LinkedList.dto;

public class FlowersDTO {

	private String name;
	private String color;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "FlowersDTO[name=" + name +", color=" +color +",price="+price +"]";
	}

}