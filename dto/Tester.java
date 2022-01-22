package com.xworkz.customEx.dto;

import com.xworkz.customEx.dao.JewelleryOperation;

public class Tester {
	
	public static void main(String[] args) {
		
		JewelleryDTO jewellery = new JewelleryDTO();
		JewelleryDTO jewellery1 = new JewelleryDTO();
		
		jewellery.setMetaltype("gold");
		jewellery.setJeweltype("necklace");
		jewellery.setPrice(825625);
		jewellery.setDesign("bride");
		jewellery.setCarats(8.25f);
		jewellery.setWeight(15.23f);
		jewellery.setMaterials("wedding");
		jewellery.setColor("goldish");
		
		jewellery1.setMetaltype("daimond");
		jewellery1.setJeweltype("crown");
		jewellery1.setPrice(800000);
		jewellery1.setDesign("valcano");
		jewellery1.setCarats(6.54f);
		jewellery1.setWeight(55.25f);
		jewellery1.setMaterials("missuniverse");
		jewellery1.setColor("stonewhite");
		
		
		JewelleryOperation operation = new JewelleryOperation();
		operation.add(jewellery);
		operation.add(jewellery1);
		operation.printAll();
		System.out.println();
		try {
			JewelleryDTO update=operation.updatepriceByJeweltype("necklace", 7825625);
			System.out.println(update.toString());
		}catch(NullPointerException e) {
			System.err.println(e.getMessage());
		}
		operation.printAll();
		System.out.println();
		
		
		try {
			JewelleryDTO get=operation.getByMetaltype("daimond");
			System.out.println(get.toString());
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println();
		try {
			JewelleryDTO update1=operation.updateMetaltypeBymaterials("daimond", "missuniverse");
			System.out.println(update1.toString());
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		operation.printAll();
		System.out.println();
	
		try {
			String delete = operation.deleteByJeweltype("crown");
		System.out.println(delete);
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		operation.printAll();
		
		
		}	
	}