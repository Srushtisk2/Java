package com.xworkz.cricket;

import com.xworkz.cricket.dto.Cricketdetails;
import com.xworkz.cricket.dto.Team;
import com.xworkz.cricket.dao.CricketDAO;


public class Testcricket {
	public static void main(String []args) {
		Cricketdetails detailDTO=new Cricketdetails();
		detailDTO.setType("ipl");
		detailDTO.setTeams(10);
		detailDTO.setManager("rahul");
		Team dto=new Team();
		dto.setTname("MI");
		dto.setOvers(20);
		dto.setCaptain("rohitsharma");
        detailDTO.setName(dto);		
		

		CricketDAO dao = new CricketDAO();
		String resp1 = dao.insert(detailDTO);
		String resp2 = dao.insert(null); 
		String resp3 = dao.insert(detailDTO);

		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);

		
		Cricketdetails details = dao.updateTypeByTeams("WorldCup",15);
		System.out.println(details);
		dao.printAll();

		Cricketdetails detailsDTO1 = dao.updatManagerByType("KapilDev","T20");
		System.out.println(detailsDTO1);
		dao.printAll();

		Cricketdetails detailsDTO2 = dao.updatTypeByTeams("ODI",20);
		System.out.println(detailsDTO2);
		dao.printAll();


		dao.printAll();
		boolean isDelet1 = dao.deleteByTeams(4);
		System.out.println("data deleted"+ isDelet1);

		dao.printAll();
		}
		}



		
