package com.xworkz.transport.dto;

import com.xworkz.transport.dto.Bus;
import com.xworkz.transport.dto.Transport;

public class TestBus {
	public static void main(String []args) {
		Bus bus=new Bus();
		bus.travelling();
		bus.drive();
		bus.doors();
		bus.goodscargo();
		Transport transport=new Bus();
		transport.travelling();
		transport.goodscargo();
	}
}
