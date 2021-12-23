package com.xworkz.transport.dto;

public class Tsize
{
	
	
	private long height;
	private long width;
	private int seats;
	public void setHeight(long height) {
		this.height=height;
	}
	public long getHeight() {
		return height;
	}
	public void setWidth(long width) {
		this.width=width;
	}
	public long getWidth() {
		return width;
	}
	public void setSeats(int seats) {
		this.seats=seats;
	}
	public int getSeats() {
		return seats;
	}
	
	public String getAll() {
		return height+"\t" + seats +"\t" +width;
	}
}

	



