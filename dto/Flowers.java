package com.xworkz.LinkedList.dto;


import java.util.Iterator;
import java.util.LinkedList;

public class Flowers {
	public static void main(String args[]) {

		LinkedList list=new LinkedList();
		list.add("Lotus");
		list.add("Jasmin");
		list.add("Water lilly");
		list.add("DendrobiumOrchid");


	System.out.println(list);
	list.add(1,"Jasmin");

	System.out.println(list);
	list.get(1);
	Iterator iterator=list.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	}


}
 

