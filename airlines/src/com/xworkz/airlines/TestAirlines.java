package com.xworkz.airlines;

import com.xworkz.airlines.dto.Indigo;
import com.xworkz.airlines.dto.Airlines;

public class TestAirlines {
public static void main(String []args) {
		
	Indigo indigo = new Indigo();
			System.out.println(indigo.country("india"));
			System.out.println(indigo.passengers(1000));
			System.out.println(indigo.color("blue and white"));
			System.out.println(indigo.destination(95));
			System.out.println(indigo.lowcost(true));
			
			Airlines airlines = new Airlines();
			
			System.out.println(airlines.place("india"));
			System.out.println(airlines.ratings(9));
			System.out.println(airlines.manager("abc"));
			System.out.println(airlines.workers(500));
			System.out.println(airlines.safety(true));
			
			
			
			
		}
}
