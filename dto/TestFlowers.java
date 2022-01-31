package com.xworkz.LinkedList.dto;

import java.util.LinkedList;

import com.xworkz.LinkedList.dao.FlowerOperation;

public class TestFlowers {
	public static void main(String[] args) {
		FlowersDTO dto = new FlowersDTO();
		dto.setName("Jasmine");
		dto.setColor("White");
		dto.setPrice(40);


		FlowersDTO dto1 = new FlowersDTO();
		dto1.setName("Dendrobium");
		dto1.setColor("Pink");
		dto1.setPrice(500);


		FlowerOperation dao = new FlowerOperation();
		dao.insert(dto);
		dao.insert(dto1);
		dao.printAll();

		System.out.println();

		LinkedList<FlowersDTO>  update = dao.updatePriceByName("Lotus", 50);
		System.out.println(update);

		System.out.println();
		dao.printAll();
		System.out.println();

	    LinkedList<FlowersDTO> delete = dao.deleteByPrice(40);
		System.out.println(delete);
		System.out.println();
		dao.printAll();
			}
		}

