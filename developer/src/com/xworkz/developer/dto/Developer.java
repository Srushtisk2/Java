package com.xworkz.developer.dto;

public class Developer 
{
	
		public String type;
		public long salary;
		public String company;
		public int servicebond;
		public boolean future;
		
		public Developer() {
			System.out.println("Invoking Developer class");
					
		}
		public String type(String type) {
			this.type=type;
			return type;
		}
		
		public long salary(long salary) {
			this.salary=salary;
			return salary;
		}
		
		public String company(String company) {
			this.company=company;
			return company;
		}
		
		public boolean future(boolean future) {
			this.future=future;
			return future;
		}
		
		public int servicebond(int servicebond) {
			this.servicebond=servicebond;
			return servicebond;
		}
	}



