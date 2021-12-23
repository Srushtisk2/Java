package com.xworkz.radio.dao;

	
	import com.xworkz.radio.dto.RadiodetailsDTO;

	public class RadioDAO 
	{
		
		RadiodetailsDTO []dtos = new RadiodetailsDTO [5];
		int index = 0;
		public String insert(RadiodetailsDTO dto)
	    {
		
		if(dto==null) {
			return "this is null object";
		}   
			else
			{
				dtos[index] = dto;
				System.out.println(dtos[index].getCompany());
				index++;
				return "object added with the company name "+ dtos[index-1].getCompany();
			}
		}
		public void printAll() {
			for(int index =0;index<dtos.length;index++) {
				if(dtos[index]!=null) {
					System.out.println(dtos[index].getAll());
				}
					
				}
		}


	public boolean deleteByprice(int price) {
		for(int index = 0;index<dtos.length;index++){
			dtos[index]=null;
			return true;
		}
	
	
	
	return false;
	
	}
	
	
	
	public RadiodetailsDTO updatePriceByColor(String color,byte noOfRs) {
		RadiodetailsDTO dto = null;
		for(int index = 0; index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(dtos[index].getColor().equals(color)) {
					dtos[index].setNoOfRs(noOfRs);
					return dtos[index];
				}
			}
		}
return dto;
	}
	public RadiodetailsDTO updatCompanyByColor(String company,String color) {
		RadiodetailsDTO dto = null;
		for(int index = 0; index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(dtos[index].getColor().equals(color)) {
					dtos[index].setCompany(company);
					dto=dtos[index];
				}
			}
		}
return dto;
	}
	public RadiodetailsDTO updatePriceByColor(int price,String color) {
		RadiodetailsDTO dto = null;
		for(int index = 0; index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(dtos[index].getColor().equals(color)) {
					dtos[index].setPrice(price);
					dto=dtos[index];
				}
			}
		}
return dto;
	}
	
	public boolean deletePriceBynoOfRs(int price) {
		for(int index = 0; index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(price==(dtos[index].getPrice())) {
					dtos[index]=null;
					return true;
				}
			}
		}
return false;
	}

	public boolean deleteByCompany(String company) {
		for(int index = 0; index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(company==(dtos[index].getCompany())) {
					dtos[index]=null;
					return true;
				}
			}
		}
return false;
}
	public boolean deleteBynoOfRs(byte noOfRs) {
		for(int index = 0; index<dtos.length;index++) {
			if(dtos[index]!=null) {
				if(noOfRs==dtos[index].getNoOfRs()) {
					dtos[index]=null;
					return true;
				}
			}
		}
return false;
	}
	
	public RadiodetailsDTO getByPrice(int price) {
		for(int index = 0; index<dtos.length;index++) {
		if(dtos[index]!=null) {
				if(price==dtos[index].getPrice()) {
					dtos[index]=null;
					return dtos[index];
				}
			}
		}
return null;
	}
	
	public RadiodetailsDTO getByWidth(double width) {
		for(int index = 0; index<dtos.length;index++) {
				if(width==dtos[index].getSize().getWidth()) {
					return dtos[index];
				}
			}
return null;
	}
	
	public RadiodetailsDTO getByColor(String color) {
		for(int index = 0; index<dtos.length;index++) {
				if(color==dtos[index].getColor()) {
					return dtos[index];
					
				}
	
		}
		return null;
	}
	}
	
				
			
	

	


