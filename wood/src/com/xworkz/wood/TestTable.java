package com.xworkz.wood;

import com.xworkz.wood.dto.Table;
import com.xworkz.wood.dto.Wood;

public class TestTable {
	public static void main(String []args) {
		
		Table table = new Table();
			System.out.println(table.width((byte)(20)));
			System.out.println(table.price(1000));
			System.out.println(table.color("brown"));
			System.out.println(table.height(40));
			System.out.println(table.weight((short)(50)));
			
			Wood wood = new Wood();
			
			System.out.println(wood.name("villow"));
			System.out.println(wood.types(20));
			System.out.println(wood.color("brown"));
			System.out.println(wood.cost(3000));
			System.out.println(wood.helpful(true));
			
			
			
			
		}
}
