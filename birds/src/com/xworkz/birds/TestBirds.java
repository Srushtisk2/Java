package com.xworkz.birds;

import com.xworkz.birds.dto.Birds;

import com.xworkz.birds.dto.Peacock;

public class TestBirds {
	public static void main(String []args) {
		
		Birds birds = new Birds();
		System.out.println(birds.color("gray"));
		System.out.println(birds.species("8.9f"));
		System.out.println(birds.flyingDistance(6.5f));
		System.out.println(birds.laysEgg(true));
		System.out.println(birds.swim(false));
		
		Peacock peacock = new Peacock();
		
		System.out.println(peacock.color("blue"));
		System.out.println(peacock.weight(5.5f));
		System.out.println(peacock.noOfFethers((short)2000));
		System.out.println(peacock.height((byte)(3)));
		System.out.println(peacock.count((byte)(40)));
		
		
		
		
	}
}
