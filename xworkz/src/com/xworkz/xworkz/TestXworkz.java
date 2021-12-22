package com.xworkz.xworkz;

import com.xworkz.xworkz.dto.Institute;
import com.xworkz.xworkz.dto.Xworkz;

public class TestXworkz {
public static void main(String []args) {
		
	Institute institute = new Institute();
		System.out.println(institute.name("xworkz"));
		System.out.println(institute.classrooms(5));
		System.out.println(institute.hr("akshara"));
		System.out.println(institute.placements(500));
		System.out.println(institute.goodquality(true));
		
		Xworkz xworkz = new Xworkz();
		
		System.out.println(xworkz.course("java"));
		System.out.println(xworkz.batch(10));
		System.out.println(xworkz.founder("omkar"));
		System.out.println(xworkz.workers(7));
		System.out.println(xworkz.fees((long)(25000)));
		
		
		
		
	}
}
