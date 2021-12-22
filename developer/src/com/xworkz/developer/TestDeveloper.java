package com.xworkz.developer;

import com.xworkz.developer.dto.Developer;
import com.xworkz.developer.dto.Employee;

public class TestDeveloper {
	public static void main(String []args) {
		
		Developer developer = new Developer();
		System.out.println(developer.type("web"));
		System.out.println(developer.salary((long)(50000)));
		System.out.println(developer.company("cognizant"));
		System.out.println(developer.servicebond(2));
		System.out.println(developer.future(true));
		
		Employee employee = new Employee();
		
		System.out.println(employee.name("blue"));
		System.out.println(employee.contact((long)(897032681)));
		System.out.println(employee.address("banglore"));
		System.out.println(employee.gender('M'));
		System.out.println(employee.goodjob(true));
		
		
		
		
	}
}
