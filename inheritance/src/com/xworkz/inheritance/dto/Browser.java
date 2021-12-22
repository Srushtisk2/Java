package com.xworkz.inheritance.dto;

public class Browser 
{
	public String title = "newTag";

	public Browser() {
		super();
		System.out.println("calling Browser()");
	}
public String search(String search) {
	return "data of " +search;
}

public boolean download(String app) {
	System.out.println("downloading application:" +app);
	return true;
}
}
