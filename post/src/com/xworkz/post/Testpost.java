package com.xworkz.post;

import com.xworkz.post.dao.PostDAO;
import com.xworkz.post.dto.Postdetails;
import com.xworkz.post.dto.Postemployee;



public class Testpost {
	public static void main(String []args) {
		Postdetails detailDTO=new Postdetails();
		detailDTO.setArea("pune");
		detailDTO.setPincode(520061);
		detailDTO.setManager("srushti");
		Postemployee dto=new Postemployee();
		dto.setEid("emp1");
		dto.setName("kumud");
		dto.setContact(994344364);
		detailDTO.setEmployee(dto);
		
		PostDAO dao = new PostDAO();
		String resp1 = dao.insert1(detailDTO);
		String resp2 = dao.insert1(null); 
		String resp3 = dao.insert1(detailDTO);

		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);
		
		Postdetails details = dao.updatePincodeByArea("Bagalkot",587101);
		System.out.println(details);
		dao.printAll();

		Postdetails detailsDTO1 = dao.updatManagerByArea("Srushti","Bagalkot");
		System.out.println(detailsDTO1);
		dao.printAll();

		Postdetails detailsDTO2 = dao.updatePincodeByArea("Srushti",587101);
		System.out.println(detailsDTO2);
		dao.printAll();


		dao.printAll();
		boolean isDelet = dao.deleteBypincode(587107);
		System.out.println("data deleted"+ isDelet);

		dao.printAll();
		}
		}


	

