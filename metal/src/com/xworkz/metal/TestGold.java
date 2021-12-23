package com.xworkz.metal;

import com.xworkz.metal.dto.Gold;
import com.xworkz.metal.dto.Metal;

public class TestGold {
	
	public static void main(Sting[] args) {
		Gold gold = new Gold("rose",1063.76f,20);
		System.out.println(gold.color);
		
		
	Metal metal = new Metal();
	System.out.println(metal.color);
	
	Metal metal1 = new Gold("rose",1063.76f,20);
	System.out.println(metal.color);
	
	Gold gold2 = (Gold)metal;
	}
}
	


