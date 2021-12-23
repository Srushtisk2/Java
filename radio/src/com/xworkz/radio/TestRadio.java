package com.xworkz.radio;

import com.xworkz.radio.dto.RadiodetailsDTO;
import com.xworkz.radio.dto.SizeDTO;
import com.xworkz.radio.dao.RadioDAO;

public class TestRadio {
public static void main(String []args) {
RadiodetailsDTO detailDTO=new RadiodetailsDTO();
detailDTO.setCompany("bajaj");
detailDTO.setPrice(500);
detailDTO.setColor("blue");

detailDTO.setNoOfRs((byte)10);
SizeDTO dto=new SizeDTO();
detailDTO.setSize(dto);


RadioDAO dao = new RadioDAO();
String resp1 = dao.insert(detailDTO);
String resp2 = dao.insert(null); 
String resp3 = dao.insert(detailDTO);

System.out.println(resp1);
System.out.println(resp2);
System.out.println(resp3);

RadiodetailsDTO detailsDTO = dao.updatePriceByColor(84,"purple");
System.out.println(detailsDTO);
dao.printAll();

RadiodetailsDTO detailsDTO1 = dao.updatCompanyByColor("bajaj","purple");
System.out.println(detailsDTO1);
dao.printAll();

RadiodetailsDTO detailsDTO2 = dao.updatePriceByColor((byte)84,"purple");
System.out.println(detailsDTO2);
dao.printAll();

dao.printAll();
boolean isDelet = dao.deleteByprice(499);
System.out.println("data deleted"+ isDelet);

dao.printAll();
}
}


	
	

