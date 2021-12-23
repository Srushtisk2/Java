package com.xworkz.post.dao;

import com.xworkz.post.dto.Postdetails;

public class PostDAO 
{
	
	Postdetails []dtos = new Postdetails [5];
	int index = 0;
	public String insert1(Postdetails dto)
    {
	
	if(dto==null) {
		return "this is null object";
	}   
		else
		{
			dtos[index] = dto;
			System.out.println(dtos[index].getArea());
			index++;
			return "object added with the company name "+ dtos[index-1].getArea();
		}
	}
	public void printAll() {
		for(int index =0;index<dtos.length;index++) {
			if(dtos[index]!=null) {
				System.out.println(dtos[index].getAll());
			}
				
			}
	}


public boolean deleteBypincode(long pincode) {
	for(int index = 0;index<dtos.length;index++){
		dtos[index]=null;
		return true;
	}

return false;
}
public Postdetails updatePincodeyArea(String area,long pincode) {
	Postdetails dto = null;
	for(int index = 0; index<dtos.length;index++) {
		if(dtos[index]!=null) {
			if(dtos[index].getArea().equals(area)) {
				dtos[index].setPincode(pincode);
				return dtos[index];
			}
		}
	}
return dto;
}
public Postdetails updatManagerByArea(String manager,String area) {
	Postdetails dto = null;
	for(int index = 0; index<dtos.length;index++) {
		if(dtos[index]!=null) {
			if(dtos[index].getArea().equals(area)) {
				dtos[index].setManager(manager);
				dto=dtos[index];
			}
		}
	}
return dto;
}
public Postdetails updatePincodeByArea(String manager,long pincode) {
	Postdetails dto = null;
	for(int index = 0; index<dtos.length;index++) {
		if(dtos[index]!=null) {
			if(dtos[index].getManager().equals(manager)) {
				dtos[index].setPincode(pincode);
				dto=dtos[index];
			}
		}
	}
return dto;
}

public boolean deleteByPincode(long pincode) {
	for(int index = 0; index<dtos.length;index++) {
		if(dtos[index]!=null) {
			if(pincode==(dtos[index].getPincode())) {
				dtos[index]=null;
				return true;
			}
		}
	}
return false;
}

public boolean deleteByArea(String area) {
	for(int index = 0; index<dtos.length;index++) {
		if(dtos[index]!=null) {
			if(area==(dtos[index].getArea())) {
				dtos[index]=null;
				return true;
			}
		}
	}
return false;
}
public boolean deleteByManager(String manager) {
	for(int index = 0; index<dtos.length;index++) {
		if(dtos[index]!=null) {
			if(manager==dtos[index].getManager()) {
				dtos[index]=null;
				return true;
			}
		}
	}
return false;
}

public Postdetails getByPrice(long pincode) {
	for(int index = 0; index<dtos.length;index++) {
	if(dtos[index]!=null) {
			if(pincode==dtos[index].getPincode()) {
				dtos[index]=null;
				return dtos[index];
			}
		}
	}
return null;
}

public Postdetails getByEid(String eid) {
	for(int index = 0; index<dtos.length;index++) {
			if(eid==dtos[index].getEmployee().getEid()) {
				return dtos[index];
			}
		}
return null;
}

public Postdetails getByArea(String area) {
	for(int index = 0; index<dtos.length;index++) {
			if(area==dtos[index].getArea()) {
				return dtos[index];
				
			}

	}
	return null;
}
}

			
		

