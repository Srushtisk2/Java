package com.xworkz.book;

import com.xworkz.book.dao.BookDAO;
import com.xworkz.book.dto.Bookstore;
import com.xworkz.book.dto.Storeowner;

public class TestBook {
	public static void main(String []args) {
		Bookstore detailDTO=new Bookstore();
		detailDTO.setName("Shubham");
		detailDTO.setIncome(10000);
		detailDTO.setStocks(500);

		Storeowner dto=new Storeowner();
		dto.setOname("Suhas");
		dto.setContact(99346877);
		dto.setPlace("Hubli");

		detailDTO.setDetails(dto);
		BookDAO dao=new BookDAO();
		String resp1=dao.insert(detailDTO);
		String resp2=dao.insert(null);
		String resp3=dao.insert(detailDTO);

		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);

		dao.printAll();
		boolean isdelete=dao.deleteByStocks(500);
		System.out.println("data deleted"+isdelete);
		dao.printAll();


		}
}
