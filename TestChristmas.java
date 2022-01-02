package com.xworkz.christmas;

public class TestChristmas {

	public static void main(String[] args) {
		Christmas christmas1 = new Christmas(25.12f, 1);
	    System.out.println(christmas1.toString());
	    
	    System.out.println();
	    
		Christmas christmas2 = new Christmas(25.12f,1);
		System.out.println("No of Days "+christmas2.hashCode());
		
		System.out.println();
		
		System.out.println(christmas1.equals(christmas2));
				
	}

}