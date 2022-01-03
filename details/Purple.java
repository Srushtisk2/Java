package com.xworkz.abstraction.details;

public abstract class Purple extends Metro {
	
	@Override
	
	public void greenLine() {
		System.out.println("Starting from Kuvempu metro to Megestic");
		
	}
	
	@Override
	public void purpleLine() {
		System.out.println("Starting from Shrirampur metro to Orion");
	
	}
	
	public abstract void yellowLine();

}
