package com.xworkz.flower.dto;

public class Flower extends Lotus
{
	public String name;
	public int types;
	public byte height;
	public int width;
	public boolean goodsmell;
	
	public Flower() {
		System.out.println("Invoking Flower class");
	}
	
	public String name(String name) {
		this.name=name;
		return name;
	}
	
	public int types(int types) {
		this.types=types;
		return types;
	}
	
	public byte height(byte height) {
		this.height=height;
		return height;
	}
	
	public boolean goodsmell(boolean goodsmell) {
		this.goodsmell=goodsmell;
		return goodsmell;
	}
	
	public int width(int width) {
		this.width=width;
		return width;
	}
}
