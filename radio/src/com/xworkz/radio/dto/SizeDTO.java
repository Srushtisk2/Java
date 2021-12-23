package com.xworkz.radio.dto;

public class SizeDTO 
{
	
	private float height;
	private float length;
	private double width;
	public void setHeight(float height) {
	this.height=height;	
	}
	public float getHeight() {
		return height;
	}
	public void setLength(float length) {
	this.length=length;	
	}
	public float getLength() {
		return length;
	}
	public void setWidth(double width) {
	this.width=width;	
	}
	public double getWidth() {
		return width;
	}
	
	public String getAll() {
		return height+"\t" + length +"\t" +width;
	}
}



