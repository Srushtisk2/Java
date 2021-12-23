package com.xworkz.transport.dao;


import com.xworkz.transport.dto.Transportdetails;

public class TransportDAO {
	
	Transportdetails []dtos = new Transportdetails [5];
	int index = 0;
	public String insert(Transportdetails dto)
    {
	
	if(dto==null) {
		return "this is null object";
	}   
		else
		{
			dtos[index] = dto;
			System.out.println(dtos[index].getName());
			index++;
			return "object added with the company name "+ dtos[index-1].getName();
		}
	}
	public void printAll() {
		for(int index =0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				System.out.println(dtos[index].getAll());
			}
				
			}
	}


public boolean deleteByprice(long price) {
	for(int index = 0;index<dtos.length;index++){
		dtos[index]=null;
		return true;
	}

return false;
}

public Transportdetails updateColorByPrice(String color,long price) {
	Transportdetails dto = null;
	for(int index = 0; index<dtos.length;index++) {
		if(dtos[index]!=null) {
			if(dtos[index].getColor().equals(color)) {
				dtos[index].setPrice(price);
				return dtos[index];
			}
		}
	}
return dto;
}
public Transportdetails updatNameByColor(String name,String color) {
	Transportdetails dto = null;
	for(int index = 0; index<dtos.length;index++) {
		if(dtos[index]!=null) {
			if(dtos[index].getName().equals(name)) {
				dtos[index].setColor(color);
				dto=dtos[index];
			}
		}
	}
return dto;
}
public Transportdetails updatNameByPrice(String name,long price) {
	Transportdetails dto = null;
	for(int index = 0; index<dtos.length;index++) {
		if(dtos[index]!=null) {
			if(dtos[index].getName().equals(name)) {
				dtos[index].setName(name);
				dto=dtos[index];
			}
		}
	}
return dto;
}

public boolean deleteByColor(String color) {
	for(int index = 0; index<dtos.length;index++) {
		if(dtos[index]!=null) {
			if(color==(dtos[index].getColor())) {
				dtos[index]=null;
				return true;
			}
		}
	}
return false;
}

public boolean deleteByType(long price) {
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
public boolean deleteByName(String name) {
	for(int index = 0; index<dtos.length;index++) {
		if(dtos[index]!=null) {
			if(name==dtos[index].getName()) {
				dtos[index]=null;
				return true;
			}
		}
	}
return false;
}

public Transportdetails getByPrice(long price) {
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

public Transportdetails getBySeats(int seats) {
	for(int index = 0; index<dtos.length;index++) {
			if(seats==dtos[index].getSize().getSeats()) {
				return dtos[index];
			}
		}
return null;
}

public Transportdetails getByName(String name) {
	for(int index = 0; index<dtos.length;index++) {
			if(name==dtos[index].getName()) {
				return dtos[index];
				
			}

	}
	return null;
}
}

			
		












