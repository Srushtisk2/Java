package com.xworkz.inheritance.dto;

public class Chrome extends Browser 
{
	
	private float version;
	private float size;
	private String releasedDate;
	
	public Chrome() {
	System.out.println("invoking chrome constructor");
}
	public Chrome(String releasedDate) {
		this();
	}
	public String getReleasedDate() {
		return releasedDate;
	}
	
	public void SetReleasedDate(String releasedDate) {
		this.releasedDate = releasedDate;
		
	}
public float getVersion() {
	return version;
}
public void SetVersion(float version) {
	this.version = version;
}

	
}
