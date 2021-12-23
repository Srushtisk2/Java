package com.xworkz.post.dto;

public class Postemployee 
{
	
	private String eid;
	private String name;
	private long contact;
	public void setEid(String eid) {
		this.eid=eid;
	}
	public String getEid() {
		return eid;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setContact(long contact) {
		this.contact=contact;
	}
	public long getContact() {
		return contact;
	}
	
	public String getAll() {
		return eid+"\t" + name +"\t" +contact;
	}
}



