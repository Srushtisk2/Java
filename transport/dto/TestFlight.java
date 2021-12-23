package com.xworkz.transport.dto;

import com.xworkz.transport.dto.Flight;
import com.xworkz.transport.dto.Transport;

public class TestFlight {
	public static void main(String []args) {
		Flight flight=new Flight();
		flight.travelling();
		flight.drive();
		flight.windows();
		flight.goodscargo();
		Transport transport=new Flight();
		transport.travelling();
		transport.goodscargo();
	}
}
