package com.xworkz.games;

public class OutdoorGames extends Games{
	
	@Override
	void earningMoney() {
		System.out.println("With outdoor game we can earn more money");
	}
	
	void anyTime1() {
		System.out.println("we can play any time");
	}
	
	void anyTime2(byte hours) {
		System.out.println("we can play for "+hours);
	}

}



