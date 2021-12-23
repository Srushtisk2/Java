package com.xworkz.metal.dto;

import com.xworkz.metal.dto.Metal;
import com.xworkz.metal.dto.Iron;


public class TestIron {

	public static void main(String[] args) {

		Metal metal = new Metal();
		System.out.println("Color :" + metal.color);
		System.out.println();
		System.out.println("isDuctile :" + metal.isductile);
		System.out.println();
		System.out.println("Price :" + metal.price);
		System.out.println();
		System.out.println("Size :" + metal.size);
		System.out.println();
		System.out.println("Weight :" + metal.weight);
		System.out.println();

		Iron iron = new Iron((byte) 6, "Fe", 1538.02, 2000, "Silver", true, 35000, 20, "Iron chloride", (byte) 78);
		System.out.println("Color :" + iron.color);
		System.out.println();
		System.out.println("isDuctile :" + iron.isductile);
		System.out.println();
		System.out.println("Price :" + iron.price);
		System.out.println();
		System.out.println("Size :" + iron.size);
		System.out.println();
		System.out.println("Weight :" + iron.weight);
		System.out.println();
		System.out.println("Catalyst :" + iron.catalyst);
		System.out.println();
		System.out.println("Chemical Name :" + iron.chemicalName);
		System.out.println();
		System.out.println("Melting Point :" + iron.meltingPoint);
		System.out.println();
		System.out.println("Automic Number :" + iron.automicNumber);
		System.out.println();
		System.out.println("Number of Electrons :" + iron.electrons);
		System.out.println();

		Metal metal4 = new Iron((byte) 4, "Fe", 1538.0f, 1000, "Silver", true, 35000, 20, "Iron chloride", (byte) 78);
		System.out.println("Down_Casting Values");
		System.out.println("-------------------");
		System.out.println("Color :" + metal4.color);
		System.out.println();
		System.out.println("isDuctile :" + metal4.isductile);
		System.out.println();
		System.out.println("Price :" + metal4.price);
		System.out.println();
		System.out.println("Size :" + metal4.size);
		System.out.println();
		System.out.println("Weight :" + metal4.weight);
		System.out.println();

		Iron iron5 = (Iron) metal4;
		System.out.println("Up_Casting Values");
		System.out.println("-------------------");
		System.out.println("Color :" + iron5.color);
		System.out.println();
		System.out.println("isDuctile :" + iron5.isductile);
		System.out.println();
		System.out.println("Price :" + iron5.price);
		System.out.println();
		System.out.println("Size :" + iron5.size);
		System.out.println();
		System.out.println("Weight :" + iron5.weight);
		System.out.println();
		System.out.println("Catalyst :" + iron5.catalyst);
		System.out.println();
		System.out.println("Chemical Name :" + iron5.chemicalName);
		System.out.println();
		System.out.println("Melting Point :" + iron5.meltingPoint);
		System.out.println();
		System.out.println("Automic Number :" + iron5.automicNumber);
		System.out.println();
		System.out.println("Number of Electrons :" + iron5.electrons);

	}

}

