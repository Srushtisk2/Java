package com.xworkz.transport;


import com.xworkz.transport.dao.TransportDAO;
import com.xworkz.transport.dto.Transportdetails;
import com.xworkz.transport.dto.Tsize;

public class Testtransport {
	public static void main(String []args) {
		Transportdetails detailDTO=new Transportdetails();
		detailDTO.setName("bus");
		detailDTO.setColor("blue");
		detailDTO.setPrice(50000);
		
		Tsize dto=new Tsize();
		dto.setHeight(1200);
		dto.setWidth(2500);
		dto.setSeats(50);
		detailDTO.setSize(dto);
		
		TransportDAO dao = new TransportDAO();
		String resp1 = dao.insert(detailDTO);
		String resp2 = dao.insert(null); 
		String resp3 = dao.insert(detailDTO);

		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);

		dao.printAll();
		boolean isDelet = dao.deleteByprice(658);
		System.out.println("data deleted"+ isDelet);
		
		Transportdetails details = dao.updateColorByPrice("Grey",25845);
		System.out.println(details);
		dao.printAll();

		Transportdetails detailsDTO1 = dao.updatNameByColor("Ambani","White");
		System.out.println(detailsDTO1);
		dao.printAll();

		Transportdetails detailsDTO2 = dao.updatNameByPrice("Thakare",20548);
		System.out.println(detailsDTO2);
		dao.printAll();


		dao.printAll();
		boolean isDelet1 = dao.deleteByprice(658);
		System.out.println("data deleted"+ isDelet1);

		dao.printAll();
		}
		}


		

			
			




