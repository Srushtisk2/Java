package com.xworkz.customEx.dao;

import com.xworkz.customEx.dto.JewelleryDTO;
import com.xworkz.customEx.exception.GetMethod;
import com.xworkz.customEx.exception.UpdateName;

public class JewelleryOperation {
	
	JewelleryDTO[] jewellery = new JewelleryDTO[3];
	
	int index=0;
	
	public void add(JewelleryDTO names) {
		if(index<jewellery.length) {
			jewellery[index]=names;
			index++;
		}
	}
	
	public void printAll() {
		for(int index=0;index<jewellery.length;index++) {
			if(jewellery[index]!=null) {
			try {
				System.out.println(jewellery[index].toString());
			}
			catch (NullPointerException e) {
				
			System.out.println(e.getMessage());
		}
	}
		}
	}
	public JewelleryDTO updatepriceByJeweltype(String jeweltype,int price ) {
		boolean check = false;
		for(int index=0;index<jewellery.length;index++) {
			if(jeweltype.equals(jewellery[index].getJeweltype())) {
				jewellery[index].setPrice(price);
				check=true;
				System.out.println("value updated");
			}if(check==false) {
			 throw new UpdateName("value not updated");
			
			}
		}
				
			return null;
			
	}
	public JewelleryDTO getByMetaltype(String metaltype) {
		JewelleryDTO dto=null;
		boolean check = false;
		for(int index=0;index<jewellery.length;index++) {
			if(metaltype.equals(jewellery[index].getMetaltype())) {
				dto= jewellery[index];
				check=true;
				System.out.println("value got by metaltype");
			}if(check==false) {
				throw new GetMethod("value not found");
			}
		}
	
		return dto;
	}
	public JewelleryDTO updateMetaltypeBymaterials(String metaltype,String materials) {
		JewelleryDTO dto1=null;
		boolean check = false; 
		for(int index=0;index<jewellery.length;index++) {
			if(metaltype.equals(jewellery[index].getMetaltype())) {
				dto1=jewellery[index];
				check=true;
				System.out.println("value updated by materials");
			}
			}
		return dto1;
		}
	public String deleteByJeweltype(String jeweltype) {
		boolean check = false;
		for(int index=0;index<jewellery.length;index++) {
			if(jeweltype.equals(jewellery[index].getJeweltype())) {
			jewellery[index]=null;
			check=true;
			System.out.println("deleted successfully");
			}
		}
		return "value deleted";
	}	
			
			
			
		}
		
			
			