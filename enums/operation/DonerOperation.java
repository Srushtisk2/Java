package com.xworkz.enums.operation;

import com.xworkz.enums.dto.BloodGroup;
import com.xworkz.enums.dto.DonerDTO;
import com.xworkz.enums.dto.Gender;

public class DonerOperation {
	DonerDTO[] donar = new DonerDTO[5];
	int index=0;

	public void save(DonerDTO name) {
		if(index<donar.length) {
			donar[index]=name;
			index++;
		}

	}

	public String getAll(DonerDTO[] dto) {
		if(donar.length==dto.length) {
			donar=dto;			
			return "get the value";
		}
		return "not get the value";
	}

	public String add(DonerDTO name) {
		if(index<donar.length) {
			donar[index]=name;
			index++;
			return "values inserted";
		}
		return "value not inserted";
	}

	public void printAll() {
		for(int index=0;index<donar.length;index++) {
			if(donar[index]!=null) {
			System.out.println(donar[index].toString());
		}
		}
	}

	public DonerDTO getByBloodGroup(BloodGroup group) {
		for(index=0;index<donar.length;index++) {
			if(group.equals(donar[index].getBloodGroup())) {
				return donar[index];

			}
		}
		 return null;

	}

	public DonerDTO getByGender(Gender gender) {
		for(int index=0;index<donar.length;index++) {
			if(gender.equals(donar[index].getGender())) {
				return donar[index];
			}
		}
		 return null;
	}
	public DonerDTO updateContactByName(String name ,long ContactNumber) {
		for(int index=0;index<donar.length;index++) {
			if(name.equals(donar[index].getName())) {
				donar[index].getDetails().setContactNumber(ContactNumber);
				return donar[index];
			}
		}

		return null;
	}

	public DonerDTO[]  getByAllGender(Gender gender) {
	    int j=0;
	    DonerDTO[] dtos = new DonerDTO[donar.length];
		for(int index=0;index<donar.length;index++) {
			if(donar[index]!=null) {
			if(gender.equals(donar[index].getGender())) {
				dtos[j]= donar[index];
	            j++;
			}
			}
		}
		 return dtos; 
	}
	public DonerDTO[] getByAllBloodGroup(BloodGroup group) {
		DonerDTO[] dto1 = new DonerDTO[donar.length];
		int k=0;
		for (int index = 0; index < donar.length; index++) {
			if(donar[index]!=null) {
			if(group.equals(donar[index].getBloodGroup())) {
				dto1[k]=donar[index];
				k++;
			}
			}

		}
		return dto1;
	}

}
