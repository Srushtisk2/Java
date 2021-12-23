package com.xworkz.cricket.dto;

public class Cricketdetails 
{
	
	private String type;
	private int teams;
	private String manager;
	private Team name;
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public void setTeams(int teams) {
		this.teams=teams;
	}
	public int getTeams() {
		return teams;
	}
	public void setManager(String manager) {
		this.manager=manager;
	}
	public String getManager() {
		return manager;
	}
	public void setName(Team name) {
		this.name=name;
	}
	public Team getName() {
		return name;
	}
	
	public String getAll() {
		return type +"\t" + teams +"\t"+manager +"\t"+name.getAll();
}
}



