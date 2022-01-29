package com.xworkz.choclate.dto;

import java.util.ArrayList;

import com.xworkz.choclate.dao.Operation;

public class TestChocalate {
	public static void main(String[] args) {
		
		ChocalateDTO dto = new ChocalateDTO();
		dto.setName("MilkyBar");
		dto.setPrice(25);
		dto.setWeight(30);
		dto.setCalories(53.45f);
		
		ChocalateDTO dto1 = new ChocalateDTO();
		dto1.setName("Munch");
		dto1.setPrice(20);
		dto1.setWeight(46.25f);
		dto1.setCalories(54.23f);
		
		Operation dao = new Operation();
		dao.insert(dto);
		dao.insert(dto1);
		dao.printAll();
		
		System.out.println();
		
		ArrayList<ChocalateDTO>  update = dao.updatePriceByName("MilkyBar", 20);
		System.out.println(update);
		
		System.out.println();
		dao.printAll();
		System.out.println();
		
		ArrayList<ChocalateDTO> delete = dao.deleteByPrice(25);
		System.out.println(delete);
		System.out.println();
		dao.printAll();
		
	}

}
