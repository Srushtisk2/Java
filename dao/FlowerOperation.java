package com.xworkz.LinkedList.dao;

import java.util.LinkedList;

import com.xworkz.LinkedList.dto.FlowersDTO;

public class FlowerOperation{
	
	LinkedList<FlowersDTO> flowers = new LinkedList<FlowersDTO>();
	
	public void insert(FlowersDTO obj) { 
	flowers.add(obj);
		System.out.println("Printing Values");
	}
	
	
	public void printAll() {
	for (FlowersDTO flowersDTO : flowers) {
		
		System.out.println(flowersDTO.toString());
	}
}
	

	public LinkedList<FlowersDTO> updatePriceByName(String name,int price){
		for (FlowersDTO flowersDTO : flowers) {
			if(name.equals(flowersDTO.getName())) {
				flowersDTO.setPrice(price);
	}
			}
		return flowers;
	}
	
	
	public LinkedList<FlowersDTO> deleteByPrice(int price){
		for (FlowersDTO flowersDTO : flowers) {
			if(price == flowersDTO.getPrice()) {
				return flowers;

	}
			
		}
		return flowers;
	}
	
}

