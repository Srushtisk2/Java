package com.xworkz.transport.dto;

import com.xworkz.transport.dto.Train;
import com.xworkz.transport.dto.Transport;

public class TestTrain {
	public static void main(String []args) {
		Train train=new Train();
		train.travelling();
		train.drive();
		train.blocks();
		train.goodscargo();
		Transport transport=new Train();
		transport.travelling();
		transport.goodscargo();
	}
}
