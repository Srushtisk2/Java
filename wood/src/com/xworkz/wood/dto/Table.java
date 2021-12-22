package com.xworkz.wood.dto;

public class Table {
	public byte width;
	public int price;
	public String color;
	public int height;
	public short weight;
	
	public Table() {
		System.out.println("Invoking Table class");
	}
	
	public byte width(byte width) {
		this.width=width;
		return width;
	}
	
	public int price(int price) {
		this.price=price;
		return price;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public int height(int height) {
		this.height=height;
		return height;
	}
	
	public short weight(short weight) {
		this.weight=weight;
		return weight;
	}
}
