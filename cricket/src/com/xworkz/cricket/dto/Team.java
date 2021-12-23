package com.xworkz.cricket.dto;

public class Team 
{
	
	private String tname;
	private int overs;
	private String captain;
	
	public void setTname(String tname) {
		this.tname=tname;
	}
	public String getTname() {
		return tname;
	}
	public void setOvers(int overs) {
		this.overs=overs;
	}
	public int getOvers() {
		return overs;
	}
	public void setCaptain(String captain) {
		this.captain=captain;
	}
	public String getCaptain() {
		return captain;
	}
	
	public String getAll() {
		return tname+"\t" + overs +"\t" +captain;
	}
}


