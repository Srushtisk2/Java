package com.xworkz.xworkz.dto;

public class Xworkz extends Institute {
	public String course;
	public int batch;
	public String founder;
	public int workers;
	public long fees;
	
	public Xworkz() {
		System.out.println("Invoking Xworkz class");
	}
	
	public String course(String course) {
		this.course=course;
		return course;
	}
	
	public int batch(int batch) {
		this.batch=batch;
		return batch;
	}
	
	public String founder(String founder) {
		this.founder=founder;
		return founder;
	}
	
	public int workers(int workers) {
		this.workers=workers;
		return workers;
	}
	
	public long fees(long fees) {
		this.fees=fees;
		return fees;
	}
}
