package com.xworkz.music.dto;

import com.xworkz.music.dao.MusicDAO;

public class TestMusic {
	public static void main(String []args) {
		Music detailDTO=new Music();
		detailDTO.setFilm("3iditots");
		detailDTO.setMinutes(10);
		detailDTO.setLanguage("Hindi");

		Singer dto=new Singer();
		dto.setName("sonunigam");
		dto.setContact(993468787);
		dto.setPlace("Mumbai");

		detailDTO.setSinger(dto);
		MusicDAO dao=new MusicDAO();
		String resp1=dao.insert(detailDTO);
		String resp2=dao.insert(null);
		String resp3=dao.insert(detailDTO);

		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);

		dao.printAll();
		boolean isdelete=dao.deleteByLanguage("Hindi");
		System.out.println("data deleted"+isdelete);
		dao.printAll();


		}
}
