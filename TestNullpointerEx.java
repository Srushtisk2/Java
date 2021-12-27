package com.xworkz.exception;


public class TestNullpointerEx {
	
	public static void main(String[]args)
	{
		NullpointerEx exception=new NullpointerEx();
		
		
		exception.store("Srushti");
		exception.store("pooja");
		exception.store("Bunny");
		
		exception.store("Neelu");
		
		exception.displayAll();
		
		 
		NullpointerEx exception1= exception.updateName("Neelu");
		System.out.println(exception1.displayAll());
		
		
	}

}
