package com.xworkz.games;

public class TestGames {

	public static void main(String[] args) {
		
		Games games = new Games();
		games.earningMoney();
		
		IndoorGames indoorGames = new IndoorGames();
		indoorGames.earningMoney();
		
		OutdoorGames outdoorGames = new OutdoorGames();
		outdoorGames.earningMoney();
		
		indoorGames.anyTime1();
		outdoorGames.anyTime1();
		
		indoorGames.anyTime2((byte)2);
		outdoorGames.anyTime2((byte)4);
	}
}
