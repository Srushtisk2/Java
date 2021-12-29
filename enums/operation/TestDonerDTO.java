package com.xworkz.enums.operation;

import com.xworkz.enums.dto.BloodGroup;
import com.xworkz.enums.dto.ContactDetails;
import com.xworkz.enums.dto.DonerDTO;
import com.xworkz.enums.dto.Gender;

public class TestDonerDTO {
	
	public static void main(String[] args) {


		DonerDTO dto = new DonerDTO();
		dto.setName("SRUSHTI");
		dto.setAge((byte)24);
		dto.setWeight(44.5f);
		dto.setBloodGroup(BloodGroup.B_POSITIVE);
		dto.setGender(Gender.FEMALE);

		DonerDTO dto1 = new DonerDTO();
		dto1.setName("POOJA");
		dto1.setAge((byte)22);
		dto1.setWeight(45.5f);
		dto1.setBloodGroup(BloodGroup.A_POSITIVE);
		dto1.setGender(Gender.FEMALE);

		DonerDTO dto2 = new DonerDTO();
		dto2.setName("SOUMYA");
		dto2.setAge((byte)21);
		dto2.setWeight(58.5f);
		dto2.setBloodGroup(BloodGroup.AB_POSIITIVE);
		dto2.setGender(Gender.FEMALE);

		DonerDTO dto3 = new DonerDTO();
		dto3.setName("SHUBHA");
		dto3.setAge((byte)21);
		dto3.setWeight(53.5f);
		dto3.setBloodGroup(BloodGroup.A_POSITIVE);
		dto3.setGender(Gender.FEMALE);


		ContactDetails details = new ContactDetails();
		details.setContactNumber(9916144877l);
		details.setEmail("srushtixworkz@gmail.com");
		details.setAdress("Bagalkot");

		ContactDetails details1 = new ContactDetails();
		details1.setContactNumber(95648789555l);
		details1.setEmail("poojaxworkz@gmail.com");
		details1.setAdress("Kolar");

		ContactDetails details2 = new ContactDetails();
		details2.setContactNumber(95487594555l);
		details2.setEmail("soumyaxworkz@gmail.com");
		details2.setAdress("Mahalingpur");

		ContactDetails details3 = new ContactDetails();
		details2.setContactNumber(98794565562l);
		details2.setEmail("shubhaxworkz@gmail.com");
		details2.setAdress("Gaddankeri");


		dto.setDetails(details);
		dto1.setDetails(details1);
		dto2.setDetails(details2);
		dto3.setDetails(details3);


		DonerOperation operation = new DonerOperation();
		operation.save(dto);
		operation.save(dto1);
		operation.save(dto2);
		operation.save(dto3);
		operation.printAll();
		System.out.println();
		
		System.out.println("get by bloodgroup");
		DonerDTO res=operation.getByBloodGroup(BloodGroup.B_POSITIVE);
		System.out.println(res.toString());
		System.out.println();
		
		System.out.println("get by gender");
		DonerDTO get = operation.getByGender(Gender.FEMALE);
		System.out.println(get.toString());
		System.out.println();
		
		System.out.println("updated contact number by name");
		DonerDTO update = operation.updateContactByName("SOUMYA",95487894555l);
		System.out.println(update.toString());
		System.out.println();
		operation.printAll();
		System.out.println();
		System.out.println("get all male array");
		
		DonerDTO[] all = operation.getByAllGender(Gender.FEMALE);
		for(int index=0;index<all.length;index++) {
			System.out.println(all[index]);
			System.out.println();
			
			System.out.println("get similar bloodgroup by array");
			DonerDTO[] response =operation.getByAllBloodGroup(BloodGroup.B_POSITIVE);
			for (int i = 0; i < response.length; i++) {
				System.out.println(response[i]);
				System.out.println();

			}

		}

	}

}


