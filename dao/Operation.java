package com.xworkz.choclate.dao;

import java.util.ArrayList;

import com.xworkz.choclate.dto.ChocalateDTO;

public class Operation {

	
	ArrayList<ChocalateDTO> chocolate = new ArrayList<ChocalateDTO>();
	
	public void insert(ChocalateDTO obj) {
		chocolate.add(obj);
		System.out.println("printing values");
	}
	
	public void printAll() {
		for (ChocalateDTO chocalateDTO : chocolate) {
			System.out.println(chocalateDTO.toString());
		}
	}
	
	public ArrayList<ChocalateDTO> updatePriceByName(String name,int price){
		
		for (ChocalateDTO chocalateDTO : chocolate) {
			if(name.equals(chocalateDTO.getName())) {
				chocalateDTO.setPrice(price);
			}
			
		}
		return chocolate;
	}
	
	public ArrayList<ChocalateDTO> deleteByPrice(int price){
		for (ChocalateDTO chocalateDTO : chocolate) {
			if(price == chocalateDTO.getPrice()) {
				chocolate  =null;
				
			}
			
		}
		return chocolate;
	}

}
