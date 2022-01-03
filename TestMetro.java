package com.xworkz.abstraction;

import com.xworkz.abstraction.details.Metro;
import com.xworkz.abstraction.details.Purple;
import com.xworkz.abstraction.details.Yellow;

public class TestMetro {
	
	public static void main(String[] args) {
		
		Purple purple = new Yellow();
		purple.yellowLine();
		purple.purpleLine();
		
		Metro metro1 = new Yellow();
		purple.greenLine();
	}

}
