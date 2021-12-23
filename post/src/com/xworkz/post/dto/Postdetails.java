package com.xworkz.post.dto;

public class Postdetails 
{
	
	private String area;
	private long pincode;
	private String manager;
	private Postemployee employee;
	public void setArea(String area) {
		this.area=area;
	}
	public String getArea() {
		return area;
	}
	public void setPincode(long pincode) {
		this.pincode=pincode;
	}
	public long getPincode() {
		return pincode;
	}
	public void setManager(String manager) {
		this.manager=manager;
	}
	public String getManager() {
		return manager;
	}
	public void setEmployee(Postemployee employee) {
		this.employee=employee;
	}
	public Postemployee getEmployee() {
		return employee;
	}
	public String getAll() {
		return area +"\t" + pincode +"\t" +manager +"\t" +employee.getAll();
	
	}
}


